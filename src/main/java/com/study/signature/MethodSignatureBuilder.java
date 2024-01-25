package com.study.signature;

public class MethodSignatureBuilder extends SimpleSignatureBuilder {

    @Override
    public MethodSignature build(String raw) {
        Signature signature = super.build(raw);
        if (!(signature instanceof MethodSignature)) {
            throw new IllegalArgumentException();
        }
        return (MethodSignature) signature;
    }
}