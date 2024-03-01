package com.study.present;

import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.constant.CpInfo;
import com.study.util.PrintStreamWrapper;
import org.apache.commons.lang3.tuple.Pair;

public class ConstantPoolPresenter extends AbstractPresenter {

    private final static String HEADER_LINE = "Constant pool:";

    protected ConstantPoolPresenter(ParseResult result, PrintStreamWrapper printStreamWrapper) {
        super(result, printStreamWrapper);
    }

    @Override
    public void doPresent() {
        printStreamWrapper.println(HEADER_LINE);

        ConstantPool constantPool = result.getConstantPool();

        for (Pair<Integer, CpInfo> pair : constantPool) {
            new CpInfoPresenter(result, printStreamWrapper, pair).present();
        }
    }
}
