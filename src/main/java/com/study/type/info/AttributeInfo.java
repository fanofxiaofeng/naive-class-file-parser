package com.study.type.info;

import com.study.io.BasicInputStream;
import com.study.io.U1InputStream;
import com.study.type.U1;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.constant.AbstractConstant;

import java.io.PrintStream;

public class AttributeInfo extends AbstractInfo {
    protected U2 attributeNameIndex;
    protected U4 attributeLength;
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

    protected AttributeInfo(U2 attributeNameIndex, U4 attributeLength, U1[] info) {
        this.attributeNameIndex = attributeNameIndex;
        this.attributeLength = attributeLength;
        this.info = info;
    }

    public static AttributeInfo build(BasicInputStream basicInputStream) {
        U2 attributeNameIndex = basicInputStream.readU2();
        U4 attributeLength = basicInputStream.readU4();
        U1[] info = basicInputStream.readU1Array(attributeLength.toInt());
        AttributeInfo raw = new AttributeInfo(attributeNameIndex, attributeLength, info);
        String name = constantPool[attributeNameIndex.toInt()].desc();
        switch (name) {
            case "InnerClasses":
                return new InnerClassesAttribute(raw);
        }
        return raw;
    }

    public String attributeName() {
        return constantPool[attributeNameIndex.toInt()].desc();
    }

    public AttributeInfo(U1InputStream u1InputStream) {
        attributeNameIndex = u1InputStream.readU2();
        attributeLength = u1InputStream.readU4();
        info = u1InputStream.readU1Array(attributeLength.toInt());
    }

    @Override
    public String desc() {
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
        return constantPool[attributeNameIndex.toInt()].desc();
    }

    protected String basic(int level) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < level; i++) {
            stringBuilder.append(' ').append(' ');
        }
        return stringBuilder.toString();

    }

    public static String displayAttributes(AttributeInfo[] attributes, int level) {
        StringBuilder stringBuilder = new StringBuilder();
        for (AttributeInfo attribute : attributes) {
            stringBuilder.append(attribute.describe(level));
        }
        return stringBuilder.toString();
    }
}

