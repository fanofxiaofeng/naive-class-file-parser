package com.study.present.attribute;

import com.study.parser.ParseResult;
import com.study.type.info.attribute.AbstractRuntimeAnnotationsAttribute;
import com.study.util.PrintStreamWrapper;

public final class RuntimeInvisibleAnnotationsAttributePresenter
        extends AbstractRuntimeAnnotationsAttributePresenter {
    public RuntimeInvisibleAnnotationsAttributePresenter(
            ParseResult result,
            PrintStreamWrapper printStreamWrapper,
            AbstractRuntimeAnnotationsAttribute attribute,
            int baseIndentLevel
    ) {
        super(result, printStreamWrapper, attribute, baseIndentLevel);
    }
}
