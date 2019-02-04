package com.study.type.info;

import com.study.io.U1InputStream;
import com.study.type.U2;
import com.study.type.constant.AbstractConstant;
import com.study.type.constant.ConstantInteger;

public class ConstantValue extends AttributeInfo {
    private U2 constantvalueIndex;

    public ConstantValue(U1InputStream u1InputStream) {
        super(u1InputStream);
        constantvalueIndex = new U2(this.info[0], this.info[1]);
    }

    @Override
    public String desc() {
        StringBuilder stringBuilder = new StringBuilder("ConstantValue: ");
        int index = constantvalueIndex.toInt();
        AbstractConstant constant = constantPool[index];
        if (ConstantInteger.class.isInstance(constant)) {
            stringBuilder.append("int");
            stringBuilder.append(' ');
            stringBuilder.append(constant.detail());
        }
        return stringBuilder.toString();
    }
}
