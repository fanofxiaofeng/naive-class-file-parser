package com.test.attribute.cases;

public class EnclosingMethodAttributeCase {

    {
        class C {

        }
    }

    static {
        class C {
        }
    }

    public void f1(int a, int b) {
        class C {
        }
    }

    public Runnable f2(int a, int b) {
        return new Runnable() {

            @Override
            public void run() {
                System.out.println("Hello world");
            }
        };
    }
    public void f1() {
        class C {
        }
    }
}
