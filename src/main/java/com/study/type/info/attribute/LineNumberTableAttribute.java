package com.study.type.info.attribute;

import com.study.type.U2;
import com.study.type.U4;

import java.util.List;

public class LineNumberTableAttribute extends AttributeInfo {
    private final List<LineNumberInfo> lineNumberTable;

    public LineNumberTableAttribute(U2 attributeNameIndex, U4 attributeLength, List<LineNumberInfo> lineNumberTable) {
        super(attributeNameIndex, attributeLength);
        this.lineNumberTable = lineNumberTable;
    }

    public List<LineNumberInfo> getLineNumberTable() {
        return lineNumberTable;
    }

    public record LineNumberInfo(U2 startPc, U2 lineNumber) {
    }
}
