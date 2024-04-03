package com.study.type.info.attribute;

import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.U4;

public class AttributeInfo {

    protected U2 attributeNameIndex;
    protected U4 attributeLength;

    protected AttributeInfo(U2 attributeNameIndex, U4 attributeLength) {
        this.attributeNameIndex = attributeNameIndex;
        this.attributeLength = attributeLength;
    }

    protected AttributeInfo(RawAttributeInfo rawAttributeInfo) {
        this.attributeNameIndex = rawAttributeInfo.getAttributeNameIndex();
        this.attributeLength = rawAttributeInfo.getAttributeLength();
    }

    public String describe(ConstantPool constantPool) {
        return "to be implemented...";
//        throw new UnsupportedOperationException();
    }

    protected String buildName(ConstantPool constantPool) {
        return constantPool.desc(attributeNameIndex);
    }

    public U2 getAttributeNameIndex() {
        return attributeNameIndex;
    }

    public U4 getAttributeLength() {
        return attributeLength;
    }
}

