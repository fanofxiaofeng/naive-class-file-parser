package com.test.cases.method;

public class EnumCase {
    public enum Temp {
        A(2, 0, 8),
        B(2, 3, 4);
        private final int[] data;

        Temp(int... data) {
            this.data = data;
        }
    }
}
