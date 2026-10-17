package com.study.ui.support;

import javax.swing.JTextArea;
import java.awt.Font;

/**
 * Small factory for read-only monospace text areas used in detail panels.
 */
public final class TextAreas {

    private TextAreas() {
    }

    public static JTextArea readOnlyMonospace() {
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 13));
        textArea.setTabSize(4);
        textArea.setLineWrap(false);
        return textArea;
    }
}
