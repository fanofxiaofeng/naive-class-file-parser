package com.study.type.info.verification;

import com.study.type.U1;
import com.study.type.U2;

public class UninitializedVariableInfo extends VerificationTypeInfo {
    final static int TAG_VALUE = 8;

    private U2 offset;

    public UninitializedVariableInfo(U2 offset) {
        this.tag = new U1(TAG_VALUE);
        this.offset = offset;
    }
}
