package com.study.parser;

import com.study.type.ConstantPool;

/**
 * 其子类都用到了常量池
 */
@Deprecated
public abstract class ConstantPoolHolder {
    @Deprecated
    protected static ConstantPool constantPool;

    @Deprecated
    public static void setConstantPool(ConstantPool constantPool) {
        ConstantPoolHolder.constantPool = constantPool;
    }
}
