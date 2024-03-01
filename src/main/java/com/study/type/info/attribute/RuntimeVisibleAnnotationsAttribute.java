package com.study.type.info.attribute;

import com.study.type.U2;
import com.study.type.U4;

import java.util.List;

// todo this class is complex
public class RuntimeVisibleAnnotationsAttribute extends AbstractRuntimeAnnotationsAttribute {

    public RuntimeVisibleAnnotationsAttribute(U2 attributeNameIndex,
                                              U4 attributeLength,
                                              List<Annotation> annotations) {
        super(attributeNameIndex, attributeLength, annotations);
    }
}
