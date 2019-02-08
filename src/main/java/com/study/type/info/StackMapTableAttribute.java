package com.study.type.info;

import com.study.type.U2;

public class StackMapTableAttribute extends AttributeInfo {
    private U2 numberOfEntries;

    protected StackMapTableAttribute(AttributeInfo that) {
        super(that);
        numberOfEntries = infoStream.readU2();
    }

    @Override
    public String describe(int indent) {
        StringBuilder stringBuilder = withIndent(indent);
        stringBuilder.append(String.format("%s: number_of_entries = %s",
                constantPool[attributeNameIndex.toInt()].desc(),
                numberOfEntries.toInt()
        ));
        return stringBuilder.toString();
    }
}
