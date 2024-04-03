package com.study.parser.attribute;

import com.study.io.U1InputStream;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.info.attribute.Annotation;
import com.study.type.info.attribute.RuntimeVisibleAnnotationsAttribute;

import java.util.List;

public final class RuntimeVisibleAnnotationsAttributeParser
        extends AbstractRuntimeAnnotationsAttributeParser {
    public RuntimeVisibleAnnotationsAttributeParser(U2 attributeNameIndex, U4 attributeLength, U1InputStream infoStream) {
        super(attributeNameIndex, attributeLength, infoStream);
    }

    @Override
    public RuntimeVisibleAnnotationsAttribute parse() {
        List<Annotation> annotations = parseAnnotations();
        return new RuntimeVisibleAnnotationsAttribute(attributeNameIndex, attributeLength, annotations);
    }
}
