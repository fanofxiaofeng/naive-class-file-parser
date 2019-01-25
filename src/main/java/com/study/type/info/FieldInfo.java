package com.study.type.info;

import com.study.io.BasicInputStream;
import com.study.type.U2;
import com.study.type.constant.AbstractConstant;

import java.lang.reflect.Modifier;

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
        int mod = accessFlags.toInt();
        StringBuilder stringBuilder = new StringBuilder();
        // todo 没有处理 ACC_SYNTHETIC, ACC_ENUM
        stringBuilder.append(Modifier.toString(mod));
        stringBuilder.append(' ');
        stringBuilder.append(constantPool[nameIndex.toInt()].desc());
        stringBuilder.append("\n    descriptor:");
        stringBuilder.append(constantPool[descriptorIndex.toInt()].desc());
        stringBuilder.append("\n    flags: ");
        stringBuilder.append(String.format("(0x%04x)", mod));
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(Modifier.toString(0x00DF));
    }
}
