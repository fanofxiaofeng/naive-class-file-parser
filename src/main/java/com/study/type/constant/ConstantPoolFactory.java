package com.study.type.constant;

import com.study.io.BasicInputStream;
import com.study.type.U1;
import com.study.type.U2;

/**
 * 常量池 entry 的工厂
 */
public class ConstantPoolFactory {
    public static AbstractConstant build(BasicInputStream basicInputStream) {
        int tag = basicInputStream.readU1().toInt();
        switch (tag) {
            case 1: {
                U2 length = basicInputStream.readU2();
                U1[] bytes = basicInputStream.readU1Array(length.toInt());
                return new ConstantUtf8(length, bytes);
            }
            case 3:
                return new ConstantInteger(basicInputStream.readU4());
            case 4:
                return new ConstantFloat(basicInputStream.readU4());
            case 5:
                return new ConstantLong(basicInputStream.readU4(), basicInputStream.readU4());
            case 6:
                return new ConstantDouble(basicInputStream.readU4(), basicInputStream.readU4());
            case 7:
                return new ConstantClass(basicInputStream.readU2());
            case 8:
                return new ConstantString(basicInputStream.readU2());
            case 9:
                return new ConstantFieldref(basicInputStream.readU2(), basicInputStream.readU2());
            case 10:
                return new ConstantMethodref(basicInputStream.readU2(), basicInputStream.readU2());
            case 11:
                return new ConstantInterfaceMethodref(basicInputStream.readU2(), basicInputStream.readU2());
            case 12:
                return new ConstantNameAndType(basicInputStream.readU2(), basicInputStream.readU2());
            default:
                throw new RuntimeException(String.format("Tag %s is not supported yet!", tag));
        }
    }
}
