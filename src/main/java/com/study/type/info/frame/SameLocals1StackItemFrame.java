package com.study.type.info.frame;

import com.study.io.U1InputStream;
import com.study.type.U1;
import com.study.type.info.verification.VerificationTypeInfo;
import com.study.type.info.verification.VerificationTypeInfoFactory;

public class SameLocals1StackItemFrame extends StackMapFrame {
    private final VerificationTypeInfo[] stack;

    SameLocals1StackItemFrame(U1 frameType, U1InputStream stream) {
        super(frameType);
        this.stack = new VerificationTypeInfo[]{VerificationTypeInfoFactory.build(stream)};
    }

    public VerificationTypeInfo[] getStack() {
        return stack;
    }
}
