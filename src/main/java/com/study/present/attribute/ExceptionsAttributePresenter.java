package com.study.present.attribute;

import com.study.parser.ParseResult;
import com.study.type.info.attribute.ExceptionsAttribute;
import com.study.util.PrintStreamWrapper;

public class ExceptionsAttributePresenter extends AbstractAttributePresenter<ExceptionsAttribute> {

    public ExceptionsAttributePresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, ExceptionsAttribute attribute, int baseIndentLevel) {
        super(result, printStreamWrapper, attribute, baseIndentLevel);
    }

    @Override
    public void doPresent() {
        if (attribute.getExceptionIndexTable().isEmpty()) {
            return;
        }

        presentHeaderLine();
        presentDetails();
    }

    private void presentDetails() {
        String description = attribute.buildDesc(result.getConstantPool());
        printStreamWrapper.printlnWithIndentLevel(description, baseIndentLevel + 1);
    }
}
