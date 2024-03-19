package com.study.present.instruction;

import com.study.parser.ParseResult;
import com.study.present.AbstractPresenter;
import com.study.type.instruction.AbstractInstruction;
import com.study.util.PrintStreamWrapper;
import org.apache.commons.lang3.StringUtils;

public abstract class AbstractInstructionPresenter extends AbstractPresenter {

    protected int baseIndentLevel = 3;

    private static final int PAD_SIZE_FOR_INDEX = 4;

    public AbstractInstructionPresenter(ParseResult result, PrintStreamWrapper printStreamWrapper) {
        super(result, printStreamWrapper);
    }

    protected void presentWithDetail(String indexPart, String temp, String detail) {
        String content = String.format(
                "%s: %s // %s",
                indexPart,
                temp,
                detail
        );
        printStreamWrapper.printlnWithIndentLevel(content, baseIndentLevel);
    }

    protected String combineNameAndOperandDesc(AbstractInstruction instruction) {
        String namePart = StringUtils.rightPad(instruction.getName(), 13);
        String operandDesc = instruction.operandDesc().orElseThrow();
        return StringUtils.rightPad(String.format("%s %s", namePart, operandDesc), 33);
    }

    protected String buildIndexPart(AbstractInstruction instruction) {
        return StringUtils.leftPad("" + instruction.getStartIndex(), PAD_SIZE_FOR_INDEX, ' ');
    }
}
