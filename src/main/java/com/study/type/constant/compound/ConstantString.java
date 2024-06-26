package com.study.type.constant.compound;

import com.study.constants.ConstantKind;
import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.constant.leaf.ConstantUtf8;

/**
 * Format example:
 * <p>
 * #12 = String             #37            // ~~
 */
public class ConstantString extends CompoundCpInfo {

    private final U2 stringIndex;

    public ConstantString(U2 stringIndex) {
        super(ConstantKind.CONSTANT_String);
        this.stringIndex = stringIndex;
    }

    @Override
    public String componentDesc(ConstantPool constantPool) {
        return componentDescForSingleIndex(stringIndex);
    }

    @Override
    public void validate(ConstantPool constantPool) {
        if (!(constantPool.get(stringIndex) instanceof ConstantUtf8)) {
            throw new AssertionError();
        }
    }

    @Override
    public String detail(ConstantPool constantPool) {
        return constantPool.get(stringIndex).desc();
    }
}
