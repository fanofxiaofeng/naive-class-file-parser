package com.study.present.instruction;

import com.study.parser.ParseResult;
import com.study.util.PrintStreamWrapper;
import org.apache.commons.lang3.StringUtils;

public abstract class VariableLengthInstructionPresenter extends AbstractInstructionPresenter {

    protected VariableLengthInstructionPresenter(ParseResult result, PrintStreamWrapper printStreamWrapper) {
        super(result, printStreamWrapper);
    }

    public abstract void presentHeaderLine();

    public abstract void presentBodyLines();

    public void presentEndLine() {
        printStreamWrapper.printlnWithIndentLevel(
                StringUtils.leftPad("}", 7, ' '),
                3);
    }

    protected void presentNormalBodyLine(int match, int targetIndex) {
        printStreamWrapper.printlnWithIndentLevel(
                String.format("%s: %s",
                        StringUtils.leftPad("" + match, 18, ' '),
                        targetIndex
                ),
                3
        );
    }

    protected void presentDefaultBodyLine(int targetIndex) {
        printStreamWrapper.printlnWithIndentLevel(
                String.format("%s: %s",
                        StringUtils.leftPad("default", 18, ' '),
                        targetIndex
                ),
                3
        );
    }

    @Override
    public void doPresent() {
        presentHeaderLine();
        presentBodyLines();
        presentEndLine();
    }
}
