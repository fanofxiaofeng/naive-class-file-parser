package com.study.signature;

public final class TypeVariableSignature extends ReferenceTypeSignature {

    private final String identifier;

    public TypeVariableSignature(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String desc() {
        return identifier;
    }
}
