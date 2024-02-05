package com.study.parser.attribute;

import com.study.type.U2;
import com.study.type.info.attribute.RawAttributeInfo;
import com.study.type.info.attribute.SignatureAttribute;

public class SignatureAttributeParser extends AttributeParser<SignatureAttribute> {
    public SignatureAttributeParser(RawAttributeInfo rawAttributeInfo) {
        super(rawAttributeInfo);
    }

    @Override
    public SignatureAttribute parse() {
        U2 signatureIndex = infoStream.readU2();
        return new SignatureAttribute(attributeNameIndex, attributeLength, signatureIndex);
    }
}
