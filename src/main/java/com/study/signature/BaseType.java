package com.study.signature;

import com.study.util.BaseTypeUtils;

public class BaseType extends AbstractSignature {

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
    public String desc() {
        return BaseTypeUtils.baseTypes.get(type);
    }
}
