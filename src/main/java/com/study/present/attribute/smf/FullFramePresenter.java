package com.study.present.attribute.smf;

import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.info.frame.FullFrame;
import com.study.type.info.verification.VerificationTypeInfo;
import com.study.util.PrintStreamWrapper;

import java.util.StringJoiner;

public class FullFramePresenter extends AbstractStackMapFramePresenter<FullFrame> {

    public FullFramePresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, FullFrame frame, int baseIndentLevel) {
        super(result, printStreamWrapper, frame, baseIndentLevel);
    }

    @Override
    public void doPresent() {
        presentHeaderLine("full_frame");
        presentDetails();
    }

    private void presentDetails() {
        printStreamWrapper.printlnWithIndentLevel(String.format("offset_delta = %s", frame.getOffsetDelta().toInt()), baseIndentLevel + 1);

        ConstantPool constantPool = result.getConstantPool();
        StringJoiner joiner = new StringJoiner(", ");
        for (VerificationTypeInfo local : frame.getLocals()) {
            joiner.add(local.desc(constantPool));
        }
        printStreamWrapper.printlnWithIndentLevel(String.format("locals = [ %s ]", joiner), baseIndentLevel + 1);

        joiner = new StringJoiner(", ");
        for (VerificationTypeInfo local : frame.getStack()) {
            joiner.add(local.desc(constantPool));
        }
        if (joiner.length() > 0) {
            printStreamWrapper.printlnWithIndentLevel(String.format("stack = [ %s ]", joiner), baseIndentLevel + 1);
        } else {
            printStreamWrapper.printlnWithIndentLevel("stack = []", baseIndentLevel + 1);
        }
    }
}
