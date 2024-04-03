package com.study.parser.attribute;

import com.study.io.U1InputStream;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.info.attribute.LineNumberTableAttribute;

import java.util.List;

public class LineNumberTableAttributeParser extends AttributeParser<LineNumberTableAttribute> {
    public LineNumberTableAttributeParser(U2 attributeNameIndex, U4 attributeLength, U1InputStream infoStream) {
        super(attributeNameIndex, attributeLength, infoStream);
    }

    @Override
    public LineNumberTableAttribute parse() {
        U2 lineNumberTableLength = infoStream.readU2();
        List<LineNumberTableAttribute.LineNumberInfo> lineNumberTable =
                lineNumberTableLength.mapToList(this::buildLineNumberInfo);
        return new LineNumberTableAttribute(attributeNameIndex, attributeLength, lineNumberTable);
    }

    private LineNumberTableAttribute.LineNumberInfo buildLineNumberInfo() {
        return new LineNumberTableAttribute.LineNumberInfo(infoStream.readU2(), infoStream.readU2());
    }
}
