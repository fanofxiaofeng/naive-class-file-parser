package com.study.present.attribute.smf;

import com.study.parser.ParseResult;
import com.study.type.info.frame.ChopFrame;
import com.study.util.PrintStreamWrapper;

public class ChopFramePresenter extends AbstractStackMapFramePresenter<ChopFrame> {
    public ChopFramePresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, ChopFrame frame, int baseIndentLevel) {
        super(result, printStreamWrapper, frame, baseIndentLevel);
    }

    @Override
    public void doPresent() {
        presentHeaderLine("chop");
        presentDetails();
    }

    private void presentDetails() {
        printStreamWrapper.printlnWithIndentLevel(String.format("offset_delta = %d", frame.getOffsetDelta().toInt()), baseIndentLevel + 1);
    }
}
