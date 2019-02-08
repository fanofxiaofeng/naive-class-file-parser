package com.study.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.instruction.AbstractCmd;
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
            case 0x86:
                return new OneByteCmd(ordinal, "i2f");
            case 0x87:
                return new OneByteCmd(ordinal, "i2d");
            case 0x88:
                return new OneByteCmd(ordinal, "l2i");
            case 0x89:
                return new OneByteCmd(ordinal, "l2f");
            case 0x8a:
                return new OneByteCmd(ordinal, "l2d");
            case 0x8b:
                return new OneByteCmd(ordinal, "f2i");
            case 0x8c:
                return new OneByteCmd(ordinal, "f2l");
            case 0x8d:
                return new OneByteCmd(ordinal, "f2d");
            case 0x8e:
                return new OneByteCmd(ordinal, "d2i");
            case 0x8f:
                return new OneByteCmd(ordinal, "d2l");
            case 0x90:
                return new OneByteCmd(ordinal, "d2f");
            case 0x91:
                return new OneByteCmd(ordinal, "i2b");
            case 0x92:
                return new OneByteCmd(ordinal, "i2c");
            case 0x93:
                return new OneByteCmd(ordinal, "i2s");
            default:
                throw new RuntimeException(String.format("ordinal: %s is not found!", ordinal));
        }
    }
}
