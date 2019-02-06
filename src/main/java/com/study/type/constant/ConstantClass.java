package com.study.type.constant;

import com.study.type.U1;
import com.study.type.U2;

/**
 * 格式参考
 * <p>
 * #5 = Class              #36            // java/lang/Object
 * #36 = Utf8               java/lang/Object
 */
public class ConstantClass extends AbstractConstant {
    /**
     * points to CONSTANT_Utf8_info
     */
    private U2 nameIndex;

    public ConstantClass(U2 nameIndex) {
        this.tag = new U1(7);
        this.nameIndex = nameIndex;
    }

    @Override
    public String desc() {
        return desc(nameIndex);
    }

    @Override
    public String type() {
        return "Class";
    }

    @Override
    public String detail() {
        String detail = constantPool[nameIndex.toInt()].desc().replaceAll("\\.", "/");
        if (detail.startsWith("[")) {
            return String.format("\"%s\"", detail);
        } else {
            return detail;
        }
    }

    @Override
    public void validate() {
        if (this.tag.toInt() != 7) {
            throw new AssertionError();
        }

        if (!ConstantUtf8.class.isInstance(constantPool[this.nameIndex.toInt()])) {
            throw new AssertionError();
        }
    }
}
