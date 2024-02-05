package com.study.type.info.attribute;

import com.study.type.U2;
import com.study.type.U4;

import java.util.List;

public class RuntimeInvisibleAnnotationsAttribute extends AbstractRuntimeAnnotationsAttribute {
    public RuntimeInvisibleAnnotationsAttribute(U2 attributeNameIndex,
                                                U4 attributeLength,
                                                List<Annotation> annotations
    ) {
        super(attributeNameIndex, attributeLength, annotations);
    }
}
