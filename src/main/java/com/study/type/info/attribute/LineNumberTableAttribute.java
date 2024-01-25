package com.study.type.info.attribute;

import com.study.io.U1InputStream;
import com.study.type.U2;
import com.study.type.info.attribute.AttributeInfo;

public class LineNumberTableAttribute extends AttributeInfo {
    private U2 lineNumberTableLength;
    private LineNumberInfo[] lineNumberTable;

    public LineNumberTableAttribute(RawAttributeInfo that) {
        super(that);
        U1InputStream infoStream = that.getInfoStream();
        lineNumberTableLength = infoStream.readU2();
        int count = lineNumberTableLength.toInt();
        lineNumberTable = new LineNumberInfo[count];
        for (int i = 0; i < count; i++) {
            U2 startPc = infoStream.readU2();
            U2 lineNumber = infoStream.readU2();
            lineNumberTable[i] = new LineNumberInfo(startPc, lineNumber);
        }
    }

    @Override
    public String describe(int indent) {
        StringBuilder stringBuilder = withIndent(indent).append("LineNumberTable:\n");
        for (LineNumberInfo lineNumberInfo : lineNumberTable) {
            stringBuilder.append(String.format("%sline %s: %s\n",
                    indentedString(indent + 2),
                    lineNumberInfo.lineNumber.toInt(),
                    lineNumberInfo.startPc.toInt()));
        }
        return stringBuilder.toString();
    }

    private class LineNumberInfo {
        private U2 startPc;
        private U2 lineNumber;

        public LineNumberInfo(U2 startPc, U2 lineNumber) {
            this.startPc = startPc;
            this.lineNumber = lineNumber;
        }
    }
}
