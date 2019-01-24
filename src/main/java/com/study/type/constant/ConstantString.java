package com.study.type.constant;

import com.study.type.U2;

public class ConstantString extends AbstractConstant {

    private U2 stringIndex;

    public ConstantString(U2 stringIndex) {
        this.stringIndex = stringIndex;
    }

    @Override
    public String desc() {
        return desc(stringIndex);
    }

    @Override
    protected String type() {
        return "String";
    }
}
