package com.study.type.info.verification;

import com.study.type.ConstantPool;
import com.study.type.U1;

public class LongVariableInfo extends VerificationTypeInfo {
    final static int TAG_VALUE = 4;

    LongVariableInfo() {
        this.tag = new U1(TAG_VALUE);
    }

    @Override
    public String desc(ConstantPool constantPool) {
        return "long";
    }
}
