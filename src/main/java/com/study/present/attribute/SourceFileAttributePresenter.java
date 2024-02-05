package com.study.present.attribute;

import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.info.attribute.SourceFileAttribute;
import com.study.util.PrintStreamWrapper;

public class SourceFileAttributePresenter extends AbstractAttributePresenter<SourceFileAttribute> {

    public SourceFileAttributePresenter(
            ParseResult result,
            PrintStreamWrapper printStreamWrapper,
            SourceFileAttribute attribute,
            int baseIndentLevel
    ) {
        super(result, printStreamWrapper, attribute, baseIndentLevel);
    }

    @Override
    public void doPresent() {
        ConstantPool constantPool = result.getConstantPool();

        String attributeName = constantPool.desc(attribute.getAttributeNameIndex());
        String fileName = constantPool.desc(attribute.getSourceFileIndex());
        String desc = String.format("%s: \"%s\"", attributeName, fileName);

        printStreamWrapper.printlnWithIndentLevel(desc, baseIndentLevel);
    }
}
