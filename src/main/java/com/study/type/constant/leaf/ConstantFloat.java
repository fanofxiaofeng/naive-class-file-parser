package com.study.type.constant.leaf;

import com.study.constants.ConstantKind;
import com.study.type.U4;

/**
 * Format example:
 * #17 = Float              1.1754944E-38f
 * Consider "1.1754944E-38f" as the description (i.e. return value for {@link #desc()}) for this item
 */
public final class ConstantFloat extends LeafCpInfo {
    private final U4 bytes;

    public ConstantFloat(U4 bytes) {
        super(ConstantKind.CONSTANT_Float);
        this.bytes = bytes;
    }

    @Override
    public String desc() {
        long raw = bytes.toLong();
        float value = Float.intBitsToFloat((int) raw);
        return desc(value);
    }

    private String desc(float value) {
        return String.valueOf(value) + 'f';
    }
}
