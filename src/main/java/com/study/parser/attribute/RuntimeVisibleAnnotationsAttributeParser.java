package com.study.parser.attribute;

import com.study.type.info.attribute.Annotation;
import com.study.type.info.attribute.RawAttributeInfo;
import com.study.type.info.attribute.RuntimeVisibleAnnotationsAttribute;

import java.util.List;

public final class RuntimeVisibleAnnotationsAttributeParser
        extends AbstractRuntimeAnnotationsAttributeParser {
    public RuntimeVisibleAnnotationsAttributeParser(RawAttributeInfo that) {
        super(that);
    }

    @Override
    public RuntimeVisibleAnnotationsAttribute parse() {
        List<Annotation> annotations = parseAnnotations();
        return new RuntimeVisibleAnnotationsAttribute(attributeNameIndex, attributeLength, annotations);
    }
}
