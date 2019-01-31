package com.study.type.instruction;

import com.study.type.U1;

public class OneByteCmd extends AbstractCmd {

    public OneByteCmd(U1 ordinal, String name) {
        super(ordinal);
        this.name = name;
    }

    @Override
    public int size() {
        return 1;
    }
}
