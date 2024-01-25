package com.study.present.attribute.ev;

import com.study.constants.ElementValueCase;
import com.study.parser.ParseResult;
import com.study.present.AbstractPresenter;
import com.study.type.U2;
import com.study.type.info.ElementValue;
import com.study.util.PrintStreamWrapper;

public class ElementValuePresenter extends AbstractPresenter {
    protected final U2 elementNameIndex;

    protected final ElementValue elementValue;

    protected final int baseIndentLevel;

    protected ElementValuePresenter(
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

    public static ElementValuePresenter build(ParseResult result,
                                              PrintStreamWrapper printStreamWrapper,
                                              U2 elementNameIndex,
                                              ElementValue elementValue,
                                              int baseIndentLevel) {
        ElementValueCase elementValueCase = ElementValue.convert(elementValue);
        switch (elementValueCase) {
            case CASE_ONE -> {
                return new CaseOnePresenter(
                        result,
                        printStreamWrapper,
                        elementNameIndex,
                        elementValue,
                        baseIndentLevel
                );
            }
            case CASE_TWO -> {
                return new CaseTwoPresenter(
                        result,
                        printStreamWrapper,
                        elementNameIndex,
                        (ElementValue.CaseTwo) elementValue,
                        baseIndentLevel
                );
            }
            case CASE_THREE -> {
                return new CaseThreePresenter(
                        result,
                        printStreamWrapper,
                        elementNameIndex,
                        elementValue,
                        baseIndentLevel);
            }
            case CASE_FOUR -> {
                return new CaseFourPresenter(
                        result,
                        printStreamWrapper,
                        elementNameIndex,
                        elementValue,
                        baseIndentLevel
                );
            }
            case CASE_FIVE -> {
                return new CaseFivePresenter(
                        result,
                        printStreamWrapper,
                        elementNameIndex,
                        elementValue,
                        baseIndentLevel
                );
            }
            default -> throw new IllegalArgumentException();
        }
    }

    @Override
    public int present() {
        int cnt1 = printStreamWrapper.getPrintlnCount();

        ElementValueCase elementValueCase = ElementValue.convert(elementValue);
        switch (elementValueCase) {
            case CASE_ONE -> new CaseOnePresenter(
                    result,
                    printStreamWrapper,
                    elementNameIndex,
                    elementValue,
                    baseIndentLevel)
                    .present();
            case CASE_TWO -> new CaseTwoPresenter(
                    result,
                    printStreamWrapper,
                    elementNameIndex,
                    (ElementValue.CaseTwo) elementValue,
                    baseIndentLevel
            ).present();
            case CASE_THREE -> new CaseThreePresenter(
                    result,
                    printStreamWrapper,
                    elementNameIndex,
                    (ElementValue.CaseThree) elementValue,
                    baseIndentLevel).present();
            case CASE_FOUR -> new CaseFourPresenter(
                    result,
                    printStreamWrapper,
                    elementNameIndex,
                    elementValue,
                    baseIndentLevel
            ).present();
            case CASE_FIVE -> new CaseFivePresenter(
                    result,
                    printStreamWrapper,
                    elementNameIndex,
                    elementValue,
                    baseIndentLevel
            ).present();
            default -> throw new IllegalArgumentException();
        }

        int cnt2 = printStreamWrapper.getPrintlnCount();
        return cnt2 - cnt1;
    }

    public String buildName() {
        return result.getConstantPool().desc(elementNameIndex);
    }

    public String buildValue() {
        throw new UnsupportedOperationException();
    }

    protected <T extends ElementValue> T getElementValue(Class<T> targetType) {
        if (!targetType.isAssignableFrom(elementValue.getClass())) {
            throw new IllegalArgumentException();
        }
        return (T) elementValue;
    }
}
