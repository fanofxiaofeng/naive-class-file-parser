package com.study.present;

import com.study.parser.ParseResult;
import com.study.present.attribute.AbstractAttributePresenter;
import com.study.type.ConstantPool;
import com.study.type.info.FieldInfo;
import com.study.util.PrintStreamWrapper;

public class FieldInfoPresenter extends AbstractPresenter {

    private final FieldInfo fieldInfo;

    private static final int DEFAULT_INDENT_LEVEL = 2;

    public FieldInfoPresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, FieldInfo fieldInfo) {
        super(result, printStreamWrapper);
        this.fieldInfo = fieldInfo;
    }

    @Override
    public void doPresent() {
        presentHeaderLine();
        presentDescriptorLine();
        presentAccessFlagsLine();
        presentAttributes();
    }

    private void presentHeaderLine() {
        Presenter headerLinePresenter = new FieldHeaderLinePresenter(result, printStreamWrapper, fieldInfo);
        headerLinePresenter.present();
    }

    private void presentDescriptorLine() {
        ConstantPool constantPool = result.getConstantPool();
        String descriptorLine = fieldInfo.buildDescriptorLine(constantPool);
        printStreamWrapper.printlnWithIndentLevel(descriptorLine, DEFAULT_INDENT_LEVEL);
    }

    private void presentAccessFlagsLine() {
        String accessFlagsLine = fieldInfo.buildAccessFlagsLine();
        printStreamWrapper.printlnWithIndentLevel(accessFlagsLine, DEFAULT_INDENT_LEVEL);
    }

    private void presentAttributes() {
        fieldInfo.getAttributes().forEach(attribute -> {
            Presenter presenter =
                    AbstractAttributePresenter.build(
                            result, printStreamWrapper, attribute, DEFAULT_INDENT_LEVEL
                    );
            presenter.present();
        });
    }
}
