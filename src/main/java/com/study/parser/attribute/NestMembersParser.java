package com.study.parser.attribute;

import com.study.type.U2;
import com.study.type.info.attribute.NestMembersAttribute;
import com.study.type.info.attribute.RawAttributeInfo;

import java.util.List;

public class NestMembersParser extends AttributeParser<NestMembersAttribute> {

    public NestMembersParser(RawAttributeInfo rawAttributeInfo) {
        super(rawAttributeInfo);
    }

    @Override
    public NestMembersAttribute parse() {
        U2 numberOfClasses = infoStream.readU2();
        List<U2> classes = infoStream.readU2List(numberOfClasses.toInt());
        return new NestMembersAttribute(attributeNameIndex, attributeLength, classes);
    }
}
