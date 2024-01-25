package com.study.type.constant.compound;

import com.study.constants.ConstantKind;
import com.study.type.ConstantPool;
import com.study.type.U1;
import com.study.type.U2;

import java.lang.invoke.MethodHandleInfo;

public class ConstantMethodHandle extends CompoundCpInfo {

    private final U1 referenceKind;

    private final U2 referenceIndex;

    public ConstantMethodHandle(U1 referenceKind, U2 referenceIndex) {
        super(ConstantKind.CONSTANT_MethodHandle);
        this.referenceKind = referenceKind;
        this.referenceIndex = referenceIndex;
    }

    @Override
    public String desc() {
        return String.format("%s:#%s", referenceKind.toInt(), referenceIndex.toInt());
    }

    @Override
    public String componentDesc(ConstantPool constantPool) {
        return String.format("%s:#%s", referenceKind.toInt(), referenceIndex.toInt());
    }

    @Override
    public void validate() {

    }

    @Override
    public String detail(ConstantPool constantPool) {
        String rawKind = MethodHandleInfo.referenceKindToString(referenceKind.toInt());

        String referenceDetail = constantPool.detail(referenceIndex);

        return String.format("REF_%s %s", rawKind, referenceDetail);
    }
}
