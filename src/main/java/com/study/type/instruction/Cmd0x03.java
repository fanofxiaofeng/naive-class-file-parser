package com.study.type.instruction;

import com.study.type.U1;

public class Cmd0x03 extends AbstractCmd {

    public Cmd0x03(U1 ordinal) {
        super(ordinal);
        this.name = "iconst_0";
    }

    @Override
    public int size() {
        return 1;
    }
}
