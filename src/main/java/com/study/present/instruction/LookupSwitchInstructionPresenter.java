package com.study.present.instruction;

import com.study.parser.ParseResult;
import com.study.type.U4;
import com.study.type.instruction.factory.LookupSwitchInstruction;
import com.study.util.PrintStreamWrapper;
import org.apache.commons.lang3.tuple.Pair;

public class LookupSwitchInstructionPresenter extends VariableLengthInstructionPresenter {

    private final LookupSwitchInstruction instruction;

    public LookupSwitchInstructionPresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, LookupSwitchInstruction instruction) {
        super(result, printStreamWrapper);
        this.instruction = instruction;
    }

    @Override
    public void presentHeaderLine() {
        int nPairs = instruction.getMatchOffsetPairs().size();
        printStreamWrapper.printlnWithIndentLevel(
                String.format("%s: %s  { // %s",
                        buildIndexPart(instruction),
                        instruction.getName(),
                        nPairs
                ),
                baseIndentLevel);
    }

    @Override
    public void presentBodyLines() {
        for (Pair<U4, U4> pair : instruction.getMatchOffsetPairs()) {
            presentNormalBodyLine(pair.getKey().toSignedInt(), pair.getValue().toSignedInt() + instruction.getStartIndex());
        }

        presentDefaultBodyLine(instruction.getDefault().toSignedInt() + instruction.getStartIndex());
    }
}