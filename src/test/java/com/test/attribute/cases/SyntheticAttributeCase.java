package com.test.attribute.cases;

public class SyntheticAttributeCase {

    private final int a;

    public SyntheticAttributeCase(int a) {
        assert a > 42;
        this.a = a;
    }

    private class Inner {
        public void f() {
            System.out.println(SyntheticAttributeCase.this.a);
        }
    }
}
