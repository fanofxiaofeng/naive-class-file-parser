package com.study.util;

import org.apache.commons.lang3.StringUtils;

public class PaddingUtils {

    private static final char SPACE = ' ';

    public static String prepend(String raw, int size) {
        StringBuilder builder = new StringBuilder();
        builder.append(StringUtils.repeat(SPACE, size));
        builder.append(raw);
        return builder.toString();
    }
}
