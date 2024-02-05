package com.test.attribute.cases;

public class InnerClassesAttributeCase {
    private static class C1 {
    }

    record C2() {
    }

    @interface C3 {
    }

    ;

    interface C4 {
    }

    ;

    public class C5 {
    }

    public void f() {
        class C6 {
        }

        Runnable r = new Runnable() {
            @Override
            public void run() {

            }
        };
    }

}
