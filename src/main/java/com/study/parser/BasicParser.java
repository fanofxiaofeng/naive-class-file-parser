package com.study.parser;

import com.study.io.BasicInputStream;
import com.study.type.ConstantPool;
import com.study.type.U2;
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
        parseResult = new ParseResult();

        fillMagic();

        fillVersion();

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

        return parseResult;
    }

    private void fillMagic() {
        parseResult.setMagic(basicInputStream.readU4());
    }

    private void fillVersion() {
        parseResult.setMinorVersion(basicInputStream.readU2());
        parseResult.setMajorVersion(basicInputStream.readU2());
    }

    private void fillConstantPool() {
        U2 count = basicInputStream.readU2();
        ConstantPool constantPool = new ConstantPool.Builder().build(count, basicInputStream);
        ConstantPoolHolder.setConstantPool(constantPool);
        parseResult.setConstantPool(constantPool);
    }

    private void fillAccessFlags() {
        parseResult.setAccessFlags(basicInputStream.readU2());
    }

    private void fillThisClass() {
        parseResult.setThisClass(basicInputStream.readU2());
    }

    private void fillSuperClass() {
        parseResult.setSuperClass(basicInputStream.readU2());
    }

    private void fillInterfacesCount() {
        parseResult.setInterfacesCount(basicInputStream.readU2());
    }

    private void fillInterfaces() {
        int size = parseResult.getInterfacesCount().toInt();
        parseResult.setInterfaces(basicInputStream.readU2Array(size));
    }

    private void fillFieldsCount() {
        parseResult.setFieldsCount(basicInputStream.readU2());
    }

    private void fillFields() {
        int count = parseResult.getFieldsCount().toInt();
        FieldInfo[] fields = new FieldInfo[count];
        for (int i = 0; i < count; i++) {
            fields[i] = FieldInfo.build(basicInputStream);
        }
        parseResult.setFields(fields);
    }

    private void fillMethodsCount() {
        parseResult.setMethodsCount(basicInputStream.readU2());
    }

    private void fillMethods() {
        int count = parseResult.getMethodsCount().toInt();
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
}
