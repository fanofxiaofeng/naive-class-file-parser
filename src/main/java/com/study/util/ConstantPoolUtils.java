package com.study.util;

import com.study.type.ConstantPool;
import com.study.type.constant.CpInfo;
import com.study.type.constant.leaf.ConstantDouble;
import com.study.type.constant.leaf.ConstantLong;

public class ConstantPoolUtils {
    public static boolean occupyOneSlot(CpInfo constant) {
        return !(constant instanceof ConstantDouble) &&
                !(constant instanceof ConstantLong);
    }

    public static int lastIndex(ConstantPool constantPool) {
        int count = constantPool.getCount().toInt();
        int lastIndex = count - 1;
        if (constantPool.get(count - 1) == null) {
            lastIndex--;
        }
        return lastIndex;
    }
}
