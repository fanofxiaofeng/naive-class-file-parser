package com.study.type.info.frame;

import com.study.type.U1;
import com.study.type.U2;

public class SameFrameExtended extends StackMapFrame {
    private final U2 offsetDelta;

    SameFrameExtended(U1 frameType, U2 offsetDelta) {
        super(frameType);
        this.offsetDelta = offsetDelta;
    }

    public U2 getOffsetDelta() {
        return offsetDelta;
    }
}
