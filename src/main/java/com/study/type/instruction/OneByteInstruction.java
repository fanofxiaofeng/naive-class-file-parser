package com.study.type.instruction;

import com.study.type.U1;

public class OneByteInstruction extends AbstractInstruction {

    public OneByteInstruction(int startIndex, U1 ordinal, String name) {
        super(startIndex, ordinal);
        this.name = name;
    }
    public OneByteInstruction(int startIndex, int ordinal, String name) {
        super(startIndex, new U1(ordinal));
        this.name = name;
    }

    @Override
    public int size() {
        return 1;
    }
}
