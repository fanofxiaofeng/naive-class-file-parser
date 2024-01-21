package com.study.util;

import java.util.Map;

public class BaseTypeUtils {
    public static final Map<Character, String> baseTypes = Map.ofEntries(
            Map.entry('B', "byte"),
            Map.entry('C', "char"),
            Map.entry('D', "double"),
            Map.entry('F', "float"),
            Map.entry('I', "int"),
            Map.entry('J', "long"),
            Map.entry('S', "short"),
            Map.entry('Z', "boolean")
    );

    public static boolean isBaseType(int codePoint) {
        if (!Character.isBmpCodePoint(codePoint)) {
            return false;
        }

        return baseTypes.containsKey((char) codePoint);
    }
}
