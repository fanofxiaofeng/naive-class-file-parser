package com.study.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.instruction.AbstractInstruction;
import com.study.type.instruction.OneByteInstruction;

public class ConversionsFactory implements InstructionFactory {
    private ConversionsFactory() {

    }

    private static ConversionsFactory instance = new ConversionsFactory();

    public static ConversionsFactory getInstance() {
        return instance;
    }

    @Override
    public AbstractInstruction build(int startIndex, boolean isWide, U1 ordinal, CodeInputStream codeInputStream) {
        return switch (ordinal.toInt()) {
            case 0x85 -> new OneByteInstruction(startIndex, ordinal, "i2l");
            case 0x86 -> new OneByteInstruction(startIndex, ordinal, "i2f");
            case 0x87 -> new OneByteInstruction(startIndex, ordinal, "i2d");
            case 0x88 -> new OneByteInstruction(startIndex, ordinal, "l2i");
            case 0x89 -> new OneByteInstruction(startIndex, ordinal, "l2f");
            case 0x8a -> new OneByteInstruction(startIndex, ordinal, "l2d");
            case 0x8b -> new OneByteInstruction(startIndex, ordinal, "f2i");
            case 0x8c -> new OneByteInstruction(startIndex, ordinal, "f2l");
            case 0x8d -> new OneByteInstruction(startIndex, ordinal, "f2d");
            case 0x8e -> new OneByteInstruction(startIndex, ordinal, "d2i");
            case 0x8f -> new OneByteInstruction(startIndex, ordinal, "d2l");
            case 0x90 -> new OneByteInstruction(startIndex, ordinal, "d2f");
            case 0x91 -> new OneByteInstruction(startIndex, ordinal, "i2b");
            case 0x92 -> new OneByteInstruction(startIndex, ordinal, "i2c");
            case 0x93 -> new OneByteInstruction(startIndex, ordinal, "i2s");
            default -> throw new RuntimeException(String.format("ordinal: %s is not found!", ordinal));
        };
    }
}
