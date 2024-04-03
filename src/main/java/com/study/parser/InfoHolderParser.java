package com.study.parser;

import com.study.io.ContentReader;
import com.study.type.ConstantPool;

public abstract class InfoHolderParser<T> extends AbstractParser<T> {

    protected final ConstantPool constantPool;

    protected InfoHolderParser(ContentReader contentReader, ConstantPool constantPool) {
        super(contentReader);
        this.constantPool = constantPool;
    }
}
