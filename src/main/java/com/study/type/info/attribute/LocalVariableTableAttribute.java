package com.study.type.info.attribute;

import com.study.io.U1InputStream;
import com.study.type.U2;
import com.study.type.info.attribute.AttributeInfo;

public class LocalVariableTableAttribute extends AttributeInfo {

    private U2 localVariableTableLength;
    private LocalVariableTable[] localVariableTable;

    public LocalVariableTableAttribute(RawAttributeInfo that) {
        super(that);
        U1InputStream infoStream = that.getInfoStream();
        this.localVariableTableLength = infoStream.readU2();
        int count = this.localVariableTableLength.toInt();
        this.localVariableTable = new LocalVariableTable[count];
        for (int i = 0; i < count; i++) {
            this.localVariableTable[i] = new LocalVariableTable(infoStream);
        }
    }

    @Override
    public String describe(int indent) {
        StringBuilder stringBuilder = withIndent(indent).append(constantPool.get(this.attributeNameIndex.toInt()).desc()).append(":\n");
        stringBuilder.append(String.format("%sStart  Length  Slot  Name   Signature\n", indentedString(indent + 2)));
        int count = this.localVariableTableLength.toInt();
        if (count > 0) {
            for (LocalVariableTable item : this.localVariableTable) {
                String name = constantPool.get(item.nameIndex.toInt()).desc();
                String desc = constantPool.get(item.descriptorIndex.toInt()).desc();
                stringBuilder.append(String.format("%s%5s%8s%6s %5s   %s\n",
                        indentedString(indent + 2),
                        item.startPc.toInt(),
                        item.length.toInt(),
                        item.index.toInt(),
                        name,
                        desc));
            }
        }
        return stringBuilder.toString();
    }

    private class LocalVariableTable {
        private U2 startPc;
        private U2 length;
        private U2 nameIndex;
        private U2 descriptorIndex;
        private U2 index;

        LocalVariableTable(U1InputStream u1InputStream) {
            this.startPc = u1InputStream.readU2();
            this.length = u1InputStream.readU2();
            this.nameIndex = u1InputStream.readU2();
            this.descriptorIndex = u1InputStream.readU2();
            this.index = u1InputStream.readU2();
        }
    }
}
