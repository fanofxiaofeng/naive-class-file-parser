package com.study.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.ConstantPool;
import com.study.type.U1;
import com.study.type.U2;
import com.study.type.instruction.AbstractInstruction;
import com.study.type.instruction.ThreeByteInstruction;

import java.util.Optional;

public class ExtendedFactory implements InstructionFactory {
    private ExtendedFactory() {

    }

    private static final ExtendedFactory instance = new ExtendedFactory();

    public static ExtendedFactory getInstance() {
        return instance;
    }

    @Override
    public AbstractInstruction build(int startIndex, boolean isWide, U1 ordinal, CodeInputStream codeInputStream) {
        switch (ordinal.toInt()) {
            case 0xc4 -> {
                System.out.println("wide instruction found");
                throw new IllegalArgumentException("wide instruction should always be used together with some other instruction!");
            }
            case 0xc5 -> {
                return new AbstractInstruction(startIndex, ordinal) {
                    private final U1 indexByte1;
                    private final U1 indexByte2;
                    private final U1 dimensions;

                    {
                        name = "multianewarray";
                        indexByte1 = codeInputStream.readU1();
                        indexByte2 = codeInputStream.readU1();
                        dimensions = codeInputStream.readU1();
                    }

                    @Override
                    public Optional<String> operandDesc() {
                        String desc = String.format("#%s,  %s", new U2(indexByte1, indexByte2).toInt(), dimensions.toInt());
                        return Optional.of(desc);
                    }

                    @Override
                    public Optional<String> detail(ConstantPool constantPool) {
                        return Optional.of(String.format("class %s", constantPool.detail(new U2(indexByte1, indexByte2))));
                    }

                    @Override
                    public int size() {
                        return 4;
                    }
                };
            }
            case 0xc6, 0xc7 -> {
                String[] nameCandidates = new String[]{"ifnull", "ifnonnull"};
                return new ThreeByteInstruction.Condition(startIndex, ordinal, nameCandidates[ordinal.toInt() - 0xc6], codeInputStream);
            }
            case 0xc8 -> {
                return new AbstractInstruction(startIndex, ordinal) {
                    {
                        name = "goto_w";
                        U1 branchByte1 = codeInputStream.readU1();
                        U1 branchByte2 = codeInputStream.readU1();
                        U1 branchByte3 = codeInputStream.readU1();
                        U1 branchByte4 = codeInputStream.readU1();
                    }

                    @Override
                    public int size() {
                        return 5;
                    }
                };
            }
            case 0xc9 -> {
                return new AbstractInstruction(startIndex, ordinal) {
                    {
                        name = "jsr_w";
                        U1 branchByte1 = codeInputStream.readU1();
                        U1 branchByte2 = codeInputStream.readU1();
                        U1 branchByte3 = codeInputStream.readU1();
                        U1 branchByte4 = codeInputStream.readU1();
                    }

                    @Override
                    public int size() {
                        return 5;
                    }
                };
            }
            default -> throw new RuntimeException(String.format("ordinal: %s is not found!", ordinal));
        }
    }
}
