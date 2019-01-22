package com.study.type.constant;

import com.study.type.U2;

public class ConstantClass extends AbstractConstant {
    private U2 nameIndex;

    public ConstantClass(U2 nameIndex) {
        this.nameIndex = nameIndex;
    }

    @Override
    public String desc() {
        return "Class";
    }
}
