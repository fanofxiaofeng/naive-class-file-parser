package com.study.parser;

import com.study.type.ConstantPool;
import com.study.type.Fields;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.info.AttributeInfo;
import com.study.type.info.MethodInfo;

import java.io.PrintStream;

import static com.study.constants.Const.MAGIC_NUMBER;

public class ParseResult {
    /**
     * Magic number
     */
    private U4 magic;

    /**
     * minor version
     */
    private U2 minorVersion;

    /**
     * major version
     */
    private U2 majorVersion;

    private ConstantPool constantPool;
    private U2 accessFlags;
    private U2 thisClass;
    private U2 superClass;
    private U2 interfacesCount;
    private U2[] interfaces;
//    private U2 fieldsCount;
//    private FieldInfo[] fields;
    private Fields fields;
    private U2 methodsCount;
    private MethodInfo[] methods;
    private U2 attributesCount;
    private AttributeInfo[] attributes;

    /**
     * To output the analysis result
     */
    private PrintStream printStream;


    public void show(PrintStream printStream) {
        this.printStream = printStream;

        if (!magic.toString().equals(MAGIC_NUMBER)) {
            throw new AssertionError("Magic number is not as expected!");
        }



//        showFields();

//        if (fieldsCount.toInt() > 0 && methodsCount.toInt() > 0) {
//            printStream.println();
//        }

        showMethods();

        showAttributes();
    }



//    private void showFields() {
//        int count = this.fieldsCount.toInt();
//        StringJoiner joiner = new StringJoiner("\n");
//        for (int i = 0; i < count; i++) {
//            joiner.add(fields[i].desc());
//        }
//        printStream.print(joiner);
//    }

    private void showMethods() {
        int count = this.methodsCount.toInt();
        for (int i = 0; i < count; i++) {
            printStream.println(methods[i].desc());
            if (i + 1 < count) {
                printStream.println();
            }
        }
    }

    private void showAttributes() {
        StringBuilder stringBuilder = new StringBuilder();
        for (AttributeInfo attribute : attributes) {
            stringBuilder.append(attribute.describe(0));
        }
        printStream.println(stringBuilder);
    }

    public void setMagic(U4 magic) {
        this.magic = magic;
    }

    public U4 getMagic() {
        return magic;
    }

    public void setMinorVersion(U2 minorVersion) {
        this.minorVersion = minorVersion;
    }

    public U2 getMinorVersion() {
        return minorVersion;
    }

    public void setMajorVersion(U2 majorVersion) {
        this.majorVersion = majorVersion;
    }

    public U2 getMajorVersion() {
        return majorVersion;
    }


    public void setConstantPool(ConstantPool constantPool) {
        this.constantPool = constantPool;
    }

    public void setAccessFlags(U2 accessFlags) {
        this.accessFlags = accessFlags;
    }

    public void setThisClass(U2 thisClass) {
        this.thisClass = thisClass;
    }

    public void setSuperClass(U2 superClass) {
        this.superClass = superClass;
    }

    public U2 getInterfacesCount() {
        return interfacesCount;
    }

    public void setInterfacesCount(U2 interfacesCount) {
        this.interfacesCount = interfacesCount;
    }

    public void setInterfaces(U2[] interfaces) {
        this.interfaces = interfaces;
    }

    public void setFields(Fields fields) {
        this.fields = fields;
    }

    public Fields getFields() {
        return fields;
    }

    public U2 getMethodsCount() {
        return methodsCount;
    }

    public void setMethodsCount(U2 methodsCount) {
        this.methodsCount = methodsCount;
    }

    public void setMethods(MethodInfo[] methods) {
        this.methods = methods;
    }

    public U2 getAttributesCount() {
        return attributesCount;
    }

    public void setAttributesCount(U2 attributesCount) {
        this.attributesCount = attributesCount;
    }

    public void setAttributes(AttributeInfo[] attributes) {
        this.attributes = attributes;
    }

    public U2 getAccessFlags() {
        return accessFlags;
    }

    public U2 getThisClass() {
        return thisClass;
    }

    public ConstantPool getConstantPool() {
        return constantPool;
    }

    public U2 getSuperClass() {
        return superClass;
    }


}
