package com.study.signature;

public final class ArrayTypeSignature extends ReferenceTypeSignature {

    private final JavaTypeSignature component;

    public ArrayTypeSignature(JavaTypeSignature component) {
        this.component = component;
    }

    @Override
    public String desc() {
        return component.desc() + "[]";
    }
}
