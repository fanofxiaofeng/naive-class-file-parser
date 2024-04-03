package com.study.type.info.verification;

import com.study.io.ContentReader;
import com.study.type.U1;
import com.study.type.U2;

public class VerificationTypeInfoFactory {
    public static VerificationTypeInfo build(ContentReader contentReader) {
        U1 tag = contentReader.readU1();
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
            case DoubleVariableInfo.TAG_VALUE -> {
                return new DoubleVariableInfo();
            }
            case LongVariableInfo.TAG_VALUE -> {
                return new LongVariableInfo();
            }
            case NullVariableInfo.TAG_VALUE -> {
                return new NullVariableInfo();
            }
            case UninitializedThisVariableInfo.TAG_VALUE -> {
                return new UninitializedThisVariableInfo();
            }
            case ObjectVariableInfo.TAG_VALUE -> {
                U2 cPoolIndex = contentReader.readU2();
                return new ObjectVariableInfo(cPoolIndex);
            }
            case UninitializedVariableInfo.TAG_VALUE -> {
                U2 offset = contentReader.readU2();
                return new UninitializedVariableInfo(offset);
            }
            default -> throw new RuntimeException("Unsupported tag: " + tag);
        }
    }
}
