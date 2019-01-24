package com.study.type.info;

import com.study.io.BasicInputStream;
import com.study.type.U2;
import com.study.type.constant.AbstractConstant;

public class FieldInfo extends AbstractInfo {

    private U2 accessFlags;
    private U2 nameIndex;
    private U2 descriptorIndex;
    private U2 attributesCount;
    private AttributeInfo[] attributes;

    private FieldInfo(BasicInputStream basicInputStream) {
        this.accessFlags = basicInputStream.readU2();
        this.nameIndex = basicInputStream.readU2();
        this.descriptorIndex = basicInputStream.readU2();
        this.attributesCount = basicInputStream.readU2();
        int count = attributesCount.toInt();
        attributes = new AttributeInfo[count];
        for (int i = 0; i < count; i++) {
            attributes[i] = AttributeInfo.build(basicInputStream);
        }
    }

    public static FieldInfo build(BasicInputStream basicInputStream) {
        return new FieldInfo(basicInputStream);
    }

    @Override
    public String desc(AbstractConstant[] constantPool) {
        StringBuilder stringBuilder = new StringBuilder();
        if (accessFlags.isX(0x01)) {
            stringBuilder.append("public");
        }
        return null;
    }
}
