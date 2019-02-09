package com.study.type.info.frame;

import com.study.type.U1;

public class SameFrame extends StackMapFrame {
    private U1 frameType;

    SameFrame(U1 frameType) {
        this.frameType = frameType;
    }

    @Override
    public String desc() {
        return String.format("frame_type = %d /* same */", frameType.toInt());
    }
}
