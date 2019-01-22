package com.study.type;

import java.math.BigInteger;

public class U4 extends AbstractU {

    public U4(int a, int b, int c, int d) {
        BigInteger temp = new BigInteger("" + a);
        temp = temp.multiply(_256).add(new BigInteger("" + b));
        temp = temp.multiply(_256).add(new BigInteger("" + c));
        temp = temp.multiply(_256).add(new BigInteger("" + d));
        bigInteger = temp;
    }

    @Override
    public String toString() {
        return String.format("0x%s", bigInteger.toString(16).toUpperCase());
    }
}
