package com.study.present.attribute;

import com.study.parser.ParseResult;
import com.study.type.info.attribute.ConstantValueAttribute;
import com.study.util.PrintStreamWrapper;

public class ConstantValueAttributePresenter extends AbstractAttributePresenter<ConstantValueAttribute> {

    public ConstantValueAttributePresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, ConstantValueAttribute attribute, int baseIndentLevel) {
        super(result, printStreamWrapper, attribute, baseIndentLevel);
    }

    @Override
    public void doPresent() {
        String description = attribute.describe(result.getConstantPool());
        printStreamWrapper.printlnWithIndentLevel(description, baseIndentLevel);
    }
}
