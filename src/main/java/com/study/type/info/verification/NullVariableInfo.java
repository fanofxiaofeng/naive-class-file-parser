package com.study.type.info.verification;

import com.study.type.ConstantPool;
import com.study.type.U1;

public class NullVariableInfo extends VerificationTypeInfo {
    final static int TAG_VALUE = 5;

    NullVariableInfo() {
        this.tag = new U1(TAG_VALUE);
    }

    @Override
    public String desc(ConstantPool constantPool) {
        return "???";
    }
}
