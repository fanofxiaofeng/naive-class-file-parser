package com.study.type.constant.compound;

import com.study.constants.ConstantKind;
import com.study.type.U2;

public final class ConstantFieldref extends ConstantMemberRef {
    public ConstantFieldref(U2 classIndex, U2 nameAndTypeIndex) {
        super(ConstantKind.CONSTANT_Fieldref, classIndex, nameAndTypeIndex);
    }

}
