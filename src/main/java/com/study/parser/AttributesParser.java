package com.study.parser;

import com.study.io.BasicInputStream;
import com.study.type.ConstantPool;
import com.study.type.info.attribute.AttributeInfo;

public class AttributesParser extends RelationParser<AttributeInfo> {

    public AttributesParser(BasicInputStream basicInputStream, ConstantPool constantPool) {
        super(
                basicInputStream,
                constantPool,
                () -> new AttributeInfoParser(basicInputStream, constantPool)
        );
    }
}
