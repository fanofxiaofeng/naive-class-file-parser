package com.study.type.info;

import com.study.io.U1InputStream;
import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.util.PaddingUtils;

import java.util.Optional;

public class SignatureAttribute extends AttributeInfo {
    private final U2 signatureIndex;

    public SignatureAttribute(U1InputStream u1InputStream) {
        super(u1InputStream);
        signatureIndex = infoStream.readU2();
    }

    public SignatureAttribute(AttributeInfo that) {
        super(that);
        this.signatureIndex = that.infoStream.readU2();
    }

    @Override
    public String describe(int indent) {
        return super.describe(indent);
    }

    @Override
    public String describe(ConstantPool constantPool) {
        String name = buildName(constantPool);
        String core = String.format("%s: #%s", name, signatureIndex.toInt());

        // todo: fix hard-coded value
        return PaddingUtils.padAndAppend(core, 40, "// " + detail(constantPool));
    }

    public String detail(ConstantPool constantPool) {
        Optional<String> detail = constantPool.detail(signatureIndex);
        if (detail.isEmpty()) {
            throw new IllegalArgumentException();
        }

        return detail.get();
    }
}
