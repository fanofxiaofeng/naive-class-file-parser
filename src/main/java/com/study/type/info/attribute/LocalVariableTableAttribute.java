package com.study.type.info.attribute;

import com.study.type.U2;
import com.study.type.U4;

import java.util.List;

public class LocalVariableTableAttribute extends AbstractLocalVariableBasedTableAttribute {

    public LocalVariableTableAttribute(U2 attributeNameIndex, U4 attributeLength, List<AbstractLocalVariableBasedTableAttribute.LocalVariableBasedInfo> localVariableTable) {
        super(attributeNameIndex, attributeLength, localVariableTable);
    }
}
