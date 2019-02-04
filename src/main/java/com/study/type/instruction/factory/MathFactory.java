package com.study.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.constant.AbstractConstant;
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
            case 0x7e:
                return new OneByteCmd(ordinal, "iand");
            case 0x84:
                return new ThreeByteCmd(ordinal, "iinc", codeInputStream) {
                    @Override
                    public String desc(int index) {
                        // todo 逻辑有待确认
                        StringBuilder stringBuilder = new StringBuilder(super.desc(index));
                        extentTo(stringBuilder);
                        stringBuilder.append(this.b1.toInt());
                        stringBuilder.append(", ");
                        stringBuilder.append(this.b2.toInt());
                        return stringBuilder.toString();
                    }
                };
        }
        return new FakeCmd(ordinal, "xx math");
    }
}
