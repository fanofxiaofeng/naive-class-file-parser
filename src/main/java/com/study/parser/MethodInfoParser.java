package com.study.parser;

import com.study.io.ContentReader;
import com.study.type.ConstantPool;
import com.study.type.ItemsContainer;
import com.study.type.U2;
import com.study.type.info.attribute.AttributeInfo;
import com.study.type.info.MethodInfo;

public class MethodInfoParser extends InfoHolderParser<MethodInfo> {

    public MethodInfoParser(ContentReader contentReader, ConstantPool constantPool) {
        super(contentReader, constantPool);
    }

    @Override
    public MethodInfo parse() {
        U2 accessFlags = contentReader.readU2();
        U2 nameIndex = contentReader.readU2();
        U2 descriptorIndex = contentReader.readU2();

        ItemsContainer<AttributeInfo> attributes = new AttributesParser(contentReader, constantPool).parse();
        return new MethodInfo(accessFlags, nameIndex, descriptorIndex, attributes);
    }
}
