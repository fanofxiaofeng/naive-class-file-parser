package com.study.present.attribute.ev;

import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.constant.leaf.LeafCpInfo;
import com.study.type.info.ElementValue;
import com.study.util.ElementValueUtils;
import com.study.util.PrintStreamWrapper;

public class CaseOnePresenter extends AbstractElementValuePresenter {

    public CaseOnePresenter(ParseResult result,
                            PrintStreamWrapper printStreamWrapper,
                            U2 elementNameIndex,
                            ElementValue elementValue,
                            int baseIndentLevel
    ) {
        super(result, printStreamWrapper, elementNameIndex, elementValue, baseIndentLevel);
    }

    private String buildRealValueDesc(U2 constValueIndex) {
        ConstantPool constantPool = result.getConstantPool();
        LeafCpInfo leafCpInfo = constantPool.get(constValueIndex, LeafCpInfo.class);
        return leafCpInfo.desc();
    }

    @Override
    public String buildValue() {
        ElementValue.CaseOne elementValue = getElementValue(ElementValue.CaseOne.class);
        U2 constValueIndex = elementValue.getConstValueIndex();

        String realValueDesc = buildRealValueDesc(constValueIndex);

        Class<?> clazz = ElementValueUtils.toClass(elementValue.getTag());
        if (clazz == byte.class) {
            return "(byte) " + realValueDesc;
        }

        if (clazz == char.class) {
            int rawValue = Integer.parseInt(realValueDesc);
            return String.format("'%s'", (char) rawValue);
        }

        if (clazz == short.class) {
            return "(short) " + realValueDesc;
        }

        if (clazz == boolean.class) {
            int rawValue = Integer.parseInt(realValueDesc);
            return String.valueOf((rawValue > 0));
        }

        if (clazz == String.class) {
            return '"' + realValueDesc + '"';
        }

        return realValueDesc;
    }
}
