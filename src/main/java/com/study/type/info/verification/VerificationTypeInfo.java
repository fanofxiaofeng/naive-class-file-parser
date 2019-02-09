package com.study.type.info.verification;

import com.study.parser.ConstantPoolHolder;
import com.study.type.U1;

public abstract class VerificationTypeInfo extends ConstantPoolHolder {
    U1 tag;

    // todo 需要改成 abstract 方法
    public String desc() {
        return null;
    }
}
