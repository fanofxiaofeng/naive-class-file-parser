package com.study.type.info.verification;

import com.study.type.U1;
import com.study.type.U2;

public class ObjectVariableInfo extends VerificationTypeInfo {
    final static int TAG_VALUE = 7;
    private U2 cPoolIndex;

    public ObjectVariableInfo(U2 cPoolIndex) {
        this.tag = new U1(TAG_VALUE);
        this.cPoolIndex = cPoolIndex;
    }

    @Override
    public String desc() {
        return "class " + constantPool.get(cPoolIndex.toInt()).detail();
    }
}
