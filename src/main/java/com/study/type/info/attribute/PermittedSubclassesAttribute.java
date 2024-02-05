package com.study.type.info.attribute;

import com.study.type.U2;
import com.study.type.U4;

import java.util.List;

public class PermittedSubclassesAttribute extends AttributeInfo {

    private final List<U2> classes;

    public PermittedSubclassesAttribute(U2 attributeNameIndex, U4 attributeLength, List<U2> classes) {
        super(attributeNameIndex, attributeLength);
        this.classes = classes;
    }

    public List<U2> getClasses() {
        return classes;
    }
}
