package com.study.present.attribute.ev;

import com.study.parser.ParseResult;
import com.study.present.AbstractPresenter;
import com.study.type.U2;
import com.study.type.info.ElementValue;
import com.study.util.PrintStreamWrapper;

public abstract class AbstractElementValuePresenter extends AbstractPresenter {

    protected final U2 elementNameIndex;

    protected final ElementValue elementValue;

    protected final int baseIndentLevel;

    protected AbstractElementValuePresenter(
            ParseResult result,
            PrintStreamWrapper printStreamWrapper,
            U2 elementNameIndex,
            ElementValue elementValue,
            int baseIndentLevel) {
        super(result, printStreamWrapper);
        this.elementNameIndex = elementNameIndex;
        this.elementValue = elementValue;
        this.baseIndentLevel = baseIndentLevel;
    }

    @Override
    public void doPresent() {
        String content = String.format("%s=%s", buildName(), buildValue());
        printStreamWrapper.printlnWithIndentLevel(content, baseIndentLevel);
    }

    private String buildName() {
        return result.getConstantPool().desc(elementNameIndex);
    }

    protected <T extends ElementValue> T getElementValue(Class<T> targetType) {
        if (!targetType.isAssignableFrom(elementValue.getClass())) {
            throw new IllegalArgumentException();
        }
        return (T) elementValue;
    }

    protected abstract String buildValue();
}
