package com.study.parser;

import com.study.io.BasicInputStream;
import com.study.type.ConstantPool;
import com.study.type.constant.CpInfo;
import com.study.type.constant.leaf.ConstantDouble;
import com.study.type.constant.leaf.ConstantLong;

public class ConstantPoolParser extends AbstractParser<ConstantPool> {

    protected ConstantPoolParser(BasicInputStream basicInputStream) {
        super(basicInputStream);
    }

    @Override
    public ConstantPool parse() {
        int count = parseCount();

        CpInfo[] items = new CpInfo[count];
        Parser<CpInfo> cpInfoParser = new CpInfoParser(basicInputStream);
        for (int i = 1; i < count; i++) {
            items[i] = cpInfoParser.parse();
            if (!occupyOneSlot(items[i])) {
                i++;
            }
        }

        ConstantPool constantPool = new ConstantPool(count, items);

        // todo: remove the next line
        ConstantPoolHolder.setConstantPool(constantPool);

        return constantPool;
    }

    private boolean occupyOneSlot(CpInfo constant) {
        return !(constant instanceof ConstantDouble) &&
                !(constant instanceof ConstantLong);
    }
}
