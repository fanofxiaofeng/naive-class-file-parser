package com.study.type.info.frame;

import com.study.io.U1InputStream;
import com.study.type.U1;
import com.study.type.info.verification.VerificationTypeInfo;

public class SameLocals1StackItemFrame extends StackMapFrame {
    private U1 frameType;
    private VerificationTypeInfo[] stack;

    SameLocals1StackItemFrame(U1 frameType, U1InputStream stream) {
        this.frameType = frameType;
        this.stack = new VerificationTypeInfo[1];
        this.stack[0] = VerificationTypeInfo.build(stream);
    }

    @Override
    public String desc() {
        return String.format("frame_type = %d /* same_locals_1_stack_item */", frameType.toInt());
    }
}
