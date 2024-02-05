package com.study.parser.attribute;

import com.study.type.U2;
import com.study.type.info.attribute.RawAttributeInfo;
import com.study.type.info.attribute.SourceFileAttribute;

public class SourceFileAttributeParser extends AttributeParser<SourceFileAttribute> {
    public SourceFileAttributeParser(RawAttributeInfo rawAttributeInfo) {
        super(rawAttributeInfo);
    }

    @Override
    public SourceFileAttribute parse() {
        U2 sourceFileIndex = infoStream.readU2();
        return new SourceFileAttribute(attributeNameIndex, attributeLength, sourceFileIndex);
    }
}
