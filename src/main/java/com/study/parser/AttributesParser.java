package com.study.parser;

import com.study.io.ContentReader;
import com.study.type.ConstantPool;
import com.study.type.info.attribute.AttributeInfo;

public class AttributesParser extends RelationParser<AttributeInfo> {

    public AttributesParser(ContentReader contentReader, ConstantPool constantPool) {
        super(
                contentReader,
                constantPool,
                () -> new AttributeInfoParser(contentReader, constantPool)
        );
    }
}
