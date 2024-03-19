package com.study.type.constant.compound;

import com.study.constants.ConstantKind;
import com.study.type.ConstantPool;
import com.study.type.U2;

public sealed abstract class ConstantMemberRef extends CompoundCpInfo permits ConstantFieldref, ConstantInterfaceMethodref, ConstantMethodref {

    protected final U2 classIndex;
    protected final U2 nameAndTypeIndex;

    protected ConstantMemberRef(ConstantKind tag, U2 classIndex, U2 nameAndTypeIndex) {
        super(tag);
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
    public String detail(ConstantPool constantPool) {
        String detail1 = constantPool.detail(classIndex);
        String detail2 = constantPool.detail(nameAndTypeIndex);

        return String.format("%s.%s", detail1, detail2);
    }

    @Override
    public void validate(ConstantPool constantPool) {
        if (!(constantPool.get(classIndex) instanceof ConstantClass)) {
            throw new AssertionError();
        }

        if (!(constantPool.get(nameAndTypeIndex) instanceof ConstantNameAndType)) {
            throw new AssertionError();
        }
    }

    public U2 getClassIndex() {
        return classIndex;
    }

    public U2 getNameAndTypeIndex() {
        return nameAndTypeIndex;
    }
}
