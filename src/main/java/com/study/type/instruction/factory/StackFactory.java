package com.study.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.instruction.AbstractCmd;
import com.study.type.instruction.FakeCmd;
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
            case 0x59:
                return new OneByteCmd(ordinal, "dup");
        }
        return new FakeCmd(ordinal, "xx stack");
    }
}
