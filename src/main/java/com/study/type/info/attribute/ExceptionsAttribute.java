package com.study.type.info.attribute;

import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.U4;

import java.util.ArrayList;
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

    public String buildDesc(ConstantPool constantPool) {
        List<String> exceptionDescriptionList = new ArrayList<>(exceptionIndexTable.size());

        exceptionIndexTable.forEach(exceptionIndex -> {
            System.out.println("exceptionIndex: " + exceptionIndex.toInt());
            String desc = constantPool.detail(exceptionIndex);
            exceptionDescriptionList.add(desc.replaceAll("/", "."));
        });

        return String.format("throws %s", String.join(", ", exceptionDescriptionList));
    }
}
