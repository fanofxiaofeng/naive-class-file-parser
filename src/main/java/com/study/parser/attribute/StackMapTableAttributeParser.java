package com.study.parser.attribute;

import com.study.io.U1InputStream;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.info.attribute.StackMapTableAttribute;
import com.study.type.info.frame.StackMapFrame;
import com.study.type.info.frame.StackMapFrameFactory;

public class StackMapTableAttributeParser extends AttributeParser<StackMapTableAttribute> {
    public StackMapTableAttributeParser(U2 attributeNameIndex, U4 attributeLength, U1InputStream infoStream) {
        super(attributeNameIndex, attributeLength, infoStream);
    }

    @Override
    public StackMapTableAttribute parse() {
        U2 numberOfEntries = infoStream.readU2();

        StackMapFrame[] entries = new StackMapFrame[numberOfEntries.toInt()];
        for (int i = 0; i < numberOfEntries.toInt(); i++) {
            entries[i] = StackMapFrameFactory.build(infoStream);
        }
        return new StackMapTableAttribute(attributeNameIndex, attributeLength, entries);
    }
}
