package com.study.type.constant.compound;

import com.study.constants.ConstantKind;
import com.study.type.ConstantPool;
import com.study.type.U2;

public class ConstantMethodref extends CompoundCpInfo {
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
    public String componentDesc(ConstantPool constantPool) {
        return desc(classIndex, nameAndTypeIndex);
    }

    @Override
    public void validate(ConstantPool constantPool) {
        if (tag != ConstantKind.CONSTANT_Methodref) {
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
    public String detail(ConstantPool constantPool) {
        String detail1 = constantPool.detail(classIndex);
        String detail2 = constantPool.detail(nameAndTypeIndex);

        return String.format("%s.%s", detail1, detail2);
    }
}
