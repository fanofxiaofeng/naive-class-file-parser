package com.study.present;

import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.constant.leaf.ConstantUtf8;
import com.study.type.info.FieldInfo;
import com.study.util.PrintStreamWrapper;

public class FieldHeaderLinePresenter extends AbstractPresenter {

    private final FieldInfo fieldInfo;

    private static final int INDENT_LEVEL = 1;

    protected FieldHeaderLinePresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, FieldInfo fieldInfo) {
        super(result, printStreamWrapper);
        this.fieldInfo = fieldInfo;
    }

    @Override
    public void doPresent() {
        String headerLine = buildHeaderLine();
        printStreamWrapper.printlnWithIndentLevel(headerLine, INDENT_LEVEL);
    }

    public String buildHeaderLine() {
        ConstantPool constantPool = result.getConstantPool();

        ConstantUtf8 fieldName = constantPool.get(fieldInfo.getNameIndex(), ConstantUtf8.class);

        return buildHeaderLine(fieldInfo.buildHumanReadableFlagsDesc(),
                fieldInfo.buildHumanReadableTypeDesc(constantPool),
                fieldName.desc());
    }
}