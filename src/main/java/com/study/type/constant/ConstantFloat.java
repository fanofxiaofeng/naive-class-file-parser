package com.study.type.constant;

import com.study.type.U4;

public class ConstantFloat extends AbstractConstant {
    private U4 bytes;

    public ConstantFloat(U4 bytes) {
        this.bytes = bytes;
    }

    @Override
    public String desc() {
        return null;
    }

    @Override
    protected String type() {
        return null;
    }
}
