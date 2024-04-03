package com.study.present.attribute.smf;

import com.study.parser.ParseResult;
import com.study.type.info.frame.SameFrame;
import com.study.util.PrintStreamWrapper;

public class SameFramePresenter extends AbstractStackMapFramePresenter<SameFrame> {

    public SameFramePresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, SameFrame frame, int baseIndentLevel) {
        super(result, printStreamWrapper, frame, baseIndentLevel);
    }

    @Override
    public void doPresent() {
        presentHeaderLine("same");
    }
}
