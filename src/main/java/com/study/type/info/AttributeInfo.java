package com.study.type.info;

import com.study.io.BasicInputStream;
import com.study.type.U1;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.constant.AbstractConstant;

public class AttributeInfo extends AbstractInfo {
    private U2 attributeNameIndex;
    private U4 attributeLength;
    private U1[] info;

    private AttributeInfo(BasicInputStream basicInputStream) {
        attributeNameIndex = basicInputStream.readU2();
        attributeLength = basicInputStream.readU4();

        int count = attributeLength.toInt();
        info = new U1[count];
        for (int i = 0; i < count; i++) {
            info[i] = basicInputStream.readU1();
        }
    }

    public static AttributeInfo build(BasicInputStream basicInputStream) {
        return new AttributeInfo(basicInputStream);
    }

    @Override
    public String desc(AbstractConstant[] constantPool) {
        return null;
    }
}
