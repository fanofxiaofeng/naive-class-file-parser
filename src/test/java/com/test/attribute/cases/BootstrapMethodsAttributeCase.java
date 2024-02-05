package com.test.attribute.cases;

public class BootstrapMethodsAttributeCase {

    private int a;
    public BootstrapMethodsAttributeCase(int a) {
        this.a = a;
    }

    private Runnable runnable1 = () -> System.out.println("Hello world");

    private Runnable runnable2 = () -> System.out.println(a);
}
