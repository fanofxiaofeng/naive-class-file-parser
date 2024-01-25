package com.study.parser;

import com.study.io.BasicInputStream;
import com.study.type.ConstantPool;

public abstract class InfoHolderParser<T> extends AbstractParser<T> {

    protected final ConstantPool constantPool;

    protected InfoHolderParser(BasicInputStream basicInputStream, ConstantPool constantPool) {
        super(basicInputStream);
        this.constantPool = constantPool;
    }
}
