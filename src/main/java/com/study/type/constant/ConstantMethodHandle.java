package com.study.type.constant;

import com.study.type.U1;
import com.study.type.U2;

public class ConstantMethodHandle extends AbstractConstant {

    private U1 referenceKind;
    private U2 referenceIndex;

    public ConstantMethodHandle(U1 referenceKind, U2 referenceIndex) {
        this.referenceKind = referenceKind;
        this.referenceIndex = referenceIndex;
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
