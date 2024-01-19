package com.study.type.constant;

import com.study.constants.ConstantKind;
import com.study.type.ConstantPool;
import com.study.type.U2;

import java.util.Optional;

public class ConstantFieldref extends AbstractConstant {
    private final U2 classIndex;
    private final U2 nameAndTypeIndex;

    public ConstantFieldref(U2 classIndex, U2 nameAndTypeIndex) {
        super(ConstantKind.CONSTANT_Fieldref);
        this.classIndex = classIndex;
        this.nameAndTypeIndex = nameAndTypeIndex;
    }

    @Override
    public String desc() {
        return desc(classIndex, nameAndTypeIndex);
    }

    @Override
    public String type() {
        return "Fieldref";
    }

    @Override
    public void validate() {
        if (this.tag != ConstantKind.CONSTANT_Fieldref) {
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
                        constantPool.get(classIndex).detail().get(),
                        constantPool.get(nameAndTypeIndex).detail().get()
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

        String detail = String.format("%s.%s", detail1.get(), detail2.get());
        return Optional.of(detail);
    }
}
