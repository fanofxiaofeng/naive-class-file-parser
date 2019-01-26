package com.study.type.constant;

import com.study.type.U2;

public class ConstantInterfaceMethodref extends AbstractConstant {

    private U2 classIndex;

    private U2 nameAndTypeIndex;

    public ConstantInterfaceMethodref(U2 classIndex, U2 nameAndTypeIndex) {
        this.classIndex = classIndex;
        this.nameAndTypeIndex = nameAndTypeIndex;
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
