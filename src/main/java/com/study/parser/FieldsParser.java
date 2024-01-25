package com.study.parser;

import com.study.io.BasicInputStream;
import com.study.type.ConstantPool;
import com.study.type.info.FieldInfo;

public class FieldsParser extends RelationParser<FieldInfo> {

    public FieldsParser(BasicInputStream basicInputStream, ConstantPool constantPool) {
        super(
                basicInputStream,
                constantPool,
                () -> new FieldInfoParser(basicInputStream, constantPool)
        );
    }
}
