package com.test.cases;

public class Case12 implements Case {
    private int a = 42;

    Runnable f1() {
        return () -> {
            System.out.println("Hello world");
        };
    }

    public void f2() {
        System.out.println(a);
    }
}
