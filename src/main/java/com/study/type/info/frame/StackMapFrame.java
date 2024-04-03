package com.study.type.info.frame;

import com.study.type.U1;

public abstract class StackMapFrame {
    private final U1 frameType;

    protected StackMapFrame(U1 frameType) {
        this.frameType = frameType;
    }

    public U1 getFrameType() {
        return frameType;
    }
}
