package com.study.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.instruction.AbstractCmd;
import com.study.type.instruction.OneByteCmd;

public class StackFactory implements CmdFactory {
    private static final StackFactory instance = new StackFactory();

    public static StackFactory getInstance() {
        return instance;
    }

    private static final OneByteCmd[] commands = {
            new OneByteCmd(0x57, "pop"),
            new OneByteCmd(0x58, "pop2"),
            new OneByteCmd(0x59, "dup"),
            new OneByteCmd(0x5a, "dup_x1"),
            new OneByteCmd(0x5b, "dup_x2"),
            new OneByteCmd(0x5c, "dup2"),
            new OneByteCmd(0x5d, "dup2_x1"),
            new OneByteCmd(0x5e, "dup2_x2"),
            new OneByteCmd(0x5f, "swap"),
    };

    private StackFactory() {

    }

    @Override
    public AbstractCmd build(boolean isWide, U1 ordinal, CodeInputStream codeInputStream) {
        if (ordinal.toInt() >= 0x57 && ordinal.toInt() <= 0x5f) {
            return commands[ordinal.toInt() - 0x57];
        }
        throw new RuntimeException(String.format("ordinal: %s is not found!", ordinal));
    }
}
