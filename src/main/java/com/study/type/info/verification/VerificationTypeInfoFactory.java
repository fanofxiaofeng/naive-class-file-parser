package com.study.type.info.verification;

import com.study.io.U1InputStream;
import com.study.type.U1;
import com.study.type.U2;

public class VerificationTypeInfoFactory {
    public static VerificationTypeInfo build(U1InputStream stream) {
        U1 tag = stream.readU1();
        switch (tag.toInt()) {
            case TopVariableInfo.TAG_VALUE -> {
                return new TopVariableInfo();
            }
            case IntegerVariableInfo.TAG_VALUE -> {
                return new IntegerVariableInfo();
            }
            case FloatVariableInfo.TAG_VALUE -> {
                return new FloatVariableInfo();
            }
            case LongVariableInfo.TAG_VALUE -> {
                return new LongVariableInfo();
            }
            case DoubleVariableInfo.TAG_VALUE -> {
                return new DoubleVariableInfo();
            }
            case NullVariableInfo.TAG_VALUE -> {
                return new NullVariableInfo();
            }
            case UninitializedThisVariableInfo.TAG_VALUE -> {
                return new UninitializedThisVariableInfo();
            }
            case ObjectVariableInfo.TAG_VALUE -> {
                U2 cPoolIndex = stream.readU2();
                return new ObjectVariableInfo(cPoolIndex);
            }
            case UninitializedVariableInfo.TAG_VALUE -> {
                U2 offset = stream.readU2();
                return new UninitializedVariableInfo(offset);
            }
            default -> throw new RuntimeException("weird tag: " + tag);
        }
    }
}
