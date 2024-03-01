package com.study.type.constant.compound;

import com.study.constants.ConstantKind;
import com.study.type.ConstantPool;
import com.study.type.U2;

public class ConstantInvokeDynamic extends CompoundCpInfo {

    private final U2 bootstrapMethodAttrIndex;
    private final U2 nameAndTypeIndex;

    public ConstantInvokeDynamic(U2 bootstrapMethodAttrIndex, U2 nameAndTypeIndex) {
        super(ConstantKind.CONSTANT_InvokeDynamic);
        this.bootstrapMethodAttrIndex = bootstrapMethodAttrIndex;
        this.nameAndTypeIndex = nameAndTypeIndex;
    }

    @Override
    public String desc() {
        return String.format("#%s:#%s", bootstrapMethodAttrIndex.toInt(), nameAndTypeIndex.toInt());
    }

    @Override
    public String componentDesc(ConstantPool constantPool) {
        return String.format("#%s:#%s", bootstrapMethodAttrIndex.toInt(), nameAndTypeIndex.toInt());
    }

    @Override
    public String detail(ConstantPool constantPool) {
        String nameAndTypeDetail = constantPool.detail(nameAndTypeIndex);

        return String.format("#%s:%s",
                bootstrapMethodAttrIndex.toInt(),
                nameAndTypeDetail);
    }
}
