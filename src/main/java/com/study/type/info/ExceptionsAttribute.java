package com.study.type.info;

import com.study.type.U2;

import java.util.StringJoiner;

public class ExceptionsAttribute extends AttributeInfo {
    private U2 numberOfExceptions;
    private U2[] exceptionIndexTable;

    ExceptionsAttribute(AttributeInfo that) {
        super(that);

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
                joiner.add(AttributeInfo.constantPool[u2.toInt()].detail().replaceAll("/", "."));
            }
            stringBuilder.append(joiner.toString());
        }
        stringBuilder.append('\n');
        return stringBuilder.toString();
    }
}
