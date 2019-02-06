package com.study.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.instruction.AbstractCmd;
import com.study.type.instruction.FakeCmd;
import com.study.type.instruction.OneByteCmd;
import com.study.type.instruction.ThreeByteCmd;

import static com.sun.tools.javac.jvm.ByteCodes.new_;

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
                        return String.format("Field %s", constantPool[combine().toInt()].detail());
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
                        return String.format("Field %s", constantPool[combine().toInt()].detail());
                    }
                };
            }
            case 0xb4: {
                U1 b1 = codeInputStream.readU1();
                U1 b2 = codeInputStream.readU1();
                return new ThreeByteCmd(ordinal, "getfield", b1, b2) {

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
                        return String.format("Method %s", constantPool[combine().toInt()].detail());
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
                        return String.format("Method %s", constantPool[combine().toInt()].detail());
                    }
                };
            }
            // 0xbb
            case new_: {
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
                        return String.format("class %s", constantPool[combine().toInt()].detail());
                    }


                };
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
                        return String.format("class %s", constantPool[combine().toInt()].detail());
                    }
                };
            }
            case 0xbe: {
                return new OneByteCmd(ordinal, "arraylength");
            }
        }
        return new FakeCmd(ordinal, "xx reference");
    }
}
