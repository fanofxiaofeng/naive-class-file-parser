package com.study.type.constant;

import com.study.type.U2;

public class ConstantInvokeDynamic extends AbstractConstant {

    private U2 bootstrapMethodAttrIndex;
    private U2 nameAndTypeIndex;

    public ConstantInvokeDynamic(U2 bootstrapMethodAttrIndex, U2 nameAndTypeIndex) {
        this.bootstrapMethodAttrIndex = bootstrapMethodAttrIndex;
        this.nameAndTypeIndex = nameAndTypeIndex;
    }

    @Override
    public String desc() {
        return null;
    }

    @Override
    public String type() {
        return null;
    }
}
