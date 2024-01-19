package com.study.parser;

import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.constant.*;
import com.study.type.info.AttributeInfo;
import com.study.type.info.FieldInfo;
import com.study.type.info.MethodInfo;
import com.study.util.Extend;

import java.io.PrintStream;
import java.util.StringJoiner;

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

    //    private U2 constantPoolCount;
    private ConstantPool constantPool;
    private U2 accessFlags;
    private U2 thisClass;
    private U2 superClass;
    private U2 interfacesCount;
    private U2[] interfaces;
    private U2 fieldsCount;
    private FieldInfo[] fields;
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


        showCount();

        showConstantPool();

        printStream.println('{');

        showFields();

        if (fieldsCount.toInt() > 0 && methodsCount.toInt() > 0) {
            printStream.println();
        }

        showMethods();

        showAttributes();
    }

    private void showCount() {
        printStream.println(String.format("  interfaces: %d, fields: %d, methods: %d, attributes: %d",
                interfacesCount.toInt(), fieldsCount.toInt(), methodsCount.toInt(), attributesCount.toInt()));
    }

    private void showConstantPool() {
        printStream.println("Constant pool:");

        int count = this.constantPool.getCount().toInt();

        int index = 1;
        while (index < count) {
            // "  #42" 这种格式的字符串(leading whitespace 的数量是计算出来的)
            AbstractConstant constant = constantPool.get(index);
            constant.validate();

            StringBuilder stringBuilder = new StringBuilder();
            String format = withThreeWidthControl();
            stringBuilder.append(String.format(format, "#" + index, constant.getTag().getType(), constant.desc()));
            if (hasDetail(constant)) {
                Extend.extendTo(stringBuilder, 42);
                stringBuilder.append("// ").append(constant.detail());
            }

            rightTrim(stringBuilder);
            printStream.println(stringBuilder);

            if (occupyOneSlot(constant)) {
                index++;
            } else {
                index += 2;
            }
        }
    }

    private String withThreeWidthControl() {
        int count = this.constantPool.getCount().toInt();
        int width = String.format("  #%d", count).length();

        // partOneControl 是类似于 "%5s" 这样的字符串
        String partOneControl = String.format("%%%ds", width);
        String partTwoControl = "%-19s";
        String partThreeControl = "%s";
        return String.format("%s = %s%s", partOneControl, partTwoControl, partThreeControl);
    }

    /**
     * 删除右边的 whitespace, 逻辑参考了 {@link String#trim()}
     *
     * @param stringBuilder 要对它进行操作
     */
    private void rightTrim(StringBuilder stringBuilder) {
        while (stringBuilder.charAt(stringBuilder.length() - 1) <= ' ') {
            stringBuilder = stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }

    private boolean occupyOneSlot(AbstractConstant constant) {
        return !(constant instanceof ConstantDouble) &&
                !(constant instanceof ConstantLong);
    }

    // todo 类型可能有遗漏
    private boolean hasDetail(AbstractConstant constant) {
        return
                (constant instanceof ConstantMethodref) ||
                        (constant instanceof ConstantFieldref) ||
                        (constant instanceof ConstantNameAndType) ||
                        (constant instanceof ConstantString) ||
                        (constant instanceof ConstantClass) ||
                        (constant instanceof ConstantInterfaceMethodref)
                ;
    }

    private void showFields() {
        int count = this.fieldsCount.toInt();
        StringJoiner joiner = new StringJoiner("\n");
        for (int i = 0; i < count; i++) {
            joiner.add(fields[i].desc());
        }
        printStream.print(joiner);
    }

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

    private void extendTo(StringBuilder stringBuilder, int expectedLength) {
        final char given = ' ';
        while (stringBuilder.length() < expectedLength) {
            stringBuilder.append(given);
        }
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

    public U2 getFieldsCount() {
        return fieldsCount;
    }

    public void setFieldsCount(U2 fieldsCount) {
        this.fieldsCount = fieldsCount;
    }

    public void setFields(FieldInfo[] fields) {
        this.fields = fields;
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
