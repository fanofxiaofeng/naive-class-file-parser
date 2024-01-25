package com.study.present.attribute.ev;

import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.info.ElementValue;
import com.study.util.PrintStreamWrapper;

public class CaseTwoPresenter extends ElementValuePresenter {

    private final ElementValue.CaseTwo elementValue;

    public CaseTwoPresenter(ParseResult result,
                            PrintStreamWrapper printStreamWrapper,
                            U2 elementNameIndex,
                            ElementValue.CaseTwo elementValue,
                            int baseIndentLevel
    ) {
        super(result, printStreamWrapper, elementNameIndex, elementValue, baseIndentLevel);
        this.elementValue = elementValue;
    }

    @Override
    public int present() {
        printStreamWrapper.printlnWithIndentLevel(String.format("%s=%s", buildName(), buildValue()), baseIndentLevel);

        return 1;
    }

    @Override
    public String buildValue() {
        ConstantPool constantPool = result.getConstantPool();
        U2 typeNameIndex = elementValue.getTypeNameIndex();
        U2 constNameIndex = elementValue.getConstNameIndex();
        String typeName = constantPool.desc(typeNameIndex);
        String constName = constantPool.desc(constNameIndex);
        return String.format("%s.%s", typeName, constName);
    }
}
