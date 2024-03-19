package com.study.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.instruction.AbstractInstruction;
import com.study.type.instruction.OneByteInstruction;

import java.util.List;
import java.util.function.Function;

public class StackFactory implements InstructionFactory {
    private static final StackFactory instance = new StackFactory();

    public static StackFactory getInstance() {
        return instance;
    }

    private static final List<Function<Integer, OneByteInstruction>> commands = List.of(
            (startIndex) -> new OneByteInstruction(startIndex, 0x57, "pop"),
            (startIndex) -> new OneByteInstruction(startIndex, 0x58, "pop2"),
            (startIndex) -> new OneByteInstruction(startIndex, 0x59, "dup"),
            (startIndex) -> new OneByteInstruction(startIndex, 0x5a, "dup_x1"),
            (startIndex) -> new OneByteInstruction(startIndex, 0x5b, "dup_x2"),
            (startIndex) -> new OneByteInstruction(startIndex, 0x5c, "dup2"),
            (startIndex) -> new OneByteInstruction(startIndex, 0x5d, "dup2_x1"),
            (startIndex) -> new OneByteInstruction(startIndex, 0x5e, "dup2_x2"),
            (startIndex) -> new OneByteInstruction(startIndex, 0x5f, "swap")
    );

    private StackFactory() {

    }

    @Override
    public AbstractInstruction build(int startIndex, boolean isWide, U1 ordinal, CodeInputStream codeInputStream) {
        if (ordinal.toInt() >= 0x57 && ordinal.toInt() <= 0x5f) {
            return commands.get(ordinal.toInt() - 0x57).apply(startIndex);
        }
        throw new RuntimeException(String.format("ordinal: %s is not found!", ordinal));
    }
}
