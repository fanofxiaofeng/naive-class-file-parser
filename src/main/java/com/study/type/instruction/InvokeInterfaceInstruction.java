package com.study.type.instruction;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.U2;

import java.util.Optional;

public class InvokeInterfaceInstruction extends AbstractInstruction {
    private final U1 indexByte1;
    private final U1 indexByte2;
    private final U1 count;

    public InvokeInterfaceInstruction(int startIndex, U1 ordinal, CodeInputStream codeInputStream) {
        super(startIndex, ordinal);
        name = "invokeinterface";
        indexByte1 = codeInputStream.readU1();
        indexByte2 = codeInputStream.readU1();
        count = codeInputStream.readU1();
        U1 _zero = codeInputStream.readU1();
        if (_zero.toInt() != 0) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public Optional<String> operandDesc() {
        return Optional.of(String.format("#%s,  %s", new U2(indexByte1, indexByte2).toInt(), count.toInt()));
    }

    @Override
    public int size() {
        return 5;
    }

    public U2 combine() {
       return new U2(indexByte1, indexByte2);
    }
}
