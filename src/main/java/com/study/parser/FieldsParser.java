package com.study.parser;

import com.study.io.ContentReader;
import com.study.type.ConstantPool;
import com.study.type.info.FieldInfo;

public class FieldsParser extends RelationParser<FieldInfo> {

    public FieldsParser(ContentReader contentReader, ConstantPool constantPool) {
        super(
                contentReader,
                constantPool,
                () -> new FieldInfoParser(contentReader, constantPool)
        );
    }
}
