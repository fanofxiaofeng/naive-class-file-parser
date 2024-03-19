package com.study.present.instruction;

import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.constant.compound.ConstantMemberRef;
import com.study.type.instruction.ThreeByteInstruction;
import com.study.util.PrintStreamWrapper;

public class AccessFieldInstructionPresenter extends AbstractInstructionPresenter {

    private final ThreeByteInstruction instruction;

    public AccessFieldInstructionPresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, ThreeByteInstruction instruction) {
        super(result, printStreamWrapper);
        this.instruction = instruction;
    }

    @Override
    public void doPresent() {
        String indexPart = buildIndexPart(instruction);
        presentWithDetail(indexPart, combineNameAndOperandDesc(instruction), buildDetail());
    }

    private String buildDetail() {
        ConstantPool constantPool = result.getConstantPool();
        ConstantMemberRef constantMemberRef = constantPool.get(instruction.combine(), ConstantMemberRef.class);
        U2 classIndex = constantMemberRef.getClassIndex();
        if (constantPool.detail(result.getThisClass()).equals(constantPool.detail(classIndex))) {
            return String.format("Field %s", constantPool.detail(constantMemberRef.getNameAndTypeIndex()));
        }
        return String.format("Field %s", constantPool.detail(instruction.combine()));
    }
}
