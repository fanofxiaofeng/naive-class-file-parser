package com.study.type.info.frame;

import com.study.type.U1;
import com.study.type.U2;

public class ChopFrame extends StackMapFrame {
    private U1 frameType;
    private U2 offsetDelta;

    ChopFrame(U1 frameType, U2 offsetDelta) {
        this.frameType = frameType;
        this.offsetDelta = offsetDelta;
    }

    @Override
    public String desc() {
        return String.format("frame_type = %d /* chop */", frameType.toInt());
    }

    @Override
    public boolean hasDetail() {
        return true;
    }

    @Override
    public String[] detail() {
        String[] detail = new String[1];
        detail[0] = String.format("offset_delta = %d", offsetDelta.toInt());
        return detail;
    }
}
