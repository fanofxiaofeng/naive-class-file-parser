package com.test.ui.cases;

import java.util.List;

/**
 * Fixture parsed by the GUI panel tests. It is compiled by javac during the
 * Maven test-compile phase, so its constant pool deterministically contains
 * the tags the tests assert on:
 * <ul>
 *   <li>the numeric constants cover Integer / Float / Long / Double
 *       (tags 3 / 4 / 5 / 6, and Long/Double each leave an unusable slot),</li>
 *   <li>the string constants cover Utf8 / String (tags 1 / 8),</li>
 *   <li>{@code fieldAccess} compiles to getfield/putfield &rarr; Fieldref (9),</li>
 *   <li>{@code virtualCall} compiles to invokevirtual &rarr; Methodref (10),</li>
 *   <li>{@code interfaceCall} compiles to invokeinterface &rarr; InterfaceMethodref (11),</li>
 *   <li>{@code stringConcat} and {@code lambda} compile to invokedynamic &rarr;
 *       InvokeDynamic (18) together with MethodHandle (15) and MethodType (16),</li>
 *   <li>NameAndType (12) and Class (7) show up alongside all of the above.</li>
 * </ul>
 */
public class GuiShowcaseCase {

    public static final int INT_CONSTANT = 98765;
    public static final float FLOAT_CONSTANT = 98765.0f;
    public static final long LONG_CONSTANT = -4294967296L;
    public static final double DOUBLE_CONSTANT = 1.0d;

    private int counter;
    private String text = "abc";

    public int fieldAccess(int delta) {
        counter += delta;
        return counter;
    }

    public String virtualCall() {
        return text.toUpperCase();
    }

    public int interfaceCall(List<String> items) {
        return items.size();
    }

    public String stringConcat(String name) {
        return "hello " + name;
    }

    public Runnable lambda() {
        return () -> counter++;
    }
}
