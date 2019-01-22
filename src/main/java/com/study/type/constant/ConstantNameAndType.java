package com.study.type.constant;

import com.study.type.U2;

public class ConstantNameAndType extends AbstractConstant {
    private U2 nameIndex;
    private U2 descriptorIndex;

    public ConstantNameAndType(U2 nameIndex, U2 descriptorIndex) {
        this.nameIndex = nameIndex;
        this.descriptorIndex = descriptorIndex;
    }

    @Override
    public String desc() {
        return "NameAndType";
    }
}
