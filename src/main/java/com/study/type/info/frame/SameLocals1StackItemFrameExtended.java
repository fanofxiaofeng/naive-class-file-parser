package com.study.type.info.frame;

import com.study.io.U1InputStream;
import com.study.type.U1;
import com.study.type.U2;
import com.study.type.info.verification.VerificationTypeInfo;
import com.study.type.info.verification.VerificationTypeInfoFactory;

public class SameLocals1StackItemFrameExtended extends StackMapFrame {
    private final U2 offsetDelta;
    private final VerificationTypeInfo[] stack;

    SameLocals1StackItemFrameExtended(U1 frameType, U1InputStream stream) {
        super(frameType);
        this.offsetDelta = stream.readU2();
        this.stack = new VerificationTypeInfo[1];
        this.stack[0] = VerificationTypeInfoFactory.build(stream);
    }
}
