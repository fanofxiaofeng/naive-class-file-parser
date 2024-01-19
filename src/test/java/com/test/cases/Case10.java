package com.test.cases;

public class Case10 {

    // todo: use lambda expression
    public Runnable f(int a, int b) {
        add(a, b);
        return null;
//        return () -> {
//            int c = a + b;
//        };
    }

    public static void add(int a, int b) {

    }

    public static void main(String[] args) {

    }
}
