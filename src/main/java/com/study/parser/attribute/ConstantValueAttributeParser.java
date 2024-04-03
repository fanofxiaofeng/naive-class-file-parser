package com.study.parser.attribute;

import com.study.io.U1InputStream;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.info.attribute.ConstantValueAttribute;

public class ConstantValueAttributeParser extends AttributeParser<ConstantValueAttribute> {

    public ConstantValueAttributeParser(U2 attributeNameIndex, U4 attributeLength, U1InputStream infoStream) {
        super(attributeNameIndex, attributeLength, infoStream);
    }

    @Override
    public ConstantValueAttribute parse() {
        U2 constantValueIndex = infoStream.readU2();
        return new ConstantValueAttribute(attributeNameIndex, attributeLength, constantValueIndex);
    }
}
