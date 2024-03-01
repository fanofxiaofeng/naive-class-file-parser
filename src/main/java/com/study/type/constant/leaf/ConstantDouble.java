package com.study.type.constant.leaf;

import com.study.constants.ConstantKind;
import com.study.type.U4;

/**
 * Format example:
 * #44 = Double             2.2250738585072014E-308d
 * Consider "2.2250738585072014E-308d" as the description (i.e. return value for {@link #desc()}) for this item
 */
public final class ConstantDouble extends LeafCpInfo {

    private final U4 highBytes;
    private final U4 lowBytes;

    public ConstantDouble(U4 highBytes, U4 lowBytes) {
        super(ConstantKind.CONSTANT_Double);
        this.highBytes = highBytes;
        this.lowBytes = lowBytes;
    }

    @Override
    public String desc() {
        long high = highBytes.toLong();
        long low = lowBytes.toLong();
        double value = Double.longBitsToDouble((high << 32) + low);
        return desc(value);
    }

    private String desc(double value) {
        return String.valueOf(value) + 'd';
    }
}
