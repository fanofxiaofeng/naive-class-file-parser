package com.study.type.info.frame;

import com.study.type.U1;
import com.study.type.U2;

public class SameFrameExtended extends StackMapFrame {
    private U1 frameType;
    private U2 offsetDelta;

    SameFrameExtended(U1 frameType, U2 offsetDelta) {
        this.frameType = frameType;
        this.offsetDelta = offsetDelta;
    }

    @Override
    public String desc() {
        return String.format("frame_type = %s /* same_frame_extended */\n%10soffset_delta = %d",
                frameType.toInt(),
                "",
                offsetDelta.toInt()
        );
    }
}
