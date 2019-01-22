package com.study.type.constant;

import com.study.type.U1;
import com.study.type.U2;

public class ConstantUtf8 extends AbstractConstant {
    private U2 length;
    private U1[] bytes;

    public ConstantUtf8(U2 length, U1[] bytes) {
        this.length = length;
        this.bytes = bytes;
    }

    @Override
    public String desc() {
        return "Utf8";
    }
}
