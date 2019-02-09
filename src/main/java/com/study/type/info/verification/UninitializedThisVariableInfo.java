package com.study.type.info.verification;

import com.study.type.U1;

public class UninitializedThisVariableInfo extends VerificationTypeInfo {
    final static int TAG_VALUE = 6;

    UninitializedThisVariableInfo() {
        this.tag = new U1(TAG_VALUE);
    }
}
