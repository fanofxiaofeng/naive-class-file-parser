package com.study.type.info.attribute;

import com.study.type.U2;
import com.study.type.U4;
import com.study.type.info.frame.StackMapFrame;

/**
 * The StackMapTable attribute is a variable-length attribute in the attributes table of a Code (§4.7.3) attribute.
 * This attribute is used during the process of verification by type checking (§4.10.1).
 * A method's Code attribute may have at most one StackMapTable attribute.
 */
public class StackMapTableAttribute extends AttributeInfo {
    //    private final U2 numberOfEntries;
    private final StackMapFrame[] entries;

    public StackMapTableAttribute(U2 attributeNameIndex, U4 attributeLength, StackMapFrame[] entries) {
        super(attributeNameIndex, attributeLength);
        this.entries = entries;
//        numberOfEntries = that.getInfoStream().readU2();
//        entries = new StackMapFrame[numberOfEntries.toInt()];
//        for (int i = 0; i < this.numberOfEntries.toInt(); i++) {
//            entries[i] = StackMapFrameFactory.build(that.getInfoStream());
//        }
    }
//    public StackMapTableAttribute(U2 numberOfEntries, StackMapFrame[] entries) {
//        this.numberOfEntries = numberOfEntries;
//        this.entries = entries;
//    }

    public StackMapFrame[] getEntries() {
        return entries;
    }
}
