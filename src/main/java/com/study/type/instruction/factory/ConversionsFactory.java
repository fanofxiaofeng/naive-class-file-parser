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
    public AbstractCmd build(boolean isWide,U1 ordinal, CodeInputStream codeInputStream) {
        return switch (ordinal.toInt()) {
            case 0x85 -> new OneByteCmd(ordinal, "i2l");
            case 0x86 -> new OneByteCmd(ordinal, "i2f");
            case 0x87 -> new OneByteCmd(ordinal, "i2d");
            case 0x88 -> new OneByteCmd(ordinal, "l2i");
            case 0x89 -> new OneByteCmd(ordinal, "l2f");
            case 0x8a -> new OneByteCmd(ordinal, "l2d");
            case 0x8b -> new OneByteCmd(ordinal, "f2i");
            case 0x8c -> new OneByteCmd(ordinal, "f2l");
            case 0x8d -> new OneByteCmd(ordinal, "f2d");
            case 0x8e -> new OneByteCmd(ordinal, "d2i");
            case 0x8f -> new OneByteCmd(ordinal, "d2l");
            case 0x90 -> new OneByteCmd(ordinal, "d2f");
            case 0x91 -> new OneByteCmd(ordinal, "i2b");
            case 0x92 -> new OneByteCmd(ordinal, "i2c");
            case 0x93 -> new OneByteCmd(ordinal, "i2s");
            default -> throw new RuntimeException(String.format("ordinal: %s is not found!", ordinal));
        };
    }
}
