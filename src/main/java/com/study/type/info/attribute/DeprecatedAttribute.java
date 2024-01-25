package com.study.type.info.attribute;

import com.study.type.ConstantPool;

public class DeprecatedAttribute extends AttributeInfo {

    public DeprecatedAttribute(RawAttributeInfo that) {
        super(that);
    }

    @Override
    public String describe(int indent) {
        StringBuilder stringBuilder = withIndent(indent);
        stringBuilder.append(String.format("%s: true\n", constantPool.get(attributeNameIndex).desc()));
        return stringBuilder.toString();
    }

    @Override
    public String describe(ConstantPool constantPool) {
        return String.format("%s: true", constantPool.desc(attributeNameIndex));
    }
}
