package com.study.type.info.verification;

import com.study.type.ConstantPool;
import com.study.type.U1;

public class DoubleVariableInfo extends VerificationTypeInfo {
    final static int TAG_VALUE = 3;

    DoubleVariableInfo() {
        this.tag = new U1(TAG_VALUE);
    }

    @Override
    public String desc(ConstantPool constantPool) {
        return "double";
    }
}
