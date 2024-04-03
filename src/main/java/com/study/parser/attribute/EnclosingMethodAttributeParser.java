package com.study.parser.attribute;

import com.study.io.U1InputStream;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.info.attribute.EnclosingMethodAttribute;

public class EnclosingMethodAttributeParser extends AttributeParser<EnclosingMethodAttribute> {
    public EnclosingMethodAttributeParser(U2 attributeNameIndex, U4 attributeLength, U1InputStream infoStream) {
        super(attributeNameIndex, attributeLength, infoStream);
    }

    @Override
    public EnclosingMethodAttribute parse() {
        U2 classIndex = infoStream.readU2();
        U2 methodIndex = infoStream.readU2();

        return new EnclosingMethodAttribute(attributeNameIndex, attributeLength, classIndex, methodIndex);
    }
}
