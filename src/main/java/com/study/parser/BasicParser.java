package com.study.parser;

import com.study.io.BasicInputStream;
import com.study.type.constant.AbstractConstant;
import com.study.type.constant.ConstantDouble;
import com.study.type.constant.ConstantLong;
import com.study.type.constant.ConstantPoolFactory;
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
            constantPool[i] = ConstantPoolFactory.build(basicInputStream);

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
