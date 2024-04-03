package com.study.present.attribute.smf;

import com.study.parser.ParseResult;
import com.study.present.AbstractPresenter;
import com.study.type.info.frame.StackMapFrame;
import com.study.util.PrintStreamWrapper;

public abstract class AbstractStackMapFramePresenter<T extends StackMapFrame> extends AbstractPresenter {

    protected final T frame;
    protected final int baseIndentLevel;

    protected AbstractStackMapFramePresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, T frame, int baseIndentLevel) {
        super(result, printStreamWrapper);
        this.frame = frame;
        this.baseIndentLevel = baseIndentLevel;
    }

    protected void presentHeaderLine(String briefName) {
        String content = String.format("frame_type = %d /* %s */", frame.getFrameType().toInt(), briefName);
        printStreamWrapper.printlnWithIndentLevel(content, baseIndentLevel);
    }
}
