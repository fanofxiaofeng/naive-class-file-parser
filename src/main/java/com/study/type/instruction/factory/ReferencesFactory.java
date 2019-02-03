package com.study.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.constant.AbstractConstant;
import com.study.type.instruction.AbstractCmd;
import com.study.type.instruction.FakeCmd;
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
                    public String desc(int index, AbstractConstant[] constantPool) {
                        StringBuilder stringBuilder = new StringBuilder(super.desc(index, constantPool));
                        extentTo(stringBuilder);
                        stringBuilder.append('#');
                        stringBuilder.append(combine().toInt());
                        return stringBuilder.toString();
                    }

                    @Override
                    public boolean hasDetail() {
                        return true;
                    }

                    @Override
                    public String detail(AbstractConstant[] constantPool) {
                        return String.format("Field %s", constantPool[combine().toInt()].detail());
                    }
                };
            }
            case 0xb3: {
                U1 b1 = codeInputStream.readU1();
                U1 b2 = codeInputStream.readU1();
                return new ThreeByteCmd(ordinal, "putstatic", b1, b2) {

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

                };
            }
            case 0xb6: {
                return new ThreeByteCmd(ordinal, "invokevirtual", codeInputStream) {
                    @Override
                    public String desc(int index, AbstractConstant[] constantPool) {
                        StringBuilder stringBuilder = new StringBuilder(super.desc(index, constantPool));
                        extentTo(stringBuilder);
                        stringBuilder.append(String.format("#%s", combine().toInt()));
                        return stringBuilder.toString();
                    }

                    @Override
                    public boolean hasDetail() {
                        return true;
                    }

                    @Override
                    public String detail(AbstractConstant[] constantPool) {
                        System.out.println("====" + combine().toInt());
                        return String.format("Method %s", constantPool[combine().toInt()].detail());
                    }
                };
            }
            case 0xb7: {
                return new ThreeByteCmd(ordinal, "invokespecial", codeInputStream) {
                    @Override
                    public String desc(int index, AbstractConstant[] constantPool) {
                        return super.desc(index, constantPool) + String.format(" #%s", combine().toInt());
                    }

                    @Override
                    public boolean hasDetail() {
                        return true;
                    }

                    @Override
                    public String detail(AbstractConstant[] constantPool) {
                        return String.format("Method %s", constantPool[combine().toInt()].detail());
                    }
                };
            }
            // 0xbb
            case new_: {
                return new ThreeByteCmd(ordinal, "new", codeInputStream) {

                };
            }
        }
        return new FakeCmd(ordinal, "xx reference");
    }
}
