package com.study.present.attribute;

import com.study.parser.ParseResult;
import com.study.present.AbstractPresenter;
import com.study.util.PrintStreamWrapper;

public abstract class AbstractAttributePresenter extends AbstractPresenter {
    protected final int baseIndentLevel;

    protected AbstractAttributePresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, int baseIndentLevel) {
        super(result, printStreamWrapper);
        this.baseIndentLevel = baseIndentLevel;
    }
}
