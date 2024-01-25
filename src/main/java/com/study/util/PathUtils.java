package com.study.util;

import org.apache.commons.lang3.StringUtils;

public class PathUtils {

    private static final String POSTFIX = ".class";

    public static String convert(String raw) {
        if (raw.endsWith(POSTFIX)) {
            return convert(StringUtils.removeEnd(raw, POSTFIX));
        }

        return raw.replace('.', '/') + POSTFIX;
    }
}
