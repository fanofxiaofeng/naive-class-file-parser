package com.study.type.info.attribute;

import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.info.frame.StackMapFrame;
import com.study.type.info.frame.StackMapFrameFactory;

/**
 * The StackMapTable attribute is a variable-length attribute in the attributes table of a Code (§4.7.3) attribute.
 * This attribute is used during the process of verification by type checking (§4.10.1).
 * A method's Code attribute may have at most one StackMapTable attribute.
 */
public class StackMapTableAttribute extends AttributeInfo {
    private U2 numberOfEntries;
    private StackMapFrame[] entries;

    public StackMapTableAttribute(RawAttributeInfo that) {
        super(that);
        numberOfEntries = that.getInfoStream().readU2();
        entries = new StackMapFrame[numberOfEntries.toInt()];
        for (int i = 0; i < this.numberOfEntries.toInt(); i++) {
            entries[i] = StackMapFrameFactory.build(that.getInfoStream());
        }
    }

    @Override
    public String describe(ConstantPool constantPool) {
        // todo: fix next line
        StringBuilder stringBuilder = withIndent(0);
        stringBuilder.append(String.format("%s: number_of_entries = %s\n",
                constantPool.get(attributeNameIndex).desc(),
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
