package com.study.type.constant.compound;

import com.study.constants.ConstantKind;
import com.study.type.U2;

public final class ConstantInterfaceMethodref extends ConstantMemberRef {

    public ConstantInterfaceMethodref(U2 classIndex, U2 nameAndTypeIndex) {
        super(ConstantKind.CONSTANT_InterfaceMethodref, classIndex, nameAndTypeIndex);
    }
}
