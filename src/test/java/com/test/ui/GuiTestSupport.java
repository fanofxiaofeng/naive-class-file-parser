package com.test.ui;

import com.study.parser.ParseResult;
import com.study.ui.ClassFileParsingService;

import javax.swing.SwingUtilities;
import java.awt.Component;
import java.awt.Container;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Shared helpers for the GUI panel tests: parsing fixtures from the test
 * classpath, locating Swing components inside a panel, and running work on
 * the Event Dispatch Thread. Swing components must be created and accessed
 * on the EDT even in headless tests; the panels under test are instantiated
 * directly (no {@code JFrame}, nothing is shown), so the assertions read the
 * same strings that end up in the component models on screen.
 */
final class GuiTestSupport {

    private GuiTestSupport() {
    }

    static ParseResult parse(String resourceName) {
        try (InputStream inputStream = GuiTestSupport.class.getClassLoader().getResourceAsStream(resourceName)) {
            Objects.requireNonNull(inputStream, "test resource not found: " + resourceName);
            return ClassFileParsingService.parse(inputStream);
        } catch (Exception e) {
            throw new AssertionError("failed to parse " + resourceName, e);
        }
    }

    @FunctionalInterface
    interface EdtAction {
        void run();
    }

    /**
     * Runs the action on the EDT, rethrowing any {@link AssertionError} on
     * the calling test thread so JUnit reports the original failure.
     */
    static void onEdt(EdtAction action) {
        if (SwingUtilities.isEventDispatchThread()) {
            action.run();
            return;
        }
        try {
            SwingUtilities.invokeAndWait(action::run);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof AssertionError assertionError) {
                throw assertionError;
            }
            throw new AssertionError("unexpected failure on the EDT", cause);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new AssertionError("interrupted while waiting for the EDT", e);
        }
    }

    static <T extends Component> T findComponent(Container root, Class<T> type) {
        List<T> matches = findAll(root, type);
        if (matches.isEmpty()) {
            throw new AssertionError(
                    "no " + type.getSimpleName() + " found under " + root.getClass().getSimpleName());
        }
        return matches.get(0);
    }

    static <T extends Component> List<T> findAll(Container root, Class<T> type) {
        List<T> matches = new ArrayList<>();
        collect(root, type, matches);
        return matches;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Component> void collect(Component component, Class<T> type, List<T> matches) {
        if (type.isInstance(component)) {
            matches.add((T) component);
        }
        if (component instanceof Container container) {
            for (Component child : container.getComponents()) {
                collect(child, type, matches);
            }
        }
    }

    /**
     * Returns the first view row whose value in the given column equals
     * {@code expected}, or -1 when there is no such row.
     */
    static int findRow(javax.swing.JTable table, int column, String expected) {
        for (int row = 0; row < table.getRowCount(); row++) {
            Object value = table.getValueAt(row, column);
            if (Objects.equals(String.valueOf(value), expected)) {
                return row;
            }
        }
        return -1;
    }
}
