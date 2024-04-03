package com.study.present.attribute.smf;

import com.study.parser.ParseResult;
import com.study.present.AbstractPresenter;
import com.study.type.ConstantPool;
import com.study.type.info.frame.*;
import com.study.type.info.verification.VerificationTypeInfo;
import com.study.util.PrintStreamWrapper;

import java.util.StringJoiner;

public class StackMapFramePresenter extends AbstractPresenter {

    private final StackMapFrame stackMapFrame;
    private final int baseIndentLevel;

    public StackMapFramePresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, StackMapFrame stackMapFrame, int baseIndentLevel) {
        super(result, printStreamWrapper);
        this.stackMapFrame = stackMapFrame;
        this.baseIndentLevel = baseIndentLevel;
    }

    @Override
    public void doPresent() {
        if (stackMapFrame instanceof SameFrame specified) {
            new SameFramePresenter(result, printStreamWrapper, specified, baseIndentLevel).present();
            return;
        }
        if (stackMapFrame instanceof SameLocals1StackItemFrame specified) {
            new SameLocals1StackItemFramePresenter(result, printStreamWrapper, specified, baseIndentLevel).present();
            return;
        }
        if (stackMapFrame instanceof FullFrame specified) {
            new FullFramePresenter(result, printStreamWrapper, specified, baseIndentLevel).present();
            return;
        }
        if (stackMapFrame instanceof AppendFrame specified) {
            new AppendFramePresenter(result, printStreamWrapper, specified, baseIndentLevel).present();
            return;
        }
        if (stackMapFrame instanceof ChopFrame specified) {
            new ChopFramePresenter(result, printStreamWrapper, specified, baseIndentLevel).present();
            return;
        }
        if (stackMapFrame instanceof SameFrameExtended specified) {
            new SameFrameExtendedPresenter(result, printStreamWrapper, specified, baseIndentLevel).present();
            return;
        }
    }
}
