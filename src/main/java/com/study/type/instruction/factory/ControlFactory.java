package com.study.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.instruction.AbstractCmd;
import com.study.type.instruction.FakeCmd;
import com.study.type.instruction.OneByteCmd;
import com.study.type.instruction.ThreeByteCmd;

import static com.sun.tools.javac.jvm.ByteCodes.areturn;
import static com.sun.tools.javac.jvm.ByteCodes.dreturn;

public class ControlFactory implements CmdFactory {
    private ControlFactory() {

    }

    private static ControlFactory instance = new ControlFactory();

    public static ControlFactory getInstance() {
        return instance;
    }

    @Override
    public AbstractCmd build(U1 ordinal, CodeInputStream codeInputStream) {
        switch (ordinal.toInt()) {
            case 0xa7: {
                U1 b1 = codeInputStream.readU1();
                U1 b2 = codeInputStream.readU1();
                return new ThreeByteCmd(ordinal, "goto", b1, b2) {
                    @Override
                    public String desc(int index) {
                        return String.format("%10s: %-14s%s", index, name, index + combine().toInt());
                    }
                };
            }
            case 0xac:
                return new OneByteCmd(ordinal, "ireturn");
            // 0xaf
            case dreturn: {
                return new OneByteCmd(ordinal, "dreturn");
            }
            // 0xb0
            case areturn: {
                return new OneByteCmd(ordinal, "areturn");
            }
            case 0xb1:
                return new OneByteCmd(ordinal, "return");
        }
        return new FakeCmd(ordinal, "xx control");
    }
}
