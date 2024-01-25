package com.study.type.constant.compound;

import com.study.constants.ConstantKind;
import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.constant.CpInfo;

public abstract class CompoundCpInfo extends CpInfo {
    protected CompoundCpInfo(ConstantKind tag) {
        super(tag);
    }

    @Override
    public String desc() {
        throw new IllegalArgumentException();
    }

    public abstract String componentDesc(ConstantPool constantPool);

    protected String componentDescForSingleIndex(U2 index) {
        return "#" + index.toInt();
    }

    public abstract String detail(ConstantPool constantPool);
}
