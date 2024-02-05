package com.study.parser.attribute;

import com.study.type.U2;
import com.study.type.info.attribute.PermittedSubclassesAttribute;
import com.study.type.info.attribute.RawAttributeInfo;

import java.util.List;

public class PermittedSubclassesParser extends AttributeParser<PermittedSubclassesAttribute>{
    public PermittedSubclassesParser(RawAttributeInfo rawAttributeInfo) {
        super(rawAttributeInfo);
    }

    @Override
    public PermittedSubclassesAttribute parse() {
        U2 number_of_classes = infoStream.readU2();
        List<U2> classes = infoStream.readU2List(number_of_classes.toInt());
        return new PermittedSubclassesAttribute(attributeNameIndex, attributeLength, classes);
    }
}
