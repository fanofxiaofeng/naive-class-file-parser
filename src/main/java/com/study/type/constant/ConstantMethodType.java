package com.study.type.constant;

import com.study.type.U1;
import com.study.type.U2;

public class ConstantMethodType extends AbstractConstant {
    private U2 descriptorIndex;

    public ConstantMethodType(U2 descriptorIndex) {
        this.tag = new U1(16);
        this.descriptorIndex = descriptorIndex;
    }

    @Override
    public String desc() {
        return null;
    }

    @Override
    public String type() {
        return null;
    }

    @Override
    public void validate() {
        if (this.tag.toInt() != 16) {
            throw new AssertionError();
        }

        if (!ConstantUtf8.class.isInstance(constantPool[descriptorIndex.toInt()])) {
            throw new AssertionError();
        }
    }
}
