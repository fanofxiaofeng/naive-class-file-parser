package com.study.type.constant;

import com.study.type.U1;
import com.study.type.U4;

public class ConstantDouble extends AbstractConstant {

    private U4 highBytes;
    private U4 lowBytes;

    public ConstantDouble(U4 highBytes, U4 lowBytes) {
        this.tag = new U1(6);
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
    public String type() {
        return "Double";
    }

    @Override
    public void validate() {
        if (this.tag.toInt() != 6) {
            throw new AssertionError();
        }
    }
}
