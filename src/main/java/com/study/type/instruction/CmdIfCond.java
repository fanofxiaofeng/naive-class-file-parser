package com.study.type.instruction;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.U2;
import com.study.type.constant.AbstractConstant;

public class CmdIfCond extends AbstractCmd {

    private U1 branchByte1;
    private U1 branchByte2;
    private static String[] names = {
            "ifeq", "ifne", "iflt", "ifge", "ifgt", "ifle"
    };

    public CmdIfCond(U1 ordinal, CodeInputStream codeInputStream) {
        super(ordinal);
        this.branchByte1 = codeInputStream.readU1();
        this.branchByte2 = codeInputStream.readU1();
        this.name = names[ordinal.toInt() - 0x99];
    }

    @Override
    public String desc(int index, AbstractConstant[] constantPool) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.desc(index, constantPool));
        extentTo(stringBuilder);
        int offset = new U2(branchByte1, branchByte2).toInt();
        stringBuilder.append(String.format("%d", index + offset));
        return stringBuilder.toString();
    }
}
