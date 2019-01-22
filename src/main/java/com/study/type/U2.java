package com.study.type;

import java.math.BigInteger;

public class U2 extends AbstractU {

    public U2(int a, int b) {
        BigInteger temp = new BigInteger("" + a);
        temp = temp.multiply(_256).add(new BigInteger("" + b));
        bigInteger = temp;
    }

    @Override
    public String toString() {
        return String.format("0x%s", bigInteger.toString(16));
    }

}
