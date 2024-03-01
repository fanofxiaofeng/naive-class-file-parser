package com.study.parser.attribute;

import com.study.type.U2;
import com.study.type.info.attribute.NestHostAttribute;
import com.study.type.info.attribute.RawAttributeInfo;

public class NestHostParser extends AttributeParser<NestHostAttribute> {
    public NestHostParser(RawAttributeInfo rawAttributeInfo) {
        super(rawAttributeInfo);
    }

    @Override
    public NestHostAttribute parse() {
        U2 hostClassIndex = infoStream.readU2();
        return new NestHostAttribute(attributeNameIndex, attributeLength, hostClassIndex);
    }
}
