package com.study.ui.support;

import com.study.util.PrintStreamWrapper;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * Captures the text produced by the existing CLI presenters,
 * so that GUI detail panels can reuse the exact same rendering logic.
 */
public final class TextCapture {

    private TextCapture() {
    }

    public interface Renderer {
        void render(PrintStreamWrapper wrapper);
    }

    public static String capture(Renderer renderer) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        // autoFlush on println; the presenters only use print/println, so no explicit flush is needed
        PrintStream printStream = new PrintStream(outputStream, true, StandardCharsets.UTF_8);
        renderer.render(new PrintStreamWrapper(printStream));
        return outputStream.toString(StandardCharsets.UTF_8);
    }

    /**
     * Capture that never throws: presentation failures (e.g., an attribute
     * whose presenter is not finished yet) are shown as text instead of
     * breaking the whole GUI.
     */
    public static String safeCapture(Renderer renderer) {
        try {
            return capture(renderer);
        } catch (Exception e) {
            return String.format("(error while presenting this content: %s: %s)%n",
                    e.getClass().getSimpleName(), e.getMessage());
        }
    }
}
