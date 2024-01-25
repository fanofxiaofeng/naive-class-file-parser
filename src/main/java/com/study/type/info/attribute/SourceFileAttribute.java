package com.study.type.info.attribute;

import com.study.io.U1InputStream;
import com.study.type.U2;

public class SourceFileAttribute extends AttributeInfo {
    private U2 sourceFileIndex;

    public SourceFileAttribute(RawAttributeInfo that) {
        super(that);
        U1InputStream infoStream = that.getInfoStream();
        this.sourceFileIndex = infoStream.readU2();
    }

    @Override
    public String describe(int indent) {
        StringBuilder stringBuilder = withIndent(indent).append("SourceFile: ");
        stringBuilder.append(String.format("\"%s\"\n", constantPool.get(sourceFileIndex.toInt()).desc()));
        return stringBuilder.toString();
    }
}
