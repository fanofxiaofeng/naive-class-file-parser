package com.study.type.instruction;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.U2;
import com.study.type.constant.AbstractConstant;

public class CmdInvokeVirtual extends AbstractCmd {
    private U1 indexByte1;
    private U1 indexByte2;

    public CmdInvokeVirtual(U1 ordinal, CodeInputStream codeInputStream) {
        super(ordinal);
        this.indexByte1 = codeInputStream.readU1();
        this.indexByte2 = codeInputStream.readU1();
        this.name = "invokevirtual";
    }

    @Override
    public String desc(int index, AbstractConstant[] constantPool) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.desc(index, constantPool));
        extentTo(stringBuilder);
        int temp = new U2(indexByte1, indexByte2).toInt();
        stringBuilder.append(String.format("#%d", temp));
        return stringBuilder.toString();
    }

    @Override
    public int size() {
        return 3;
    }
}
