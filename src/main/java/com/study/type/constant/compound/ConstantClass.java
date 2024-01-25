package com.study.type.constant.compound;

import com.study.constants.ConstantKind;
import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.constant.leaf.ConstantUtf8;

/**
 * Format
 * <p>
 * #5 = Class              #36            // java/lang/Object
 * #36 = Utf8               java/lang/Object
 */
public class ConstantClass extends CompoundCpInfo {
    /**
     * points to CONSTANT_Utf8_info
     */
    private final U2 nameIndex;

    public ConstantClass(U2 nameIndex) {
        super(ConstantKind.CONSTANT_Class);
        this.nameIndex = nameIndex;
    }

    @Override
    public String componentDesc(ConstantPool constantPool) {
        return "#" + nameIndex.toInt();
    }

    //    @Override
//    public String desc() {
//        return desc(nameIndex);
//    }

    @Override
    public String detail() {
        return detail(constantPool);
    }

    @Override
    public String detail(ConstantPool constantPool) {
        String detail = constantPool.get(nameIndex).desc().replaceAll("\\.", "/");
        if (detail.startsWith("[")) {
            return String.format("\"%s\"", detail);
        }

        return detail;
    }

    @Override
    public void validate() {
        if (this.tag != ConstantKind.CONSTANT_Class) {
            throw new AssertionError();
        }

        if (!(constantPool.get(nameIndex) instanceof ConstantUtf8)) {
            throw new AssertionError();
        }
    }

}
