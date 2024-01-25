package com.study.type.info;

import com.study.constants.FieldAccessFlags;
import com.study.signature.FieldSignatureBuilder;
import com.study.signature.Signature;
import com.study.type.ConstantPool;
import com.study.type.ItemsContainer;
import com.study.type.U2;
import com.study.type.constant.leaf.LeafCpInfo;
import com.study.type.descriptor.FieldDescriptor;
import com.study.type.info.attribute.AttributeInfo;
import com.study.type.info.attribute.SignatureAttribute;

import java.util.*;

public class FieldInfo extends AbstractInfo {
    private static final EnumSet<FieldAccessFlags> skippedFlags =
            EnumSet.of(
                    FieldAccessFlags.ACC_ENUM,
                    FieldAccessFlags.ACC_SYNTHETIC
            );

    public FieldInfo(U2 accessFlags, U2 nameIndex, U2 descriptorIndex, ItemsContainer<AttributeInfo> attributes) {
        super(accessFlags, nameIndex, descriptorIndex, attributes);
    }

    public String buildDescriptorLine(ConstantPool constantPool) {
        LeafCpInfo descriptor = constantPool.get(descriptorIndex, LeafCpInfo.class);
        return String.format("descriptor: %s", descriptor.desc());
    }

    public String buildAccessFlagsLine() {
        return descAccessFlags();
    }

    public String buildHumanReadableFlagsDesc() {
        int mod = accessFlags.toInt();

        StringJoiner joiner = new StringJoiner(" ");

        Arrays.stream(FieldAccessFlags.values()).
                filter(e -> !skippedFlags.contains(e)).
                filter(e -> (mod & e.getFlag()) > 0).
                forEach(e -> joiner.add(e.getSimpleName()));

        return joiner.toString();
    }

    public List<String> buildAttributeLines(ConstantPool constantPool) {
        List<String> attributeLines = new ArrayList<>();
        for (AttributeInfo attribute : attributes) {
            attributeLines.add(attribute.describe(constantPool));
        }
        return attributeLines;
    }

    public String toHumanReadable(SignatureAttribute signature, ConstantPool constantPool) {
        String raw = signature.detail(constantPool);
        Signature s = new FieldSignatureBuilder().build(raw);
        return s.desc().get(0);
    }

    public String toHumanReadable(FieldDescriptor fieldDescriptor) {
        return fieldDescriptor.fieldType().desc();
    }

    /**
     * @return a string that shows accessFlags.
     * Some examples are shown as follows:
     * "flags: (0x0002) ACC_PRIVATE"
     * "flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC"
     */
    private String descAccessFlags() {
        int mod = accessFlags.toInt();

        StringJoiner joiner = new StringJoiner(", ");

        Arrays.stream(FieldAccessFlags.values()).
                filter(e -> (mod & e.getFlag()) > 0).
                forEach(e -> joiner.add(e.toString()));

        return String.format("flags: (0x%04x) %s", mod, joiner);
    }

}
