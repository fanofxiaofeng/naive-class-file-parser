package com.study.present.attribute;

import com.study.parser.ParseResult;
import com.study.present.Presenter;
import com.study.present.attribute.smf.StackMapFramePresenter;
import com.study.type.info.attribute.StackMapTableAttribute;
import com.study.type.info.frame.StackMapFrame;
import com.study.util.PrintStreamWrapper;

public class StackMapAttributePresenter extends AbstractAttributePresenter<StackMapTableAttribute> {
    public StackMapAttributePresenter(ParseResult result,
                                      PrintStreamWrapper printStreamWrapper,
                                      StackMapTableAttribute attribute,
                                      int baseIndentLevel) {
        super(result, printStreamWrapper, attribute, baseIndentLevel);
    }

    @Override
    public void doPresent() {
        presentHeaderLine();
        presentEntries();
    }

    private void presentEntries() {
        StackMapFrame[] entries = attribute.getEntries();
        for (StackMapFrame entry : entries) {
            Presenter presenter = new StackMapFramePresenter(result, printStreamWrapper, entry, baseIndentLevel + 1);
            presenter.present();
        }
    }

    @Override
    protected void presentHeaderLine() {
        String attributeName = result.getConstantPool().desc(attribute.getAttributeNameIndex());
        String message = String.format("%s: number_of_entries = %s", attributeName, attribute.getEntries().length);
        printStreamWrapper.printlnWithIndentLevel(message, baseIndentLevel);
    }
}
