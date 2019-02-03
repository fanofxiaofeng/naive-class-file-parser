package com.study.type.constant;

import com.study.type.U1;
import com.study.type.U4;

public class ConstantFloat extends AbstractConstant {
    private U4 bytes;

    public ConstantFloat(U4 bytes) {
        this.tag = new U1(4);
        this.bytes = bytes;
    }

    @Override
    public String desc() {
        long raw = bytes.toLong();
        float value = Float.intBitsToFloat((int) raw);
        return desc(value);
    }

    @Override
    public String type() {
        return "Float";
    }
}
