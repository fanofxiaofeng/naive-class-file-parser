package com.study.type.constant;

import com.study.constants.ConstantKind;
import com.study.type.ConstantPool;
import com.study.type.U2;

import java.util.Optional;

public class ConstantMethodref extends AbstractConstant {
    private final U2 classIndex;
    private final U2 nameAndTypeIndex;

    public ConstantMethodref(U2 classIndex, U2 nameAndTypeIndex) {
        super(ConstantKind.CONSTANT_Methodref);
        this.classIndex = classIndex;
        this.nameAndTypeIndex = nameAndTypeIndex;
    }

    @Override
    public String desc() {
        return desc(classIndex, nameAndTypeIndex);
    }

    @Override
    public String type() {
        return "Methodref";
    }

    @Override
    public void validate() {
        if (this.tag != ConstantKind.CONSTANT_Methodref) {
            throw new AssertionError();
        }

        if (!(constantPool.get(classIndex.toInt()) instanceof ConstantClass)) {
            throw new AssertionError();
        }

        if (!(constantPool.get(nameAndTypeIndex.toInt()) instanceof ConstantNameAndType)) {
            throw new AssertionError();
        }
    }

    @Override
    public Optional<String> detail() {
        return Optional.of(String.format("%s.%s",
                        constantPool.get(classIndex.toInt()).detail(),
                        constantPool.get(nameAndTypeIndex.toInt()).detail()
                )
        );
    }

    @Override
    public Optional<String> detail(ConstantPool constantPool) {
        Optional<String> detail1 = constantPool.get(classIndex).detail(constantPool);
        Optional<String> detail2 = constantPool.get(nameAndTypeIndex).detail(constantPool);

        if (detail1.isEmpty() || detail2.isEmpty()) {
            throw new IllegalArgumentException();
        }

        return Optional.of(String.format("%s.%s", detail1.get(), detail2.get()));
    }
}
