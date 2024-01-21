package com.study.util;

import org.apache.commons.lang3.StringUtils;

public class PaddingUtils {

    private static final String SPACE = " ";

    public static String prepend(String raw, int size) {
        StringBuilder builder = new StringBuilder();
        builder.append(SPACE.repeat(size));
        builder.append(raw);
        return builder.toString();
    }

    public static String padAndAppend(String left, int size, String right) {
        String padded = StringUtils.rightPad(left, size);
        return padded + right;
    }
}
