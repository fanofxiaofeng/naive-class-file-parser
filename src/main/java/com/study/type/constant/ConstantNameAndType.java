package com.study.type.constant;

import com.study.type.U1;
import com.study.type.U2;

public class ConstantNameAndType extends AbstractConstant {
    private U2 nameIndex;
    private U2 descriptorIndex;

    public ConstantNameAndType(U2 nameIndex, U2 descriptorIndex) {
        this.tag = new U1(12);
        this.nameIndex = nameIndex;
        this.descriptorIndex = descriptorIndex;
    }

    @Override
    public String desc() {
        return desc(nameIndex, descriptorIndex);
    }

    @Override
    protected String type() {
        return "NameAndType";
    }

    @Override
    public String detail(AbstractConstant[] constantPool) {
        String part1 = constantPool[nameIndex.toInt()].detail(constantPool);
        String part2 = constantPool[descriptorIndex.toInt()].detail(constantPool);
        if (part1.equals("<init>")) {
            return String.format("\"%s\":%s", part1, part2);
        }
        return String.format("%s:%s", part1, part2);
    }
}
