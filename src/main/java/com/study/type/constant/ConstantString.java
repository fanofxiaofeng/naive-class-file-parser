package com.study.type.constant;

import com.study.type.U1;
import com.study.type.U2;

/**
 * 格式参考
 * <p>
 * #12 = String             #37            // ~~
 */
public class ConstantString extends AbstractConstant {

    private U2 stringIndex;

    public ConstantString(U2 stringIndex) {
        this.tag = new U1(8);
        this.stringIndex = stringIndex;
    }

    @Override
    public String desc() {
        return desc(stringIndex);
    }

    @Override
    public String type() {
        return "String";
    }

    @Override
    public void validate() {
        if (this.tag.toInt() != 8) {
            throw new AssertionError();
        }

        if (!ConstantUtf8.class.isInstance(constantPool[stringIndex.toInt()])) {
            throw new AssertionError();
        }
    }

    @Override
    public String detail() {
        return constantPool[stringIndex.toInt()].desc();
    }
}
