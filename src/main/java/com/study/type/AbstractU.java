package com.study.type;

import java.math.BigInteger;

public class AbstractU {
    protected BigInteger bigInteger;
    protected final BigInteger _256 = new BigInteger("256");

    public String toString(int radix) {
        return bigInteger.toString(radix);
    }

    public int toInt() {
        if (getClass() == U1.class || getClass() == U2.class) {
            return Integer.parseInt(toString(10));
        } else {
            throw new RuntimeException("Unsupported type!");
        }
    }
}
