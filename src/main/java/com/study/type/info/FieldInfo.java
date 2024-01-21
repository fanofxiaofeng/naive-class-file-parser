package com.study.type.info;

import com.study.io.BasicInputStream;
import com.study.signature.Signature;
import com.study.signature.SignatureBuilder;
import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.constant.CpInfo;
import com.study.type.constant.ConstantUtf8;
import com.study.util.PaddingUtils;

import java.lang.reflect.Modifier;
import java.util.*;

public class FieldInfo extends AbstractInfo {

    private final U2 accessFlags;
    private final U2 nameIndex;
    private final U2 descriptorIndex;
    private final U2 attributesCount;
    private final AttributeInfo[] attributes;

    private FieldInfo(BasicInputStream basicInputStream) {
        this.accessFlags = basicInputStream.readU2();
        this.nameIndex = basicInputStream.readU2();
        this.descriptorIndex = basicInputStream.readU2();
        this.attributesCount = basicInputStream.readU2();
        int count = attributesCount.toInt();
        attributes = new AttributeInfo[count];
        for (int i = 0; i < count; i++) {
            attributes[i] = AttributeInfo.build(basicInputStream);
        }
    }

    public static FieldInfo build(BasicInputStream basicInputStream) {
        return new FieldInfo(basicInputStream);
    }

    public String description(ConstantPool constantPool) {
        int mod = accessFlags.toInt();
        CpInfo descriptor = constantPool.get(descriptorIndex);
        if (!(descriptor instanceof ConstantUtf8)) {
            throw new AssertionError();
        }
        CpInfo name = constantPool.get(nameIndex);
        if (!(name instanceof ConstantUtf8)) {
            throw new AssertionError();
        }

        Optional<SignatureAttribute> optionalSignature = findSignatureAttribute();
        String s = optionalSignature.isPresent() ?
                toHumanReadable(optionalSignature.get(), constantPool) :
                toHumanReadable(descriptor, constantPool);

        String coreLine = String.format("%s %s %s;",
                Modifier.toString(mod),
                s,
                name.desc()
        );
        String descriptorLine = buildDescriptorLine();
        String accessFlagsLine = buildAccessFlagsLine();

        StringJoiner joiner = new StringJoiner("\n");
        joiner.add(PaddingUtils.prepend(coreLine, INDENT_FOR_EACH_LEVEL));
        joiner.add(PaddingUtils.prepend(descriptorLine, INDENT_FOR_EACH_LEVEL * 2));
        joiner.add(PaddingUtils.prepend(accessFlagsLine, INDENT_FOR_EACH_LEVEL * 2));

        List<String> attributeLines = buildAttributeLines(constantPool);
        for (String attributeLine : attributeLines) {
            joiner.add(PaddingUtils.prepend(attributeLine, INDENT_FOR_EACH_LEVEL * 2));
        }
//        for (AttributeInfo attribute : attributes) {
//            stringBuilder.append(attribute.describe(4));
//        }
//        return stringBuilder.toString();
        return joiner + "\n";
    }

    private Optional<SignatureAttribute> findSignatureAttribute() {
        for (AttributeInfo attribute : attributes) {
            if (attribute instanceof SignatureAttribute) {
                return Optional.of((SignatureAttribute) attribute);
            }
        }

        return Optional.empty();
    }

    private String buildCoreLine() {
        return null;
    }

    private String buildDescriptorLine() {
        CpInfo descriptor = constantPool.get(descriptorIndex);
        return String.format("descriptor: %s", descriptor.desc());
    }

    private String buildAccessFlagsLine() {
        return descAccessFlags();
    }

    private List<String> buildAttributeLines(ConstantPool constantPool) {
        List<String> attributeLines = new ArrayList<>();
        for (AttributeInfo attribute : attributes) {
            attributeLines.add(attribute.describe(constantPool));
        }
        return attributeLines;
    }

    private String toHumanReadable(SignatureAttribute signature, ConstantPool constantPool) {
        String raw = signature.detail(constantPool);
        Signature s = new SignatureBuilder().build(raw);
        return s.desc();
    }

    private String toHumanReadable(CpInfo cpInfo, ConstantPool constantPool) {
        Optional<String> detail = cpInfo.detail(constantPool);
        if (detail.isEmpty()) {
            throw new IllegalArgumentException();
        }

        SignatureBuilder builder = new SignatureBuilder();
        return builder.build(detail.get()).desc();
    }

    @Override
    public String desc() {
        int mod = accessFlags.toInt();
        CpInfo descriptor = constantPool.get(descriptorIndex);
        if (!(descriptor instanceof ConstantUtf8)) {
            throw new AssertionError();
        }
        CpInfo name = constantPool.get(nameIndex);
        if (!(name instanceof ConstantUtf8)) {
            throw new AssertionError();
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("  %s %s %s;\n",
                // todo 没有处理 ACC_SYNTHETIC, ACC_ENUM
                Modifier.toString(mod),
                toHumanReadable(descriptor.desc()),
                name.desc()
        ));
        stringBuilder.append(String.format("    descriptor: %s\n", descriptor.desc()));
        stringBuilder.append(String.format("    %s\n", descAccessFlags()));
        for (AttributeInfo attribute : attributes) {
            stringBuilder.append(attribute.describe(4));
        }
        return stringBuilder.toString();
    }

    private static final Map<Integer, String> map = new TreeMap<>() {
        {
            // 0x0001
            put(Modifier.PUBLIC, "ACC_PUBLIC");

            // 0x0002
            put(Modifier.PRIVATE, "ACC_PRIVATE");

            // 0x0004
            put(Modifier.PROTECTED, "ACC_PROTECTED");

            // 0x0008
            put(Modifier.STATIC, "ACC_STATIC");

            // 0x0010
            put(Modifier.FINAL, "ACC_FINAL");

            // 0x0040
            put(Modifier.VOLATILE, "ACC_VOLATILE");

            // 0x0080
            put(Modifier.TRANSIENT, "ACC_TRANSIENT");

            // 0x1000
            put(0x1000, "ACC_SYNTHETIC");

            // 0x4000
            put(0x4000, "ACC_ENUM");
        }
    };

    /**
     * @return a string that shows accessFlags.
     * Some examples are shown as follows:
     * "flags: (0x0002) ACC_PRIVATE"
     * "flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC"
     */
    private String descAccessFlags() {
        int mod = accessFlags.toInt();

        StringJoiner joiner = new StringJoiner(", ");

        map.forEach((key, value) -> {
            if ((mod & key) > 0) {
                joiner.add(value);
            }
        });

        return String.format("flags: (0x%04x) %s", mod, joiner);
    }
}
