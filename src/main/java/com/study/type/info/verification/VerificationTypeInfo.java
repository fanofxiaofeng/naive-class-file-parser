package com.study.type.info.verification;

import com.study.type.ConstantPool;
import com.study.type.U1;

public abstract class VerificationTypeInfo {
    protected U1 tag;

    public abstract String desc(ConstantPool constantPool);
}
