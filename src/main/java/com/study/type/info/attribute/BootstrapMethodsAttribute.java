package com.study.type.info.attribute;

import com.study.type.U2;
import com.study.type.U4;

import java.util.List;

public class BootstrapMethodsAttribute extends AttributeInfo {

    private final List<BootstrapMethod> bootstrapMethods;

    public BootstrapMethodsAttribute(U2 attributeNameIndex, U4 attributeLength, List<BootstrapMethod> bootstrapMethods) {
        super(attributeNameIndex, attributeLength);
        this.bootstrapMethods = bootstrapMethods;
    }

    public record BootstrapMethod(U2 bootstrapMethodRef, List<U2> bootstrapArguments) {
    }

    public List<BootstrapMethod> getBootstrapMethods() {
        return bootstrapMethods;
    }
}
