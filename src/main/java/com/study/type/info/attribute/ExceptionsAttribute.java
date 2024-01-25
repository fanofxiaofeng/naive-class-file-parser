package com.study.type.info.attribute;

import com.study.io.U1InputStream;
import com.study.type.U2;
import com.study.type.info.attribute.AttributeInfo;

import java.util.StringJoiner;

public class ExceptionsAttribute extends AttributeInfo {
    private U2 numberOfExceptions;
    private U2[] exceptionIndexTable;

    public ExceptionsAttribute(RawAttributeInfo that) {
        super(that);

        U1InputStream infoStream = that.getInfoStream();
        numberOfExceptions = infoStream.readU2();
        exceptionIndexTable = infoStream.readU2Array(numberOfExceptions.toInt());
    }

    @Override
    public String describe(int indent) {
        StringBuilder stringBuilder = new StringBuilder();
        if (numberOfExceptions.toInt() > 0) {
            String nameLine = withIndent(indent).append("Exceptions:\n").toString();
            stringBuilder.append(nameLine);

            String detailLine = withIndent(indent + 2).append("throws ").toString();
            stringBuilder.append(detailLine);

            StringJoiner joiner = new StringJoiner(", ");
            for (U2 u2 : exceptionIndexTable) {
                System.out.println(u2.toInt());
                joiner.add(AttributeInfo.constantPool.get(u2).detail().replaceAll("/", "."));
            }
            stringBuilder.append(joiner);
        }
        stringBuilder.append('\n');
        return stringBuilder.toString();
    }
}
