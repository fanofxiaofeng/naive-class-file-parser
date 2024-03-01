package com.study.type.info;

import com.study.constants.FieldAccessFlags;
import com.study.signature.builder.SignatureFacade;
import com.study.type.ConstantPool;
import com.study.type.ItemsContainer;
import com.study.type.U2;
import com.study.type.constant.leaf.LeafCpInfo;
import com.study.type.descriptor.FieldDescriptor;
import com.study.type.descriptor.FieldDescriptorBuilder;
import com.study.type.info.attribute.AttributeInfo;
import com.study.type.info.attribute.SignatureAttribute;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Optional;
import java.util.StringJoiner;

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

    public String buildHumanReadableTypeDesc(ConstantPool constantPool) {
        Optional<SignatureAttribute> optionalSignature = findSignatureAttribute();

        return optionalSignature.isPresent() ?
                toHumanReadable(optionalSignature.get(), constantPool) :
                toHumanReadable(constantPool);
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

    public String toHumanReadable(SignatureAttribute signature, ConstantPool constantPool) {
        String raw = signature.detail(constantPool);
        return new SignatureFacade().buildFieldSignature(raw).desc();
    }

    public String toHumanReadable(ConstantPool constantPool) {
        FieldDescriptorBuilder fieldDescriptorBuilder = new FieldDescriptorBuilder();
        FieldDescriptor fieldDescriptor = fieldDescriptorBuilder.build(constantPool, getDescriptorIndex());
        return fieldDescriptor.fieldType().desc();
    }

    /**
     * @return a string that shows accessFlags.
     * Some examples are shown as follows:
     * 1. "flags: (0x0002) ACC_PRIVATE"
     * 2. "flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC"
     */
    private String descAccessFlags() {
        int mod = accessFlags.toInt();

        StringJoiner joiner = new StringJoiner(", ");

        Arrays.stream(FieldAccessFlags.values()).
                filter(e -> (mod & e.getFlag()) > 0).
                forEach(e -> joiner.add(e.toString()));

        if (joiner.length() > 0) {
            return String.format("flags: (0x%04x) %s", mod, joiner);
        }
        return String.format("flags: (0x%04x)", mod);
    }
}
