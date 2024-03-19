package com.study.present.instruction;

import com.study.parser.ParseResult;
import com.study.type.instruction.factory.TableSwitchInstruction;
import com.study.util.PrintStreamWrapper;

public class TableSwitchInstructionPresenter extends VariableLengthInstructionPresenter {

    private final TableSwitchInstruction instruction;
/*
         1: tableswitch   { // 1 to 8
                       1: 48
                       2: 52
                       3: 56
                       4: 60
                       5: 65
                       6: 70
                       7: 75
                       8: 80
                 default: 85
            }
      19752: tableswitch   { // 42 to 45
                      42: 19784
                      43: 19789
                      44: 19794
                      45: 19799
                 default: 19804
            }
 */

    public TableSwitchInstructionPresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, TableSwitchInstruction instruction) {
        super(result, printStreamWrapper);
        this.instruction = instruction;
    }

    @Override
    public void presentHeaderLine() {
        int low = instruction.getLow().toSignedInt();
        int high = instruction.getHigh().toSignedInt();

        printStreamWrapper.printlnWithIndentLevel(
                String.format("%s: %s   { // %s to %s",
                        buildIndexPart(instruction),
                        instruction.getName(),
                        low,
                        high
                ),
                baseIndentLevel
        );
    }

    @Override
    public void presentBodyLines() {
        int low = instruction.getLow().toSignedInt();
        int high = instruction.getHigh().toSignedInt();
        for (int i = low; i <= high; i++) {
            presentNormalBodyLine(i, instruction.getOffsets().get(i - low).toSignedInt() + instruction.getStartIndex());
        }

        presentDefaultBodyLine(instruction.getDefault().toSignedInt() + instruction.getStartIndex());
    }
}