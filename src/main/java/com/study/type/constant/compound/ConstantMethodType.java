package com.study.type.constant.compound;

import com.study.constants.ConstantKind;
import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.constant.leaf.LeafCpInfo;

public class ConstantMethodType extends CompoundCpInfo {

    private final U2 descriptorIndex;

    public ConstantMethodType(U2 descriptorIndex) {
        super(ConstantKind.CONSTANT_MethodType);
        this.descriptorIndex = descriptorIndex;
    }

    @Override
    public String desc() {
        return "#" + descriptorIndex.toInt();
    }

    @Override
    public String componentDesc(ConstantPool constantPool) {
        return "#" + descriptorIndex.toInt();
    }

    @Override
    public void validate(ConstantPool constantPool) {
    }

    @Override
    public String detail(ConstantPool constantPool) {
        return constantPool.get(descriptorIndex, LeafCpInfo.class).desc();
    }

    @Override
    public String decoratedDetail(ConstantPool constantPool) {
        return " " + detail(constantPool);
    }
}
