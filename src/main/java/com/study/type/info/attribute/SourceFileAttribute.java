package com.study.type.info.attribute;

import com.study.type.U2;
import com.study.type.U4;

public class SourceFileAttribute extends AttributeInfo {
    private final U2 sourceFileIndex;

    public SourceFileAttribute(U2 attributeNameIndex, U4 attributeLength, U2 sourceFileIndex) {
        super(attributeNameIndex, attributeLength);
        this.sourceFileIndex = sourceFileIndex;
    }

    @Override
    public String describe(int indent) {
        StringBuilder stringBuilder = withIndent(indent).append("SourceFile: ");
        stringBuilder.append(String.format("\"%s\"\n", constantPool.get(sourceFileIndex.toInt()).desc()));
        return stringBuilder.toString();
    }

    public U2 getSourceFileIndex() {
        return sourceFileIndex;
    }
}
