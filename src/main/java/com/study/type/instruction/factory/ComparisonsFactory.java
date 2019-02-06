package com.study.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.instruction.AbstractCmd;
import com.study.type.instruction.FakeCmd;
import com.study.type.instruction.ThreeByteCmd;

public class ComparisonsFactory implements CmdFactory {
    private ComparisonsFactory() {

    }

    private static ComparisonsFactory instance = new ComparisonsFactory();

    public static ComparisonsFactory getInstance() {
        return instance;
    }

    @Override
    public AbstractCmd build(U1 ordinal, CodeInputStream codeInputStream) {
        switch (ordinal.toInt()) {
            case 0xa2:
                return new ThreeByteCmd(ordinal, "if_icmpge", codeInputStream) {

                };
            case 0xa3:
                return new ThreeByteCmd(ordinal, "if_icmpgt", codeInputStream) {
                    @Override
                    public String desc(int index) {
                        return String.format("%10s: %-14s%s", index, name, index + combine().toInt());
                    }
                };
        }
        return new FakeCmd(ordinal, "xx comparision");
    }
}
