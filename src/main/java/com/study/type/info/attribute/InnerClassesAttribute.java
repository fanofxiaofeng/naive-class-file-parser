package com.study.type.info.attribute;

import com.study.type.U2;
import com.study.type.U4;

import java.util.List;

public class InnerClassesAttribute extends AttributeInfo {
    private final List<InnerClass> classes;

    public InnerClassesAttribute(U2 attributeNameIndex, U4 attributeLength, List<InnerClass> classes) {
        super(attributeNameIndex, attributeLength);
        this.classes = classes;
    }

    @Override
    public String describe(int indent) {
        if (indent != 0) {
            throw new AssertionError("indent should be 0, but in fact indent = " + indent);
        }

        StringBuilder stringBuilder = new StringBuilder(String.format("%s:\n", constantPool.get(this.attributeNameIndex).desc()));
        for (int i = 0; i < classes.size(); i++) {
            String line = String.format("%-40s// class %s\n", "#" + classes.get(i).innerClassInfoIndex.toInt() + ";", constantPool.get(classes.get(i).innerClassInfoIndex).detail());
            stringBuilder.append("  ").append(line);
        }
        return stringBuilder.toString();
    }

    public List<InnerClass> getClasses() {
        return classes;
    }

    public static class InnerClass {
        U2 innerClassInfoIndex;
        U2 outerClassInfoIndex;
        U2 innerNameIndex;
        U2 innerClassAccessFlags;

        public InnerClass(U2 innerClassInfoIndex,
                          U2 outerClassInfoIndex,
                          U2 innerNameIndex,
                          U2 innerClassAccessFlags) {
            this.innerClassInfoIndex = innerClassInfoIndex;
            this.outerClassInfoIndex = outerClassInfoIndex;
            this.innerNameIndex = innerNameIndex;
            this.innerClassAccessFlags = innerClassAccessFlags;
        }

        public U2 getInnerClassInfoIndex() {
            return innerClassInfoIndex;
        }

        public U2 getOuterClassInfoIndex() {
            return outerClassInfoIndex;
        }

        public U2 getInnerNameIndex() {
            return innerNameIndex;
        }

        public U2 getInnerClassAccessFlags() {
            return innerClassAccessFlags;
        }
    }
}
