package com.study.type.info;

import com.study.type.U2;
import com.study.type.constant.*;

public class ConstantValueAttribute extends AttributeInfo {
    private U2 constantValueIndex;

    ConstantValueAttribute(AttributeInfo that) {
        super(that);
        constantValueIndex = infoStream.readU2();
        validate();
    }

    private void validate() {
        AbstractConstant constant = constantPool.get(attributeNameIndex);
        if (!(constant instanceof ConstantUtf8) ||
                !"ConstantValue".equals(constant.desc())) {
            throw new AssertionError();
        }
        if (attributeLength.toInt() != 2) {
            throw new AssertionError();
        }
    }

    @Override
    public String describe(int indent) {
        StringBuilder stringBuilder = withIndent(indent).append("ConstantValue: ");
        int index = constantValueIndex.toInt();
        AbstractConstant constant = constantPool.get(index);
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
