package com.study.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.constant.AbstractConstant;
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
            case 0xa3:
                return new ThreeByteCmd(ordinal, "if_icmpgt", codeInputStream) {
                    @Override
                    public String desc(int index, AbstractConstant[] constantPool) {
                        StringBuilder stringBuilder = new StringBuilder(super.desc(index, constantPool));
                        extentTo(stringBuilder);
                        stringBuilder.append(combine().toInt() + index);
                        return stringBuilder.toString();
                    }
                };
        }
        return new FakeCmd(ordinal, "xx comparision");
    }
}
