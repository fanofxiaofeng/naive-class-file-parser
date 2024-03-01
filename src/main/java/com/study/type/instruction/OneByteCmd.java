package com.study.type.instruction;

import com.study.type.U1;

public class OneByteCmd extends AbstractCmd {

    public OneByteCmd(U1 ordinal, String name) {
        super(ordinal);
        this.name = name;
    }
    public OneByteCmd(int ordinal, String name) {
        super(new U1(ordinal));
        this.name = name;
    }

    @Override
    public int size() {
        return 1;
    }
}
