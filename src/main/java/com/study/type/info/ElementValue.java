package com.study.type.info;

import com.study.io.U1InputStream;
import com.study.parser.ConstantPoolHolder;
import com.study.type.U1;

public class ElementValue extends ConstantPoolHolder {
    private U1 tag;

    public static ElementValue build(U1InputStream u1InputStream) {
        U1 tag = u1InputStream.readU1();
        System.out.println("" + constantPool[tag.toInt()].desc());
//        switch (constantPool[tag.toInt()].desc())
        return null;
    }
}
