package com.study.parser.attribute;

import com.study.io.U1InputStream;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.info.attribute.AbstractRuntimeAnnotationsAttribute;
import com.study.type.info.attribute.Annotation;

import java.util.List;

public sealed abstract class AbstractRuntimeAnnotationsAttributeParser
        extends AttributeParser<AbstractRuntimeAnnotationsAttribute>
        permits RuntimeInvisibleAnnotationsAttributeParser,
        RuntimeVisibleAnnotationsAttributeParser {
    public AbstractRuntimeAnnotationsAttributeParser(U2 attributeNameIndex, U4 attributeLength, U1InputStream infoStream) {
        super(attributeNameIndex, attributeLength, infoStream);
    }

    protected List<Annotation> parseAnnotations() {
        U2 numAnnotations = infoStream.readU2();
        AnnotationParser annotationParser = new AnnotationParser(infoStream);
        return numAnnotations.mapToList(annotationParser::parse);
    }
}
