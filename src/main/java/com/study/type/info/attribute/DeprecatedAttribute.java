package com.study.type.info.attribute;

import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.U4;

public class DeprecatedAttribute extends AttributeInfo {

    public DeprecatedAttribute(U2 attributeNameIndex, U4 attributeLength) {
        super(attributeNameIndex, attributeLength);
    }

    @Override
    public String describe(ConstantPool constantPool) {
        return String.format("%s: true", constantPool.desc(attributeNameIndex));
    }
}
