package com.study.parser.attribute;

import com.study.io.U1InputStream;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.info.attribute.PermittedSubclassesAttribute;

import java.util.List;

public class PermittedSubclassesParser extends AttributeParser<PermittedSubclassesAttribute> {
    public PermittedSubclassesParser(U2 attributeNameIndex, U4 attributeLength, U1InputStream infoStream) {
        super(attributeNameIndex, attributeLength, infoStream);
    }

    @Override
    public PermittedSubclassesAttribute parse() {
        U2 numberOfClasses = infoStream.readU2();
        List<U2> classes = infoStream.readU2List(numberOfClasses);
        return new PermittedSubclassesAttribute(attributeNameIndex, attributeLength, classes);
    }
}
