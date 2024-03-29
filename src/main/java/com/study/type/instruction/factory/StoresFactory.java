package com.study.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.instruction.AbstractCmd;
import com.study.type.instruction.OneByteCmd;
import com.study.type.instruction.ThreeByteCmd;
import com.study.type.instruction.TwoByteCmd;

public class StoresFactory implements CmdFactory {
    private static final StoresFactory instance = new StoresFactory();

    private StoresFactory() {

    }

    public static StoresFactory getInstance() {
        return instance;
    }

    @Override
    public AbstractCmd build(boolean isWide, U1 ordinal, CodeInputStream codeInputStream) {
        switch (ordinal.toInt()) {
            case 0x36 -> {
                if (isWide) {
                    return new ThreeByteCmd.ThreeByteCmdWithCpIndex(ordinal, "istore_w", codeInputStream);
                }
                return new TwoByteCmd.TwoByteCmdWithCpIndex(ordinal, "istore", codeInputStream.readU1());
            }
            case 0x37 -> {
                if (isWide) {
                    return new ThreeByteCmd.ThreeByteCmdWithCpIndex(ordinal, "lstore_w", codeInputStream);
                }
                return new TwoByteCmd.TwoByteCmdWithCpIndex(ordinal, "lstore", codeInputStream.readU1());
            }
            case 0x38 -> {
                if (isWide) {
                    return new ThreeByteCmd.ThreeByteCmdWithCpIndex(ordinal, "fstore_w", codeInputStream);
                }
                return new TwoByteCmd.TwoByteCmdWithCpIndex(ordinal, "fstore", codeInputStream.readU1());
            }
            case 0x39 -> {
                if (isWide) {
                    return new ThreeByteCmd.ThreeByteCmdWithCpIndex(ordinal, "dstore_w", codeInputStream);
                }
                return new TwoByteCmd.TwoByteCmdWithCpIndex(ordinal, "dstore", codeInputStream.readU1());
            }
            case 0x3a -> {
                if (isWide) {
                    return new ThreeByteCmd.ThreeByteCmdWithCpIndex(ordinal, "astore_w", codeInputStream);
                }
                return new TwoByteCmd.TwoByteCmdWithCpIndex(ordinal, "astore", codeInputStream.readU1());
            }
            case 0x3b, 0x3c, 0x3d, 0x3e -> {
                String[] names = {"istore_0", "istore_1", "istore_2", "istore_3"};
                String name = names[ordinal.toInt() - 0x3b];
                return new OneByteCmd(ordinal, name);
            }
            case 0x3f, 0x40, 0x41, 0x42 -> {
                String[] names = {"lstore_0", "lstore_1", "lstore_2", "lstore_3"};
                String name = names[ordinal.toInt() - 0x3f];
                return new OneByteCmd(ordinal, name);
            }
            case 0x43, 0x44, 0x45, 0x46 -> {
                String[] names = {"fstore_0", "fstore_1", "fstore_2", "fstore_3"};
                String name = names[ordinal.toInt() - 0x43];
                return new OneByteCmd(ordinal, name);
            }
            case 0x47, 0x48, 0x49, 0x4a -> {
                String[] names = {"dstore_0", "dstore_1", "dstore_2", "dstore_3"};
                String name = names[ordinal.toInt() - 0x47];
                return new OneByteCmd(ordinal, name);
            }
            case 0x4b, 0x4c, 0x4d, 0x4e -> {
                String[] names = {"astore_0", "astore_1", "astore_2", "astore_3"};
                String name = names[ordinal.toInt() - 0x4b];
                return new OneByteCmd(ordinal, name);
            }
            case 0x4f -> {
                return new OneByteCmd(ordinal, "iastore");
            }
            case 0x50 -> {
                return new OneByteCmd(ordinal, "lastore");
            }
            case 0x51 -> {
                return new OneByteCmd(ordinal, "fastore");
            }
            case 0x52 -> {
                return new OneByteCmd(ordinal, "dastore");
            }
            case 0x53 -> {
                return new OneByteCmd(ordinal, "aastore");
            }
            case 0x54 -> {
                return new OneByteCmd(ordinal, "bastore");
            }
            case 0x55 -> {
                return new OneByteCmd(ordinal, "castore");
            }
            case 0x56 -> {
                return new OneByteCmd(ordinal, "sastore");
            }
            default -> throw new RuntimeException(String.format("ordinal: %s is not found!", ordinal));
        }
    }
}
