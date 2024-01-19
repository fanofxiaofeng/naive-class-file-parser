package com.study.type.info;

import com.study.io.BasicInputStream;
import com.study.io.U1InputStream;
import com.study.parser.ConstantPoolHolder;
import com.study.type.U1;
import com.study.type.U2;
import com.study.type.U4;

public class AttributeInfo extends ConstantPoolHolder {
    U2 attributeNameIndex;
    U4 attributeLength;
    U1InputStream infoStream;

    protected AttributeInfo(AttributeInfo that) {
        this.attributeNameIndex = that.attributeNameIndex;
        this.attributeLength = that.attributeLength;

        this.infoStream = that.infoStream;
    }

    public AttributeInfo(U2 attributeNameIndex, U1InputStream u1InputStream) {
        this.attributeNameIndex = attributeNameIndex;
        this.attributeLength = u1InputStream.readU4();

        U1[] info = u1InputStream.readU1Array(attributeLength.toInt());
        this.infoStream = new U1InputStream(info);
    }

    public AttributeInfo(U2 attributeNameIndex, BasicInputStream basicInputStream) {
        this.attributeNameIndex = attributeNameIndex;
        this.attributeLength = basicInputStream.readU4();

        U1[] info = basicInputStream.readU1Array(attributeLength.toInt());
        this.infoStream = new U1InputStream(info);
    }

    private static AttributeInfo convert(AttributeInfo that) {
        U2 attributeNameIndex = that.attributeNameIndex;
        String name = constantPool.get(attributeNameIndex.toInt()).desc();

        System.out.println(String.format("属性 %s 将会被创建(length: %s)", name, that.infoStream.length()));
        switch (name) {
            case "InnerClasses":
                return new InnerClassesAttribute(that);
            case "Deprecated":
                return new DeprecatedAttribute(that);
            case "Exceptions":
                return new ExceptionsAttribute(that);
            case "SourceFile":
                return new SourceFileAttribute(that);
            case "ConstantValue":
                return new ConstantValueAttribute(that);
            case "Code":
                return new CodeAttribute(that);
            case "LineNumberTable":
                return new LineNumberTableAttribute(that);
            case "RuntimeVisibleAnnotations":
                return new RuntimeVisibleAnnotationsAttribute(that);
            case "LocalVariableTable":
                return new LocalVariableTableAttribute(that);
            case "StackMapTable":
                return new StackMapTableAttribute(that);
        }
        return that;
    }

    public static AttributeInfo build(U1InputStream u1InputStream) {
        U2 attributeNameIndex = u1InputStream.readU2();
        AttributeInfo raw = new AttributeInfo(attributeNameIndex, u1InputStream);
        return convert(raw);
    }

    public static AttributeInfo build(BasicInputStream basicInputStream) {
        U2 attributeNameIndex = basicInputStream.readU2();
        AttributeInfo raw = new AttributeInfo(attributeNameIndex, basicInputStream);
        return convert(raw);
    }

    public AttributeInfo(U1InputStream u1InputStream) {
        attributeNameIndex = u1InputStream.readU2();
        attributeLength = u1InputStream.readU4();

        U1[] info = u1InputStream.readU1Array(attributeLength.toInt());
        infoStream = new U1InputStream(info);
    }

    // todo
    public String describe(int indent) {
        return withIndent(indent).
                append(constantPool.get(attributeNameIndex.toInt()).desc()).
                append(":").append("[请修改实现逻辑]").append('\n').
                toString();
    }

    protected StringBuilder withIndent(int indent) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < indent; i++) {
            stringBuilder.append(' ');
        }
        return stringBuilder;
    }

    protected String indentedString(int indent) {
        return withIndent(indent).toString();
    }
}

