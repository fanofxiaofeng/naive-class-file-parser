package com.study.type;

import java.math.BigInteger;

public class U4 {
    private final BigInteger bigInteger;

    private final BigInteger _256 = new BigInteger("256");

    public U4(int a, int b, int c, int d) {
        BigInteger temp = new BigInteger("" + a);
        temp = temp.multiply(_256).add(new BigInteger("" + b));
        temp = temp.multiply(_256).add(new BigInteger("" + c));
        temp = temp.multiply(_256).add(new BigInteger("" + d));
        bigInteger = temp;
    }

    public void show() {
        System.out.println(bigInteger.toString(16));
    }

}
