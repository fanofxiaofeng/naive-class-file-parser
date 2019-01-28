package com.study.type.constant;

import com.study.type.U1;
import com.study.type.U2;

public class ConstantFieldref extends AbstractConstant {
    private U2 classIndex;
    private U2 nameAndTypeIndex;

    public ConstantFieldref(U2 classIndex, U2 nameAndTypeIndex) {
        this.tag = new U1(9);
        this.classIndex = classIndex;
        this.nameAndTypeIndex = nameAndTypeIndex;
    }

    @Override
    public String desc() {
        return desc(classIndex, nameAndTypeIndex);
    }

    @Override
    protected String type() {
        return "Fieldref";
    }

    @Override
    public String detail(AbstractConstant[] constantPool) {
        return String.format("%s.%s",
                constantPool[classIndex.toInt()].detail(constantPool),
                constantPool[nameAndTypeIndex.toInt()].detail(constantPool)
        );
    }
}
