package com.study.parser.attribute;

import com.study.io.U1InputStream;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.info.attribute.Annotation;
import com.study.type.info.attribute.RuntimeInvisibleAnnotationsAttribute;

import java.util.List;

public final class RuntimeInvisibleAnnotationsAttributeParser
        extends AbstractRuntimeAnnotationsAttributeParser {
    public RuntimeInvisibleAnnotationsAttributeParser(U2 attributeNameIndex, U4 attributeLength, U1InputStream infoStream) {
        super(attributeNameIndex, attributeLength, infoStream);
    }

    @Override
    public RuntimeInvisibleAnnotationsAttribute parse() {
        List<Annotation> annotations = parseAnnotations();
        return new RuntimeInvisibleAnnotationsAttribute(attributeNameIndex, attributeLength, annotations);
    }
}
