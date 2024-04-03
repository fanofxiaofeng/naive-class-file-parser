package com.study.parser.attribute;

import com.study.io.U1InputStream;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.info.attribute.SourceFileAttribute;

public class SourceFileAttributeParser extends AttributeParser<SourceFileAttribute> {
    public SourceFileAttributeParser(U2 attributeNameIndex, U4 attributeLength, U1InputStream infoSteam) {
        super(attributeNameIndex, attributeLength, infoSteam);
    }

    @Override
    public SourceFileAttribute parse() {
        U2 sourceFileIndex = infoStream.readU2();
        return new SourceFileAttribute(attributeNameIndex, attributeLength, sourceFileIndex);
    }
}
