package com.study.type.instruction.factory;

import com.study.constants.ArrayTypeCode;
import com.study.io.CodeInputStream;
import com.study.type.ConstantPool;
import com.study.type.U1;
import com.study.type.U2;
import com.study.type.constant.compound.ConstantFieldref;
import com.study.type.constant.compound.ConstantMethodref;
import com.study.type.instruction.*;

import java.util.Optional;


public class ReferencesFactory implements InstructionFactory {
    private ReferencesFactory() {

    }

    private static final ReferencesFactory instance = new ReferencesFactory();

    public static ReferencesFactory getInstance() {
        return instance;
    }

    @Override
    public AbstractInstruction build(int startIndex, boolean isWide, U1 ordinal, CodeInputStream codeInputStream) {
        switch (ordinal.toInt()) {
            case 0xb2, 0xb3, 0xb4, 0xb5 -> {
                String[] nameCandidates = new String[]{"getstatic", "putstatic", "getfield", "putfield"};
                return new ThreeByteInstruction(startIndex, ordinal, nameCandidates[ordinal.toInt() - 0xb2], codeInputStream) {

                    @Override
                    public Optional<String> operandDesc() {
                        return Optional.of("#" + combine().toInt());
                    }
                };
            }
            case 0xb6, 0xb7, 0xb8 -> {
                String[] nameCandidates = new String[]{"invokevirtual", "invokespecial", "invokestatic"};
                return new ThreeByteInstruction(startIndex, ordinal, nameCandidates[ordinal.toInt() - 0xb6], codeInputStream) {

                    @Override
                    public Optional<String> operandDesc() {
                        return Optional.of("#" + combine().toInt());
                    }
                };
            }
            case 0xb9 -> {
                return new InvokeInterfaceInstruction(startIndex, ordinal, codeInputStream);
            }
            case 0xba -> {
                return new AbstractInstruction(startIndex, ordinal) {

                    final U1 indexByte1;
                    final U1 indexByte2;

                    {
                        name = "invokedynamic";
                        indexByte1 = codeInputStream.readU1();
                        indexByte2 = codeInputStream.readU1();
                        U1 _zero1 = codeInputStream.readU1();
                        U1 _zero2 = codeInputStream.readU1();
                        if (_zero1.toInt() != 0 || _zero2.toInt() != 0) {
                            throw new AssertionError();
                        }
                    }

                    @Override
                    public Optional<String> operandDesc() {
                        String desc = String.format("#%s,  0", new U2(indexByte1, indexByte2).toInt());
                        return Optional.of(desc);
                    }

                    @Override
                    public Optional<String> detail(ConstantPool constantPool) {
                        return Optional.of(String.format("InvokeDynamic %s", constantPool.detail(new U2(indexByte1, indexByte2))));
                    }

                    @Override
                    public int size() {
                        return 5;
                    }
                };
            }

            // 0xbb
            case 0xbb -> {
                return new ThreeByteInstruction(startIndex, ordinal, "new", codeInputStream) {

                    @Override
                    public Optional<String> operandDesc() {
                        return Optional.of("#" + combine().toInt());
                    }

                    @Override
                    public Optional<String> detail(ConstantPool constantPool) {
                        return Optional.of(String.format("class %s", constantPool.detail(combine())));
                    }
                };
            }
            case 0xbc -> {
                U1 _byte = codeInputStream.readU1();
                return new TwoByteInstruction(startIndex, ordinal, "newarray", _byte) {
                    @Override
                    public Optional<String> operandDesc() {
                        return Optional.of(" " + ArrayTypeCode.toArrayTypeCode(_byte.toInt()));
                    }
                };
            }
            case 0xbd -> {
                return new ThreeByteInstruction(startIndex, ordinal, "anewarray", codeInputStream) {

                    @Override
                    public Optional<String> operandDesc() {
                        return Optional.of("#" + combine().toInt());
                    }

                    @Override
                    public Optional<String> detail(ConstantPool constantPool) {
                        return Optional.of(String.format("class %s", constantPool.detail(combine())));
                    }
                };
            }
            case 0xbe -> {
                return new OneByteInstruction(startIndex, ordinal, "arraylength");
            }
            case 0xbf -> {
                return new OneByteInstruction(startIndex, ordinal, "athrow");
            }
            case 0xc0 -> {
                return new ThreeByteInstruction(startIndex, ordinal, "checkcast", codeInputStream) {
                    @Override
                    public Optional<String> operandDesc() {
                        String desc = "#" + combine().toInt();
                        return Optional.of(desc);
                    }

                    @Override
                    public Optional<String> detail(ConstantPool constantPool) {
                        String detail = String.format("class %s", constantPool.detail(combine()));
                        return Optional.of(detail);
                    }
                };
            }
            case 0xc1 -> {
                return new ThreeByteInstruction(startIndex, ordinal, "instanceof", codeInputStream) {
                    @Override
                    public Optional<String> operandDesc() {
                        String desc = "#" + combine().toInt();
                        return Optional.of(desc);
                    }

                    @Override
                    public Optional<String> detail(ConstantPool constantPool) {
                        String detail = String.format("class %s", constantPool.detail(combine()));
                        return Optional.of(detail);
                    }
                };
            }
            case 0xc2 -> {
                return new OneByteInstruction(startIndex, ordinal, "monitorenter");
            }
            case 0xc3 -> {
                return new OneByteInstruction(startIndex, ordinal, "monitorexit");
            }
            default -> throw new RuntimeException(String.format("ordinal: %s is not found!", ordinal));
        }
    }
}
