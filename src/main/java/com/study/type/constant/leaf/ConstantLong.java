package com.study.type.constant.leaf;

import com.study.constants.ConstantKind;
import com.study.type.ConstantPool;
import com.study.type.U4;

public class ConstantLong extends LeafCpInfo {
    private final U4 highBytes;
    private final U4 lowBytes;

    public ConstantLong(U4 highBytes, U4 lowBytes) {
        super(ConstantKind.CONSTANT_Long);
        this.highBytes = highBytes;
        this.lowBytes = lowBytes;
    }

    @Override
    public String desc() {
        long high = highBytes.toLong();
        long low = lowBytes.toLong();
        // todo 有待确认
        long value = (high << 32) + low;
        return desc(value);
    }

    @Override
    public void validate(ConstantPool constantPool) {
        if (tag != ConstantKind.CONSTANT_Long) {
            throw new AssertionError();
        }
    }
}
