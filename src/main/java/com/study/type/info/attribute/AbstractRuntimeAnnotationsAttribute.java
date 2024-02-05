package com.study.type.info.attribute;

import com.study.type.U2;
import com.study.type.U4;

import java.util.List;

public abstract class AbstractRuntimeAnnotationsAttribute extends AttributeInfo {
    protected final List<Annotation> annotations;


    public AbstractRuntimeAnnotationsAttribute(U2 attributeNameIndex,
                                               U4 attributeLength,
                                               List<Annotation> annotations) {
        super(attributeNameIndex, attributeLength);
        this.annotations = annotations;
    }

    public List<Annotation> getAnnotations() {
        return annotations;
    }
}
