package com.study.parser.attribute;

import com.study.type.info.attribute.DeprecatedAttribute;
import com.study.type.info.attribute.RawAttributeInfo;

public class DeprecatedAttributeParser extends AttributeParser<DeprecatedAttribute> {
    public DeprecatedAttributeParser(RawAttributeInfo rawAttributeInfo) {
        super(rawAttributeInfo);
    }

    @Override
    public DeprecatedAttribute parse() {
        return new DeprecatedAttribute(attributeNameIndex, attributeLength);
    }
}
