package com.study.present.attribute;

import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.info.attribute.ExceptionsAttribute;
import com.study.util.PrintStreamWrapper;

import java.util.ArrayList;
import java.util.List;

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
        List<U2> exceptionIndexTable = attribute.getExceptionIndexTable();
        List<String> exceptionDescriptionList = new ArrayList<>(exceptionIndexTable.size());

        ConstantPool constantPool = result.getConstantPool();
        exceptionIndexTable.forEach(exceptionIndex -> {
            System.out.println("exceptionIndex: " + exceptionIndex.toInt());
            String desc = constantPool.detail(exceptionIndex);
            exceptionDescriptionList.add(desc.replaceAll("/", "."));
        });

        String description = String.format("throws %s", String.join(", ", exceptionDescriptionList));

        printStreamWrapper.printlnWithIndentLevel(description, baseIndentLevel + 1);
    }

    private void presentHeaderLine() {
        printStreamWrapper.printlnWithIndentLevel("Exceptions:", baseIndentLevel);
    }
}
