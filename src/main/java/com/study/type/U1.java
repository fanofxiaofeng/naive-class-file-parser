package com.study.type;

public class U1 extends AbstractU {

    public U1(int a) {
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
