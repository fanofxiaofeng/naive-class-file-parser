package com.study.type.instruction;

import com.study.type.U1;
import com.study.type.constant.AbstractConstant;

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
    public String desc(int index, AbstractConstant[] constantPool) {
        StringBuilder stringBuilder = new StringBuilder(super.desc(index, constantPool));
        extentTo(stringBuilder);
        stringBuilder.append(this._byte.toInt());
        return stringBuilder.toString();
    }
}
