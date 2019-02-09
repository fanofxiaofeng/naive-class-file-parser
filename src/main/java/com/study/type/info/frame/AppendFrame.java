package com.study.type.info.frame;

import com.study.io.U1InputStream;
import com.study.type.U1;
import com.study.type.U2;
import com.study.type.info.verification.VerificationTypeInfo;

import java.util.StringJoiner;

public class AppendFrame extends StackMapFrame {
    private U1 frameType;//APPEND; /* 252-254 */
    private U2 offsetDelta;
    private VerificationTypeInfo[] locals;
    //[frame_type - 251]// ;

    AppendFrame(U1 frameType, U1InputStream stream) {
        this.frameType = frameType;
        this.offsetDelta = stream.readU2();
        this.locals = new VerificationTypeInfo[this.frameType.toInt() - 251];
        for (int i = 0; i < this.locals.length; i++) {
            this.locals[i] = VerificationTypeInfo.build(stream);
        }
    }

    @Override
    public String desc() {
        return String.format("frame_type = %d /* append */", frameType.toInt());
    }

    @Override
    public boolean hasDetail() {
        return true;
    }

    @Override
    public String[] detail() {
        String[] detail = new String[2];

        detail[0] = String.format("offset_delta = %d", offsetDelta.toInt());

        StringJoiner joiner = new StringJoiner(", ");
        for (VerificationTypeInfo local : this.locals) {
            joiner.add(local.desc());
        }
        detail[1] = String.format("locals = [ %s ]", joiner.toString());

        return detail;
    }
}
