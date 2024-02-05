package com.study.parser.attribute;

import com.study.type.info.attribute.Annotation;
import com.study.type.info.attribute.RawAttributeInfo;
import com.study.type.info.attribute.RuntimeInvisibleAnnotationsAttribute;

import java.util.List;

public final class RuntimeInvisibleAnnotationsAttributeParser
        extends AbstractRuntimeAnnotationsAttributeParser {
    public RuntimeInvisibleAnnotationsAttributeParser(RawAttributeInfo that) {
        super(that);
    }

    @Override
    public RuntimeInvisibleAnnotationsAttribute parse() {
        List<Annotation> annotations = parseAnnotations();
        return new RuntimeInvisibleAnnotationsAttribute(attributeNameIndex, attributeLength, annotations);
    }
}
