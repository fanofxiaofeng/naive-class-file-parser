package com.study.type.instruction;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.U2;

import java.util.Optional;

public class ThreeByteCmd extends AbstractCmd {
    protected U1 b1;
    protected U1 b2;

    public ThreeByteCmd(U1 ordinal, String name, U1 b1, U1 b2) {
        super(ordinal);
        this.name = name;
        this.b1 = b1;
        this.b2 = b2;
    }

    public ThreeByteCmd(U1 ordinal, String name, CodeInputStream codeInputStream) {
        super(ordinal);
        this.name = name;
        this.b1 = codeInputStream.readU1();
        this.b2 = codeInputStream.readU1();
    }

    protected U2 combine() {
        return new U2(b1, b2);
    }

    @Override
    public int size() {
        return 3;
    }

    public static class ThreeByteCmdWithCpIndex extends ThreeByteCmd {

        public ThreeByteCmdWithCpIndex(U1 ordinal, String name, CodeInputStream codeInputStream) {
            super(ordinal, name, codeInputStream);
        }

        @Override
        public Optional<String> operandDesc() {
            return Optional.of("" + combine().toInt());
        }
    }
}
