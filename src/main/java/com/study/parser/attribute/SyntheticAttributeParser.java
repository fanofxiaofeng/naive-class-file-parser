package com.study.parser.attribute;

import com.study.io.U1InputStream;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.info.attribute.SyntheticAttribute;

public class SyntheticAttributeParser extends AttributeParser<SyntheticAttribute> {
    public SyntheticAttributeParser(U2 attributeNameIndex, U4 attributeLength, U1InputStream infoStream) {
        super(attributeNameIndex, attributeLength, infoStream);
    }

    @Override
    public SyntheticAttribute parse() {
        return new SyntheticAttribute(attributeNameIndex, attributeLength);
    }
}
