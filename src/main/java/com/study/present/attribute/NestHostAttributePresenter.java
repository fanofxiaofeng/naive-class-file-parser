package com.study.present.attribute;

import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.info.attribute.NestHostAttribute;
import com.study.util.PrintStreamWrapper;

public class NestHostAttributePresenter extends AbstractAttributePresenter<NestHostAttribute> {

    private static final int INDENT_LEVEL = 0;

    public NestHostAttributePresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, NestHostAttribute attribute, int baseIndentLevel) {
        super(result, printStreamWrapper, attribute, baseIndentLevel);
    }

    @Override
    public void doPresent() {
        ConstantPool constantPool = result.getConstantPool();
        String message =
                String.format("%s: class %s",
                        constantPool.desc(attribute.getAttributeNameIndex()),
                        constantPool.detail(attribute.getHostClassIndex())
                );
        printStreamWrapper.printlnWithIndentLevel(message, INDENT_LEVEL);
    }
}
