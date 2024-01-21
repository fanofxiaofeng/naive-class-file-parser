package com.study.present;

import com.study.parser.ParseResult;

import java.io.PrintStream;

public abstract class AbstractPresenter implements Presenter {

    protected final ParseResult result;

    protected final PrintStream printStream;

    protected static final int DEFAULT_LEFT_PADDING_CNT = 2;
    protected static final int CORE_INFO_WIDTH = 40;

    protected AbstractPresenter(ParseResult result, PrintStream printStream) {
        this.result = result;
        this.printStream = printStream;
    }

    public abstract void present();

}
