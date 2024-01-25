package com.test.present;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

public abstract class C33 {
    private synchronized int f1(int a, int b) {
        return -1;
    }

    abstract long f2(long a, long b, long c, long... d);

    abstract float f3(float... a);

    abstract double f4(double a);

    abstract String f5(String a, int[]... b);

    abstract Map f6(int a, Map[]... maps);

    abstract List f7(List[] a, List... b);

    abstract Level2 f8(Level2[] a, Level2... b);

    abstract Level2.Level3 f9(Level2.Level3... a);

    class Level2 {
        class Level3 {

        }
    }

    abstract SC f10(SC a, SC b, SC c, SC[] d, SC... e);

    static class SC {

    }

    abstract int[][][][][][][] f11(int[][][][][][][]... a);

    abstract Level2.Level3[][][][][][][][][][][] f12(Level2.Level3[][][][][][][][][][][]... a);

    static List[][][][][][] f13(List[][][][][][] a,
                                int[][][][][][][] b,
                                boolean[][][][][][][] c,
                                Boolean[][][][][][][] d,
                                Integer[][][][][] e,
                                Function[][][][] f,
                                BiConsumer[][][] g,
                                Object... h) {
        return null;
    }

    static {
        int a = 42;
    }

    private C33(String[]... s) {
    }

    public C33(String... s) {
    }

    protected C33(String s) {
    }

    C33(String s, int[]... n) {
    }
}
