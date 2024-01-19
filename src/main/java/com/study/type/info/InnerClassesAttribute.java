package com.study.type.info;

import com.study.io.U1InputStream;
import com.study.type.U2;

public class InnerClassesAttribute extends AttributeInfo {
    private U2 numberOfClasses;
    private InnerClasses[] innerClasses;

    InnerClassesAttribute(AttributeInfo that) {
        super(that);
        numberOfClasses = infoStream.readU2();
        innerClasses = new InnerClasses[numberOfClasses.toInt()];
        for (int i = 0; i < numberOfClasses.toInt(); i++) {
            innerClasses[i] = new InnerClasses(infoStream);
        }
    }

    @Override
    public String describe(int indent) {
        if (indent != 0) {
            throw new AssertionError("indent should be 0, but in fact indent = " + indent);
        }
        StringBuilder stringBuilder = new StringBuilder(String.format("%s:\n", constantPool.get(this.attributeNameIndex).desc()));
        for (int i = 0; i < numberOfClasses.toInt(); i++) {
            String line = String.format("%-40s// class %s\n", "#" + innerClasses[i].innerClassInfoIndex.toInt() + ";", constantPool.get(innerClasses[i].innerClassInfoIndex).detail());
            stringBuilder.append("  ").append(line);
        }
        return stringBuilder.toString();
    }

    private class InnerClasses {
        U2 innerClassInfoIndex;
        U2 outerClassInfoIndex;
        U2 innerNameIndex;
        U2 innerClassAccessFlags;

        InnerClasses(U1InputStream u1InputStream) {
            innerClassInfoIndex = u1InputStream.readU2();
            outerClassInfoIndex = u1InputStream.readU2();
            innerNameIndex = u1InputStream.readU2();
            innerClassAccessFlags = u1InputStream.readU2();
        }
    }
}
