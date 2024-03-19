package com.study.type.info.attribute;

import com.study.type.U2;
import com.study.type.U4;

import java.util.List;

public class LocalVariableTypeTableAttribute extends AbstractLocalVariableBasedTableAttribute {

    public LocalVariableTypeTableAttribute(U2 attributeNameIndex, U4 attributeLength, List<LocalVariableBasedInfo> localVariableTypeTable) {
        super(attributeNameIndex, attributeLength, localVariableTypeTable);
    }
}
