package com.study.type.constant.leaf;

import com.study.constants.ConstantKind;
import com.study.type.ConstantPool;
import com.study.type.U4;

public class ConstantDouble extends LeafCpInfo {

    private final U4 highBytes;
    private final U4 lowBytes;

    public ConstantDouble(U4 highBytes, U4 lowBytes) {
        super(ConstantKind.CONSTANT_Double);
        this.highBytes = highBytes;
        this.lowBytes = lowBytes;
    }

    @Override
    public String desc() {
        long high = highBytes.toLong();
        long low = lowBytes.toLong();
        double value = Double.longBitsToDouble((high << 32) + low);
        return desc(value);
    }

    @Override
    public void validate(ConstantPool constantPool) {
        if (tag != ConstantKind.CONSTANT_Double) {
            throw new AssertionError();
        }
    }
}
