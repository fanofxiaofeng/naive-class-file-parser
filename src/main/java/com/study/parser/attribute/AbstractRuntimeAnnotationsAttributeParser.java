package com.study.parser.attribute;

import com.study.type.U2;
import com.study.type.info.attribute.AbstractRuntimeAnnotationsAttribute;
import com.study.type.info.attribute.Annotation;
import com.study.type.info.attribute.RawAttributeInfo;

import java.util.ArrayList;
import java.util.List;

public sealed abstract class AbstractRuntimeAnnotationsAttributeParser
        extends AttributeParser<AbstractRuntimeAnnotationsAttribute>
        permits RuntimeInvisibleAnnotationsAttributeParser,
        RuntimeVisibleAnnotationsAttributeParser {
    public AbstractRuntimeAnnotationsAttributeParser(RawAttributeInfo that) {
        super(that);
    }

    protected List<Annotation> parseAnnotations() {
        U2 numAnnotations = infoStream.readU2();
        List<Annotation> annotations = new ArrayList<>(numAnnotations.toInt());

        AnnotationParser annotationParser = new AnnotationParser(infoStream);
        numAnnotations.forEach(e -> annotations.add(annotationParser.parse()));

        return annotations;
    }
}
