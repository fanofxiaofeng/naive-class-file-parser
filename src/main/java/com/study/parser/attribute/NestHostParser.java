package com.study.parser.attribute;

import com.study.io.U1InputStream;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.info.attribute.NestHostAttribute;

public class NestHostParser extends AttributeParser<NestHostAttribute> {
    public NestHostParser(U2 attributeNameIndex, U4 attributeLength, U1InputStream infoStream) {
        super(attributeNameIndex, attributeLength, infoStream);
    }

    @Override
    public NestHostAttribute parse() {
        U2 hostClassIndex = infoStream.readU2();
        return new NestHostAttribute(attributeNameIndex, attributeLength, hostClassIndex);
    }
}
