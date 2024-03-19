package com.study.type;

public final class U4 extends AbstractU {

    public U4(int a, int b, int c, int d) {
        rangeCheck(a, b, c, d);
        fillDetail(a, b, c, d);
    }

    public U4(U1 a, U1 b, U1 c, U1 d) {
        fillDetail(a, b, c, d);
    }

    public int toSignedInt() {
        long raw = toLong();
        if (raw > Integer.MAX_VALUE) {
            return (int) (raw - 0x100000000L);
        }
        return (int) raw;
    }
}
