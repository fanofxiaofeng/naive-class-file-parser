package com.study.signature;

public class FieldSignatureBuilder extends ReferenceTypeSignatureBuilder {

    private final ReferenceTypeSignatureBuilder signatureBuilder = new ReferenceTypeSignatureBuilder();

    @Override
    public ReferenceTypeSignature build(String raw) {
        return signatureBuilder.build(raw);
    }
}
