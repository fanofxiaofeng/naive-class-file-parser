package com.study.type.instruction;

import com.study.type.U1;

public class CmdIStore extends OneByteCmd {
    private static String[] names = {
            "istore_0", "istore_1", "istore_2", "istore_3"
    };

    public CmdIStore(U1 ordinal) {
        super(ordinal, names[ordinal.toInt() - 0x3b]);
    }
}
