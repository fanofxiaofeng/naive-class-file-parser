package com.study.type.instruction;

import com.study.type.U1;

import java.util.Optional;

public class TwoByteInstruction extends AbstractInstruction {
    protected U1 _byte;

    public TwoByteInstruction(int startIndex, U1 ordinal, String name, U1 _byte) {
        super(startIndex, ordinal);
        this.name = name;
        this._byte = _byte;
    }

    @Override
    public int size() {
        return 2;
    }

    public static class TwoByteCmdWithCpIndex extends TwoByteInstruction {

        private final boolean signed;

        public TwoByteCmdWithCpIndex(int startIndex, U1 ordinal, String name, U1 _byte) {
            this(startIndex, ordinal, name, _byte, false);
        }

        public TwoByteCmdWithCpIndex(int startIndex, U1 ordinal, String name, U1 _byte, boolean signed) {
            super(startIndex, ordinal, name, _byte);
            this.signed = signed;
        }

        @Override
        public Optional<String> operandDesc() {
            if (signed) {
                return Optional.of("" + _byte.toSignedInt());
            }
            return Optional.of("" + _byte.toInt());
        }
    }
}
