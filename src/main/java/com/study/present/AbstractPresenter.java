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

    public int present() {
        int cnt1 = printStreamWrapper.getPrintlnCount();

        doPresent();

        int cnt2 = printStreamWrapper.getPrintlnCount();
        return cnt2 - cnt1;
    }

    public abstract void doPresent();

    protected String buildHeaderLine(String... components) {
        StringJoiner joiner = new StringJoiner(" ");
        Arrays.stream(components).filter(e -> !e.isEmpty()).forEach(joiner::add);
        return joiner + ";";
    }

    protected String smartJoin(String... components) {
        StringJoiner joiner = new StringJoiner(" ");
        Arrays.stream(components).filter(e -> !e.isEmpty()).forEach(joiner::add);
        return joiner.toString();
    }
}
