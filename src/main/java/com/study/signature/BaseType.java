package com.study.signature;

import com.study.util.BaseTypeUtils;

public final class BaseType implements JavaTypeSignature {
    private final char type;

    public BaseType(int type) {
        if (!BaseTypeUtils.isBaseType(type)) {
            String message = String.format("%s is not a base type!", type);
            throw new IllegalArgumentException(message);
        }

        this.type = (char) type;
    }

    @Override
    public String desc() {
        return BaseTypeUtils.baseTypes.get(type);
    }
}
