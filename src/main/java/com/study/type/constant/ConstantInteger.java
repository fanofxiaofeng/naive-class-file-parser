package com.study.type.constant;

import com.study.constants.ConstantKind;
import com.study.type.U4;

/**
 * Format
 * <p>
 * #9 = Integer            1
 */
public class ConstantInteger extends AbstractConstant {

    private final U4 bytes;

    public ConstantInteger(U4 bytes) {
        super(ConstantKind.CONSTANT_Integer);
        this.bytes = bytes;
    }

    @Override
    public String desc() {
        long value = bytes.toLong();
        if (value > Integer.MAX_VALUE) {
            value -= 0x100000000L;
        }
        return desc((int) value);
    }

    @Override
    public String type() {
        return "Integer";
    }

    @Override
    public void validate() {
        if (this.tag != ConstantKind.CONSTANT_Integer) {
            throw new AssertionError();
        }
    }
}
