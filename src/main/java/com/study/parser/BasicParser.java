package com.study.parser;

import com.study.io.BasicInputStream;
import com.study.type.U1;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.constant.*;

public class BasicParser {

    private BasicInputStream basicInputStream;

    private U4 magic;
    private U2 minorVersion;
    private U2 majorVersion;
    private U2 constantPoolCount;
    private AbstractConstant[] constantPool;
    private U2 accessFlags;
    private U2 thisClass;
    private U2 superClass;

    public BasicParser(BasicInputStream basicInputStream) {
        this.basicInputStream = basicInputStream;
    }

    public BasicParser build() {
        return fillMagic().
                fillMinorVersion().fillMajorVersion().
                fillConstantPoolCount().fillConstantPool().
                fillAccessFlags().fillThisClass().fillSuperClass();
    }

    private BasicParser fillMagic() {
        this.magic = basicInputStream.readU4();
        return this;
    }

    private BasicParser fillMinorVersion() {
        this.minorVersion = basicInputStream.readU2();
        return this;
    }

    private BasicParser fillMajorVersion() {
        this.majorVersion = basicInputStream.readU2();
        return this;
    }

    private BasicParser fillConstantPoolCount() {
        this.constantPoolCount = basicInputStream.readU2();
        return this;
    }

    private BasicParser fillConstantPool() {
        int count = constantPoolCount.toInt();
        this.constantPool = new AbstractConstant[count];
        for (int i = 1; i < count; i++) {
            int type = basicInputStream.readU1().toInt();
            AbstractConstant constant = build(type);
            System.out.println(i + " " + constant.desc());
            this.constantPool[i] = constant;
        }
        return this;
    }

    private BasicParser fillAccessFlags() {
        this.accessFlags = basicInputStream.readU2();
        return this;
    }


    private BasicParser fillThisClass() {
        this.thisClass = basicInputStream.readU2();
        return this;
    }

    private BasicParser fillSuperClass() {
        this.superClass = basicInputStream.readU2();
        return this;
    }

    private AbstractConstant build(int type) {
//        System.out.println(type);
        switch (type) {
            case 1: {
                U2 length = basicInputStream.readU2();
                int size = length.toInt();
                U1[] bytes = new U1[size];
                for (int i = 0; i < size; i++) {
                    bytes[i] = basicInputStream.readU1();
                }
                return new ConstantUtf8(length, bytes);
            }
            case 3:
                return new ConstantInteger(basicInputStream.readU4());
            case 7:
                return new ConstantClass(basicInputStream.readU2());
            case 9:
                return new ConstantFieldref(basicInputStream.readU2(), basicInputStream.readU2());
            case 10:
                return new ConstantMethodref(basicInputStream.readU2(), basicInputStream.readU2());
            case 12:
                return new ConstantNameAndType(basicInputStream.readU2(), basicInputStream.readU2());
            default:
                System.out.println("Not supported yet!");
        }
        return null;

    }


    public void show() {
        System.out.println("Magic: " + magic.toString());

        System.out.println(String.format("Version: %s.%s", majorVersion.toString(10), minorVersion.toString(10)));
        System.out.println("constant pool count: " + constantPoolCount.toString(10));
        System.out.println("access flags: " + accessFlags.toString());
        System.out.println("this class: " + thisClass.toString());
        System.out.println("super class: " + superClass.toString());
    }
}
