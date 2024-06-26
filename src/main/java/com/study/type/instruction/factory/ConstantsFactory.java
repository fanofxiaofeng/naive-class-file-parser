package com.study.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.ConstantPool;
import com.study.type.U1;
import com.study.type.U2;
import com.study.type.constant.CpInfo;
import com.study.type.constant.compound.ConstantClass;
import com.study.type.constant.compound.ConstantString;
import com.study.type.constant.leaf.ConstantDouble;
import com.study.type.constant.leaf.ConstantFloat;
import com.study.type.constant.leaf.ConstantInteger;
import com.study.type.constant.leaf.ConstantLong;
import com.study.type.instruction.AbstractInstruction;
import com.study.type.instruction.OneByteInstruction;
import com.study.type.instruction.ThreeByteInstruction;
import com.study.type.instruction.TwoByteInstruction;

import java.util.Optional;

public class ConstantsFactory implements InstructionFactory {
    private static final ConstantsFactory instance = new ConstantsFactory();

    public static ConstantsFactory getInstance() {
        return instance;
    }

    private ConstantsFactory() {

    }

    public AbstractInstruction build(int startIndex, boolean isWide, U1 ordinal, CodeInputStream codeInputStream) {
        switch (ordinal.toInt()) {
            case 0x00 -> {
                // todo: need test
                return new OneByteInstruction(startIndex, ordinal, "nop");
            }
            case 0x01 -> {
                return new OneByteInstruction(startIndex, ordinal, "aconst_null");
            }
            case 0x02 -> {
                return new OneByteInstruction(startIndex, ordinal, "iconst_m1");
            }
            case 0x03, 0x04, 0x05, 0x06, 0x07, 0x08 -> {
                String[] names = {"iconst_0", "iconst_1", "iconst_2", "iconst_3", "iconst_4", "iconst_5"};
                String name = names[ordinal.toInt() - 0x03];
                return new OneByteInstruction(startIndex, ordinal, name);
            }
            case 0x09, 0x0a -> {
                String[] names = {"lconst_0", "lconst_1"};
                String name = names[ordinal.toInt() - 0x09];
                return new OneByteInstruction(startIndex, ordinal, name);
            }
            case 0x0b, 0x0c, 0x0d -> {
                String[] names = {"fconst_0", "fconst_1", "fconst_2"};
                String name = names[ordinal.toInt() - 0x0b];
                return new OneByteInstruction(startIndex, ordinal, name);
            }
            case 0x0e, 0x0f -> {
                String[] names = {"dconst_0", "dconst_1"};
                String name = names[ordinal.toInt() - 0x0e];
                return new OneByteInstruction(startIndex, ordinal, name);
            }
            case 0x10 -> {
                U1 _byte = codeInputStream.readU1();
                return new TwoByteInstruction.TwoByteCmdWithCpIndex(startIndex, ordinal, "bipush", _byte, true);
            }
            case 0x11 -> {
                return new ThreeByteInstruction(startIndex, ordinal, "sipush", codeInputStream) {
                    @Override
                    public Optional<String> operandDesc() {
                        return Optional.of("" + new U2(b1, b2).toSignedInt());
                    }
                };
            }
            case 0x12 -> {
                U1 _byte = codeInputStream.readU1();
                return new TwoByteInstruction(startIndex, ordinal, "ldc", _byte) {

                    @Override
                    public Optional<String> operandDesc() {
                        return Optional.of("#" + _byte.toInt());
                    }

                    @Override
                    public Optional<String> detail(ConstantPool constantPool) {
                        CpInfo constant = constantPool.get(_byte.toInt());
                        if (constant instanceof ConstantInteger) {
                            return Optional.of(String.format("int %s", constant.desc()));
                        }
                        if (constant instanceof ConstantFloat) {
                            return Optional.of(String.format("float %s", constant.desc()));
                        }
                        if (constant instanceof ConstantClass specified) {
                            return Optional.of(String.format("class %s", specified.detail(constantPool)));
                        }
                        if (constant instanceof ConstantString specified) {
                            return Optional.of(String.format("String %s", specified.detail(constantPool)).stripTrailing());
                        }
                        throw new RuntimeException(String.format("%d in constant pool is not supported yet!", _byte.toInt()));
                    }
                };
            }
            case 0x13 -> {
                return new ThreeByteInstruction(startIndex, ordinal, "ldc_w", codeInputStream) {

                    @Override
                    public Optional<String> operandDesc() {
                        return Optional.of("#" + combine().toInt());
                    }

                    @Override
                    public Optional<String> detail(ConstantPool constantPool) {
                        CpInfo constant = constantPool.get(combine());
                        if (constant instanceof ConstantInteger) {
                            return Optional.of(String.format("int %s", constant.desc()));
                        }
                        if (constant instanceof ConstantFloat) {
                            return Optional.of(String.format("float %s", constant.desc()));
                        }
                        if (constant instanceof ConstantClass specified) {
                            return Optional.of(String.format("class %s", specified.detail(constantPool)));
                        }
                        if (constant instanceof ConstantString specified) {
                            return Optional.of(String.format("String %s", specified.detail(constantPool)).stripTrailing());
                        }
                        throw new RuntimeException(String.format("%d in constant pool is not supported yet!", combine().toInt()));
                    }

                    @Override
                    public int size() {
                        return 3;
                    }
                };
            }
            case 0x14 -> {
                return new ThreeByteInstruction(startIndex, ordinal, "ldc2_w", codeInputStream) {

                    @Override
                    public Optional<String> operandDesc() {
                        return Optional.of("#" + combine().toInt());
                    }

                    @Override
                    public Optional<String> detail(ConstantPool constantPool) {
                        int constantIndex = combine().toInt();

                        CpInfo constant = constantPool.get(constantIndex);
                        if (constant instanceof ConstantLong) {
                            return Optional.of(String.format("long %s", constant.desc()));
                        }
                        if (constant instanceof ConstantDouble) {
                            return Optional.of(String.format("double %s", constant.desc()));
                        }
                        throw new RuntimeException("unsupported yet!" + constant.getClass());
                    }
                };
            }
            default -> throw new RuntimeException(String.format("ordinal: %s is not found!", ordinal));
        }
    }
}
