package com.study.parser.attribute;

import com.study.io.U1InputStream;
import com.study.parser.Parser;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.info.attribute.AttributeInfo;
import com.study.type.info.attribute.RawAttributeInfo;

public abstract class AttributeParser<T extends AttributeInfo> implements Parser<T> {

    protected U2 attributeNameIndex;
    protected U4 attributeLength;
    protected U1InputStream infoStream;

    protected AttributeParser(RawAttributeInfo rawAttributeInfo) {
        this.attributeNameIndex = rawAttributeInfo.getAttributeNameIndex();
        this.attributeLength = rawAttributeInfo.getAttributeLength();
        this.infoStream = rawAttributeInfo.getInfoStream();
    }

    protected AttributeParser(U2 attributeNameIndex, U4 attributeLength, U1InputStream infoStream) {
        this.attributeNameIndex = attributeNameIndex;
        this.attributeLength = attributeLength;
        this.infoStream = infoStream;
    }
}
