package com.study.type.instruction;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.constant.AbstractConstant;

public abstract class AbstractCmd {
    private U1 ordinal;
    String name;

    AbstractCmd(U1 ordinal) {
        this.ordinal = ordinal;
    }

    public static AbstractCmd build(CodeInputStream codeInputStream) {
        U1 ordinal = codeInputStream.readU1();
        switch (ordinal.toInt()) {
            case 0x00:
                return new OneByteCmd(ordinal, "nop");
            case 0x01:
                return new OneByteCmd(ordinal, "aconst_null");
            case 0x02:
                return new OneByteCmd(ordinal, "iconst_m1");
            case 0x03:
            case 0x04:
            case 0x05:
            case 0x06:
            case 0x07:
            case 0x08: {
                String[] names = {"iconst_0", "iconst_1", "iconst_2", "iconst_3", "iconst_4", "iconst_5"};
                String name = names[ordinal.toInt() - 0x03];
                return new OneByteCmd(ordinal, name);
            }

            case 0x10:
                return new CmdBiPush(ordinal, codeInputStream);
            case 0x12:
                return new Cmd0x12(ordinal, codeInputStream);
            case 0x2a:
            case 0x2b:
            case 0x2c:
            case 0x2d: {
                String[] names = {"aload_0", "aload_1", "aload_2", "aload_3"};
                String name = names[ordinal.toInt() - 0x2a];
                return new OneByteCmd(ordinal, name);
            }
            case 0x3b:
            case 0x3c:
            case 0x3d:
            case 0x3e: {
                return new CmdIStore(ordinal);
            }
            case 0x4b:
            case 0x4c:
            case 0x4d:
            case 0x4e:
                return new CmdAStore(ordinal);
            case 0xb1:
                return new OneByteCmd(ordinal, "return");
            case 0xb6:
                return new CmdInvokeVirtual(ordinal, codeInputStream);
            case 0x99:
            case 0x9a:
            case 0x9b:
            case 0x9c:
            case 0x9d:
            case 0x9e:
                return new CmdIfCond(ordinal, codeInputStream);
            case 0xa7:
                return new CmdGoto(ordinal, codeInputStream);
            default:
                return new FakeCmd(ordinal);
        }
    }

    public String desc(int index, AbstractConstant[] constantPool) {
        return name;
    }

    void extentTo(StringBuilder stringBuilder) {
        while (stringBuilder.length() < 14) {
            stringBuilder.append(' ');
        }
    }

    public int size() {
        return 1;
    }
}
