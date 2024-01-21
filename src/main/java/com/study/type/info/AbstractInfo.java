package com.study.type.info;

import com.study.parser.ConstantPoolHolder;
import com.study.util.BaseTypeUtils;

import java.util.Map;

public abstract class AbstractInfo extends ConstantPoolHolder {

    protected static final int INDENT_FOR_EACH_LEVEL = 2;


    public abstract String desc();


    // todo: this method is still buggy
    @Deprecated
    String toHumanReadable(String description) {
        // todo: what does the following if branch do?
        if (description.contains("(")) {
        }

        StringBuilder result = new StringBuilder();
        int arrayCount = 0;
        while (description.charAt(arrayCount) == '[') {
            arrayCount++;
        }

        for (int i = arrayCount; i < description.length(); i++) {
            char current = description.charAt(i);
            if (BaseTypeUtils.baseTypes.containsKey(current)) {
                result.append(BaseTypeUtils.baseTypes.get(current));
            } else if (current == 'L') {
                // todo: cannot handle generic types correctly for now
                int indexOfSemicolon = description.indexOf(';', i);
                String raw = description.substring(i + 1, indexOfSemicolon);
                result.append(raw.replaceAll("/", "."));
                i = indexOfSemicolon;
            }
        }

        result.append("[]".repeat(arrayCount));
        return result.toString();
    }
}
