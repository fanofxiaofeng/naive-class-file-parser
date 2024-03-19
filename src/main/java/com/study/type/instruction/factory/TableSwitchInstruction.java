package com.study.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.U4;
import com.study.type.instruction.AbstractInstruction;

import java.util.ArrayList;
import java.util.List;

public class TableSwitchInstruction extends AbstractInstruction {

    private final U4 _default;
    private final U4 low;
    private final U4 high;
    private final List<U4> offsets;

    public TableSwitchInstruction(int startIndex, U1 ordinal, CodeInputStream codeInputStream) {
        super(startIndex, ordinal);
        name = "tableswitch";

        while (codeInputStream.getIndex() % 4 != 0) {
            U1 _zero = codeInputStream.readU1();
            if (_zero.toInt() != 0) {
                throw new IllegalArgumentException("Failed to parse tableswitch instruction since it contains unexpected content!");
            }
        }

        // todo 逻辑细节可能有问题
        _default = codeInputStream.readU4();
        low = codeInputStream.readU4();
        high = codeInputStream.readU4();
        offsets = new ArrayList<>(high.toSignedInt() - low.toSignedInt() + 1);
        for (int i = low.toSignedInt(); i <= high.toSignedInt(); i++) {
            offsets.add(codeInputStream.readU4());
        }
    }

    @Override
    public int size() {
        return 0;
    }

    public U4 getDefault() {
        return _default;
    }

    public U4 getLow() {
        return low;
    }

    public U4 getHigh() {
        return high;
    }

    public List<U4> getOffsets() {
        return offsets;
    }
}
