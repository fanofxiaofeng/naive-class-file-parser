package com.study.ui;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * GUI entry point.
 * <p>
 * Run with:
 * <pre>
 * mvn compile exec:java -Pgui
 * mvn compile exec:java -Pgui -Dexec.args="target/classes/com/study/parser/MainParser.class"
 * </pre>
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

            if (args.length > 0) {
                Path path = Path.of(args[0]);
                if (Files.isRegularFile(path)) {
                    frame.openFile(path);
                }
            }
        });
    }
}
