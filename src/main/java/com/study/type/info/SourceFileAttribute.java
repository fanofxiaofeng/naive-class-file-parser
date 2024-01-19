package com.study.type.info;

import com.study.type.U2;

public class SourceFileAttribute extends AttributeInfo {
    private U2 sourceFileIndex;

    SourceFileAttribute(AttributeInfo that) {
        super(that);
        this.sourceFileIndex = infoStream.readU2();
    }

    @Override
    public String describe(int indent) {
        StringBuilder stringBuilder = withIndent(indent).append("SourceFile: ");
        stringBuilder.append(String.format("\"%s\"\n", constantPool.get(sourceFileIndex.toInt()).desc()));
        return stringBuilder.toString();
    }
}
