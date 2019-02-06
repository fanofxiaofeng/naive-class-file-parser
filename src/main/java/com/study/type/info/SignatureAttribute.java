package com.study.type.info;

import com.study.io.U1InputStream;
import com.study.type.U2;

public class SignatureAttribute extends AttributeInfo {
    private U2 signatureIndex;

    public SignatureAttribute(U1InputStream u1InputStream) {
        super(u1InputStream);
        signatureIndex = infoStream.readU2();
    }

    @Override
    public String describe(int indent) {
        return super.describe(indent);
    }
}
