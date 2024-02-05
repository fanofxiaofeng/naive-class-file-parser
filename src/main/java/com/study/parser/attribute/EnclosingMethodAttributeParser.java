package com.study.parser.attribute;

import com.study.type.U2;
import com.study.type.info.attribute.EnclosingMethodAttribute;
import com.study.type.info.attribute.RawAttributeInfo;

public class EnclosingMethodAttributeParser extends AttributeParser<EnclosingMethodAttribute> {
    public EnclosingMethodAttributeParser(RawAttributeInfo rawAttributeInfo) {
        super(rawAttributeInfo);
    }

    @Override
    public EnclosingMethodAttribute parse() {
        U2 classIndex = infoStream.readU2();
        U2 methodIndex = infoStream.readU2();

        return new EnclosingMethodAttribute(attributeNameIndex, attributeLength, classIndex, methodIndex);
    }
}
