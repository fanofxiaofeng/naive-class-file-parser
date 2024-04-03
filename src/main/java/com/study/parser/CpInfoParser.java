package com.study.parser;

import com.study.io.ContentReader;
import com.study.type.U1;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.constant.CpInfo;
import com.study.type.constant.compound.*;
import com.study.type.constant.leaf.*;

public class CpInfoParser extends AbstractParser<CpInfo> {
    public CpInfoParser(ContentReader contentReader) {
        super(contentReader);
    }

    @Override
    public CpInfo parse() {
        int tag = contentReader.readU1().toInt();
        switch (tag) {
            case 1 -> {
                U2 length = contentReader.readU2();
                U1[] bytes = contentReader.readU1Array(length.toInt());
                return new ConstantUtf8(length, bytes);
            }
            case 3 -> {
                U4 bytes = contentReader.readU4();
                return new ConstantInteger(bytes);
            }
            case 4 -> {
                U4 bytes = contentReader.readU4();
                return new ConstantFloat(bytes);
            }
            case 5 -> {
                U4 highBytes = contentReader.readU4();
                U4 lowBytes = contentReader.readU4();
                return new ConstantLong(highBytes, lowBytes);
            }
            case 6 -> {
                U4 highBytes = contentReader.readU4();
                U4 lowBytes = contentReader.readU4();
                return new ConstantDouble(highBytes, lowBytes);
            }
            case 7 -> {
                U2 nameIndex = contentReader.readU2();
                return new ConstantClass(nameIndex);
            }
            case 8 -> {
                U2 stringIndex = contentReader.readU2();
                return new ConstantString(stringIndex);
            }
            case 9 -> {
                U2 classIndex = contentReader.readU2();
                U2 nameAndTypeIndex = contentReader.readU2();
                return new ConstantFieldref(classIndex, nameAndTypeIndex);
            }
            case 10 -> {
                U2 classIndex = contentReader.readU2();
                U2 nameAndTypeIndex = contentReader.readU2();
                return new ConstantMethodref(classIndex, nameAndTypeIndex);
            }
            case 11 -> {
                U2 classIndex = contentReader.readU2();
                U2 nameAndTypeIndex = contentReader.readU2();
                return new ConstantInterfaceMethodref(classIndex, nameAndTypeIndex);
            }
            case 12 -> {
                U2 nameIndex = contentReader.readU2();
                U2 descriptorIndex = contentReader.readU2();
                return new ConstantNameAndType(nameIndex, descriptorIndex);
            }
            case 15 -> {
                U1 referenceKind = contentReader.readU1();
                U2 referenceIndex = contentReader.readU2();
                return new ConstantMethodHandle(referenceKind, referenceIndex);
            }
            case 16 -> {
                U2 descriptorIndex = contentReader.readU2();
                return new ConstantMethodType(descriptorIndex);
            }
            case 18 -> {
                U2 bootstrapMethodAttrIndex = contentReader.readU2();
                U2 nameAndTypeIndex = contentReader.readU2();
                return new ConstantInvokeDynamic(bootstrapMethodAttrIndex, nameAndTypeIndex);
            }
            default -> throw new IllegalArgumentException(String.format("Tag %s is not supported yet!", tag));
        }
    }
}
