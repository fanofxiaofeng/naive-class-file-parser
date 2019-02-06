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
    public String type() {
        return "NameAndType";
    }

    @Override
    public void validate() {
        if (this.tag.toInt() != 12) {
            throw new AssertionError();
        }

        if (!ConstantUtf8.class.isInstance(constantPool[nameIndex.toInt()])) {
            throw new AssertionError();
        }

        if (!ConstantUtf8.class.isInstance(constantPool[descriptorIndex.toInt()])) {
            throw new AssertionError();
        }

    }

    @Override
    public String detail() {
        String part1 = constantPool[nameIndex.toInt()].desc();
        String part2 = constantPool[descriptorIndex.toInt()].desc();
        if (part1.equals("<init>")) {
            return String.format("\"%s\":%s", part1, part2);
        }
        return String.format("%s:%s", part1, part2);
    }
}
