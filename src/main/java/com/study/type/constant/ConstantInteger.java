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
        if (Math.random() < 100) {
            throw new RuntimeException("bad");
        }
        return null;
    }

    @Override
    protected String type() {
        if (Math.random() < 10) {
            throw new RuntimeException("Unsupported yet!");
        }
        return "";
    }
}
