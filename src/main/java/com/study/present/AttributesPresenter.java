package com.study.present;

import com.study.parser.ParseResult;
import com.study.present.attribute.AbstractAttributePresenter;
import com.study.util.PrintStreamWrapper;

public class AttributesPresenter extends AbstractPresenter {

    private final int baseIndentLevel = 0;

    public AttributesPresenter(ParseResult result, PrintStreamWrapper printStreamWrapper) {
        super(result, printStreamWrapper);
    }

    @Override
    public void doPresent() {
        result.getAttributes().forEach(attributeInfo -> {
            Presenter presenter = AbstractAttributePresenter.build(result, printStreamWrapper, attributeInfo, baseIndentLevel);
            presenter.present();
        });
    }
}
