package com.study.util;

import com.study.type.constant.CpInfo;
import com.study.type.constant.leaf.LeafCpInfo;

public class CpInfoUtils {
    public static boolean isLeafCpInfo(CpInfo cpInfo) {
        return cpInfo instanceof LeafCpInfo;
    }
}
