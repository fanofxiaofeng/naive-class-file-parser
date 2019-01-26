package com.study.type.constant;

import com.study.type.U2;

public class ConstantMethodType extends AbstractConstant {
    private U2 descriptorIndex;

    public ConstantMethodType(U2 descriptorIndex) {
        this.descriptorIndex = descriptorIndex;
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
