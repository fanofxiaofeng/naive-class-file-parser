package com.study.present.attribute;

import com.study.parser.ParseResult;
import com.study.type.info.attribute.DeprecatedAttribute;
import com.study.util.PrintStreamWrapper;

public class DeprecatedAttributePresenter extends AbstractAttributePresenter {

    private final DeprecatedAttribute attribute;

    public DeprecatedAttributePresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, DeprecatedAttribute attribute, int baseIndentLevel) {
        super(result, printStreamWrapper, baseIndentLevel);
        this.attribute = attribute;
    }

    @Override
    public int present() {
        String description = attribute.describe(result.getConstantPool());
        printStreamWrapper.printlnWithIndentLevel(description, baseIndentLevel);

        return 1;
    }
}
