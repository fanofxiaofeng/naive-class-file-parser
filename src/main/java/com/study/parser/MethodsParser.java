package com.study.parser;

import com.study.io.BasicInputStream;
import com.study.type.ConstantPool;
import com.study.type.info.MethodInfo;

public class MethodsParser extends RelationParser<MethodInfo> {

    public MethodsParser(BasicInputStream basicInputStream, ConstantPool constantPool) {
        super(
                basicInputStream,
                constantPool,
                () -> new MethodInfoParser(basicInputStream, constantPool)
        );
    }

}
