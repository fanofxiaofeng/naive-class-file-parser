package com.study.parser;

import com.study.type.constant.AbstractConstant;

public abstract class ConstantPoolHolder {
    protected static AbstractConstant[] constantPool;

    public static void setConstantPool(AbstractConstant[] constantPool) {
        ConstantPoolHolder.constantPool = constantPool;
    }
}
