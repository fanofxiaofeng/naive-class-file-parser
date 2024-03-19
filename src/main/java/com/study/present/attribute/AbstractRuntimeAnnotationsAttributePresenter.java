package com.study.present.attribute;

import com.study.parser.ParseResult;
import com.study.present.AnnotationPresenter;
import com.study.type.info.attribute.AbstractRuntimeAnnotationsAttribute;
import com.study.type.info.attribute.Annotation;
import com.study.util.PrintStreamWrapper;

import java.util.List;
import java.util.stream.IntStream;

public sealed abstract class AbstractRuntimeAnnotationsAttributePresenter
        extends AbstractAttributePresenter<AbstractRuntimeAnnotationsAttribute>
        permits RuntimeInvisibleAnnotationsAttributePresenter,
        RuntimeVisibleAnnotationAttributePresenter {
    public AbstractRuntimeAnnotationsAttributePresenter(ParseResult result,
                                                        PrintStreamWrapper printStreamWrapper,
                                                        AbstractRuntimeAnnotationsAttribute attribute,
                                                        int baseIndentLevel) {
        super(result, printStreamWrapper, attribute, baseIndentLevel);
    }

    @Override
    public void doPresent() {
        presentHeaderLine();

        List<Annotation> annotations = attribute.getAnnotations();
        IntStream.range(0, annotations.size()).forEach(index -> new AnnotationPresenter(
                result,
                printStreamWrapper,
                annotations.get(index),
                index,
                baseIndentLevel + 1
        ).present());
    }
}
