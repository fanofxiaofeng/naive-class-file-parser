package com.study.type.info.verification;

import com.study.type.U1;

public class FloatVariableInfo extends VerificationTypeInfo {
    final static int TAG_VALUE = 2;

    FloatVariableInfo() {
        this.tag = new U1(TAG_VALUE);
    }
}
