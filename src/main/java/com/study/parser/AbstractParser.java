package com.study.parser;

import com.study.io.BasicInputStream;

public abstract class AbstractParser<T> implements Parser<T> {

    protected final BasicInputStream basicInputStream;

    protected AbstractParser(BasicInputStream basicInputStream) {
        this.basicInputStream = basicInputStream;
    }

    protected int parseCount() {
        return basicInputStream.readU2().toInt();
    }
}
