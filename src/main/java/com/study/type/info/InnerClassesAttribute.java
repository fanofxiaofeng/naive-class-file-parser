package com.study.type.info;

import com.study.io.U1InputStream;
import com.study.type.U1;
import com.study.type.U2;
import com.study.type.U4;

public class InnerClassesAttribute extends AttributeInfo {
    private U2 numberOfClasses;
    private InnerClasses[] innerClasses;

    private void utilizeInfo() {
        U1InputStream real = new U1InputStream(this.info);
        numberOfClasses = real.readU2();
        innerClasses = new InnerClasses[numberOfClasses.toInt()];
        for (int i = 0; i < numberOfClasses.toInt(); i++) {
            innerClasses[i] = new InnerClasses(real);
        }
    }

    public InnerClassesAttribute(AttributeInfo that) {
        super(that.attributeNameIndex, that.attributeLength, that.info);
        utilizeInfo();
    }

    public InnerClassesAttribute(U2 attributeNameIndex, U4 attributeLength, U1[] info) {
        super(attributeNameIndex, attributeLength, info);
        utilizeInfo();
    }

    @Override
    public String describe(int level) {
        if (level != 1) {
            throw new AssertionError("level should be 1, but in fact level = " + level);
        }
        StringBuilder stringBuilder = new StringBuilder(String.format("%s:\n", constantPool[this.attributeNameIndex.toInt()].desc()));
        for (int i = 0; i < numberOfClasses.toInt(); i++) {
            String line = String.format("%-40s// %s\n", "#" + innerClasses[i].innerClassInfoIndex.toInt() + ";", constantPool[innerClasses[i].innerClassInfoIndex.toInt()].detail());
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
