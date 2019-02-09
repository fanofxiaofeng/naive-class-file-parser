package com.study.parser;

import com.study.type.constant.AbstractConstant;

/**
 * 其子类都用到了常量池
 */
public abstract class ConstantPoolHolder {
    protected static AbstractConstant[] constantPool;

    public static void setConstantPool(AbstractConstant[] constantPool) {
        ConstantPoolHolder.constantPool = constantPool;
    }
}
