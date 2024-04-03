package com.study.parser.attribute;

import com.study.io.U1InputStream;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.info.attribute.SignatureAttribute;

public class SignatureAttributeParser extends AttributeParser<SignatureAttribute> {
    public SignatureAttributeParser(U2 attributeNameIndex, U4 attributeLength, U1InputStream infoStream) {
        super(attributeNameIndex, attributeLength, infoStream);
    }

    @Override
    public SignatureAttribute parse() {
        U2 signatureIndex = infoStream.readU2();
        return new SignatureAttribute(attributeNameIndex, attributeLength, signatureIndex);
    }
}
