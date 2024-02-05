package com.study.present.attribute;

import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.constant.compound.ConstantClass;
import com.study.type.constant.compound.ConstantNameAndType;
import com.study.type.info.attribute.EnclosingMethodAttribute;
import com.study.util.PrintStreamWrapper;
import org.apache.commons.lang3.StringUtils;

public class EnclosingMethodAttributePresenter extends AbstractAttributePresenter<EnclosingMethodAttribute> {
    public EnclosingMethodAttributePresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, EnclosingMethodAttribute attribute, int baseIndentLevel) {
        super(result, printStreamWrapper, attribute, baseIndentLevel);
    }

    @Override
    public void doPresent() {
        String description = buildDescription();
        String details = buildDetails();

        printStreamWrapper.printlnWithIndentLevel(
                String.format("%s// %s",
                        StringUtils.rightPad(description, CORE_INFO_WIDTH),
                        details
                ),
                baseIndentLevel);
    }

    private String buildDescription() {
        ConstantPool constantPool = result.getConstantPool();

        return String.format("%s: #%s.#%s",
                constantPool.desc(attribute.getAttributeNameIndex()),
                attribute.getClassIndex().toInt(),
                attribute.getMethodIndex().toInt());
    }

    private String buildDetails() {
        ConstantPool constantPool = result.getConstantPool();

        U2 methodIndex = attribute.getMethodIndex();
        if (methodIndex.toInt() == 0) {
            return buildClassName(constantPool);
        }

        ConstantNameAndType nameAndType = constantPool.get(methodIndex, ConstantNameAndType.class);
        return String.format("%s.%s", buildClassName(constantPool), constantPool.desc(nameAndType.getNameIndex()));
    }

    private String buildClassName(ConstantPool constantPool) {
        ConstantClass constantClass = constantPool.get(attribute.getClassIndex(), ConstantClass.class);
        return constantClass.detail(constantPool).replace('/', '.');
    }
}
