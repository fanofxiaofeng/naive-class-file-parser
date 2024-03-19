package com.study.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.instruction.AbstractInstruction;
import com.study.type.instruction.OneByteInstruction;
import com.study.type.instruction.ThreeByteInstruction;
import com.study.type.instruction.TwoByteInstruction;

public class LoadsFactory implements InstructionFactory {
    private static final LoadsFactory instance = new LoadsFactory();

    public static LoadsFactory getInstance() {
        return instance;
    }

    private LoadsFactory() {
    }

    @Override
    public AbstractInstruction build(int startIndex, boolean isWide, U1 ordinal, CodeInputStream codeInputStream) {
        switch (ordinal.toInt()) {
            case 0x15 -> {
                if (isWide) {
                    return new ThreeByteInstruction.ThreeByteCmdWithCpIndex(startIndex, ordinal, "iload_w", codeInputStream);
                }
                return new TwoByteInstruction.TwoByteCmdWithCpIndex(startIndex, ordinal, "iload", codeInputStream.readU1());
            }
            case 0x16 -> {
                if (isWide) {
                    return new ThreeByteInstruction.ThreeByteCmdWithCpIndex(startIndex, ordinal, "lload_w", codeInputStream);
                }
                return new TwoByteInstruction.TwoByteCmdWithCpIndex(startIndex, ordinal, "lload", codeInputStream.readU1());
            }
            case 0x17 -> {
                if (isWide) {
                    return new ThreeByteInstruction.ThreeByteCmdWithCpIndex(startIndex, ordinal, "fload_w", codeInputStream);
                }
                return new TwoByteInstruction.TwoByteCmdWithCpIndex(startIndex, ordinal, "fload", codeInputStream.readU1());
            }
            case 0x18 -> {
                if (isWide) {
                    return new ThreeByteInstruction.ThreeByteCmdWithCpIndex(startIndex, ordinal, "dload_w", codeInputStream);
                }
                return new TwoByteInstruction.TwoByteCmdWithCpIndex(startIndex, ordinal, "dload", codeInputStream.readU1());
            }
            case 0x19 -> {
                if (isWide) {
                    return new ThreeByteInstruction.ThreeByteCmdWithCpIndex(startIndex, ordinal, "aload_w", codeInputStream);
                }
                return new TwoByteInstruction.TwoByteCmdWithCpIndex(startIndex, ordinal, "aload", codeInputStream.readU1());
            }
            case 0x1a, 0x1b, 0x1c, 0x1d -> {
                String[] names = {"iload_0", "iload_1", "iload_2", "iload_3"};
                String name = names[ordinal.toInt() - 0x1a];
                return new OneByteInstruction(startIndex, ordinal, name);
            }
            case 0x1e, 0x1f, 0x20, 0x21 -> {
                String[] names = {"lload_0", "lload_1", "lload_2", "lload_3"};
                String name = names[ordinal.toInt() - 0x1e];
                return new OneByteInstruction(startIndex, ordinal, name);
            }
            case 0x22, 0x23, 0x24, 0x25 -> {
                String[] names = {"fload_0", "fload_1", "fload_2", "fload_3"};
                String name = names[ordinal.toInt() - 0x22];
                return new OneByteInstruction(startIndex, ordinal, name);
            }
            case 0x26, 0x27, 0x28, 0x29 -> {
                String[] names = {"dload_0", "dload_1", "dload_2", "dload_3"};
                String name = names[ordinal.toInt() - 0x26];
                return new OneByteInstruction(startIndex, ordinal, name);
            }
            case 0x2a, 0x2b, 0x2c, 0x2d -> {
                String[] names = {"aload_0", "aload_1", "aload_2", "aload_3"};
                String name = names[ordinal.toInt() - 0x2a];
                return new OneByteInstruction(startIndex, ordinal, name);
            }
            case 0x2e -> {
                return new OneByteInstruction(startIndex, ordinal, "iaload");
            }
            case 0x2f -> {
                return new OneByteInstruction(startIndex, ordinal, "laload");
            }
            case 0x30 -> {
                return new OneByteInstruction(startIndex, ordinal, "faload");
            }
            case 0x31 -> {
                return new OneByteInstruction(startIndex, ordinal, "daload");
            }
            case 0x32 -> {
                return new OneByteInstruction(startIndex, ordinal, "aaload");
            }
            case 0x33 -> {
                return new OneByteInstruction(startIndex, ordinal, "baload");
            }
            case 0x34 -> {
                return new OneByteInstruction(startIndex, ordinal, "caload");
            }
            case 0x35 -> {
                return new OneByteInstruction(startIndex, ordinal, "saload");
            }
            default -> throw new RuntimeException(String.format("ordinal: %s is not found!", ordinal));
        }
    }
}
