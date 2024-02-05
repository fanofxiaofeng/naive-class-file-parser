package com.study.type.constant.leaf;

import com.study.constants.ConstantKind;
import com.study.type.ConstantPool;
import com.study.type.U4;

public class ConstantFloat extends LeafCpInfo {
    private final U4 bytes;

    public ConstantFloat(U4 bytes) {
        super(ConstantKind.CONSTANT_Float);
        this.bytes = bytes;
    }

    @Override
    public String desc() {
        long raw = bytes.toLong();
        float value = Float.intBitsToFloat((int) raw);
        return desc(value);
    }

    @Override
    public void validate(ConstantPool constantPool) {
        if (tag != ConstantKind.CONSTANT_Float) {
            throw new AssertionError();
        }
    }
}
