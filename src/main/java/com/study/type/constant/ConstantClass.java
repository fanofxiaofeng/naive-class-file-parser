package com.study.type.constant;

import com.study.type.U1;
import com.study.type.U2;

public class ConstantClass extends AbstractConstant {
    private U2 nameIndex;

    public ConstantClass(U2 nameIndex) {
        this.tag = new U1(7);
        this.nameIndex = nameIndex;
    }

    @Override
    public String desc() {
        return desc(nameIndex);
    }

    @Override
    protected String type() {
        return "Class";
    }

    @Override
    public String detail(AbstractConstant[] constantPool) {
        String detail = constantPool[nameIndex.toInt()].detail(constantPool).replaceAll("\\.", "/");
        if (detail.startsWith("[")) {
            return String.format("\"%s\"", detail);
        } else {
            return detail;
        }
    }
}
