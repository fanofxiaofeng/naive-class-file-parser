package com.study.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.instruction.AbstractCmd;
import com.study.type.instruction.OneByteCmd;

public class StackFactory implements CmdFactory {
    private static StackFactory instance = new StackFactory();

    public static StackFactory getInstance() {
        return instance;
    }

    private StackFactory() {

    }

    @Override
    public AbstractCmd build(U1 ordinal, CodeInputStream codeInputStream) {
        switch (ordinal.toInt()) {
            case 0x57:
                return new OneByteCmd(ordinal, "pop");
            case 0x58:
                return new OneByteCmd(ordinal, "pop2");
            case 0x59:
                return new OneByteCmd(ordinal, "dup");
            case 0x5a:
                return new OneByteCmd(ordinal, "dup_x1");
            case 0x5b:
                return new OneByteCmd(ordinal, "dup_x2");
            case 0x5c:
                return new OneByteCmd(ordinal, "dup2");
            case 0x5d:
                return new OneByteCmd(ordinal, "dup2_x1");
            case 0x5e:
                return new OneByteCmd(ordinal, "dup2_x2");
            case 0x5f:
                return new OneByteCmd(ordinal, "swap");
            default:
                throw new RuntimeException(String.format("ordinal: %s is not found!", ordinal));
        }
    }
}
