package com.study.type.info.attribute;

import com.study.type.U2;
import com.study.type.U4;

public class NestHostAttribute extends AttributeInfo {

    private final U2 hostClassIndex;

    public NestHostAttribute(U2 attributeNameIndex, U4 attributeLength, U2 hostClassIndex) {
        super(attributeNameIndex, attributeLength);
        this.hostClassIndex = hostClassIndex;
    }

    public U2 getHostClassIndex() {
        return hostClassIndex;
    }
}
