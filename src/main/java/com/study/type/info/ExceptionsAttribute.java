package com.study.type.info;

import com.study.io.U1InputStream;
import com.study.type.U2;

public class ExceptionsAttribute extends AttributeInfo {
    private U2 numberOfExceptions;
    private U2[] exceptionIndexTable;

    public ExceptionsAttribute(U1InputStream u1InputStream) {
        super(u1InputStream);
        U1InputStream real = new U1InputStream(this.info);
        numberOfExceptions = real.readU2();
        exceptionIndexTable = real.readU2Array(numberOfExceptions.toInt());
    }

    @Override
    public String describe(int level) {
        if (numberOfExceptions.toInt() > 0) {
            printStream.println(basic(level) + " Exceptions:");
            printStream.println(basic(level) + "    throws");
            for (U2 u2 : exceptionIndexTable) {
                System.out.println(AttributeInfo.constantPool[u2.toInt()].desc());
            }
        }
        return null;
    }
}
