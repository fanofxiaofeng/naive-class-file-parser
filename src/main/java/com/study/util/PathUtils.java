package com.study.util;

import org.apache.commons.lang3.Strings;

public class PathUtils {

    private static final String POSTFIX = ".class";

    public static String convert(String raw) {
        if (raw.endsWith(POSTFIX)) {
            return convert(Strings.CS.removeEnd(raw, POSTFIX));
        }

        return raw.replace('.', '/') + POSTFIX;
    }
}
