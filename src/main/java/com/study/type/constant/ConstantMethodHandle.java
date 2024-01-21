package com.study.type.constant;

import com.study.constants.ConstantKind;
import com.study.type.ConstantPool;
import com.study.type.U1;
import com.study.type.U2;

import java.lang.invoke.MethodHandleInfo;
import java.util.Optional;

public class ConstantMethodHandle extends CpInfo {

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
    public void validate() {

    }

    @Override
    public Optional<String> detail(ConstantPool constantPool) {
        String rawKind = MethodHandleInfo.referenceKindToString(referenceKind.toInt());

        Optional<String> referenceDetail = constantPool.detail(referenceIndex);
        if (referenceDetail.isEmpty()) {
            throw new IllegalArgumentException();
        }

        return Optional.of(String.format("REF_%s %s", rawKind, referenceDetail.get()));
    }
}
