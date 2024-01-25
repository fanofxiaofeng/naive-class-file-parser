package com.study.signature;

import com.study.util.BaseTypeUtils;

import java.util.List;

public class BaseType implements Signature {

    private final char type;

    public BaseType(int codePoint) {
        if (!BaseTypeUtils.isBaseType(codePoint)) {
            throw new IllegalArgumentException();
        }

        this.type = (char) codePoint;
    }

    public BaseType(char type) {
        if (!BaseTypeUtils.baseTypes.containsKey(type)) {
            throw new IllegalArgumentException();
        }

        this.type = type;
    }

    @Override
    public List<String> desc() {
        String desc = BaseTypeUtils.baseTypes.get(type);
        return List.of(desc);
    }
}
