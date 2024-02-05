package com.study.present.attribute;

import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.info.attribute.PermittedSubclassesAttribute;
import com.study.util.PrintStreamWrapper;

public class PermittedSubclassesAttributePresenter extends AbstractAttributePresenter<PermittedSubclassesAttribute> {
    public PermittedSubclassesAttributePresenter(
            ParseResult result,
            PrintStreamWrapper printStreamWrapper,
            PermittedSubclassesAttribute attribute,
            int baseIndentLevel
    ) {
        super(result, printStreamWrapper, attribute, baseIndentLevel);
    }

    @Override
    public void doPresent() {
        ConstantPool constantPool = result.getConstantPool();
        printStreamWrapper.printlnWithIndentLevel(
                constantPool.desc(attribute.getAttributeNameIndex()) + ":",
                baseIndentLevel
        );

        attribute.getClasses().forEach(
                classIndex -> printStreamWrapper.printlnWithIndentLevel(
                        constantPool.detail(classIndex),
                        baseIndentLevel + 1
                ));
    }
}
