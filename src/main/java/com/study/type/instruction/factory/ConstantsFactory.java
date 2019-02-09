package com.study.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.constant.*;
import com.study.type.instruction.AbstractCmd;
import com.study.type.instruction.OneByteCmd;
import com.study.type.instruction.ThreeByteCmd;
import com.study.type.instruction.TwoByteCmd;

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
                    // todo 逻辑有待确认
                };
            }
            case 0x11: {
                return new ThreeByteCmd(ordinal, "sipush", codeInputStream);
            }
            case 0x12: {
                U1 _byte = codeInputStream.readU1();
                return new TwoByteCmd(ordinal, "ldc", _byte) {
                    @Override
                    public String desc(int index) {
                        return String.format("%10s: %-14s#%s", index, name, _byte.toInt());
                    }

                    @Override
                    public boolean hasDetail() {
                        return true;
                    }

                    @Override
                    public String detail() {
                        AbstractConstant constant = constantPool[_byte.toInt()];
                        if (ConstantInteger.class.isInstance(constant)) {
                            return String.format("int %s", constant.desc());
                        }
                        if (ConstantClass.class.isInstance(constant)) {
                            return String.format("class %s", constant.detail());
                        }
                        if (ConstantString.class.isInstance(constant)) {
                            return String.format("String %s", constant.detail());
                        }
                        throw new RuntimeException(String.format("%d in constant pool is not supported yet!", _byte.toInt()));
                    }

                };
            }
            case 0x13:
                return new AbstractCmd(ordinal) {
                    {
                        name = "ldc_w";
                        U1 indexByte1 = codeInputStream.readU1();
                        U1 indexByte2 = codeInputStream.readU1();
                    }

                    @Override
                    public String desc(int index) {
                        return super.desc(index);
                    }

                    @Override
                    public int size() {
                        return 3;
                    }
                };
            case 0x14: {
                return new ThreeByteCmd(ordinal, "ldc2_w", codeInputStream) {
                    @Override
                    public String desc(int index) {
                        int constantIndex = combine().toInt();
                        String line = String.format("%10s: %-14s#%-19s", index, name, constantIndex);
                        System.out.println("b1: " + b1.toInt());
                        System.out.println("b2: " + b2.toInt());
                        AbstractConstant constant = constantPool[constantIndex];
                        if (ConstantLong.class.isInstance(constant)) {
                            return String.format("%s// long %s", line, constant.desc());
                        }
                        if (ConstantInteger.class.isInstance(constant)) {
                            return String.format("%s// int %s", line, constant.desc());
                        }
                        if (ConstantDouble.class.isInstance(constant)) {
                            return String.format("%s// double %s", line, constant.desc());
                        }
                        throw new RuntimeException("unsupported yet!" + constant.getClass());
                    }
                };
            }
            default:
                throw new RuntimeException(String.format("ordinal: %s is not found!", ordinal));
        }
    }
}
