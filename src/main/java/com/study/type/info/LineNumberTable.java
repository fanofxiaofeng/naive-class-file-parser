package com.study.type.info;

import com.study.io.U1InputStream;
import com.study.type.U2;

public class LineNumberTable {
    private U2 startPc;
    private U2 lineNumber;

    public LineNumberTable(U1InputStream u1InputStream) {
        this.startPc = u1InputStream.readU2();
        this.lineNumber = u1InputStream.readU2();
    }
}
