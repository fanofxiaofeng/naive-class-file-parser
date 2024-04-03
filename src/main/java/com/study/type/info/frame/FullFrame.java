package com.study.type.info.frame;

import com.study.io.U1InputStream;
import com.study.type.U1;
import com.study.type.U2;
import com.study.type.info.verification.VerificationTypeInfo;
import com.study.type.info.verification.VerificationTypeInfoFactory;

public class FullFrame extends StackMapFrame {
    private final U2 offsetDelta;
    private final U2 numberOfLocals;
    private final VerificationTypeInfo[] locals;
    //[ number_of_locals];
    private final U2 numberOfStackItems;
    private final VerificationTypeInfo[] stack;
    //[ number_of_stack_items];

    FullFrame(U1 frameType, U1InputStream stream) {
        super(frameType);
        this.offsetDelta = stream.readU2();
        this.numberOfLocals = stream.readU2();
        this.locals = new VerificationTypeInfo[this.numberOfLocals.toInt()];
        for (int i = 0; i < this.locals.length; i++) {
            this.locals[i] = VerificationTypeInfoFactory.build(stream);
        }
        this.numberOfStackItems = stream.readU2();
        this.stack = new VerificationTypeInfo[this.numberOfStackItems.toInt()];
        for (int i = 0; i < this.stack.length; i++) {
            this.stack[i] = VerificationTypeInfoFactory.build(stream);
        }
    }

    public U2 getOffsetDelta() {
        return offsetDelta;
    }

    public VerificationTypeInfo[] getLocals() {
        return locals;
    }

    public VerificationTypeInfo[] getStack() {
        return stack;
    }
}
