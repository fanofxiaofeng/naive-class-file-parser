package com.study.type.constant;

import com.study.constants.ConstantKind;
import com.study.type.U4;

public class ConstantLong extends AbstractConstant {
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
    public String type() {
        return "Long";
    }

    @Override
    public void validate() {
        if (this.tag != ConstantKind.CONSTANT_Long) {
            throw new AssertionError();
        }
    }
}
