package com.test.cases.method;

import java.util.List;

public abstract class ThrowsCase {

    abstract void f1() throws RuntimeException, NullPointerException, Throwable, IllegalStateException, IllegalArgumentException, AssertionError;

    abstract void f2(List<? extends Integer> a) throws Throwable, IllegalStateException;

    abstract <T extends Exception, T2 extends Throwable & Runnable> void f3(List<Integer> a) throws C1.C2.C3, T, T2, NullPointerException, Throwable, AssertionError;

    static class C1 {
        static class C2 {
            static class C3 extends Exception {

            }
        }
    }
}
