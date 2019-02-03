package com.study.type.instruction;

import com.study.io.CodeInputStream;
import com.study.type.U1;

public class CmdBiPush extends AbstractCmd {
    private U1 _byte;

    public CmdBiPush(U1 ordinal, CodeInputStream codeInputStream) {
        super(ordinal);
        this._byte = codeInputStream.readU1();
        this.name = "bipush";
    }

    @Override
    public int size() {
        return 2;
    }
}
