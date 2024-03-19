package com.study.present.attribute;

import com.study.parser.ParseResult;
import com.study.type.info.attribute.LineNumberTableAttribute;
import com.study.util.PrintStreamWrapper;

public class LineNumberTableAttributePresenter extends AbstractAttributePresenter<LineNumberTableAttribute> {
    public LineNumberTableAttributePresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, LineNumberTableAttribute attribute, int baseIndentLevel) {
        super(result, printStreamWrapper, attribute, baseIndentLevel);
    }

    @Override
    public void doPresent() {
        presentHeaderLine();
        presentDetails();
    }

    private void presentDetails() {
        for (LineNumberTableAttribute.LineNumberInfo lineNumberInfo : attribute.getLineNumberTable()) {
            printStreamWrapper.printlnWithIndentLevel(
                    String.format("line %s: %s",
                            lineNumberInfo.lineNumber().toInt(),
                            lineNumberInfo.startPc().toInt()
                    ),
                    baseIndentLevel + 1);
        }
    }
}
