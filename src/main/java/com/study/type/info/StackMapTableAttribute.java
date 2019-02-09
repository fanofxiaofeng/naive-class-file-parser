package com.study.type.info;

import com.study.type.U2;
import com.study.type.info.frame.StackMapFrame;

public class StackMapTableAttribute extends AttributeInfo {
    private U2 numberOfEntries;
    private StackMapFrame[] entries;

    protected StackMapTableAttribute(AttributeInfo that) {
        super(that);
        numberOfEntries = infoStream.readU2();
        entries = new StackMapFrame[numberOfEntries.toInt()];
        for (int i = 0; i < this.numberOfEntries.toInt(); i++) {
            entries[i] = StackMapFrame.build(infoStream);
        }
    }

    @Override
    public String describe(int indent) {
        StringBuilder stringBuilder = withIndent(indent);
        stringBuilder.append(String.format("%s: number_of_entries = %s\n",
                constantPool[attributeNameIndex.toInt()].desc(),
                numberOfEntries.toInt()
        ));
        for (StackMapFrame entry : entries) {
            stringBuilder.append(String.format("%8s%s\n",
                    "",
                    entry.desc()
            ));
            if (entry.hasDetail()) {
                for (String item : entry.detail()) {
                    stringBuilder.append(String.format("%10s%s\n",
                            "",
                            item
                    ));
                }
            }
        }
        return stringBuilder.toString();
    }
}
