package com.study.type;

public final class U1 extends AbstractU {

    public U1(int a) {
        rangeCheck(a);
        fillDetail(a);
    }

    public int toSignedInt() {
        int raw = toInt();
        if (raw > Byte.MAX_VALUE) {
            return raw - 0x100;
        }
        return raw;
    }
}
