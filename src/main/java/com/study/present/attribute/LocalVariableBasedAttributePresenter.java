package com.study.present.attribute;

import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.info.attribute.AbstractLocalVariableBasedTableAttribute;
import com.study.util.PrintStreamWrapper;
import org.apache.commons.lang3.StringUtils;

public class LocalVariableBasedAttributePresenter extends AbstractAttributePresenter<AbstractLocalVariableBasedTableAttribute> {
    public LocalVariableBasedAttributePresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, AbstractLocalVariableBasedTableAttribute attribute, int baseIndentLevel) {
        super(result, printStreamWrapper, attribute, baseIndentLevel);
    }

    @Override
    public void doPresent() {
        presentHeaderLine();
        presentDetails();
    }

    private void presentDetails() {
        printStreamWrapper.printlnWithIndentLevel("Start  Length  Slot  Name   Signature", baseIndentLevel + 1);

        ConstantPool constantPool = result.getConstantPool();
        attribute.getLocalVariableBasedTable().forEach(localVariableInfo -> {
            String line = String.format("%s   %s %s %s   %s",
                    StringUtils.leftPad(localVariableInfo.startPc().toInt() + "", 5),
                    StringUtils.leftPad(localVariableInfo.length().toInt() + "", 5),
                    StringUtils.leftPad(localVariableInfo.index().toInt() + "", 5),
                    StringUtils.leftPad(constantPool.desc(localVariableInfo.nameIndex()), 5),
                    constantPool.desc(localVariableInfo.descriptorIndex())
            );
            printStreamWrapper.printlnWithIndentLevel(line, baseIndentLevel + 1);
        });
    }
}
