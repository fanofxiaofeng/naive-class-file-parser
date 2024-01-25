package com.study.type.constant.compound;

import com.study.io.BasicInputStream;
import com.study.type.U1;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.constant.CpInfo;
import com.study.type.constant.leaf.*;

/**
 * The factory to build constant pool entries
 */
public class ConstantPoolFactory {
    public static CpInfo build(BasicInputStream basicInputStream) {
        int tag = basicInputStream.readU1().toInt();
        switch (tag) {
            case 1 -> {
                U2 length = basicInputStream.readU2();
                U1[] bytes = basicInputStream.readU1Array(length.toInt());
                return new ConstantUtf8(length, bytes);
            }
            case 3 -> {
                U4 bytes = basicInputStream.readU4();
                return new ConstantInteger(bytes);
            }
            case 4 -> {
                U4 bytes = basicInputStream.readU4();
                return new ConstantFloat(bytes);
            }
            case 5 -> {
                U4 highBytes = basicInputStream.readU4();
                U4 lowBytes = basicInputStream.readU4();
                return new ConstantLong(highBytes, lowBytes);
            }
            case 6 -> {
                U4 highBytes = basicInputStream.readU4();
                U4 lowBytes = basicInputStream.readU4();
                return new ConstantDouble(highBytes, lowBytes);
            }
            case 7 -> {
                U2 nameIndex = basicInputStream.readU2();
                return new ConstantClass(nameIndex);
            }
            case 8 -> {
                U2 stringIndex = basicInputStream.readU2();
                return new ConstantString(stringIndex);
            }
            case 9 -> {
                U2 classIndex = basicInputStream.readU2();
                U2 nameAndTypeIndex = basicInputStream.readU2();
                return new ConstantFieldref(classIndex, nameAndTypeIndex);
            }
            case 10 -> {
                U2 classIndex = basicInputStream.readU2();
                U2 nameAndTypeIndex = basicInputStream.readU2();
                return new ConstantMethodref(classIndex, nameAndTypeIndex);
            }
            case 11 -> {
                U2 classIndex = basicInputStream.readU2();
                U2 nameAndTypeIndex = basicInputStream.readU2();
                return new ConstantInterfaceMethodref(classIndex, nameAndTypeIndex);
            }
            case 12 -> {
                U2 nameIndex = basicInputStream.readU2();
                U2 descriptorIndex = basicInputStream.readU2();
                return new ConstantNameAndType(nameIndex, descriptorIndex);
            }
            case 15 -> {
                U1 referenceKind = basicInputStream.readU1();
                U2 referenceIndex = basicInputStream.readU2();
                return new ConstantMethodHandle(referenceKind, referenceIndex);
            }
            case 16 -> {
                U2 descriptorIndex = basicInputStream.readU2();
                return new ConstantMethodType(descriptorIndex);
            }
            case 18 -> {
                U2 bootstrapMethodAttrIndex = basicInputStream.readU2();
                U2 nameAndTypeIndex = basicInputStream.readU2();
                return new ConstantInvokeDynamic(bootstrapMethodAttrIndex, nameAndTypeIndex);
            }
            default -> throw new RuntimeException(String.format("Tag %s is not supported yet!", tag));
        }
    }
}
