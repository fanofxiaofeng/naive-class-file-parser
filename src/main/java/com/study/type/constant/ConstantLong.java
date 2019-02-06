package com.study.type.constant;

import com.study.type.U1;
import com.study.type.U4;

public class ConstantLong extends AbstractConstant {
    private U4 highBytes;
    private U4 lowBytes;

    public ConstantLong(U4 highBytes, U4 lowBytes) {
        this.tag = new U1(5);
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
        if (this.tag.toInt() != 5) {
            throw new AssertionError();
        }
    }
}
