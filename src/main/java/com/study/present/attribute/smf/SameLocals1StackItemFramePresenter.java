package com.study.present.attribute.smf;

import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.info.frame.SameLocals1StackItemFrame;
import com.study.type.info.verification.VerificationTypeInfo;
import com.study.util.PrintStreamWrapper;

import java.util.StringJoiner;

public class SameLocals1StackItemFramePresenter extends AbstractStackMapFramePresenter<SameLocals1StackItemFrame> {
    public SameLocals1StackItemFramePresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, SameLocals1StackItemFrame frame, int baseIndentLevel) {
        super(result, printStreamWrapper, frame, baseIndentLevel);
    }

    @Override
    public void doPresent() {
        presentHeaderLine("same_locals_1_stack_item");

        VerificationTypeInfo[] stack = frame.getStack();

        ConstantPool constantPool = result.getConstantPool();
        StringJoiner joiner = new StringJoiner(", ");
        for (VerificationTypeInfo typeInfo : stack) {
            joiner.add(typeInfo.desc(constantPool));
        }
        // todo: probably still need to consider empty stack case...
        String content = String.format("stack = [ %s ]", joiner);
        printStreamWrapper.printlnWithIndentLevel(content, baseIndentLevel + 1);
    }
}
