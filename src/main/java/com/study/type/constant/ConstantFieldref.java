package com.study.type.constant;

import com.study.type.U2;

public class ConstantFieldref extends AbstractConstant {
    private U2 classIndex;
    private U2 nameAndTypeIndex;

    public ConstantFieldref(U2 classIndex, U2 nameAndTypeIndex) {
        this.classIndex = classIndex;
        this.nameAndTypeIndex = nameAndTypeIndex;
    }

    @Override
    public String desc() {
        return "Fieldref";
    }
}
