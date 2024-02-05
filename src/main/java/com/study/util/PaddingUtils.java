package com.study.util;

import org.apache.commons.lang3.StringUtils;

public class PaddingUtils {

    public static String padAndAppend(String left, int size, String right) {
        String padded = StringUtils.rightPad(left, size);
        return padded + right;
    }
}
