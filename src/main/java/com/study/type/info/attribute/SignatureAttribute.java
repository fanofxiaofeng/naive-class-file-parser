package com.study.type.info.attribute;

import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.util.PaddingUtils;

public class SignatureAttribute extends AttributeInfo {
    private final U2 signatureIndex;

    public SignatureAttribute(RawAttributeInfo rawAttributeInfo) {
        super(rawAttributeInfo.getAttributeNameIndex(), rawAttributeInfo.getAttributeLength());
        this.signatureIndex = rawAttributeInfo.getInfoStream().readU2();
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
}
