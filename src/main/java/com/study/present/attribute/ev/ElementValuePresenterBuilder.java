package com.study.present.attribute.ev;

import com.study.constants.ElementValueCase;
import com.study.parser.ParseResult;
import com.study.type.U2;
import com.study.type.info.ElementValue;
import com.study.util.PrintStreamWrapper;

public class ElementValuePresenterBuilder {

    public ElementValuePresenter build(ParseResult result,
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
}
