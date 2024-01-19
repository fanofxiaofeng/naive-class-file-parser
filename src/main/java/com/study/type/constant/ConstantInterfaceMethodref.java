package com.study.type.constant;

import com.study.constants.ConstantKind;
import com.study.type.U2;

import java.util.Optional;

public class ConstantInterfaceMethodref extends AbstractConstant {

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
    public String type() {
        return "InterfaceMethodref";
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

    public static void main(String[] args) {
    }
}
