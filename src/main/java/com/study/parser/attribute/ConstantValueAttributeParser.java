package com.study.parser.attribute;

import com.study.type.U2;
import com.study.type.info.attribute.ConstantValueAttribute;
import com.study.type.info.attribute.RawAttributeInfo;

public class ConstantValueAttributeParser extends AttributeParser<ConstantValueAttribute> {

    public ConstantValueAttributeParser(RawAttributeInfo that) {
        super(that);
    }

    @Override
    public ConstantValueAttribute parse() {
        U2 constantValueIndex = infoStream.readU2();
        return new ConstantValueAttribute(attributeNameIndex, attributeLength, constantValueIndex);
    }
}
