package com.study.present.attribute;

import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.info.attribute.SyntheticAttribute;
import com.study.util.PrintStreamWrapper;

public class SyntheticAttributePresenter extends AbstractAttributePresenter<SyntheticAttribute> {
    public SyntheticAttributePresenter(ParseResult result,
                                       PrintStreamWrapper printStreamWrapper,
                                       SyntheticAttribute attribute,
                                       int baseIndentLevel
    ) {
        super(result, printStreamWrapper, attribute, baseIndentLevel);
    }

    // todo: to be verified (I am still unable to get a class file that has SyntheticAttribute as for now)
    @Override
    public void doPresent() {
        ConstantPool constantPool = result.getConstantPool();
        U2 attributeNameIndex = attribute.getAttributeNameIndex();
        String description = String.format("%s: true", constantPool.desc(attributeNameIndex));

        printStreamWrapper.printlnWithIndentLevel(description, baseIndentLevel);
    }
}
