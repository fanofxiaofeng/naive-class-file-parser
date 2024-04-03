package com.study.parser.attribute;

import com.study.io.U1InputStream;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.info.attribute.NestMembersAttribute;

import java.util.List;

public class NestMembersParser extends AttributeParser<NestMembersAttribute> {

    public NestMembersParser(U2 attributeNameIndex, U4 attributeLength, U1InputStream infoStream) {
        super(attributeNameIndex, attributeLength, infoStream);
    }

    @Override
    public NestMembersAttribute parse() {
        U2 numberOfClasses = infoStream.readU2();
        List<U2> classes = infoStream.readU2List(numberOfClasses);
        return new NestMembersAttribute(attributeNameIndex, attributeLength, classes);
    }
}
