package com.study.type;

import java.math.BigInteger;

public class U1 extends AbstractU {

    public U1(int a) {
        BigInteger temp = new BigInteger("" + a);
        bigInteger = temp;
    }

    @Override
    public String toString() {
        return String.format("0x%s", bigInteger.toString(16));
    }

}
