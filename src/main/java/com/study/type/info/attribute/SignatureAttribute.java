package com.study.type.info.attribute;

import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.U4;
import com.study.util.PaddingUtils;

public class SignatureAttribute extends AttributeInfo {
    private final U2 signatureIndex;

    public SignatureAttribute(U2 attributeNameIndex, U4 attributeLength, U2 signatureIndex) {
        super(attributeNameIndex, attributeLength);
        this.signatureIndex = signatureIndex;
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
        return constantPool.desc(signatureIndex);
    }

    public U2 getSignatureIndex() {
        return signatureIndex;
    }
}
