package com.study.parser;

import com.study.io.BasicInputStream;
import com.study.type.U1;
import com.study.type.U2;
import com.study.type.constant.*;
import com.study.type.info.AttributeInfo;
import com.study.type.info.FieldInfo;
import com.study.type.info.MethodInfo;

/**
 * (基本的)解析器
 */
public class BasicParser {
    /**
     * 通过它来读取 class 文件
     */
    private BasicInputStream basicInputStream;

    /**
     * 解析结果
     */
    private ParseResult parseResult;

    public BasicParser(BasicInputStream basicInputStream) {
        this.basicInputStream = basicInputStream;
    }

    /**
     * 构建
     *
     * @return 构建结果
     */
    public ParseResult build() {
        this.parseResult = new ParseResult();

        fillMagic();

        fillMinorVersion();
        fillMajorVersion();

        fillConstantPoolCount();
        fillConstantPool();

        fillAccessFlags();
        fillThisClass();
        fillSuperClass();

        fillInterfacesCount();
        fillInterfaces();

        fillFieldsCount();
        fillFields();

        fillMethodsCount();
        fillMethods();

        fillAttributesCount();
        fillAttributes();

        makeSure();

        return this.parseResult;
    }

    private void fillMagic() {
        this.parseResult.setMagic(basicInputStream.readU4());
    }

    private void fillMinorVersion() {
        this.parseResult.setMinorVersion(basicInputStream.readU2());
    }

    private void fillMajorVersion() {
        this.parseResult.setMajorVersion(basicInputStream.readU2());
    }

    private void fillConstantPoolCount() {
        this.parseResult.setConstantPoolCount(basicInputStream.readU2());
    }

    private void fillConstantPool() {
        int count = this.parseResult.getConstantPoolCount().toInt();
        AbstractConstant[] constantPool = new AbstractConstant[count];
        for (int i = 1; i < count; i++) {
            int tag = basicInputStream.readU1().toInt();
            constantPool[i] = build(tag);

            if (!occupyOneSlot(constantPool[i])) {
                i++;
            }
        }
        ConstantPoolHolder.setConstantPool(constantPool);
        this.parseResult.setConstantPool(constantPool);
    }

    private void fillAccessFlags() {
        this.parseResult.setAccessFlags(basicInputStream.readU2());
    }

    private void fillThisClass() {
        this.parseResult.setThisClass(basicInputStream.readU2());
    }

    private void fillSuperClass() {
        this.parseResult.setSuperClass(basicInputStream.readU2());
    }

    private void fillInterfacesCount() {
        this.parseResult.setInterfacesCount(basicInputStream.readU2());
    }

    private void fillInterfaces() {
        int size = this.parseResult.getInterfacesCount().toInt();
        this.parseResult.setInterfaces(basicInputStream.readU2Array(size));
    }

    private void fillFieldsCount() {
        this.parseResult.setFieldsCount(basicInputStream.readU2());
    }

    private void fillFields() {
        int count = this.parseResult.getFieldsCount().toInt();
        FieldInfo[] fields = new FieldInfo[count];
        for (int i = 0; i < count; i++) {
            fields[i] = FieldInfo.build(basicInputStream);
        }
        this.parseResult.setFields(fields);
    }

    private void fillMethodsCount() {
        this.parseResult.setMethodsCount(basicInputStream.readU2());
    }

    private void fillMethods() {
        int count = this.parseResult.getMethodsCount().toInt();
        MethodInfo[] methods = new MethodInfo[count];
        for (int i = 0; i < count; i++) {
            methods[i] = MethodInfo.build(basicInputStream);
        }
        this.parseResult.setMethods(methods);
    }

    private void fillAttributesCount() {
        this.parseResult.setAttributesCount(basicInputStream.readU2());
    }

    private void fillAttributes() {
        int count = this.parseResult.getAttributesCount().toInt();
        AttributeInfo[] attributes = new AttributeInfo[count];
        for (int i = 0; i < count; i++) {
            attributes[i] = AttributeInfo.build(basicInputStream);
        }
        this.parseResult.setAttributes(attributes);
    }

    private AbstractConstant build(int tag) {
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

    private void makeSure() {
        if (!basicInputStream.justFinished()) {
            throw new AssertionError();
        }
    }

    private boolean occupyOneSlot(AbstractConstant constant) {
        return !ConstantDouble.class.isInstance(constant) &&
                !ConstantLong.class.isInstance(constant);
    }
}
