package com.study.type.instruction;

import com.study.io.CodeInputStream;
import com.study.type.U1;

public class CmdGoto extends AbstractCmd {
    private U1 branchByte1;
    private U1 branchByte2;

    CmdGoto(U1 ordinal, CodeInputStream codeInputStream) {
        super(ordinal);
        this.branchByte1 = codeInputStream.readU1();
        this.branchByte2 = codeInputStream.readU1();
        this.name = "goto";
    }
}
