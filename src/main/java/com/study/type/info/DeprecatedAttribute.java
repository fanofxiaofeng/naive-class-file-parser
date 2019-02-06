package com.study.type.info;

public class DeprecatedAttribute extends AttributeInfo {

    DeprecatedAttribute(AttributeInfo that) {
        super(that);
    }

    @Override
    public String describe(int indent) {
        StringBuilder stringBuilder = withIndent(indent);
        stringBuilder.append(String.format("%s: true\n", constantPool[attributeNameIndex.toInt()].desc()));
        return stringBuilder.toString();
    }
}
