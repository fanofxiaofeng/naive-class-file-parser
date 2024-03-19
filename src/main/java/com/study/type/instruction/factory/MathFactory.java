package com.study.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.U2;
import com.study.type.instruction.AbstractInstruction;
import com.study.type.instruction.OneByteInstruction;
import com.study.type.instruction.ThreeByteInstruction;

import java.util.Optional;

public class MathFactory implements InstructionFactory {
    private static final MathFactory instance = new MathFactory();

    private MathFactory() {

    }

    public static MathFactory getInstance() {
        return instance;
    }

    @Override
    public AbstractInstruction build(int startIndex, boolean isWide, U1 ordinal, CodeInputStream codeInputStream) {
        switch (ordinal.toInt()) {
            case 0x60 -> {
                return new OneByteInstruction(startIndex, ordinal, "iadd");
            }
            case 0x61 -> {
                return new OneByteInstruction(startIndex, ordinal, "ladd");
            }
            case 0x62 -> {
                return new OneByteInstruction(startIndex, ordinal, "fadd");
            }
            case 0x63 -> {
                return new OneByteInstruction(startIndex, ordinal, "dadd");
            }
            case 0x64 -> {
                return new OneByteInstruction(startIndex, ordinal, "isub");
            }
            case 0x65 -> {
                return new OneByteInstruction(startIndex, ordinal, "lsub");
            }
            case 0x66 -> {
                return new OneByteInstruction(startIndex, ordinal, "fsub");
            }
            case 0x67 -> {
                return new OneByteInstruction(startIndex, ordinal, "dsub");
            }
            case 0x68 -> {
                return new OneByteInstruction(startIndex, ordinal, "imul");
            }
            case 0x69 -> {
                return new OneByteInstruction(startIndex, ordinal, "lmul");
            }
            case 0x6a -> {
                return new OneByteInstruction(startIndex, ordinal, "fmul");
            }
            case 0x6b -> {
                return new OneByteInstruction(startIndex, ordinal, "dmul");
            }
            case 0x6c -> {
                return new OneByteInstruction(startIndex,ordinal, "idiv");
            }
            case 0x6d -> {
                return new OneByteInstruction(startIndex, ordinal, "ldiv");
            }
            case 0x6e -> {
                return new OneByteInstruction(startIndex, ordinal, "fdiv");
            }
            case 0x6f -> {
                return new OneByteInstruction(startIndex, ordinal, "ddiv");
            }
            case 0x70 -> {
                return new OneByteInstruction(startIndex, ordinal, "irem");
            }
            case 0x71 -> {
                return new OneByteInstruction(startIndex, ordinal, "lrem");
            }
            case 0x72 -> {
                return new OneByteInstruction(startIndex, ordinal, "frem");
            }
            case 0x73 -> {
                return new OneByteInstruction(startIndex, ordinal, "drem");
            }
            case 0x74 -> {
                return new OneByteInstruction(startIndex, ordinal, "ineg");
            }
            case 0x75 -> {
                return new OneByteInstruction(startIndex, ordinal, "lneg");
            }
            case 0x76 -> {
                return new OneByteInstruction(startIndex, ordinal, "fneg");
            }
            case 0x77 -> {
                return new OneByteInstruction(startIndex, ordinal, "dneg");
            }
            case 0x78 -> {
                return new OneByteInstruction(startIndex, ordinal, "ishl");
            }
            case 0x79 -> {
                return new OneByteInstruction(startIndex, ordinal, "lshl");
            }
            case 0x7a -> {
                return new OneByteInstruction(startIndex, ordinal, "ishr");
            }
            case 0x7b -> {
                return new OneByteInstruction(startIndex, ordinal, "lshr");
            }
            case 0x7c -> {
                return new OneByteInstruction(startIndex, ordinal, "iushr");
            }
            case 0x7d -> {
                return new OneByteInstruction(startIndex, ordinal, "lushr");
            }
            case 0x7e -> {
                return new OneByteInstruction(startIndex, ordinal, "iand");
            }
            case 0x7f -> {
                return new OneByteInstruction(startIndex, ordinal, "land");
            }
            case 0x80 -> {
                return new OneByteInstruction(startIndex, ordinal, "ior");
            }
            case 0x81 -> {
                return new OneByteInstruction(startIndex, ordinal, "lor");
            }
            case 0x82 -> {
                return new OneByteInstruction(startIndex, ordinal, "ixor");
            }
            case 0x83 -> {
                return new OneByteInstruction(startIndex, ordinal, "lxor");
            }
            case 0x84 -> {
                if (isWide) {
                    return new AbstractInstruction(startIndex, ordinal) {
                        final U1 indexByte1;
                        final U1 indexByte2;
                        final U1 constByte1;
                        final U1 constByte2;

                        {
                            // todo 有待确认
                            name = "iinc_w";
                            indexByte1 = codeInputStream.readU1();
                            indexByte2 = codeInputStream.readU1();
                            constByte1 = codeInputStream.readU1();
                            constByte2 = codeInputStream.readU1();
                        }

                        @Override
                        public Optional<String> operandDesc() {
                            return Optional.of(String.format("%s, %s",
                                    new U2(indexByte1, indexByte2).toInt(),
                                    new U2(constByte1, constByte2).toSignedInt()
                            ));
                        }

                        // todo desc 的逻辑尚未实现

                        @Override
                        public int size() {
                            return 5;
                        }
                    };
                } else {
                    return new ThreeByteInstruction(startIndex, ordinal, "iinc", codeInputStream) {
                        @Override
                        public Optional<String> operandDesc() {
                            return Optional.of(String.format("%s, %s", b1.toInt(), b2.toSignedInt()));
                        }
                    };
                }
            }
            default -> throw new RuntimeException(String.format("ordinal: %s is not found!", ordinal));
        }
    }
}
