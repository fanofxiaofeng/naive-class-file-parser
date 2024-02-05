package com.study.parser.attribute;

import com.study.type.info.attribute.RawAttributeInfo;
import com.study.type.info.attribute.SyntheticAttribute;

public class SyntheticAttributeParser extends AttributeParser<SyntheticAttribute> {
    public SyntheticAttributeParser(RawAttributeInfo rawAttributeInfo) {
        super(rawAttributeInfo);
    }

    @Override
    public SyntheticAttribute parse() {
        return new SyntheticAttribute(attributeNameIndex, attributeLength);
    }
}
