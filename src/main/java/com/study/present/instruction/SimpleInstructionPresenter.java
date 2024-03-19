package com.study.present.instruction;

import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.instruction.AbstractInstruction;
import com.study.util.PrintStreamWrapper;
import org.apache.commons.lang3.StringUtils;

import java.util.Optional;

public class SimpleInstructionPresenter extends AbstractInstructionPresenter {
    private final AbstractInstruction instruction;

    public SimpleInstructionPresenter(ParseResult result,
                                      PrintStreamWrapper printStreamWrapper,
                                      AbstractInstruction instruction
    ) {
        super(result, printStreamWrapper);
        this.instruction = instruction;
    }

    @Override
    public void doPresent() {
        ConstantPool constantPool = result.getConstantPool();
        String indexPart = buildIndexPart(instruction);
        String namePart = instruction.getName();
        switch (instruction.size()) {
            case 1 ->
                    printStreamWrapper.printlnWithIndentLevel(String.format("%s: %s", indexPart, namePart), baseIndentLevel);
            case 2, 3, 4, 5 -> {
                Optional<String> operandDesc = instruction.operandDesc();
                if (operandDesc.isPresent()) {
                    namePart = StringUtils.rightPad(namePart, 13);
                    Optional<String> detail = instruction.detail(constantPool);
                    if (detail.isPresent()) {
                        presentWithDetail(indexPart, combineNameAndOperandDesc(instruction), detail.get());
                    } else {
                        printStreamWrapper.printlnWithIndentLevel(String.format("%s: %s %s", indexPart, namePart, operandDesc.get()), baseIndentLevel);
                    }
                } else {
                    printStreamWrapper.printlnWithIndentLevel("todo...??", baseIndentLevel);
                }
            }
            default -> printStreamWrapper.printlnWithIndentLevel("todo...", baseIndentLevel);
        }
    }
}
