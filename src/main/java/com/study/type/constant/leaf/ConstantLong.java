package com.study.type.constant.leaf;

import com.study.constants.ConstantKind;
import com.study.type.U4;

/**
 * Format example:
 * #172 = Long               -4294967296l
 * Consider "-4294967296l" as the description (i.e. return value for {@link #desc()}) for this item
 */
public final class ConstantLong extends LeafCpInfo {
    private final U4 highBytes;
    private final U4 lowBytes;

    public ConstantLong(U4 highBytes, U4 lowBytes) {
        super(ConstantKind.CONSTANT_Long);
        this.highBytes = highBytes;
        this.lowBytes = lowBytes;
    }

    @Override
    public String desc() {
        long high = highBytes.toLong();
        long low = lowBytes.toLong();
        // todo: check whether next line is correct
        long value = (high << 32) + low;
        return desc(value);
    }

    private String desc(long value) {
        return String.valueOf(value) + 'l';
    }
}
