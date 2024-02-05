package com.test.cases;

public class Case10 implements Case {

    public Runnable f(int a, int b) {
        return () -> {
            int c = a + b;
        };
    }

    public static void add(int a, int b) {

    }

    public static void main(String[] args) {

    }
}
