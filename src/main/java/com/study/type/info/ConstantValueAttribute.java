package com.study.type.info;

import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.constant.*;
import com.study.type.constant.leaf.*;

import java.util.Optional;
import java.util.StringJoiner;

public class ConstantValueAttribute extends AttributeInfo {
    private final U2 constantValueIndex;

    ConstantValueAttribute(AttributeInfo that) {
        super(that);
        constantValueIndex = infoStream.readU2();
        validate();
    }

    private void validate() {
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
        if (LeafCpInfo.isLeafCpInfo(cpInfo)) {
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
        } else if (cpInfo instanceof ConstantString) {
            Optional<String> detail = cpInfo.detail(constantPool);
            if (detail.isEmpty()) {
                throw new IllegalArgumentException();
            }
            joiner.add("String").add(detail.get());
        } else {
            throw new RuntimeException("Bad constant value! the index is: " + index);
        }

        return joiner.toString();
    }

    @Override
    public String describe(int indent) {
        StringBuilder stringBuilder = withIndent(indent).append("ConstantValue: ");
        int index = constantValueIndex.toInt();
        CpInfo constant = constantPool.get(index);
        if (constant instanceof ConstantLong) {
            stringBuilder.append("long").append(" ").append(constant.desc());
        } else if (constant instanceof ConstantFloat) {
            stringBuilder.append("float").append(" ").append(constant.desc());
        } else if (constant instanceof ConstantDouble) {
            stringBuilder.append("double").append(" ").append(constant.desc());
        } else if (constant instanceof ConstantInteger) {
            stringBuilder.append("int").append(" ").append(constant.desc());
        } else if (constant instanceof ConstantString) {
            stringBuilder.append("String").append(" ").append(constant.detail());
        } else {
            throw new RuntimeException("Bad constant value! the index is: " + index);
        }

        stringBuilder.append('\n');
        return stringBuilder.toString();
    }
}
