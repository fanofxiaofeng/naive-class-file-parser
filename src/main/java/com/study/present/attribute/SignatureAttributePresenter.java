package com.study.present.attribute;

import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.info.attribute.SignatureAttribute;
import com.study.util.PrintStreamWrapper;
import org.apache.commons.lang3.StringUtils;

public class SignatureAttributePresenter extends AbstractAttributePresenter<SignatureAttribute> {
    public SignatureAttributePresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, SignatureAttribute attribute, int baseIndentLevel) {
        super(result, printStreamWrapper, attribute, baseIndentLevel);
    }

    @Override
    public void doPresent() {
        ConstantPool constantPool = result.getConstantPool();
        U2 attributeNameIndex = attribute.getAttributeNameIndex();
        U2 signatureIndex = attribute.getSignatureIndex();
        String desc = String.format("%s: #%s",
                constantPool.desc(attributeNameIndex),
                signatureIndex.toInt());

        String detail = constantPool.desc(signatureIndex);

        printStreamWrapper.printlnWithIndentLevel(
                String.format(
                        "%s// %s",
                        StringUtils.rightPad(desc, 40),
                        detail
                ),
                baseIndentLevel
        );
    }
}
