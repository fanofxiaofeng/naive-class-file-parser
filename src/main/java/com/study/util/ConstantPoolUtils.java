package com.study.util;

import com.study.type.constant.CpInfo;
import com.study.type.constant.leaf.ConstantDouble;
import com.study.type.constant.leaf.ConstantLong;

public class ConstantPoolUtils {
    public static boolean occupyOneSlot(CpInfo constant) {
        return !(constant instanceof ConstantDouble) &&
                !(constant instanceof ConstantLong);
    }
}
