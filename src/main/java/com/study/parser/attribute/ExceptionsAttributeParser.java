package com.study.parser.attribute;

import com.study.type.U2;
import com.study.type.info.attribute.ExceptionsAttribute;
import com.study.type.info.attribute.RawAttributeInfo;

import java.util.ArrayList;
import java.util.List;

public class ExceptionsAttributeParser extends AttributeParser<ExceptionsAttribute>{
    public ExceptionsAttributeParser(RawAttributeInfo rawAttributeInfo) {
        super(rawAttributeInfo);
    }

    @Override
    public ExceptionsAttribute parse() {
        U2 numberOfExceptions = infoStream.readU2();
        List<U2> exceptionIndexTable = new ArrayList<>(numberOfExceptions.toInt());
        numberOfExceptions.forEach(index -> exceptionIndexTable.add(infoStream.readU2()));
        return new ExceptionsAttribute(attributeNameIndex, attributeLength, exceptionIndexTable);
    }
}
