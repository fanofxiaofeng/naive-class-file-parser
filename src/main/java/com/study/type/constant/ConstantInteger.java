package com.study.type.constant;

import com.study.type.U1;
import com.study.type.U4;

public class ConstantInteger extends AbstractConstant {

    private U4 bytes;

    public ConstantInteger(U4 bytes) {
        this.tag = new U1(3);
        this.bytes = bytes;
    }

    @Override
    public String desc() {
        long value = bytes.toLong();
        if (value > Integer.MAX_VALUE) {
            value -= 0x100000000L;
        }
        return desc((int) value);
    }

    @Override
    public String type() {
        return "Integer";
    }
}
