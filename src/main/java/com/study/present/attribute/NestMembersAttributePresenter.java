package com.study.present.attribute;

import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.info.attribute.NestMembersAttribute;
import com.study.util.PrintStreamWrapper;

public class NestMembersAttributePresenter extends AbstractAttributePresenter<NestMembersAttribute> {

    private static final int INDENT_LEVEL = 0;

    public NestMembersAttributePresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, NestMembersAttribute attribute, int baseIndentLevel) {
        super(result, printStreamWrapper, attribute, baseIndentLevel);
    }

    @Override
    public void doPresent() {
        presentHeaderLine();

        ConstantPool constantPool = result.getConstantPool();
        for (U2 u2 : attribute.getClasses()) {
            printStreamWrapper.printlnWithIndentLevel(constantPool.detail(u2), INDENT_LEVEL + 1);
        }
    }
}
