package com.study.present.attribute.smf;

import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.info.frame.AppendFrame;
import com.study.type.info.verification.VerificationTypeInfo;
import com.study.util.PrintStreamWrapper;

import java.util.StringJoiner;

public class AppendFramePresenter extends AbstractStackMapFramePresenter<AppendFrame> {

    public AppendFramePresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, AppendFrame frame, int baseIndentLevel) {
        super(result, printStreamWrapper, frame, baseIndentLevel);
    }

    @Override
    public void doPresent() {
        presentHeaderLine("append");
        presentDetails();
    }

    private void presentDetails() {
        printStreamWrapper.printlnWithIndentLevel(String.format("offset_delta = %d", frame.getOffsetDelta().toInt()), baseIndentLevel + 1);

        ConstantPool constantPool = result.getConstantPool();
        StringJoiner joiner = new StringJoiner(", ");
        for (VerificationTypeInfo local : frame.getLocals()) {
            joiner.add(local.desc(constantPool));
        }
        printStreamWrapper.printlnWithIndentLevel(String.format("locals = [ %s ]", joiner), baseIndentLevel + 1);
    }
}
