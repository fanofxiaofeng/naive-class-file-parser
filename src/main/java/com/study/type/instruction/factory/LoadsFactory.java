package com.study.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.instruction.AbstractCmd;
import com.study.type.instruction.FakeCmd;
import com.study.type.instruction.OneByteCmd;
import com.study.type.instruction.TwoByteCmd;

public class LoadsFactory implements CmdFactory {
    private static LoadsFactory instance = new LoadsFactory();

    public static LoadsFactory getInstance() {
        return instance;
    }

    private LoadsFactory() {

    }

    @Override
    public AbstractCmd build(U1 ordinal, CodeInputStream codeInputStream) {
        switch (ordinal.toInt()) {
            case 0x15:
                return new TwoByteCmd(ordinal, "iload", codeInputStream.readU1());
            case 0x16:
                // todo 特殊
                return new TwoByteCmd(ordinal, "lload", codeInputStream.readU1());
            case 0x17:
                return new TwoByteCmd(ordinal, "fload", codeInputStream.readU1());
            case 0x18:
                return new TwoByteCmd(ordinal, "dload", codeInputStream.readU1());
            case 0x19:
                return new TwoByteCmd(ordinal, "aload", codeInputStream.readU1());

            case 0x1a:
            case 0x1b:
            case 0x1c:
            case 0x1d: {
                String[] names = {"iload_0", "iload_1", "iload_2", "iload_3"};
                String name = names[ordinal.toInt() - 0x1a];
                return new OneByteCmd(ordinal, name);
            }
            case 0x1e:
            case 0x1f:
            case 0x20:
            case 0x21: {
                String[] names = {"lload_0", "lload_1", "lload_2", "lload_3"};
                String name = names[ordinal.toInt() - 0x1e];
                return new OneByteCmd(ordinal, name);
            }

            case 0x2a:
            case 0x2b:
            case 0x2c:
            case 0x2d: {
                String[] names = {"aload_0", "aload_1", "aload_2", "aload_3"};
                String name = names[ordinal.toInt() - 0x2a];
                return new OneByteCmd(ordinal, name);
            }
            case 0x32:
                return new OneByteCmd(ordinal, "aaload");
        }
        return new FakeCmd(ordinal, "xx loads");
    }
}
