package com.study.ui;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 * GUI entry point.
 * <p>
 * Run with:
 * <pre>
 * mvn compile exec:java -Pgui
 * </pre>
 * Then pick a {@code .class} file via File &gt; Open, or drag &amp; drop one onto the window.
 */
public class GuiMain {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ignored) {
                // fall back to the default cross-platform look and feel
            }

            MainFrame frame = new MainFrame();
            frame.setVisible(true);
        });
    }
}
