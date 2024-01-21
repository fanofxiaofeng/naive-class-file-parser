package com.study.type.info;

import com.study.io.BasicInputStream;
import com.study.io.U1InputStream;
import com.study.parser.ConstantPoolHolder;
import com.study.type.ConstantPool;
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
        String name = constantPool.get(attributeNameIndex).desc();

        System.out.println(String.format("属性 %s 将会被创建(length: %s)", name, that.infoStream.length()));
        return switch (name) {
            case "InnerClasses" -> new InnerClassesAttribute(that);
            case "Deprecated" -> new DeprecatedAttribute(that);
            case "Exceptions" -> new ExceptionsAttribute(that);
            case "SourceFile" -> new SourceFileAttribute(that);
            case "ConstantValue" -> new ConstantValueAttribute(that);
            case "Code" -> new CodeAttribute(that);
            case "LineNumberTable" -> new LineNumberTableAttribute(that);
            case "RuntimeVisibleAnnotations" -> new RuntimeVisibleAnnotationsAttribute(that);
            case "LocalVariableTable" -> new LocalVariableTableAttribute(that);
            case "StackMapTable" -> new StackMapTableAttribute(that);
            case "Signature" -> new SignatureAttribute(that);
            default -> that;
        };
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


    public String describe(ConstantPool constantPool) {
        return "to be implemented...";
//        throw new UnsupportedOperationException();
    }

    // todo
    @Deprecated
    public String describe(int indent) {
        return new StringBuilder().
                append(constantPool.get(attributeNameIndex).desc()).
                append(":").append("[请修改实现逻辑]").append('\n').
                toString();
    }

    protected StringBuilder withIndent(int indent) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" ".repeat(Math.max(0, indent)));
        return stringBuilder;
    }

    protected String indentedString(int indent) {
        return withIndent(indent).toString();
    }

    protected String buildName(ConstantPool constantPool) {
        return constantPool.get(attributeNameIndex).desc();
    }
}

