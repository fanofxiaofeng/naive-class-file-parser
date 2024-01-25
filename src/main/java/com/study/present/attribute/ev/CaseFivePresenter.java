package com.study.present.attribute.ev;

import com.study.parser.ParseResult;
import com.study.type.U2;
import com.study.type.info.ElementValue;
import com.study.util.PrintStreamWrapper;

import java.util.ArrayList;
import java.util.List;

public class CaseFivePresenter extends ElementValuePresenter {

    public CaseFivePresenter(ParseResult result,
                             PrintStreamWrapper printStreamWrapper,
                             U2 elementNameIndex,
                             ElementValue elementValue,
                             int baseIndentLevel
    ) {
        super(result, printStreamWrapper, elementNameIndex, elementValue, baseIndentLevel);
        if (!(elementValue instanceof ElementValue.CaseFive)) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public int present() {
        int cnt1 = printStreamWrapper.getPrintlnCount();

        String content = String.format("%s=%s", buildName(), buildValue());
        printStreamWrapper.printlnWithIndentLevel(content, baseIndentLevel);

        int cnt2 = printStreamWrapper.getPrintlnCount();
        return cnt2 - cnt1;
    }

    @Override
    public String buildValue() {
        ElementValue.CaseFive elementValue = getElementValue(ElementValue.CaseFive.class);
        List<String> valueDescriptions = new ArrayList<>(elementValue.getValues().size());
        elementValue.getValues().forEach(value -> {
            String valueDescription =
                    new ElementValuePresenterBuilder().
                            build(result, printStreamWrapper, elementNameIndex, value, baseIndentLevel).
                            buildValue();
            valueDescriptions.add(valueDescription);
        });
        return String.format("[%s]", String.join(",", valueDescriptions));
    }
}
