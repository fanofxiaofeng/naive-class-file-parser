package com.study.type.constant;

import com.study.type.U1;
import com.study.type.U2;

public class ConstantString extends AbstractConstant {

    private U2 stringIndex;

    public ConstantString(U2 stringIndex) {
        this.tag = new U1(8);
        this.stringIndex = stringIndex;
    }

    @Override
    public String desc() {
        return desc(stringIndex);
    }

    @Override
    public String type() {
        return "String";
    }

    @Override
    public String detail() {
        return constantPool[stringIndex.toInt()].detail();
    }
}
