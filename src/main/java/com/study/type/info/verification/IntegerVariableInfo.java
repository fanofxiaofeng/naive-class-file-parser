package com.study.type.info.verification;

import com.study.type.U1;

public class IntegerVariableInfo extends VerificationTypeInfo {
    final static int TAG_VALUE = 1;

    IntegerVariableInfo() {
        this.tag = new U1(TAG_VALUE);
    }

    @Override
    public String desc() {
        return "int";
    }
}
