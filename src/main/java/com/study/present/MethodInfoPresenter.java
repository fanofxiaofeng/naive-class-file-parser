package com.study.present;

import com.study.parser.ParseResult;
import com.study.present.attribute.AbstractAttributePresenter;
import com.study.type.ConstantPool;
import com.study.type.info.MethodInfo;
import com.study.util.PrintStreamWrapper;

public class MethodInfoPresenter extends AbstractPresenter {

    private final MethodInfo methodInfo;

    private final int baseIndentLevel = 2;

    public MethodInfoPresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, MethodInfo methodInfo) {
        super(result, printStreamWrapper);
        this.methodInfo = methodInfo;
    }

    @Override
    public void doPresent() {
        presentHeaderLine();
        presentDescriptorLine();
        presentAccessFlagsLine();
        presentAttributes();
    }

    private void presentHeaderLine() {
        Presenter headerLinePresenter = new MethodHeaderLinePresenter(result, printStreamWrapper, methodInfo);
        headerLinePresenter.present();
    }

    private void presentDescriptorLine() {
        ConstantPool constantPool = result.getConstantPool();
        String descriptorLine = methodInfo.buildDescriptorLine(constantPool);
        printStreamWrapper.printlnWithIndentLevel(descriptorLine, baseIndentLevel);
    }

    private void presentAccessFlagsLine() {
        String accessFlagsLine = methodInfo.buildAccessFlagsLine();
        printStreamWrapper.printlnWithIndentLevel(accessFlagsLine, baseIndentLevel);
    }

    private void presentAttributes() {
        methodInfo.getAttributes().forEach(attributeInfo -> {
            Presenter presenter =
                    AbstractAttributePresenter.build(
                            result,
                            printStreamWrapper,
                            attributeInfo,
                            baseIndentLevel
                    );
            presenter.present();
        });
    }
}
