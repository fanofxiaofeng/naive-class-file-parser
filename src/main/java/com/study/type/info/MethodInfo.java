package com.study.type.info;

import com.study.io.BasicInputStream;
import com.study.type.U2;
import com.study.type.constant.AbstractConstant;

public class MethodInfo extends AbstractInfo {
    private U2 accessFlags;
    private U2 nameIndex;
    private U2 descriptorIndex;
    private U2 attributesCount;
    private AttributeInfo[] attributes;

    private MethodInfo(BasicInputStream basicInputStream) {
        accessFlags = basicInputStream.readU2();
        nameIndex = basicInputStream.readU2();
        descriptorIndex = basicInputStream.readU2();
        attributesCount = basicInputStream.readU2();

        int count = attributesCount.toInt();
        attributes = new AttributeInfo[count];
        for (int i = 0; i < count; i++) {
            attributes[i] = AttributeInfo.build(basicInputStream);
        }
    }

    public static MethodInfo build(BasicInputStream basicInputStream) {
        return new MethodInfo(basicInputStream);
    }

    @Override
    public String desc(AbstractConstant[] constantPool) {

        return null;
    }
}
