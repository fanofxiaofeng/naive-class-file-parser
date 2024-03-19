package com.study.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.instruction.AbstractInstruction;
import com.study.type.instruction.OneByteInstruction;
import com.study.type.instruction.ThreeByteInstruction;

public class ComparisonsFactory implements InstructionFactory {
    private ComparisonsFactory() {

    }

    private static final ComparisonsFactory instance = new ComparisonsFactory();

    public static ComparisonsFactory getInstance() {
        return instance;
    }

    @Override
    public AbstractInstruction build(int startIndex, boolean isWide, U1 ordinal, CodeInputStream codeInputStream) {
        switch (ordinal.toInt()) {
            case 0x94 -> {
                return new OneByteInstruction(startIndex, ordinal, "lcmp");
            }
            case 0x95 -> {
                return new OneByteInstruction(startIndex, ordinal, "fcmpl");
            }
            case 0x96 -> {
                return new OneByteInstruction(startIndex, ordinal, "fcmpg");
            }
            case 0x97 -> {
                return new OneByteInstruction(startIndex, ordinal, "dcmpl");
            }
            case 0x98 -> {
                return new OneByteInstruction(startIndex, ordinal, "dcmpg");
            }
            case 0x99, 0x9a, 0x9b, 0x9c, 0x9d, 0x9e -> {
                String[] nameCandidates = new String[]{"ifeq", "ifne", "iflt", "ifge", "ifgt", "ifle"};
                return new ThreeByteInstruction.Condition(startIndex, ordinal, nameCandidates[ordinal.toInt() - 0x99], codeInputStream);
            }
            case 0x9f, 0xa0, 0xa1, 0xa2, 0xa3, 0xa4, 0xa5, 0xa6 -> {
                String[] nameCandidates = new String[]{
                        "if_icmpeq",
                        "if_icmpne",
                        "if_icmplt",
                        "if_icmpge",
                        "if_icmpgt",
                        "if_icmple",
                        "if_acmpeq",
                        "if_acmpne"
                };
                return new ThreeByteInstruction.Condition(startIndex, ordinal, nameCandidates[ordinal.toInt() - 0x9f], codeInputStream);
            }
            default -> throw new RuntimeException(String.format("ordinal: %s is not found!", ordinal));
        }
    }
}
