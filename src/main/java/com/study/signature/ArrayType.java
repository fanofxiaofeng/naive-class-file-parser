package com.study.signature;

public class ArrayType extends AbstractSignature {
    private final Signature signature;

    public ArrayType(Signature signature) {
        this.signature = signature;
    }

    @Override
    public String desc() {
        return signature.desc() + "[]";
    }
}
