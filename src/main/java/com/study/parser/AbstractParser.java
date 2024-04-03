package com.study.parser;

import com.study.io.ContentReader;

public abstract class AbstractParser<T> implements Parser<T> {

    protected final ContentReader contentReader;

    protected AbstractParser(ContentReader contentReader) {
        this.contentReader = contentReader;
    }

    protected int parseCount() {
        return contentReader.readU2().toInt();
    }
}
