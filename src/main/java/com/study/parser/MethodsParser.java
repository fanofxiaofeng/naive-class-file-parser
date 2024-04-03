package com.study.parser;

import com.study.io.ContentReader;
import com.study.type.ConstantPool;
import com.study.type.info.MethodInfo;

public class MethodsParser extends RelationParser<MethodInfo> {

    public MethodsParser(ContentReader contentReader, ConstantPool constantPool) {
        super(
                contentReader,
                constantPool,
                () -> new MethodInfoParser(contentReader, constantPool)
        );
    }

}
