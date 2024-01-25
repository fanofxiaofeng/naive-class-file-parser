package com.study.present.attribute;

import com.study.parser.ParseResult;
import com.study.type.info.attribute.ConstantValueAttribute;
import com.study.util.PrintStreamWrapper;

public class ConstantValueAttributePresenter extends AbstractAttributePresenter {

    private final ConstantValueAttribute attribute;

    public ConstantValueAttributePresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, ConstantValueAttribute attribute, int baseIndentLevel) {
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
