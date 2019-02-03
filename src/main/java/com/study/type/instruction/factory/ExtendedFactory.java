package com.study.type.instruction.factory;

import com.study.io.CodeInputStream;
import com.study.type.U1;
import com.study.type.instruction.AbstractCmd;
import com.study.type.instruction.FakeCmd;

public class ExtendedFactory implements CmdFactory {
    private ExtendedFactory() {

    }

    private static ExtendedFactory instance = new ExtendedFactory();

    public static ExtendedFactory getInstance() {
        return instance;
    }

    @Override
    public AbstractCmd build(U1 ordinal, CodeInputStream codeInputStream) {
        return new FakeCmd(ordinal, "xx extended");
    }
}
