package com.study.present.attribute.ev;

import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.constant.leaf.ConstantUtf8;
import com.study.type.constant.leaf.LeafCpInfo;
import com.study.type.info.ElementValue;
import com.study.util.PrintStreamWrapper;

public class CaseOnePresenter extends ElementValuePresenter {

    public CaseOnePresenter(ParseResult result,
                            PrintStreamWrapper printStreamWrapper,
                            U2 elementNameIndex,
                            ElementValue elementValue,
                            int baseIndentLevel
    ) {
        super(result, printStreamWrapper, elementNameIndex, elementValue, baseIndentLevel);
    }

    @Override
    public int present() {
        ConstantPool constantPool = result.getConstantPool();
        String realValueDesc = buildValue();
        String key = constantPool.desc(elementNameIndex);
        printStreamWrapper.printlnWithIndentLevel(String.format("%s=%s", key, realValueDesc), baseIndentLevel);

        return 1;
    }

    private String buildRealValueDesc() {
        ConstantPool constantPool = result.getConstantPool();
        ElementValue.CaseOne elementValue = getElementValue(ElementValue.CaseOne.class);
        U2 constValueIndex = elementValue.getConstValueIndex();
        LeafCpInfo leafCpInfo = constantPool.get(constValueIndex, LeafCpInfo.class);
        String rawValueDesc = leafCpInfo.desc();
        return (leafCpInfo instanceof ConstantUtf8) ? ('"' + rawValueDesc + '"') : rawValueDesc;
    }

    @Override
    public String buildValue() {
        return buildRealValueDesc();
    }
}
