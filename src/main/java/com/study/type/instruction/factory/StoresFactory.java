package com.study.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.instruction.AbstractCmd;
import com.study.type.instruction.FakeCmd;
import com.study.type.instruction.OneByteCmd;
import com.study.type.instruction.TwoByteCmd;

public class StoresFactory implements CmdFactory {
    private static StoresFactory instance = new StoresFactory();

    private StoresFactory() {

    }

    public static StoresFactory getInstance() {
        return instance;
    }

    @Override
    public AbstractCmd build(U1 ordinal, CodeInputStream codeInputStream) {
        switch (ordinal.toInt()) {
            case 0x36:
                return new TwoByteCmd(ordinal, "istore", codeInputStream.readU1());
            case 0x37:
                return new TwoByteCmd(ordinal, "lstore", codeInputStream.readU1());
            case 0x3b:
            case 0x3c:
            case 0x3d:
            case 0x3e: {
                String[] names = {"istore_0", "istore_1", "istore_2", "istore_3"};
                String name = names[ordinal.toInt() - 0x3b];
                return new OneByteCmd(ordinal, name);
            }
            case 0x3f:
            case 0x40:
            case 0x41:
            case 0x42: {
                String[] names = {"lstore_0", "lstore_1", "lstore_2", "lstore_3"};
                String name = names[ordinal.toInt() - 0x3f];
                return new OneByteCmd(ordinal, name);
            }
            case 0x4b:
            case 0x4c:
            case 0x4d:
            case 0x4e: {
                String[] names = {"astore_0", "astore_1", "astore_2", "astore_3"};
                String name = names[ordinal.toInt() - 0x4b];
                return new OneByteCmd(ordinal, name);
            }
        }
        return new FakeCmd(ordinal, "xx stores");
    }
}
