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
        AbstractConstant constant = constantPool[attributeNameIndex.toInt()];
        if (!ConstantUtf8.class.isInstance(constant) ||
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
        AbstractConstant constant = constantPool[index];
        if (ConstantLong.class.isInstance(constant)) {
            stringBuilder.append("long").append(" ").append(constant.desc());
        } else if (ConstantFloat.class.isInstance(constant)) {
            stringBuilder.append("float").append(" ").append(constant.desc());
        } else if (ConstantDouble.class.isInstance(constant)) {
            stringBuilder.append("double").append(" ").append(constant.desc());
        } else if (ConstantInteger.class.isInstance(constant)) {
            stringBuilder.append("int").append(" ").append(constant.desc());
        } else if (ConstantString.class.isInstance(constant)) {
            stringBuilder.append("String").append(" ").append(constant.detail());
        } else {
            throw new RuntimeException("Bad constant value! the index is: " + index);
        }

        stringBuilder.append('\n');
        return stringBuilder.toString();
    }
}
