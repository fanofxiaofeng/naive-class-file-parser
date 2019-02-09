package com.study.type.info.frame;

import com.study.io.U1InputStream;
import com.study.type.U1;
import com.study.type.U2;

public class StackMapFrameFactory {
    public static StackMapFrame build(U1InputStream stream) {
        U1 frameType = stream.readU1();
        int judge = frameType.toInt();

        if (judge >= 0 && judge <= 63) {
            // finished
            return new SameFrame(frameType);
        }
        if (judge >= 64 && judge <= 127) {
            // todo
            return new SameLocals1StackItemFrame(frameType, stream);
        }
        if (judge >= 128 && judge <= 246) {
            // todo
            throw new RuntimeException("For future use");
        }
        if (judge == 247) {
            // todo
            return new SameLocals1StackItemFrameExtended(frameType, stream);
        }
        if (judge >= 248 && judge <= 250) {
            U2 offsetDelta = stream.readU2();
            return new ChopFrame(frameType, offsetDelta);
        }
        if (judge == 251) {
            // todo
            U2 offsetDelta = stream.readU2();
            return new SameFrameExtended(frameType, offsetDelta);
        }
        if (judge >= 252 && judge <= 254) {
            return new AppendFrame(frameType, stream);
        }
        if (judge == 255) {
            // todo
            return new FullFrame(frameType, stream);
        }

        throw new RuntimeException("weird frameType: " + frameType);
    }
}
