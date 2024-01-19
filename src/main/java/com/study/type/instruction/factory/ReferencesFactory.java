package com.study.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.instruction.AbstractCmd;
import com.study.type.instruction.OneByteCmd;
import com.study.type.instruction.ThreeByteCmd;
import com.study.type.instruction.TwoByteCmd;


public class ReferencesFactory implements CmdFactory {
    private ReferencesFactory() {

    }

    private static ReferencesFactory instance = new ReferencesFactory();

    public static ReferencesFactory getInstance() {
        return instance;
    }

    @Override
    public AbstractCmd build(U1 ordinal, CodeInputStream codeInputStream) {
        switch (ordinal.toInt()) {
            case 0xb2: {
                U1 b1 = codeInputStream.readU1();
                U1 b2 = codeInputStream.readU1();
                return new ThreeByteCmd(ordinal, "getstatic", b1, b2) {
                    @Override
                    public String desc(int index) {
                        return String.format("%10s: %-14s#%s", index, name, combine().toInt());
                    }

                    @Override
                    public boolean hasDetail() {
                        return true;
                    }

                    @Override
                    public String detail() {
                        return String.format("Field %s", constantPool.get(combine()).detail());
                    }
                };
            }
            case 0xb3: {
                U1 b1 = codeInputStream.readU1();
                U1 b2 = codeInputStream.readU1();
                return new ThreeByteCmd(ordinal, "putstatic", b1, b2) {
                    @Override
                    public String desc(int index) {
                        return String.format("%10s: %-14s#%s", index, name, combine().toInt());
                    }

                    @Override
                    public boolean hasDetail() {
                        return true;
                    }

                    @Override
                    public String detail() {
                        return String.format("Field %s", constantPool.get(combine()).detail());
                    }
                };
            }
            case 0xb4: {
                U1 b1 = codeInputStream.readU1();
                U1 b2 = codeInputStream.readU1();
                return new ThreeByteCmd(ordinal, "getfield", b1, b2) {
                    @Override
                    public String desc(int index) {
                        return String.format("%10s: %-14s#%s",
                                index,
                                name,
                                combine().toInt());
                    }
                };
            }
            case 0xb5: {
                U1 b1 = codeInputStream.readU1();
                U1 b2 = codeInputStream.readU1();
                return new ThreeByteCmd(ordinal, "putfield", b1, b2) {
                    @Override
                    public String desc(int index) {
                        return String.format("%10s: %-14s#%s", index, name, combine().toInt());
                    }

                };
            }
            case 0xb6: {
                return new ThreeByteCmd(ordinal, "invokevirtual", codeInputStream) {
                    @Override
                    public String desc(int index) {
                        return String.format("%10s: %-14s#%s", index, name, combine().toInt());
                    }

                    @Override
                    public boolean hasDetail() {
                        return true;
                    }

                    @Override
                    public String detail() {
                        System.out.println(combine().toInt());
                        return String.format("Method %s", constantPool.get(combine()).detail());
                    }
                };
            }
            case 0xb7: {
                return new ThreeByteCmd(ordinal, "invokespecial", codeInputStream) {
                    @Override
                    public String desc(int index) {
                        return String.format("%10s: %-14s#%s", index, name, combine().toInt());
                    }

                    @Override
                    public boolean hasDetail() {
                        return true;
                    }

                    @Override
                    public String detail() {
                        return String.format("Method %s", constantPool.get(combine()).detail());
                    }
                };
            }
            case 0xb8: {
                return new ThreeByteCmd(ordinal, "invokestatic", codeInputStream);
            }
            case 0xb9: {
                return new AbstractCmd(ordinal) {
                    {
                        name = "invokeinterface";
                        U1 indexByte1 = codeInputStream.readU1();
                        U1 indexByte2 = codeInputStream.readU1();
                        U1 count = codeInputStream.readU1();
                        U1 _zero = codeInputStream.readU1();
                        if (_zero.toInt() != 0) {
                            throw new AssertionError();
                        }
                    }

                    @Override
                    public int size() {
                        return 5;
                    }
                };
            }
            case 0xba: {
                return new AbstractCmd(ordinal) {
                    {
                        name = "invokedynamic";
                        U1 indexByte1 = codeInputStream.readU1();
                        U1 indexByte2 = codeInputStream.readU1();
                        U1 _zero1 = codeInputStream.readU1();
                        U1 _zero2 = codeInputStream.readU1();
                        if (_zero1.toInt() != 0 || _zero2.toInt() != 0) {
                            throw new AssertionError();
                        }
                    }

                    @Override
                    public int size() {
                        return 5;
                    }
                };
            }
            // 0xbb
            case 0xbb: {
                return new ThreeByteCmd(ordinal, "new", codeInputStream) {
                    @Override
                    public String desc(int index) {
                        return String.format("%10s: %-14s#%s", index, name, combine().toInt());
                    }

                    @Override
                    public boolean hasDetail() {
                        return true;
                    }

                    @Override
                    public String detail() {
                        return String.format("class %s", constantPool.get(combine()).detail());
                    }
                };
            }
            case 0xbc: {
                // todo 逻辑有待确认
                U1 _byte = codeInputStream.readU1();
                return new TwoByteCmd(ordinal, "newarray", _byte);
            }
            case 0xbd: {
                return new ThreeByteCmd(ordinal, "anewarray", codeInputStream) {
                    @Override
                    public String desc(int index) {
                        return String.format("%10s: %-14s#%s", index, name, combine().toInt());
                    }

                    @Override
                    public boolean hasDetail() {
                        return true;
                    }

                    @Override
                    public String detail() {
                        return String.format("class %s", constantPool.get(combine()).detail());
                    }
                };
            }
            case 0xbe: {
                return new OneByteCmd(ordinal, "arraylength");
            }
            case 0xbf: {
                return new OneByteCmd(ordinal, "athrow");
            }
            case 0xc0: {
                return new ThreeByteCmd(ordinal, "checkcast", codeInputStream);
            }
            case 0xc1: {
                return new ThreeByteCmd(ordinal, "instanceof", codeInputStream);
            }
            case 0xc2: {
                return new OneByteCmd(ordinal, "monitorenter");
            }
            case 0xc3: {
                return new OneByteCmd(ordinal, "monitorexit");
            }
            default:
                throw new RuntimeException(String.format("ordinal: %s is not found!", ordinal));
        }
    }
}
