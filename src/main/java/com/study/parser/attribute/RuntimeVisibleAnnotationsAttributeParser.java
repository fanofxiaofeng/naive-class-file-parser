package com.study.parser.attribute;

import com.study.type.U2;
import com.study.type.info.attribute.Annotation;
import com.study.type.info.attribute.RawAttributeInfo;
import com.study.type.info.attribute.RuntimeVisibleAnnotationsAttribute;

import java.util.ArrayList;
import java.util.List;

public class RuntimeVisibleAnnotationsAttributeParser extends AttributeParser<RuntimeVisibleAnnotationsAttribute> {
    public RuntimeVisibleAnnotationsAttributeParser(RawAttributeInfo that) {
        super(that);
    }

    @Override
    public RuntimeVisibleAnnotationsAttribute parse() {
        U2 numAnnotations = infoStream.readU2();
        List<Annotation> annotations = new ArrayList<>(numAnnotations.toInt());

        AnnotationParser annotationParser = new AnnotationParser(infoStream);
        numAnnotations.forEach(e -> annotations.add(annotationParser.parse()));

        return new RuntimeVisibleAnnotationsAttribute(attributeNameIndex, attributeLength, annotations);
    }
}
