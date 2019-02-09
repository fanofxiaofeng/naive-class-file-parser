package com.study.type.info.verification;

import com.study.type.U1;

public class TopVariableInfo extends VerificationTypeInfo {
    final static int TAG_VALUE = 0;

    TopVariableInfo() {
        this.tag = new U1(TAG_VALUE);
    }
}
