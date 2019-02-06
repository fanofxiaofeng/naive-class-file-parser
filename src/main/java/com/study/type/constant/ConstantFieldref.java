package com.study.type.constant;

import com.study.type.U1;
import com.study.type.U2;

public class ConstantFieldref extends AbstractConstant {
    private U2 classIndex;
    private U2 nameAndTypeIndex;

    public ConstantFieldref(U2 classIndex, U2 nameAndTypeIndex) {
        this.tag = new U1(9);
        this.classIndex = classIndex;
        this.nameAndTypeIndex = nameAndTypeIndex;
    }

    @Override
    public String desc() {
        return desc(classIndex, nameAndTypeIndex);
    }

    @Override
    public String type() {
        return "Fieldref";
    }

    @Override
    public void validate() {
        if (this.tag.toInt() != 9) {
            throw new AssertionError();
        }

        if (!ConstantClass.class.isInstance(constantPool[classIndex.toInt()])) {
            throw new AssertionError();
        }

        if (!ConstantNameAndType.class.isInstance(constantPool[nameAndTypeIndex.toInt()])) {
            throw new AssertionError();
        }
    }

    @Override
    public String detail() {
        return String.format("%s.%s",
                constantPool[classIndex.toInt()].detail(),
                constantPool[nameAndTypeIndex.toInt()].detail()
        );
    }
}
