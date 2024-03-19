package com.study.parser.attribute;

import com.study.type.U2;
import com.study.type.info.attribute.LineNumberTableAttribute;
import com.study.type.info.attribute.RawAttributeInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class LineNumberTableAttributeParser extends AttributeParser<LineNumberTableAttribute> {
    public LineNumberTableAttributeParser(RawAttributeInfo rawAttributeInfo) {
        super(rawAttributeInfo);
    }

    @Override
    public LineNumberTableAttribute parse() {
        U2 lineNumberTableLength = infoStream.readU2();
        List<LineNumberTableAttribute.LineNumberInfo> lineNumberTable = new ArrayList<>(lineNumberTableLength.toInt());
        IntStream.range(0, lineNumberTableLength.toInt()).
                forEach(i -> lineNumberTable.add(buildLineNumberInfo()));

        return new LineNumberTableAttribute(attributeNameIndex, attributeLength, lineNumberTable);
    }

    private LineNumberTableAttribute.LineNumberInfo buildLineNumberInfo() {
        return new LineNumberTableAttribute.LineNumberInfo(infoStream.readU2(), infoStream.readU2());
    }
}
