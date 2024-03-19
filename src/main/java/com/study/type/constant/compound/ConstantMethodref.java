package com.study.type.constant.compound;

import com.study.constants.ConstantKind;
import com.study.type.U2;

public final class ConstantMethodref extends ConstantMemberRef {
    public ConstantMethodref(U2 classIndex, U2 nameAndTypeIndex) {
        super(ConstantKind.CONSTANT_Methodref, classIndex, nameAndTypeIndex);
    }
}
