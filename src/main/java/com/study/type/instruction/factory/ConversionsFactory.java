package com.study.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.instruction.AbstractCmd;
import com.study.type.instruction.FakeCmd;
import com.study.type.instruction.OneByteCmd;

public class ConversionsFactory implements CmdFactory {
    private ConversionsFactory() {

    }

    private static ConversionsFactory instance = new ConversionsFactory();

    public static ConversionsFactory getInstance() {
        return instance;
    }

    @Override
    public AbstractCmd build(U1 ordinal, CodeInputStream codeInputStream) {
        switch (ordinal.toInt()) {
            case 0x85:
                return new OneByteCmd(ordinal, "i2l");
        }
        return new FakeCmd(ordinal, "xx conversion");
    }
}
