package com.study.parser;

import com.study.io.ContentReader;
import com.study.io.U1InputStream;
import com.study.parser.attribute.*;
import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.info.attribute.AttributeInfo;
import com.study.type.info.attribute.RawAttributeInfo;

import java.util.Objects;
import java.util.function.Supplier;

public class AttributeInfoParser extends InfoHolderParser<AttributeInfo> {

    public AttributeInfoParser(ContentReader contentReader, ConstantPool constantPool) {
        super(contentReader, constantPool);
    }

    @Override
    public AttributeInfo parse() {
        U2 attributeNameIndex = contentReader.readU2();
        U4 attributeLength = contentReader.readU4();
        U1InputStream u1InputStream = new U1InputStream(contentReader.readU1Array(attributeLength.toInt()));

        return build(constantPool, attributeNameIndex, attributeLength, u1InputStream);
    }

    public AttributeInfo build(ConstantPool constantPool, U2 attributeNameIndex, U4 attributeLength, U1InputStream infoSteam) {
        String name = constantPool.get(attributeNameIndex).desc();

        System.out.printf("属性 %s 将会被创建(length: %s)%n", name, attributeLength.toLong());

        Supplier<AttributeParser<? extends AttributeInfo>> supplier =
                () -> switch (name) {
                    case "InnerClasses" ->
                            new InnerClassesAttributeParser(attributeNameIndex, attributeLength, infoSteam);
                    case "Exceptions" -> new ExceptionsAttributeParser(attributeNameIndex, attributeLength, infoSteam);
                    case "SourceFile" -> new SourceFileAttributeParser(attributeNameIndex, attributeLength, infoSteam);
                    case "ConstantValue" ->
                            new ConstantValueAttributeParser(attributeNameIndex, attributeLength, infoSteam);
                    case "EnclosingMethod" ->
                            new EnclosingMethodAttributeParser(attributeNameIndex, attributeLength, infoSteam);
                    case "Code" ->
                            new CodeAttributeParser(constantPool, attributeNameIndex, attributeLength, infoSteam);
                    case "LineNumberTable" ->
                            new LineNumberTableAttributeParser(attributeNameIndex, attributeLength, infoSteam);
                    case "RuntimeVisibleAnnotations" ->
                            new RuntimeVisibleAnnotationsAttributeParser(attributeNameIndex, attributeLength, infoSteam);
                    case "LocalVariableTable" ->
                            new LocalVariableTableAttributeParser(attributeNameIndex, attributeLength, infoSteam);
                    case "LocalVariableTypeTable" ->
                            new LocalVariableTypeTableAttributeParser(attributeNameIndex, attributeLength, infoSteam);
                    case "StackMapTable" ->
                            new StackMapTableAttributeParser(attributeNameIndex, attributeLength, infoSteam);
                    case "Signature" -> new SignatureAttributeParser(attributeNameIndex, attributeLength, infoSteam);
                    case "Synthetic" -> new SyntheticAttributeParser(attributeNameIndex, attributeLength, infoSteam);
                    case "Deprecated" -> new DeprecatedAttributeParser(attributeNameIndex, attributeLength, infoSteam);
                    case "BootstrapMethods" ->
                            new BootstrapMethodsAttributeParser(attributeNameIndex, attributeLength, infoSteam);
                    case "RuntimeInvisibleAnnotations" ->
                            new RuntimeInvisibleAnnotationsAttributeParser(attributeNameIndex, attributeLength, infoSteam);
                    case "PermittedSubclasses" ->
                            new PermittedSubclassesParser(attributeNameIndex, attributeLength, infoSteam);
                    case "NestHost" -> new NestHostParser(attributeNameIndex, attributeLength, infoSteam);
                    case "NestMembers" -> new NestMembersParser(attributeNameIndex, attributeLength, infoSteam);
                    default -> new AttributeParser<>(attributeNameIndex, attributeLength, infoSteam) {
                        @Override
                        public AttributeInfo parse() {
                            return new RawAttributeInfo(attributeNameIndex, attributeLength, infoSteam);
                        }
                    };
                };

        return Objects.requireNonNull(supplier.get()).parse();
    }
}
