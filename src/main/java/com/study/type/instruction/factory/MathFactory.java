package com.study.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.U2;
import com.study.type.instruction.AbstractCmd;
import com.study.type.instruction.OneByteCmd;
import com.study.type.instruction.ThreeByteCmd;

import java.util.Optional;

public class MathFactory implements CmdFactory {
    private static final MathFactory instance = new MathFactory();

    private MathFactory() {

    }

    public static MathFactory getInstance() {
        return instance;
    }

    @Override
    public AbstractCmd build(boolean isWide, U1 ordinal, CodeInputStream codeInputStream) {
        switch (ordinal.toInt()) {
            case 0x60 -> {
                return new OneByteCmd(ordinal, "iadd");
            }
            case 0x61 -> {
                return new OneByteCmd(ordinal, "ladd");
            }
            case 0x62 -> {
                return new OneByteCmd(ordinal, "fadd");
            }
            case 0x63 -> {
                return new OneByteCmd(ordinal, "dadd");
            }
            case 0x64 -> {
                return new OneByteCmd(ordinal, "isub");
            }
            case 0x65 -> {
                return new OneByteCmd(ordinal, "lsub");
            }
            case 0x66 -> {
                return new OneByteCmd(ordinal, "fsub");
            }
            case 0x67 -> {
                return new OneByteCmd(ordinal, "dsub");
            }
            case 0x68 -> {
                return new OneByteCmd(ordinal, "imul");
            }
            case 0x69 -> {
                return new OneByteCmd(ordinal, "lmul");
            }
            case 0x6a -> {
                return new OneByteCmd(ordinal, "fmul");
            }
            case 0x6b -> {
                return new OneByteCmd(ordinal, "dmul");
            }
            case 0x6c -> {
                return new OneByteCmd(ordinal, "idiv");
            }
            case 0x6d -> {
                return new OneByteCmd(ordinal, "ldiv");
            }
            case 0x6e -> {
                return new OneByteCmd(ordinal, "fdiv");
            }
            case 0x6f -> {
                return new OneByteCmd(ordinal, "ddiv");
            }
            case 0x70 -> {
                return new OneByteCmd(ordinal, "irem");
            }
            case 0x71 -> {
                return new OneByteCmd(ordinal, "lrem");
            }
            case 0x72 -> {
                return new OneByteCmd(ordinal, "frem");
            }
            case 0x73 -> {
                return new OneByteCmd(ordinal, "drem");
            }
            case 0x74 -> {
                return new OneByteCmd(ordinal, "ineg");
            }
            case 0x75 -> {
                return new OneByteCmd(ordinal, "lneg");
            }
            case 0x76 -> {
                return new OneByteCmd(ordinal, "fneg");
            }
            case 0x77 -> {
                return new OneByteCmd(ordinal, "dneg");
            }
            case 0x78 -> {
                return new OneByteCmd(ordinal, "ishl");
            }
            case 0x79 -> {
                return new OneByteCmd(ordinal, "lshl");
            }
            case 0x7a -> {
                return new OneByteCmd(ordinal, "ishr");
            }
            case 0x7b -> {
                return new OneByteCmd(ordinal, "lshr");
            }
            case 0x7c -> {
                return new OneByteCmd(ordinal, "iushr");
            }
            case 0x7d -> {
                return new OneByteCmd(ordinal, "lushr");
            }
            case 0x7e -> {
                return new OneByteCmd(ordinal, "iand");
            }
            case 0x7f -> {
                return new OneByteCmd(ordinal, "land");
            }
            case 0x80 -> {
                return new OneByteCmd(ordinal, "ior");
            }
            case 0x81 -> {
                return new OneByteCmd(ordinal, "lor");
            }
            case 0x82 -> {
                return new OneByteCmd(ordinal, "ixor");
            }
            case 0x83 -> {
                return new OneByteCmd(ordinal, "lxor");
            }
            case 0x84 -> {
                if (isWide) {
                    return new AbstractCmd(ordinal) {
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
                    return new ThreeByteCmd(ordinal, "iinc", codeInputStream) {
                        @Override
                        public Optional<String> operandDesc() {
                            return Optional.of(String.format("%s, %s", b1.toInt(), b2.toInt()));
                        }
                    };
                }
            }
            default -> throw new RuntimeException(String.format("ordinal: %s is not found!", ordinal));
        }
    }
}
