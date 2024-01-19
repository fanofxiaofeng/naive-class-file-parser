package com.study.type.constant;

import com.study.constants.ConstantKind;
import com.study.type.U2;

import java.util.Optional;

/**
 * 格式参考
 * <p>
 * #12 = String             #37            // ~~
 */
public class ConstantString extends AbstractConstant {

    private final U2 stringIndex;

    public ConstantString(U2 stringIndex) {
        super(ConstantKind.CONSTANT_String);
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
        if (this.tag != ConstantKind.CONSTANT_String) {
            throw new AssertionError();
        }

        if (!(constantPool.get(stringIndex.toInt()) instanceof ConstantUtf8)) {
            throw new AssertionError();
        }
    }

    @Override
    public Optional<String> detail() {
        return Optional.of(constantPool.get(stringIndex.toInt()).desc());
    }
}
