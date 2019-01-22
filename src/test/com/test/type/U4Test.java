package com.test.type;

import org.junit.Test;

import java.math.BigInteger;

public class U4Test {
    @Test
    public void f() {
        byte[] bytes = new byte[]{(byte) 0xFF};
        BigInteger bigInteger = new BigInteger(bytes);
        System.out.println(bigInteger);
    }
}
