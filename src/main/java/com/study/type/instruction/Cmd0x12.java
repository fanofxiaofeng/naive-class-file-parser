package com.study.type.instruction;

import com.study.io.CodeInputStream;
import com.study.type.U1;

public class Cmd0x12 extends AbstractCmd {
    private U1 index;

    public Cmd0x12(U1 ordinal, CodeInputStream codeInputStream) {
        super(ordinal);
        this.index = codeInputStream.readU1();
        this.name = "ldc";
    }

    @Override
    public String desc(int index) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.desc(index));
        extentTo(stringBuilder);
        stringBuilder.append(String.format("#%d", this.index.toInt()));
        return stringBuilder.toString();
    }

    @Override
    public int size() {
        return 2;
    }
}
