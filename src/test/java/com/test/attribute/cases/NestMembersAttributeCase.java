package com.test.attribute.cases;

public class NestMembersAttributeCase {

    private class C1 {
    }

    private class C2 {
    }

    public void f() {
        class C3 {
        }

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world");
            }
        };
    }

}
