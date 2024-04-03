package com.study.parser;

import com.study.io.ContentReader;
import com.study.type.ConstantPool;
import com.study.type.ItemsContainer;
import com.study.type.U2;
import com.study.type.info.attribute.AttributeInfo;
import com.study.type.info.FieldInfo;

public class FieldInfoParser extends InfoHolderParser<FieldInfo> {

    public FieldInfoParser(ContentReader contentReader, ConstantPool constantPool) {
        super(contentReader, constantPool);
    }

    @Override
    public FieldInfo parse() {
        U2 accessFlags = contentReader.readU2();
        U2 nameIndex = contentReader.readU2();
        U2 descriptorIndex = contentReader.readU2();

        ItemsContainer<AttributeInfo> attributes = new AttributesParser(contentReader, constantPool).parse();
        return new FieldInfo(accessFlags, nameIndex, descriptorIndex, attributes);
    }
}
