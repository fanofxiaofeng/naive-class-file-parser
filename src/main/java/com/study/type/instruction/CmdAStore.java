package com.study.type.instruction;

import com.study.type.U1;

public class CmdAStore extends OneByteCmd {

    private static String[] names = {
            "astore_0", "astore_1", "astore_2", "astore_3"
    };

    public CmdAStore(U1 ordinal) {
        super(ordinal, names[ordinal.toInt() - 0x4b]);
    }
}
