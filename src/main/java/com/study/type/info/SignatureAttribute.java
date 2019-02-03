package com.study.type.info;

import com.study.io.U1InputStream;
import com.study.type.U1;
import com.study.type.U2;

public class SignatureAttribute extends AttributeInfo {
    private U2 signatureIndex;

    public SignatureAttribute(U1InputStream u1InputStream) {
        super(u1InputStream);
        U1InputStream real = new U1InputStream(this.info);
        U1 a = real.readU1();
        U1 b = real.readU1();
        signatureIndex = new U2(a, b);
    }

    @Override
    public String describe(int level) {
        return super.describe(level);
    }
}
