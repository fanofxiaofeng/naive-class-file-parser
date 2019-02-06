package com.study.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.instruction.AbstractCmd;
import com.study.type.instruction.FakeCmd;
import com.study.type.instruction.OneByteCmd;
import com.study.type.instruction.ThreeByteCmd;

public class MathFactory implements CmdFactory {
    private static MathFactory instance = new MathFactory();

    private MathFactory() {

    }

    public static MathFactory getInstance() {
        return instance;
    }

    @Override
    public AbstractCmd build(U1 ordinal, CodeInputStream codeInputStream) {
        switch (ordinal.toInt()) {
            case 0x60:
                return new OneByteCmd(ordinal, "iadd");
            case 0x61:
                return new OneByteCmd(ordinal, "ladd");
            case 0x69:
                return new OneByteCmd(ordinal, "lmul");
            case 0x7e:
                return new OneByteCmd(ordinal, "iand");
            case 0x84:
                return new ThreeByteCmd(ordinal, "iinc", codeInputStream) {
                    @Override
                    public String desc(int index) {
                        // todo 逻辑有待确认
                        return String.format("%10s: %-14s%s, %s",
                                index,
                                name,
                                this.b1.toInt(),
                                this.b2.toInt());
                    }
                };
        }
        return new FakeCmd(ordinal, "xx math");
    }
}
