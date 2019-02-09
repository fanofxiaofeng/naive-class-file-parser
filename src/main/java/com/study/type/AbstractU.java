package com.study.type;

import java.math.BigInteger;

public class AbstractU {

    protected int[] detail;

    private BigInteger bigInteger;

    private final BigInteger _256 = new BigInteger("256");

    @Override
    public String toString() {
        return String.format("0x%s", bigInteger.toString(16).toUpperCase());
    }

    public String toString(int radix) {
        return bigInteger.toString(radix);
    }

    public int toInt() {
        if (getClass() == U1.class || getClass() == U2.class) {
            // safe
            return Integer.parseInt(toString(10));
        } else if (getClass() == U4.class) {
            // the operations is not safe (overflow is possible)
            return Integer.parseInt(toString(10));
        } else {
            throw new RuntimeException("Unsupported type!");
        }
    }

    public long toLong() {
        if (getClass() == U1.class || getClass() == U2.class || getClass() == U4.class) {
            return Long.parseLong(toString(10));
        }
        throw new RuntimeException("Unsupported type!");
    }

    public boolean isOn(int mask) {
        int flags = toInt();
        if (flags < 0 || mask <= 0) {
            throw new RuntimeException(String.format("bad case with flags: %d, mask: %d", flags, mask));
        }
        return (flags & mask) == mask;
    }

    void fillDetail(int... arg) {
        int length = arg.length;
        // 分别对应 U1, U2, U4
        assert length == 1 || length == 2 || length == 4;
        detail = arg;
        bigInteger = new BigInteger("" + arg[0]);
        for (int i = 1; i < length; i++) {
            bigInteger = bigInteger.multiply(_256).add(new BigInteger("" + arg[i]));
        }
    }

    void fillDetail(U1... arg) {
        int length = arg.length;
        // 分别对应 U1, U2, U4
        assert length == 1 || length == 2 || length == 4;
        int[] ints = new int[arg.length];
        for (int i = 0; i < arg.length; i++) {
            ints[i] = arg[i].toInt();
        }
        fillDetail(ints);
    }

    public int[] getDetail() {
        return detail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AbstractU abstractU = (AbstractU) o;

        return bigInteger != null ? bigInteger.equals(abstractU.bigInteger) : abstractU.bigInteger == null;
    }

    @Override
    public int hashCode() {
        return bigInteger != null ? bigInteger.hashCode() : 0;
    }
}
