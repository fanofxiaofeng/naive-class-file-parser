package com.study.type.info.attribute;

import com.study.type.U2;
import com.study.type.U4;

import java.util.List;

public class ExceptionsAttribute extends AttributeInfo {
    private final List<U2> exceptionIndexTable;

    public ExceptionsAttribute(U2 attributeNameIndex, U4 attributeLength, List<U2> exceptionIndexTable) {
        super(attributeNameIndex, attributeLength);
        this.exceptionIndexTable = exceptionIndexTable;
    }

    public List<U2> getExceptionIndexTable() {
        return exceptionIndexTable;
    }
}
