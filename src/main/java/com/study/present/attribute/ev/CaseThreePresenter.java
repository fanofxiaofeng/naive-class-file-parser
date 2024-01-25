package com.study.present.attribute.ev;

import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.info.ElementValue;
import com.study.util.PrintStreamWrapper;

public class CaseThreePresenter extends ElementValuePresenter {

    public CaseThreePresenter(
            ParseResult result,
            PrintStreamWrapper printStreamWrapper,
            U2 elementNameIndex,
            ElementValue elementValue,
            int baseIndentLevel
    ) {
        super(result, printStreamWrapper, elementNameIndex, elementValue, baseIndentLevel);
    }

    @Override
    public int present() {
        printStreamWrapper.printlnWithIndentLevel(String.format("%s=class %s", buildName(), buildValue()), baseIndentLevel);

        return 1;
    }

    @Override
    public String buildValue() {
        ConstantPool constantPool = result.getConstantPool();
        U2 classInfoIndex = getElementValue(ElementValue.CaseThree.class).getClassInfoIndex();
        String value = constantPool.desc(classInfoIndex);
        return String.format("class %s", value);
    }
}
