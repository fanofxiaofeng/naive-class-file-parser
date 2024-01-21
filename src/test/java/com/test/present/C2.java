package com.test.present;

import java.util.List;
import java.util.Map;

public class C2<T extends Number> {

    //    @C1
    private static final int f1 = 42;
    private long f2;
    private float f3;
    private Map f4;

    private Map<Integer, Map<Integer, String>> f5;

    private Map<? extends Number, Map<? super String, ? extends String>> f6;

    private int[][][][] f7;

    private T f8;

    private Map<T, T> f9;

    private Map<? extends T, Map<? super T, List<? extends String>>> f10;
}
