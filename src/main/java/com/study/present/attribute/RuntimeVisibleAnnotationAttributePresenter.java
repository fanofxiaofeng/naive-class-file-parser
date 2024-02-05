package com.study.present.attribute;

import com.study.parser.ParseResult;
import com.study.type.info.attribute.RuntimeVisibleAnnotationsAttribute;
import com.study.util.PrintStreamWrapper;

public final class RuntimeVisibleAnnotationAttributePresenter
        extends AbstractRuntimeAnnotationsAttributePresenter {

    public RuntimeVisibleAnnotationAttributePresenter(
            ParseResult result,
            PrintStreamWrapper printStreamWrapper,
            RuntimeVisibleAnnotationsAttribute attribute,
            int baseIndentLevel
    ) {
        super(result, printStreamWrapper, attribute, baseIndentLevel);
    }
}
