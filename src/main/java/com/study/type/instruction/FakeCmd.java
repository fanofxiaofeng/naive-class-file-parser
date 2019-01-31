package com.study.type.instruction;

import com.study.type.U1;

public class FakeCmd extends OneByteCmd {
    FakeCmd(U1 ordinal) {
        super(ordinal, "xxx");
//        codeInputStream.readU1();
    }
}
