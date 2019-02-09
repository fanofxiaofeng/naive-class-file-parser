package com.study.type.info.frame;

import com.study.io.U1InputStream;
import com.study.type.U1;
import com.study.type.U2;
import com.study.type.info.verification.VerificationTypeInfo;
import com.study.type.info.verification.VerificationTypeInfoFactory;

import java.util.StringJoiner;

public class FullFrame extends StackMapFrame {
    private U1 frameType;//FULL_FRAME; /* 255 */
    private U2 offsetDelta;
    private U2 numberOfLocals;
    private VerificationTypeInfo[] locals;
    //[ number_of_locals];
    private U2 numberOfStackItems;
    private VerificationTypeInfo[] stack;
    //[ number_of_stack_items];

    FullFrame(U1 frameType, U1InputStream stream) {
        this.frameType = frameType;
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

    @Override
    public String desc() {
        return String.format("frame_type = %s /* full_frame */", frameType.toInt());
    }

    @Override
    public boolean hasDetail() {
        return true;
    }

    @Override
    public String[] detail() {
        String[] detail = new String[3];
        detail[0] = String.format("offset_delta = %d", offsetDelta.toInt());

        StringJoiner joiner = new StringJoiner(", ");
        for (VerificationTypeInfo local : this.locals) {
            joiner.add(local.desc());
        }
        detail[1] = String.format("locals = [ %s ]", joiner.toString());

        joiner = new StringJoiner(", ");
        for (VerificationTypeInfo local : this.stack) {
            joiner.add(local.desc());
        }
        if (joiner.length() > 0) {
            detail[2] = String.format("stack = [ %s ]", joiner);
        } else {
            detail[2] = "stack = []";
        }
        return detail;
    }
}
