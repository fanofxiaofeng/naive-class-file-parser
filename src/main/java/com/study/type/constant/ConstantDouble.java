package com.study.type.constant;

import com.study.type.U4;

public class ConstantDouble extends AbstractConstant {

    private U4 highBytes;
    private U4 lowBytes;

    public ConstantDouble(U4 highBytes, U4 lowBytes) {
        this.highBytes = highBytes;
        this.lowBytes = lowBytes;
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
