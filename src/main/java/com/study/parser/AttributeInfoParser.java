package com.study.parser;

import com.study.io.BasicInputStream;
import com.study.io.U1InputStream;
import com.study.parser.attribute.ConstantValueAttributeParser;
import com.study.parser.attribute.RuntimeVisibleAnnotationsAttributeParser;
import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.info.attribute.*;

public class AttributeInfoParser extends InfoHolderParser<AttributeInfo> {

    public AttributeInfoParser(BasicInputStream basicInputStream, ConstantPool constantPool) {
        super(basicInputStream, constantPool);
    }

    @Override
    public AttributeInfo parse() {
        U2 attributeNameIndex = basicInputStream.readU2();
        U4 attributeLength = basicInputStream.readU4();
        U1InputStream u1InputStream = new U1InputStream(basicInputStream.readU1Array(attributeLength.toInt()));
        RawAttributeInfo rawAttributeInfo = new RawAttributeInfo(attributeNameIndex, attributeLength, u1InputStream);
        return convert(rawAttributeInfo);
    }

    private AttributeInfo convert(RawAttributeInfo that) {
        U2 attributeNameIndex = that.getAttributeNameIndex();
        String name = constantPool.get(attributeNameIndex).desc();

        System.out.println(String.format("属性 %s 将会被创建(length: %s)", name, that.getInfoStream().length()));
        return switch (name) {
//            case "InnerClasses" -> new InnerClassesAttribute(that);
            case "Deprecated" -> new DeprecatedAttribute(that);
//            case "Exceptions" -> new ExceptionsAttribute(that);
//            case "SourceFile" -> new SourceFileAttribute(that);
            case "ConstantValue" -> new ConstantValueAttributeParser(that).parse();
//            case "Code" -> new CodeAttribute(that);
//            case "LineNumberTable" -> new LineNumberTableAttribute(that);
            case "RuntimeVisibleAnnotations" -> new RuntimeVisibleAnnotationsAttributeParser(that).parse();
//            case "LocalVariableTable" -> new LocalVariableTableAttribute(that);
//            case "StackMapTable" -> new StackMapTableAttribute(that);
//            case "Signature" -> new SignatureAttribute(that);
            default -> that;
        };
    }
}
