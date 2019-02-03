package com.study.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.constant.AbstractConstant;
import com.study.type.instruction.*;

public class ConstantsFactory implements CmdFactory {
    private static ConstantsFactory instance = new ConstantsFactory();

    public static ConstantsFactory getInstance() {
        return instance;
    }

    private ConstantsFactory() {

    }

    public AbstractCmd build(U1 ordinal, CodeInputStream codeInputStream) {
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
            case 0x09:
            case 0x0a: {
                String[] names = {"lconst_0", "lconst_1"};
                String name = names[ordinal.toInt() - 0x09];
                return new OneByteCmd(ordinal, name);
            }
            case 0x0b:
            case 0x0c:
            case 0x0d: {
                String[] names = {"fconst_0", "fconst_1", "fconst_2"};
                String name = names[ordinal.toInt() - 0x0b];
                return new OneByteCmd(ordinal, name);
            }
            case 0x0e:
            case 0x0f: {
                String[] names = {"dconst_0", "dconst_1"};
                String name = names[ordinal.toInt() - 0x0e];
                return new OneByteCmd(ordinal, name);
            }

            case 0x10: {
                U1 _byte = codeInputStream.readU1();
                return new TwoByteCmd(ordinal, "bipush", _byte) {
                    @Override
                    public String desc(int index, AbstractConstant[] constantPool) {
                        StringBuilder stringBuilder = new StringBuilder(this.name);
                        extentTo(stringBuilder);
                        // todo 逻辑有待确认
                        stringBuilder.append((byte) _byte.toInt());
                        return stringBuilder.toString();
                    }
                };
            }
            case 0x11:
                return new CmdSiPush(ordinal, codeInputStream);
            case 0x12:
                return new Cmd0x12(ordinal, codeInputStream);
            case 0x13:
                return new AbstractCmd(ordinal) {
                    @Override
                    public String desc(int index, AbstractConstant[] constantPool) {
                        return super.desc(index, constantPool);
                    }

                    @Override
                    public int size() {
                        return 3;
                    }
                };
            case 0x14:
                return new ThreeByteCmd(ordinal, "ldc2_w", codeInputStream);
            default:
                System.out.println(ordinal.toInt());
                throw new RuntimeException("not supported yet!");
        }
    }
}
