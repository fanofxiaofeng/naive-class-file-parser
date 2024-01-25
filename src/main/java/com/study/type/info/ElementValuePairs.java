package com.study.type.info;

import com.study.type.U2;

public class ElementValuePairs {
    private final U2 elementNameIndex;

    private final ElementValue value;


    public ElementValuePairs(U2 elementNameIndex, ElementValue value) {
        this.elementNameIndex = elementNameIndex;
        this.value = value;
    }
}
