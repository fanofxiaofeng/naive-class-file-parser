package com.study.type.info.attribute;

import com.study.type.U2;
import com.study.type.U4;

import java.util.List;

public abstract class AbstractLocalVariableBasedTableAttribute extends AttributeInfo {
    protected final List<LocalVariableBasedInfo> localVariableBasedTable;

    protected AbstractLocalVariableBasedTableAttribute(U2 attributeNameIndex, U4 attributeLength, List<LocalVariableBasedInfo> localVariableBasedTable) {
        super(attributeNameIndex, attributeLength);
        this.localVariableBasedTable = localVariableBasedTable;
    }

    public List<LocalVariableBasedInfo> getLocalVariableBasedTable() {
        return localVariableBasedTable;
    }

    public record LocalVariableBasedInfo(U2 startPc, U2 length, U2 nameIndex, U2 descriptorIndex, U2 index) {
    }
}
