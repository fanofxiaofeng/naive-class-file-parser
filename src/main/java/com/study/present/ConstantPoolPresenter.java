package com.study.present;

import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.constant.AbstractConstant;
import org.apache.commons.lang3.tuple.Pair;

import java.io.PrintStream;

public class ConstantPoolPresenter extends AbstractPresenter {

    private final static String HEADER_LINE = "Constant pool:";

    protected ConstantPoolPresenter(ParseResult result, PrintStream printStream) {
        super(result, printStream);
    }

    @Override
    public void present() {
        printStream.println(HEADER_LINE);

        ConstantPool constantPool = result.getConstantPool();

        for (Pair<Integer, AbstractConstant> pair : constantPool) {
//            item.validate();
            new ItemPresenter(result, printStream, pair).present();
        }
    }
}
