package com.study.type.constant;

import com.study.constants.ConstantKind;
import com.study.type.ConstantPool;
import com.study.type.U2;

import java.util.Optional;

public class ConstantInterfaceMethodref extends CpInfo {

    private final U2 classIndex;

    private final U2 nameAndTypeIndex;

    public ConstantInterfaceMethodref(U2 classIndex, U2 nameAndTypeIndex) {
        super(ConstantKind.CONSTANT_InterfaceMethodref);
        this.classIndex = classIndex;
        this.nameAndTypeIndex = nameAndTypeIndex;
    }

    @Override
    public String desc() {
        return desc(classIndex, nameAndTypeIndex);
    }

    @Override
    public void validate() {
        if (this.tag != ConstantKind.CONSTANT_InterfaceMethodref) {
            throw new AssertionError();
        }

        if (!(constantPool.get(classIndex) instanceof ConstantClass)) {
            throw new AssertionError();
        }

        if (!(constantPool.get(nameAndTypeIndex) instanceof ConstantNameAndType)) {
            throw new AssertionError();
        }
    }

    @Override
    public Optional<String> detail() {
        return Optional.of(String.format("%s.%s",
                        constantPool.get(classIndex).detail(),
                        constantPool.get(nameAndTypeIndex).detail()
                )
        );
    }

    @Override
    public Optional<String> detail(ConstantPool constantPool) {
        Optional<String> detail1 = constantPool.detail(classIndex);
        Optional<String> detail2 = constantPool.detail(nameAndTypeIndex);

        if (detail1.isEmpty() || detail2.isEmpty()) {
            throw new IllegalArgumentException();
        }

        return Optional.of(String.format("%s.%s", detail1.get(), detail2.get()));
    }

    public static void main(String[] args) {
    }
}
