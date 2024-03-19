package com.study.present.instruction;

import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.constant.compound.ConstantInterfaceMethodref;
import com.study.type.constant.compound.ConstantMemberRef;
import com.study.type.constant.compound.ConstantMethodref;
import com.study.type.instruction.ThreeByteInstruction;
import com.study.util.PrintStreamWrapper;

import java.util.Set;

public class ThreeInvokeInstructionPresenter extends AbstractInstructionPresenter {

    private final ThreeByteInstruction instruction;

    public ThreeInvokeInstructionPresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, ThreeByteInstruction instruction, int baseIndentLevel) {
        super(result, printStreamWrapper);
        if (!Set.of("invokevirtual", "invokestatic", "invokespecial").contains(instruction.getName())) {
            throw new IllegalArgumentException();
        }
        this.instruction = instruction;
        this.baseIndentLevel = baseIndentLevel;
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
            if (!(constantMemberRef instanceof ConstantMethodref) && !(constantMemberRef instanceof ConstantInterfaceMethodref)) {
                throw new IllegalArgumentException(String.format("constantMemberRef belongs to class: %s!", constantMemberRef.getClass().getCanonicalName()));
            }
            String type = constantMemberRef instanceof ConstantMethodref ? "Method" : "InterfaceMethod";
            return String.format("%s %s", type, constantPool.detail(constantMemberRef.getNameAndTypeIndex()));
        }
        return String.format("Method %s", constantPool.detail(instruction.combine()));
    }
}
