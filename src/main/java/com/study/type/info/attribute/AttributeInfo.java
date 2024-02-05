package com.study.type.info.attribute;

import com.study.io.U1InputStream;
import com.study.parser.ConstantPoolHolder;
import com.study.parser.attribute.*;
import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.U4;

public class AttributeInfo extends ConstantPoolHolder {
    protected U2 attributeNameIndex;
    protected U4 attributeLength;

    protected AttributeInfo(U2 attributeNameIndex, U4 attributeLength) {
        this.attributeNameIndex = attributeNameIndex;
        this.attributeLength = attributeLength;
    }

    protected AttributeInfo(RawAttributeInfo rawAttributeInfo) {
        this.attributeNameIndex = rawAttributeInfo.getAttributeNameIndex();
        this.attributeLength = rawAttributeInfo.getAttributeLength();
    }

    private static AttributeInfo convert(RawAttributeInfo rawAttributeInfo) {
        U2 attributeNameIndex = rawAttributeInfo.attributeNameIndex;
        String name = constantPool.get(attributeNameIndex).desc();

        System.out.println(String.format("属性 %s 将会被创建(length: %s)", name, rawAttributeInfo.getInfoStream().length()));
        return switch (name) {
            case "InnerClasses" -> new InnerClassesAttributeParser(rawAttributeInfo).parse();
            case "Deprecated" -> new DeprecatedAttributeParser(rawAttributeInfo).parse();
            case "Exceptions" -> new ExceptionsAttributeParser(rawAttributeInfo).parse();
            case "SourceFile" -> new SourceFileAttributeParser(rawAttributeInfo).parse();
            case "ConstantValue" -> new ConstantValueAttributeParser(rawAttributeInfo).parse();
            case "Code" -> new CodeAttribute(rawAttributeInfo);
            case "LineNumberTable" -> new LineNumberTableAttribute(rawAttributeInfo);
            case "RuntimeVisibleAnnotations" -> new RuntimeVisibleAnnotationsAttributeParser(rawAttributeInfo).parse();
            case "LocalVariableTable" -> new LocalVariableTableAttribute(rawAttributeInfo);
            case "StackMapTable" -> new StackMapTableAttribute(rawAttributeInfo);
            case "Signature" -> new SignatureAttributeParser(rawAttributeInfo).parse();
            default -> rawAttributeInfo;
        };
    }

    public static AttributeInfo build(U1InputStream u1InputStream) {
        U2 attributeNameIndex = u1InputStream.readU2();
        RawAttributeInfo rawAttributeInfo = new RawAttributeInfo(attributeNameIndex, u1InputStream);
        return convert(rawAttributeInfo);
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

    public U2 getAttributeNameIndex() {
        return attributeNameIndex;
    }

    public U4 getAttributeLength() {
        return attributeLength;
    }
}

