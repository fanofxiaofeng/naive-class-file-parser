package com.test.present;

import java.util.List;
import java.util.Map;

public abstract class C3<T extends Number> {
//    private static int f1(int a, int b) {
//        return a + b;
//    }

//    abstract long f2(long a, long b);

//    abstract float f3(float a, float b);

//    abstract Map f4(Map a, Map b);

    abstract Map<Integer, Map<Integer, String>> f5(Map<Integer, Map<Integer, String>> a,
                                                   Map<Integer, Map<Integer, String>> b);

    abstract Map<? extends Number, Map<? super String, ? extends String>> f6(
            Map<? extends Number, Map<? super String, ? extends String>> a,
            Map<? extends Number, Map<? super String, ? extends String>> b
    );

    abstract int[][][][] f7(int[][][][] a, int[][][][] b);

    abstract T f8(T a, T b);

    abstract Map<T, T> f9(Map<T, T> a, Map<T, T> b);

    abstract Map<? extends T, Map<? super T, List<? extends String>>> f10(
            Map<? extends T, Map<? super T, List<? extends String>>> a,
            Map<? extends T, Map<? super T, List<? extends String>>> b
    );

    abstract void f11(int... a);
}
