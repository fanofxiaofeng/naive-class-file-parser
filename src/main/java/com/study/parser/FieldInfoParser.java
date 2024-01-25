package com.study.parser;

import com.study.io.BasicInputStream;
import com.study.type.ConstantPool;
import com.study.type.ItemsContainer;
import com.study.type.U2;
import com.study.type.info.attribute.AttributeInfo;
import com.study.type.info.FieldInfo;

public class FieldInfoParser extends InfoHolderParser<FieldInfo> {

    public FieldInfoParser(BasicInputStream basicInputStream, ConstantPool constantPool) {
        super(basicInputStream, constantPool);
    }

    @Override
    public FieldInfo parse() {
        U2 accessFlags = basicInputStream.readU2();
        U2 nameIndex = basicInputStream.readU2();
        U2 descriptorIndex = basicInputStream.readU2();

        ItemsContainer<AttributeInfo> attributes = new AttributesParser(basicInputStream, constantPool).parse();
        return new FieldInfo(accessFlags, nameIndex, descriptorIndex, attributes);
    }
}
