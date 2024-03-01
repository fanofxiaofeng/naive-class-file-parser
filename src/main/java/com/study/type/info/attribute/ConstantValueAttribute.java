package com.study.type.info.attribute;

import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.constant.CpInfo;
import com.study.type.constant.compound.ConstantString;
import com.study.type.constant.leaf.*;
import com.study.util.CpInfoUtils;

import java.util.StringJoiner;

public class ConstantValueAttribute extends AttributeInfo {
    private final U2 constantValueIndex;

    public ConstantValueAttribute(U2 attributeNameIndex, U4 attributeLength, U2 constantValueIndex) {
        super(attributeNameIndex, attributeLength);
        this.constantValueIndex = constantValueIndex;
    }

    private void validate(ConstantPool constantPool) {
        CpInfo constant = constantPool.get(attributeNameIndex);
        if (!(constant instanceof ConstantUtf8) ||
                !"ConstantValue".equals(constant.desc())) {
            throw new AssertionError();
        }
        if (attributeLength.toInt() != 2) {
            throw new AssertionError();
        }
    }

    @Override
    public String describe(ConstantPool constantPool) {
        StringJoiner joiner = new StringJoiner(" ");
        joiner.add("ConstantValue:");
        int index = constantValueIndex.toInt();
        CpInfo cpInfo = constantPool.get(index);
        if (CpInfoUtils.isLeafCpInfo(cpInfo)) {
            if (cpInfo instanceof ConstantLong) {
                joiner.add("long").add(cpInfo.desc());
            } else if (cpInfo instanceof ConstantFloat) {
                joiner.add("float").add(cpInfo.desc());
            } else if (cpInfo instanceof ConstantDouble) {
                joiner.add("double").add(cpInfo.desc());
            } else if (cpInfo instanceof ConstantInteger) {
                joiner.add("int").add(cpInfo.desc());
            } else {
                throw new IllegalArgumentException();
            }
        } else if (cpInfo instanceof ConstantString specified) {
            String detail = specified.detail(constantPool);
            joiner.add("String").add(detail);
        } else {
            throw new RuntimeException("Bad constant value! the index is: " + index);
        }

        return joiner.toString();
    }
}
