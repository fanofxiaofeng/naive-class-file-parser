package com.study.present.attribute.ev;

import com.study.parser.ParseResult;
import com.study.present.AbstractPresenter;
import com.study.type.U2;
import com.study.util.PrintStreamWrapper;

public abstract class AbstractCasePresenter extends AbstractPresenter {
    protected final U2 elementNameIndex;

    protected final int baseIndentLevel;

    protected AbstractCasePresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, U2 elementNameIndex, int baseIndentLevel) {
        super(result, printStreamWrapper);
        this.elementNameIndex = elementNameIndex;
        this.baseIndentLevel = baseIndentLevel;
    }
}
