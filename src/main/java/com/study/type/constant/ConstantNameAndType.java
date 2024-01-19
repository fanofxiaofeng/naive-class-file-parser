package com.study.type.constant;

import com.study.constants.ConstantKind;
import com.study.type.ConstantPool;
import com.study.type.U2;

import java.util.Optional;

public class ConstantNameAndType extends AbstractConstant {
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
    public String type() {
        return "NameAndType";
    }

    @Override
    public void validate() {
        if (this.tag != ConstantKind.CONSTANT_NameAndType) {
            throw new AssertionError();
        }

        if (!(constantPool.get(nameIndex) instanceof ConstantUtf8)) {
            throw new AssertionError();
        }

        if (!(constantPool.get(descriptorIndex) instanceof ConstantUtf8)) {
            throw new AssertionError();
        }

    }

    @Override
    public Optional<String> detail() {
        String part1 = constantPool.get(nameIndex).desc();
        String part2 = constantPool.get(descriptorIndex).desc();
        if (part1.equals("<init>")) {
            return Optional.of(String.format("\"%s\":%s", part1, part2));
        }
        return Optional.of(String.format("%s:%s", part1, part2));
    }

    @Override
    public Optional<String> detail(ConstantPool constantPool) {
        String part1 = constantPool.get(nameIndex).desc();
        String part2 = constantPool.get(descriptorIndex).desc();
        if (part1.equals("<init>")) {
            return Optional.of(String.format("\"%s\":%s", part1, part2));
        }
        return Optional.of(String.format("%s:%s", part1, part2));
    }
}
