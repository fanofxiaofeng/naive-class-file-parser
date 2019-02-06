package com.study.type.info;

import com.study.parser.ConstantPoolHolder;

public abstract class AbstractInfo extends ConstantPoolHolder {

    /**
     * 8 个基本类型
     */
    private static String[] basicTypes = {
            "byte", "char", "double", "float", "int", "long", "short", "boolean"
    };

    public abstract String desc();

    String toHumanReadable(String description) {
        if (description.contains("(")) {

        }
        StringBuilder result = new StringBuilder();
        int arrayCount = 0;
        while (description.charAt(arrayCount) == '[') {
            arrayCount++;
        }

        for (int i = arrayCount; i < description.length(); i++) {
            char current = description.charAt(i);
            if ("BCDFIJSZ".indexOf(current) >= 0) {
                result.append(basicTypes["BCDFIJSZ".indexOf(current)]);
            } else if (current == 'L') {
                int indexOfSemicolon = description.indexOf(';', i);
                String raw = description.substring(i + 1, indexOfSemicolon);
                result.append(raw.replaceAll("/", "."));
                i = indexOfSemicolon;
            }
        }

        for (int i = 0; i < arrayCount; i++) {
            result.append("[]");
        }
        return result.toString();
    }
}
