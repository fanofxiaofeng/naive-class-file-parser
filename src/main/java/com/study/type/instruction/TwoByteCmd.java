package com.study.type.instruction;

import com.study.type.U1;

import java.util.Optional;

public class TwoByteCmd extends AbstractCmd {
    protected U1 _byte;

    public TwoByteCmd(U1 ordinal, String name, U1 _byte) {
        super(ordinal);
        this.name = name;
        this._byte = _byte;
    }

    @Override
    public int size() {
        return 2;
    }

    public static class TwoByteCmdWithCpIndex extends TwoByteCmd {

        private final boolean signed;

        public TwoByteCmdWithCpIndex(U1 ordinal, String name, U1 _byte) {
            this(ordinal, name, _byte, false);
        }

        public TwoByteCmdWithCpIndex(U1 ordinal, String name, U1 _byte, boolean signed) {
            super(ordinal, name, _byte);
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
