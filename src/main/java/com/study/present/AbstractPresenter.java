package com.study.present;

import com.study.parser.ParseResult;
import com.study.util.PrintStreamWrapper;

import java.util.Arrays;
import java.util.StringJoiner;

public abstract class AbstractPresenter implements Presenter {

    protected final ParseResult result;

    protected final PrintStreamWrapper printStreamWrapper;
    protected static final int CORE_INFO_WIDTH = 40;

    protected AbstractPresenter(ParseResult result, PrintStreamWrapper printStreamWrapper) {
        this.result = result;
        this.printStreamWrapper = printStreamWrapper;
    }

    public abstract int present();

    protected String buildHeaderLine(String... components) {
        StringJoiner joiner = new StringJoiner(" ");
        Arrays.stream(components).filter(e -> !e.isEmpty()).forEach(joiner::add);
        return joiner + ";";
    }
}
