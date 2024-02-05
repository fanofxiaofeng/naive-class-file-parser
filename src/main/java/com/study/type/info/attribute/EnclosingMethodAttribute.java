package com.study.type.info.attribute;

import com.study.type.U2;
import com.study.type.U4;

public class EnclosingMethodAttribute extends AttributeInfo {
    private final U2 classIndex;
    private final U2 methodIndex;

    public EnclosingMethodAttribute(U2 attributeNameIndex,
                                       U4 attributeLength,
                                       U2 classIndex,
                                       U2 methodIndex
    ) {
        super(attributeNameIndex, attributeLength);
        this.classIndex = classIndex;
        this.methodIndex = methodIndex;
    }

    public U2 getClassIndex() {
        return classIndex;
    }

    public U2 getMethodIndex() {
        return methodIndex;
    }
}
