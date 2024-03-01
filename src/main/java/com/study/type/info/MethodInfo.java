package com.study.type.info;

import com.study.constants.MethodAccessFlags;
import com.study.type.ConstantPool;
import com.study.type.ItemsContainer;
import com.study.type.U2;
import com.study.type.constant.leaf.LeafCpInfo;
import com.study.type.descriptor.MethodDescriptor;
import com.study.type.descriptor.MethodDescriptorBuilder;
import com.study.type.info.attribute.AttributeInfo;
import com.study.type.info.attribute.CodeAttribute;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.StringJoiner;

public class MethodInfo extends AbstractInfo {

    private static final EnumSet<MethodAccessFlags> skippedFlags =
            EnumSet.of(
                    MethodAccessFlags.ACC_BRIDGE,
                    MethodAccessFlags.ACC_VARARGS,
                    MethodAccessFlags.ACC_SYNTHETIC
            );

    public MethodInfo(U2 accessFlags, U2 nameIndex, U2 descriptorIndex, ItemsContainer<AttributeInfo> attributes) {
        super(accessFlags, nameIndex, descriptorIndex, attributes);
        for (AttributeInfo attributeInfo : attributes.items()) {
            if (attributeInfo instanceof CodeAttribute codeAttribute) {
                codeAttribute.setMethodInfo(this);
            }
        }
    }

    public String buildDescriptorLine(ConstantPool constantPool) {
        LeafCpInfo descriptor = constantPool.get(descriptorIndex, LeafCpInfo.class);
        return String.format("descriptor: %s", descriptor.desc());
    }

    public String buildHumanReadableFlagsDesc() {
        StringJoiner joiner = new StringJoiner(" ");

        Arrays.stream(MethodAccessFlags.values()).
                filter(e -> !skippedFlags.contains(e)).
                filter(e -> accessFlags.isOn(e.getFlag())).
                forEach(e -> joiner.add(e.getSimpleName()));

        return joiner.toString();
    }

    private String functionName(ConstantPool constantPool) {
        return constantPool.desc(nameIndex);
    }

    public boolean isConstructor(ConstantPool constantPool) {
        return functionName(constantPool).equals("<init>");
    }

    public boolean isClassInit(ConstantPool constantPool) {
        return functionName(constantPool).equals("<clinit>");
    }

    public String buildAccessFlagsLine() {
        int mod = accessFlags.toInt();

        StringJoiner joiner = new StringJoiner(", ");

        Arrays.stream(MethodAccessFlags.values()).
                filter(e -> (mod & e.getFlag()) > 0).
                forEach(e -> joiner.add(e.toString()));

        if (joiner.length() > 0) {
            return String.format("flags: (0x%04x) %s", mod, joiner);
        }
        return String.format("flags: (0x%04x)", mod);
    }

    public int calculateArgsSize(ConstantPool constantPool) {
        MethodDescriptor methodDescriptor = new MethodDescriptorBuilder().build(constantPool, descriptorIndex);
        int parameterCount = methodDescriptor.getParameterDescriptors().size();

        if (getAccessFlags().isOn(MethodAccessFlags.ACC_STATIC.getFlag())) {
            return parameterCount;
        }
        return parameterCount + 1;
    }
}
