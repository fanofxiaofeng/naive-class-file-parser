package com.study.type.constant.leaf;

import com.study.constants.ConstantKind;
import com.study.type.constant.CpInfo;

public abstract class LeafCpInfo extends CpInfo {

    protected String desc(int value) {
        return "" + value;
    }

    protected String desc(float value) {
        return String.valueOf(value) + 'f';
    }

    protected String desc(long value) {
        return String.valueOf(value) + 'l';
    }

    protected String desc(double value) {
        return String.valueOf(value) + 'd';
    }

    protected LeafCpInfo(ConstantKind tag) {
        super(tag);
    }

    public static boolean isLeafCpInfo(CpInfo cpInfo) {
        return cpInfo instanceof LeafCpInfo;
    }
}
