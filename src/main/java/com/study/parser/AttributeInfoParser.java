package com.study.parser;

import com.study.io.BasicInputStream;
import com.study.io.U1InputStream;
import com.study.parser.attribute.*;
import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.info.attribute.AttributeInfo;
import com.study.type.info.attribute.RawAttributeInfo;

public class AttributeInfoParser<I extends AttributeInfo> extends InfoHolderParser<AttributeInfo> {

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
        AttributeParser<? extends AttributeInfo> parser = switch (name) {
            case "InnerClasses" -> new InnerClassesAttributeParser(that);
            case "Deprecated" -> new DeprecatedAttributeParser(that);
            case "Exceptions" -> new ExceptionsAttributeParser(that);
            case "SourceFile" -> new SourceFileAttributeParser(that);
            case "ConstantValue" -> new ConstantValueAttributeParser(that);
            case "EnclosingMethod" -> new EnclosingMethodAttributeParser(that);
            case "Synthetic" -> new SyntheticAttributeParser(that);
            case "BootstrapMethods" -> new BootstrapMethodsAttributeParser(that);
            case "Code" -> new CodeAttributeParser(constantPool, that);
            case "LineNumberTable" -> new LineNumberTableAttributeParser(that);
            case "RuntimeVisibleAnnotations" -> new RuntimeVisibleAnnotationsAttributeParser(that);
            case "RuntimeInvisibleAnnotations" -> new RuntimeInvisibleAnnotationsAttributeParser(that);
//            case "LocalVariableTable" -> new LocalVariableTableAttribute(that);
//            case "StackMapTable" -> new StackMapTableAttribute(that);
            case "Signature" -> new SignatureAttributeParser(that);
            case "PermittedSubclasses" -> new PermittedSubclassesParser(that);
            case "NestHost" -> new NestHostParser(that);
            case "NestMembers" -> new NestMembersParser(that);
            default -> new AttributeParser<>(that) {
                @Override
                public AttributeInfo parse() {
                    return that;
                }
            };
        };
        return parser.parse();
    }
}
