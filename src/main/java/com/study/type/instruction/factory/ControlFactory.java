package com.study.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.instruction.AbstractInstruction;
import com.study.type.instruction.OneByteInstruction;
import com.study.type.instruction.ThreeByteInstruction;
import com.study.type.instruction.TwoByteInstruction;

public class ControlFactory implements InstructionFactory {
    private ControlFactory() {

    }

    private static final ControlFactory instance = new ControlFactory();

    public static ControlFactory getInstance() {
        return instance;
    }

    @Override
    public AbstractInstruction build(int startIndex, boolean isWide, U1 ordinal, CodeInputStream codeInputStream) {
        switch (ordinal.toInt()) {
            case 0xa7 -> {
                return new ThreeByteInstruction.Condition(startIndex, ordinal, "goto", codeInputStream);
            }
            case 0xa8 -> {
                return new ThreeByteInstruction(startIndex, ordinal, "jsr", codeInputStream);
            }
            case 0xa9 -> {
                if (isWide) {
                    return new ThreeByteInstruction(startIndex, ordinal, "ret_w", codeInputStream);
                } else {
                    U1 _byte = codeInputStream.readU1();
                    return new TwoByteInstruction(startIndex, ordinal, "ret", _byte);
                }
            }
            case 0xaa -> {
                return new TableSwitchInstruction(startIndex, ordinal, codeInputStream);
            }
            case 0xab -> {
                return new LookupSwitchInstruction(startIndex, ordinal, codeInputStream);
            }
            case 0xac -> {
                return new OneByteInstruction(startIndex, ordinal, "ireturn");
            }
            case 0xad -> {
                return new OneByteInstruction(startIndex, ordinal, "lreturn");
            }
            case 0xae -> {
                return new OneByteInstruction(startIndex, ordinal, "freturn");
            }
            // 0xaf
            case 0xaf -> {
                return new OneByteInstruction(startIndex, ordinal, "dreturn");
            }

            // 0xb0
            case 0xb0 -> {
                return new OneByteInstruction(startIndex, ordinal, "areturn");
            }
            case 0xb1 -> {
                return new OneByteInstruction(startIndex, ordinal, "return");
            }
            default -> throw new RuntimeException(String.format("ordinal: %s is not found!", ordinal));
        }
    }
}
