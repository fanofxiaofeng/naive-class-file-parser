package com.study.type.instruction;

import com.study.io.CodeInputStream;
import com.study.type.ConstantPool;
import com.study.type.U1;
import com.study.type.instruction.factory.*;

import java.util.Optional;

public abstract class AbstractInstruction {
    private U1 ordinal;
    protected int startIndex;
    protected String name;

    public AbstractInstruction(int startIndex, U1 ordinal) {
        this.startIndex = startIndex;
        this.ordinal = ordinal;
    }

    public static AbstractInstruction build(CodeInputStream codeInputStream) {
        int startIndex = codeInputStream.getIndex();
        U1 ordinal = codeInputStream.readU1();
        boolean isWide = (ordinal.toInt() == 0xc4);
        U1 realOrdinal = isWide ? (codeInputStream.readU1()) : ordinal;
        InstructionFactory cmdFactory = factory(realOrdinal.toInt());
        return cmdFactory.build(startIndex, isWide, realOrdinal, codeInputStream);
    }

    private static InstructionFactory factory(int ordinal) {
        // todo: Please check whether the range is correct for each type
        if (ordinal >= 0x00 && ordinal <= 0x14) {
            // CommandType.constants;
            return ConstantsFactory.getInstance();
        } else if (ordinal >= 0x15 && ordinal <= 0x35) {
            return LoadsFactory.getInstance();
        } else if (ordinal >= 0x36 && ordinal <= 0x56) {
            return StoresFactory.getInstance();
        } else if (ordinal >= 0x57 && ordinal <= 0x5f) {
            return StackFactory.getInstance();
        } else if (ordinal >= 0x60 && ordinal <= 0x84) {
            return MathFactory.getInstance();
        } else if (ordinal >= 0x85 && ordinal <= 0x93) {
            return ConversionsFactory.getInstance();
        } else if (ordinal >= 0x94 && ordinal <= 0xa6) {
            return ComparisonsFactory.getInstance();
        } else if (ordinal >= 0xa7 && ordinal <= 0xb1) {
            return ControlFactory.getInstance();
        } else if (ordinal >= 0xb2 && ordinal <= 0xc3) {
            return ReferencesFactory.getInstance();
        } else if (ordinal >= 0xc4 && ordinal <= 0xc9) {
            return ExtendedFactory.getInstance();
        } else {
            throw new RuntimeException(String.format("%s is not supported yet! ", ordinal));
        }
    }

    public Optional<String> operandDesc() {
        return Optional.empty();
    }

    public Optional<String> detail(ConstantPool constantPool) {
        return Optional.empty();
    }

    public abstract int size();

    public String getName() {
        return this.name;
    }

    public int getStartIndex() {
        return startIndex;
    }

    enum CommandType {
        constants,
        loads,
        stores,
        stack,
        math,
        conversions,
        comparisons,
        control,
        references,
        extended,
        reserved
    }
}
