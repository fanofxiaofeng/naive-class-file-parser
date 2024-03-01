package com.study.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.instruction.AbstractCmd;
import com.study.type.instruction.OneByteCmd;
import com.study.type.instruction.ThreeByteCmd;
import com.study.type.instruction.TwoByteCmd;

public class LoadsFactory implements CmdFactory {
    private static final LoadsFactory instance = new LoadsFactory();

    public static LoadsFactory getInstance() {
        return instance;
    }

    private LoadsFactory() {
    }

    @Override
    public AbstractCmd build(boolean isWide, U1 ordinal, CodeInputStream codeInputStream) {
        switch (ordinal.toInt()) {
            case 0x15 -> {
                if (isWide) {
                    return new ThreeByteCmd.ThreeByteCmdWithCpIndex(ordinal, "iload_w", codeInputStream);
                }
                return new TwoByteCmd.TwoByteCmdWithCpIndex(ordinal, "iload", codeInputStream.readU1());
            }
            case 0x16 -> {
                if (isWide) {
                    return new ThreeByteCmd.ThreeByteCmdWithCpIndex(ordinal, "lload_w", codeInputStream);
                }
                return new TwoByteCmd.TwoByteCmdWithCpIndex(ordinal, "lload", codeInputStream.readU1());
            }
            case 0x17 -> {
                if (isWide) {
                    return new ThreeByteCmd.ThreeByteCmdWithCpIndex(ordinal, "fload_w", codeInputStream);
                }
                return new TwoByteCmd.TwoByteCmdWithCpIndex(ordinal, "fload", codeInputStream.readU1());
            }
            case 0x18 -> {
                if (isWide) {
                    return new ThreeByteCmd.ThreeByteCmdWithCpIndex(ordinal, "dload_w", codeInputStream);
                }
                return new TwoByteCmd.TwoByteCmdWithCpIndex(ordinal, "dload", codeInputStream.readU1());
            }
            case 0x19 -> {
                if (isWide) {
                    return new ThreeByteCmd.ThreeByteCmdWithCpIndex(ordinal, "aload_w", codeInputStream);
                }
                return new TwoByteCmd.TwoByteCmdWithCpIndex(ordinal, "aload", codeInputStream.readU1());
            }
            case 0x1a, 0x1b, 0x1c, 0x1d -> {
                String[] names = {"iload_0", "iload_1", "iload_2", "iload_3"};
                String name = names[ordinal.toInt() - 0x1a];
                return new OneByteCmd(ordinal, name);
            }
            case 0x1e, 0x1f, 0x20, 0x21 -> {
                String[] names = {"lload_0", "lload_1", "lload_2", "lload_3"};
                String name = names[ordinal.toInt() - 0x1e];
                return new OneByteCmd(ordinal, name);
            }
            case 0x22, 0x23, 0x24, 0x25 -> {
                String[] names = {"fload_0", "fload_1", "fload_2", "fload_3"};
                String name = names[ordinal.toInt() - 0x22];
                return new OneByteCmd(ordinal, name);
            }
            case 0x26, 0x27, 0x28, 0x29 -> {
                String[] names = {"dload_0", "dload_1", "dload_2", "dload_3"};
                String name = names[ordinal.toInt() - 0x26];
                return new OneByteCmd(ordinal, name);
            }
            case 0x2a, 0x2b, 0x2c, 0x2d -> {
                String[] names = {"aload_0", "aload_1", "aload_2", "aload_3"};
                String name = names[ordinal.toInt() - 0x2a];
                return new OneByteCmd(ordinal, name);
            }
            case 0x2e -> {
                return new OneByteCmd(ordinal, "iaload");
            }
            case 0x2f -> {
                return new OneByteCmd(ordinal, "laload");
            }
            case 0x30 -> {
                return new OneByteCmd(ordinal, "faload");
            }
            case 0x31 -> {
                return new OneByteCmd(ordinal, "daload");
            }
            case 0x32 -> {
                return new OneByteCmd(ordinal, "aaload");
            }
            case 0x33 -> {
                return new OneByteCmd(ordinal, "baload");
            }
            case 0x34 -> {
                return new OneByteCmd(ordinal, "caload");
            }
            case 0x35 -> {
                return new OneByteCmd(ordinal, "saload");
            }
            default -> throw new RuntimeException(String.format("ordinal: %s is not found!", ordinal));
        }
    }
}
