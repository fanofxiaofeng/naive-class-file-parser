package com.study.type.info.frame;

import com.study.io.U1InputStream;
import com.study.type.U1;
import com.study.type.U2;
import com.study.type.info.verification.VerificationTypeInfo;
import com.study.type.info.verification.VerificationTypeInfoFactory;

public class AppendFrame extends StackMapFrame {
    private final U2 offsetDelta;
    private final VerificationTypeInfo[] locals;
    //[frame_type - 251]// ;

    AppendFrame(U1 frameType, U1InputStream stream) {
        super(frameType);
        this.offsetDelta = stream.readU2();
        this.locals = new VerificationTypeInfo[this.getFrameType().toInt() - 251];
        for (int i = 0; i < this.locals.length; i++) {
            this.locals[i] = VerificationTypeInfoFactory.build(stream);
        }
    }

    public U2 getOffsetDelta() {
        return offsetDelta;
    }

    public VerificationTypeInfo[] getLocals() {
        return locals;
    }
}
