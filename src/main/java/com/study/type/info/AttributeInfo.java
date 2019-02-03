package com.study.type.info;

import com.study.io.BasicInputStream;
import com.study.io.U1InputStream;
import com.study.type.U1;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.constant.AbstractConstant;

import java.io.PrintStream;

public class AttributeInfo extends AbstractInfo {
    private U2 attributeNameIndex;
    private U4 attributeLength;
    U1[] info;

    protected static PrintStream printStream;

    public static void setPrintStream(PrintStream printStream) {
        AttributeInfo.printStream = printStream;
    }

    private AttributeInfo(BasicInputStream basicInputStream) {
        attributeNameIndex = basicInputStream.readU2();
        attributeLength = basicInputStream.readU4();
        info = basicInputStream.readU1Array(attributeLength.toInt());
    }

    public AttributeInfo(U1InputStream u1InputStream) {
        attributeNameIndex = u1InputStream.readU2();
        attributeLength = u1InputStream.readU4();
        info = u1InputStream.readU1Array(attributeLength.toInt());
    }

    public static AttributeInfo build(BasicInputStream basicInputStream) {
        return new AttributeInfo(basicInputStream);
    }

    @Override
    public String desc(AbstractConstant[] constantPool) {
        int index = attributeNameIndex.toInt();
        AbstractConstant constant = constantPool[index];
        if ("Code".equals(constant.detail())) {
            CodeAttribute codeAttribute = new CodeAttribute(attributeNameIndex, attributeLength, info);
            System.out.println(codeAttribute.toString());
            System.out.println(codeAttribute.desc(constantPool));
            return codeAttribute.desc(constantPool);
        }

        return null;
    }

    // todo
    @Override
    public String describe(int level) {
        return null;
    }

    protected String basic(int level) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < level; i++) {
            stringBuilder.append(' ').append(' ');
        }
        return stringBuilder.toString();
    }
}
