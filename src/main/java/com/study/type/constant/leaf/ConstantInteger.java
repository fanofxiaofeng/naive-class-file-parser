package com.study.type.constant.leaf;

import com.study.constants.ConstantKind;
import com.study.type.U4;

/**
 * Format example:
 * #122 = Integer            -2147483647
 * <p>
 * Consider "-2147483647" as the description (i.e. return value for {@link #desc()}) for this item
 */
public final class ConstantInteger extends LeafCpInfo {

    private final U4 bytes;

    public ConstantInteger(U4 bytes) {
        super(ConstantKind.CONSTANT_Integer);
        this.bytes = bytes;
    }

    @Override
    public String desc() {
        return desc(bytes.toSignedInt());
    }

    private String desc(int value) {
        return "" + value;
    }
}
