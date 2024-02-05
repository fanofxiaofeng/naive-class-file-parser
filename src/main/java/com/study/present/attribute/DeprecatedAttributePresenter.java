package com.study.present.attribute;

import com.study.parser.ParseResult;
import com.study.type.info.attribute.DeprecatedAttribute;
import com.study.util.PrintStreamWrapper;

public class DeprecatedAttributePresenter extends AbstractAttributePresenter<DeprecatedAttribute> {

    public DeprecatedAttributePresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, DeprecatedAttribute attribute, int baseIndentLevel) {
        super(result, printStreamWrapper, attribute, baseIndentLevel);
    }

    @Override
    public void doPresent() {
        String description = attribute.describe(result.getConstantPool());
        printStreamWrapper.printlnWithIndentLevel(description, baseIndentLevel);
    }
}
