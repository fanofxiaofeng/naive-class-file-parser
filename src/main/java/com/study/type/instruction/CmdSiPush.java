package com.study.type.instruction;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.U2;
import com.study.type.constant.AbstractConstant;

public class CmdSiPush extends AbstractCmd {
    private U1 byte1;
    private U1 byte2;

    public CmdSiPush(U1 ordinal, CodeInputStream codeInputStream) {
        super(ordinal);
        this.name = "sipush";
        this.byte1 = codeInputStream.readU1();
        this.byte2 = codeInputStream.readU1();
    }

    @Override
    public String desc(int index, AbstractConstant[] constantPool) {
        StringBuilder stringBuilder = new StringBuilder(super.desc(index, constantPool));
        extentTo(stringBuilder);
        // todo 这里的计算可能有问题
        stringBuilder.append((short) new U2(byte1, byte2).toInt());
        return stringBuilder.toString();
    }

    @Override
    public int size() {
        return 3;
    }

    public static void main(String[] args) {
        short s = (short) 0xFFFF;
        System.out.println(s);
        System.out.println(0xFFFF);
    }

}
