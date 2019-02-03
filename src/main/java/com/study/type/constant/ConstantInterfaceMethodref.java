package com.study.type.constant;

import com.study.type.U1;
import com.study.type.U2;

public class ConstantInterfaceMethodref extends AbstractConstant {

    private U2 classIndex;

    private U2 nameAndTypeIndex;

    public ConstantInterfaceMethodref(U2 classIndex, U2 nameAndTypeIndex) {
        this.tag = new U1(11);
        this.classIndex = classIndex;
        this.nameAndTypeIndex = nameAndTypeIndex;
    }

    @Override
    public String desc() {
        return desc(classIndex, nameAndTypeIndex);
    }

    @Override
    public String type() {
        return "InterfaceMethodref";
    }
}
