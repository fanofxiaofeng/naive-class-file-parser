package com.study.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.U4;
import com.study.type.instruction.AbstractInstruction;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.List;

public class LookupSwitchInstruction extends AbstractInstruction {

    private final U4 _default;
    private final U4 nPairs;

    private final List<Pair<U4, U4>> matchOffsetPairs;

    public LookupSwitchInstruction(int startIndex, U1 ordinal, CodeInputStream codeInputStream) {
        super(startIndex, ordinal);
        name = "lookupswitch";

        while (codeInputStream.getIndex() % 4 != 0) {
            U1 _zero = codeInputStream.readU1();
            if (_zero.toInt() != 0) {
                throw new IllegalArgumentException("Failed to parse lookupswitch instruction since it contains unexpected content!");
            }
        }
        // todo 逻辑细节可能有问题
        _default = codeInputStream.readU4();
        nPairs = codeInputStream.readU4();
        matchOffsetPairs = new ArrayList<>(nPairs.toInt());
        for (int i = 0; i < nPairs.toInt(); i++) {
            matchOffsetPairs.add(Pair.of(codeInputStream.readU4(), codeInputStream.readU4()));
        }
    }

    @Override
    public int size() {
        return 0;
    }

    public U4 getDefault() {
        return _default;
    }

//    public U4 getnPairs() {
//        return nPairs;
//    }

    public List<Pair<U4, U4>> getMatchOffsetPairs() {
        return matchOffsetPairs;
    }
}
