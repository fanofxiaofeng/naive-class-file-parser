package com.study.type.instruction;

import com.study.type.U1;

public class TwoByteCmd extends AbstractCmd {
    protected U1 _byte;

    public TwoByteCmd(U1 ordinal, String name, U1 _byte) {
        super(ordinal);
        this.name = name;
        this._byte = _byte;
    }

    @Override
    public int size() {
        return 2;
    }

    @Override
    public String desc(int index) {
        return String.format("%10s: %-14s%s", index, name, this._byte.toInt());
    }
}
