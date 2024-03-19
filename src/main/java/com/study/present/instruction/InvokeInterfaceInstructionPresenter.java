package com.study.present.instruction;

import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.constant.compound.ConstantInterfaceMethodref;
import com.study.type.instruction.InvokeInterfaceInstruction;
import com.study.util.PrintStreamWrapper;

public class InvokeInterfaceInstructionPresenter extends AbstractInstructionPresenter {

    private final InvokeInterfaceInstruction instruction;

    public InvokeInterfaceInstructionPresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, InvokeInterfaceInstruction instruction) {
        super(result, printStreamWrapper);
        if (!instruction.getName().equals("invokeinterface")) {
            throw new IllegalArgumentException();
        }
        this.instruction = instruction;
    }

    @Override
    public void doPresent() {
        String indexPart = buildIndexPart(instruction);
        presentWithDetail(indexPart, combineNameAndOperandDesc(instruction), buildDetail());
    }

    private String buildDetail() {
        ConstantPool constantPool = result.getConstantPool();
        ConstantInterfaceMethodref constantInterfaceMethodref = constantPool.get(instruction.combine(), ConstantInterfaceMethodref.class);
        U2 classIndex = constantInterfaceMethodref.getClassIndex();
        if (constantPool.detail(result.getThisClass()).equals(constantPool.detail(classIndex))) {
            return String.format("InterfaceMethod %s", constantPool.detail(constantInterfaceMethodref.getNameAndTypeIndex()));
        }
        return String.format("InterfaceMethod %s", constantPool.detail(instruction.combine()));
    }
}
