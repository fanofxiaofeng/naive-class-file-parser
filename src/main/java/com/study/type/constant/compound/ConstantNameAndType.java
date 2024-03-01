package com.study.type.constant.compound;

import com.study.constants.ConstantKind;
import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.constant.leaf.ConstantUtf8;

public class ConstantNameAndType extends CompoundCpInfo {
    private final U2 nameIndex;
    private final U2 descriptorIndex;

    public ConstantNameAndType(U2 nameIndex, U2 descriptorIndex) {
        super(ConstantKind.CONSTANT_NameAndType);
        this.nameIndex = nameIndex;
        this.descriptorIndex = descriptorIndex;
    }

    @Override
    public String desc() {
        return desc(nameIndex, descriptorIndex);
    }

    @Override
    public String componentDesc(ConstantPool constantPool) {
        return desc(nameIndex, descriptorIndex);
    }

    @Override
    public void validate(ConstantPool constantPool) {
        if (!(constantPool.get(nameIndex) instanceof ConstantUtf8)) {
            throw new AssertionError();
        }

        if (!(constantPool.get(descriptorIndex) instanceof ConstantUtf8)) {
            throw new AssertionError();
        }
    }

    @Override
    public String detail(ConstantPool constantPool) {
        String part1 = constantPool.get(nameIndex).desc();
        String part2 = constantPool.get(descriptorIndex).desc();
        if (part1.equals("<init>")) {
            return String.format("\"%s\":%s", part1, part2);
        }
        return String.format("%s:%s", part1, part2);
    }

    public U2 getNameIndex() {
        return nameIndex;
    }
}
