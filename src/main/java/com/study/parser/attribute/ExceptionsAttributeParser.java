package com.study.parser.attribute;

import com.study.io.U1InputStream;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.info.attribute.ExceptionsAttribute;

import java.util.List;

public class ExceptionsAttributeParser extends AttributeParser<ExceptionsAttribute> {
    public ExceptionsAttributeParser(U2 attributeNameIndex, U4 attributeLength, U1InputStream infoSteam) {
        super(attributeNameIndex, attributeLength, infoSteam);
    }

    @Override
    public ExceptionsAttribute parse() {
        U2 numberOfExceptions = infoStream.readU2();
        List<U2> exceptionIndexTable = numberOfExceptions.mapToList(() -> infoStream.readU2());
        return new ExceptionsAttribute(attributeNameIndex, attributeLength, exceptionIndexTable);
    }
}
