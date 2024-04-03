package com.study.parser;

import com.study.io.ContentReader;
import com.study.type.ConstantPool;
import com.study.type.constant.CpInfo;
import com.study.type.constant.leaf.ConstantDouble;
import com.study.type.constant.leaf.ConstantLong;

import java.util.Arrays;

public class ConstantPoolParser extends AbstractParser<ConstantPool> {

    protected ConstantPoolParser(ContentReader contentReader) {
        super(contentReader);
    }

    @Override
    public ConstantPool parse() {
        int count = parseCount();

        CpInfo[] items = new CpInfo[count];
        Parser<CpInfo> cpInfoParser = new CpInfoParser(contentReader);
        for (int i = 1; i < count; i++) {
            items[i] = cpInfoParser.parse();
            if (!occupyOneSlot(items[i])) {
                i++;
            }
        }

        return new ConstantPool(count, Arrays.asList(items));
    }

    private boolean occupyOneSlot(CpInfo constant) {
        return !(constant instanceof ConstantDouble) &&
                !(constant instanceof ConstantLong);
    }
}
