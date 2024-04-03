package com.study.present.attribute.smf;

import com.study.parser.ParseResult;
import com.study.type.info.frame.SameFrameExtended;
import com.study.util.PrintStreamWrapper;

public class SameFrameExtendedPresenter extends AbstractStackMapFramePresenter<SameFrameExtended> {
    public SameFrameExtendedPresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, SameFrameExtended frame, int baseIndentLevel) {
        super(result, printStreamWrapper, frame, baseIndentLevel);
    }

    @Override
    public void doPresent() {
        presentHeaderLine("same_frame_extended");
        presentDetails();
    }

    private void presentDetails() {
        String content = String.format("offset_delta = %s", frame.getOffsetDelta().toInt());
        printStreamWrapper.printlnWithIndentLevel(content, baseIndentLevel + 1);
    }
}
