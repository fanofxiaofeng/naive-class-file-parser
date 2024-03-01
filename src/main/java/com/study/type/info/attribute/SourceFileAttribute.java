package com.study.type.info.attribute;

import com.study.type.U2;
import com.study.type.U4;

public class SourceFileAttribute extends AttributeInfo {
    private final U2 sourceFileIndex;

    public SourceFileAttribute(U2 attributeNameIndex, U4 attributeLength, U2 sourceFileIndex) {
        super(attributeNameIndex, attributeLength);
        this.sourceFileIndex = sourceFileIndex;
    }

    public U2 getSourceFileIndex() {
        return sourceFileIndex;
    }
}
