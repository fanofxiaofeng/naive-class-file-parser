package com.study.parser.attribute;

import com.study.io.U1InputStream;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.info.attribute.DeprecatedAttribute;

public class DeprecatedAttributeParser extends AttributeParser<DeprecatedAttribute> {
    public DeprecatedAttributeParser(U2 attributeNameIndex, U4 attributeLength, U1InputStream infoStream) {
        super(attributeNameIndex, attributeLength, infoStream);
    }

    @Override
    public DeprecatedAttribute parse() {
        return new DeprecatedAttribute(attributeNameIndex, attributeLength);
    }
}
