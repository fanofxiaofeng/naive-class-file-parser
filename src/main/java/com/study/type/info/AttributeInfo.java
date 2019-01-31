package com.study.type.info;

import com.study.io.BasicInputStream;
import com.study.io.U1InputStream;
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
        info = basicInputStream.readU1Array(attributeLength.toInt());
    }

    public AttributeInfo(U1InputStream u1InputStream) {
        attributeNameIndex = u1InputStream.readU2();
        attributeLength = u1InputStream.readU4();
        info = u1InputStream.readU1Array(attributeLength.toInt());
    }

    public static AttributeInfo build(BasicInputStream basicInputStream) {
        return new AttributeInfo(basicInputStream);
    }

    @Override
    public String desc(AbstractConstant[] constantPool) {
        int index = attributeNameIndex.toInt();
        AbstractConstant constant = constantPool[index];
        if ("Code".equals(constant.detail(constantPool))) {
            CodeAttribute codeAttribute = new CodeAttribute(attributeNameIndex, attributeLength, info);
            System.out.println("^^^");
            System.out.println(codeAttribute.toString());
            System.out.println("$$$");
            System.out.println(codeAttribute.desc(constantPool));
        }

        return null;
    }
}
