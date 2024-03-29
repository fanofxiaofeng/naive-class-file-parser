package com.study.type.constant;

import com.study.constants.ConstantKind;
import com.study.type.AbstractU;
import com.study.type.ConstantPool;
import com.study.type.constant.compound.CompoundCpInfo;
import com.study.type.constant.compound.ConstantNameAndType;

public abstract class CpInfo {

    protected final ConstantKind tag;

    protected CpInfo(ConstantKind tag) {
        this.tag = tag;
    }

    public abstract String desc();

    protected String desc(AbstractU u1, AbstractU u2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('#');
        stringBuilder.append(u1.toInt());
        if (this instanceof ConstantNameAndType) {
            stringBuilder.append(':');
        } else {
            stringBuilder.append('.');
        }
        stringBuilder.append('#');
        stringBuilder.append(u2.toInt());
        return stringBuilder.toString();
    }

    public void validate(ConstantPool constantPool) {

    }

    /**
     * Should use the following method instead
     * {@link CompoundCpInfo#detail(ConstantPool)}
     */
    @Deprecated
    public String detail() {
        throw new IllegalArgumentException();
    }


    public ConstantKind getTag() {
        return tag;
    }
}
