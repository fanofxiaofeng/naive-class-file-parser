package com.study.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.instruction.AbstractInstruction;

public interface InstructionFactory {
    AbstractInstruction build(int startIndex, boolean isWide, U1 ordinal, CodeInputStream codeInputStream);
}
