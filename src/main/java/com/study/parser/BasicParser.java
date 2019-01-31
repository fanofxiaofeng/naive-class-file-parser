package com.study.parser;

import com.study.io.BasicInputStream;
import com.study.type.U1;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.constant.*;
import com.study.type.info.AttributeInfo;
import com.study.type.info.FieldInfo;
import com.study.type.info.MethodInfo;

import java.io.PrintStream;
import java.util.StringJoiner;

public class BasicParser {
    /**
     * 通过它来读取 class 文件
     */
    private BasicInputStream basicInputStream;

    /**
     * 输出结果
     */
    private PrintStream printStream;

    private U4 magic;
    private U2 minorVersion;
    private U2 majorVersion;
    private U2 constantPoolCount;
    private AbstractConstant[] constantPool;
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

    public BasicParser(BasicInputStream basicInputStream, PrintStream printStream) {
        this.basicInputStream = basicInputStream;
        this.printStream = printStream;
    }

    public BasicParser(BasicInputStream basicInputStream) {
        this.basicInputStream = basicInputStream;
        this.printStream = System.out;
    }

    public BasicParser build() {
        return fillMagic().
                fillMinorVersion().fillMajorVersion().
                fillConstantPoolCount().fillConstantPool().
                fillAccessFlags().fillThisClass().fillSuperClass().
                fillInterfacesCount().fillInterfaces().
                fillFieldsCount().fillFields().
                fillMethodsCount().fillMethods().
                fillAttributesCount().fillAttributes().makeSure();
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
            int tag = basicInputStream.readU1().toInt();
            this.constantPool[i] = build(tag);

            if (!occupyOneSlot(this.constantPool[i])) {
                i++;
            }
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

    private BasicParser fillInterfacesCount() {
        this.interfacesCount = basicInputStream.readU2();
        return this;
    }

    private BasicParser fillInterfaces() {
        int size = interfacesCount.toInt();
        this.interfaces = basicInputStream.readU2Array(size);
        return this;
    }

    private BasicParser fillFieldsCount() {
        this.fieldsCount = basicInputStream.readU2();
        return this;
    }

    private BasicParser fillFields() {
        int count = fieldsCount.toInt();
        this.fields = new FieldInfo[count];
        for (int i = 0; i < count; i++) {
            this.fields[i] = FieldInfo.build(basicInputStream);
        }
        return this;
    }

    private BasicParser fillMethodsCount() {
        this.methodsCount = basicInputStream.readU2();
        return this;
    }

    private BasicParser fillMethods() {
        int count = this.methodsCount.toInt();
        this.methods = new MethodInfo[count];
        for (int i = 0; i < count; i++) {
            this.methods[i] = MethodInfo.build(basicInputStream);
        }
        return this;
    }

    private BasicParser fillAttributesCount() {
        this.attributesCount = basicInputStream.readU2();
        return this;
    }

    private BasicParser fillAttributes() {
        int count = this.attributesCount.toInt();
        this.attributes = new AttributeInfo[count];
        for (int i = 0; i < count; i++) {
            this.attributes[i] = AttributeInfo.build(basicInputStream);
        }
        return this;
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
            case 12:
                return new ConstantNameAndType(basicInputStream.readU2(), basicInputStream.readU2());
            default:
                throw new RuntimeException(String.format("Tag %s is not supported yet!", tag));
        }
    }

    private BasicParser makeSure() {
        if (!basicInputStream.justFinished()) {
            throw new AssertionError();
        }
        return this;
    }

    public void show() {
        if (!magic.toString().equals("0xCAFEBABE")) {
            throw new AssertionError();
        }

        showMinorVersion();
        showMajorVersion();

        showAccessFlags();
        showThisClass();
        showSuperClass();
        showCount();

        showConstantPool();
        showFields();
        if (fieldsCount.toInt() > 0 && methodsCount.toInt() > 0) {
            printStream.println();
        }
        showMethods();
    }

    private void showMinorVersion() {
        printStream.println(String.format("  minor version: %s", minorVersion.toInt()));
    }

    private void showMajorVersion() {
        printStream.println(String.format("  major version: %s", majorVersion.toInt()));
    }

    private void showAccessFlags() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("  flags: (0x%04x)", accessFlags.toInt()));
        StringJoiner joiner = new StringJoiner(", ");
        if (accessFlags.isOn(0x0001)) {
            joiner.add("ACC_PUBLIC");
        }
        if (accessFlags.isOn(0x0010)) {
            joiner.add("ACC_FINAL");
        }
        if (accessFlags.isOn(0x0020)) {
            joiner.add("ACC_SUPER");
        }
        if (accessFlags.isOn(0x0200)) {
            joiner.add("ACC_INTERFACE");
        }
        if (accessFlags.isOn(0x0400)) {
            joiner.add("ACC_ABSTRACT");
        }
        if (accessFlags.isOn(0x1000)) {
            joiner.add("ACC_SYNTHETIC");
        }
        if (accessFlags.isOn(0x2000)) {
            joiner.add("ACC_ANNOTATION");
        }
        if (accessFlags.isOn(0x4000)) {
            joiner.add("ACC_ENUM");
        }
        if (joiner.length() > 0) {
            stringBuilder.append(' ');
            stringBuilder.append(joiner.toString());
        }
        printStream.println(stringBuilder.toString());
    }

    private void showThisClass() {
        StringBuilder stringBuilder = new StringBuilder(String.format("  this_class: #%d", thisClass.toInt()));
        extendTo(stringBuilder, 42);
        stringBuilder.append("// ");
        stringBuilder.append(constantPool[thisClass.toInt()].detail(constantPool));
        printStream.println(stringBuilder.toString());
    }

    private void showSuperClass() {
        StringBuilder stringBuilder = new StringBuilder(String.format("  super_class: #%d", superClass.toInt()));
        extendTo(stringBuilder, 42);
        stringBuilder.append("// ");
        stringBuilder.append(constantPool[superClass.toInt()].detail(constantPool));
        printStream.println(stringBuilder.toString());
    }

    private void showCount() {
        printStream.println(String.format("  interfaces: %d, fields: %d, methods: %d, attributes: %d",
                interfacesCount.toInt(), fieldsCount.toInt(), methodsCount.toInt(), attributesCount.toInt()));
    }

    private void showConstantPool() {
        printStream.println("Constant pool:");

        int count = this.constantPoolCount.toInt();
        int width = String.format("  #%d", count).length();
        String widthControl = String.format("%%%ds", width);

        int index = 1;
        while (index < count) {
            // "  #42" 这种格式的字符串(leading whitespace 的数量是计算出来的)
            String number = String.format(widthControl, "#" + index);
            AbstractConstant constant = constantPool[index];
            StringBuilder stringBuilder = new StringBuilder(String.format("%s = %s", number, constant.desc()));

            if (hasDetail(constant)) {
                extendTo(stringBuilder, Math.max(36 + width, 42));

                stringBuilder.append("//");
                String detail = constant.detail(constantPool);
                if (detail.length() > 0) {
                    stringBuilder.append(' ');
                    stringBuilder.append(constant.detail(constantPool));
                }
            }

            rightTrim(stringBuilder);

            printStream.println(stringBuilder.toString());
            if (occupyOneSlot(constant)) {
                index++;
            } else {
                index += 2;
            }
        }
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
        return !ConstantDouble.class.isInstance(constant) &&
                !ConstantLong.class.isInstance(constant);
    }

    // todo 类型可能有遗漏
    private boolean hasDetail(AbstractConstant constant) {
        return
                (ConstantMethodref.class.isInstance(constant)) ||
                        (ConstantFieldref.class.isInstance(constant)) ||
                        (ConstantNameAndType.class.isInstance(constant)) ||
                        (ConstantString.class.isInstance(constant)) ||
                        (ConstantClass.class.isInstance(constant))
                ;
    }

    private void showFields() {
        printStream.println('{');
        int count = this.fieldsCount.toInt();
        for (int i = 0; i < count; i++) {
            printStream.println(fields[i].desc(constantPool));
            if (i + 1 < count) {
                printStream.println();
            }
        }
    }

    private void showMethods() {
        int count = this.methodsCount.toInt();
        for (int i = 0; i < count; i++) {
            printStream.println(methods[i].desc(constantPool));
            if (i + 1 < count) {
                printStream.println();
            }
        }
    }

    private void extendTo(StringBuilder stringBuilder, int expectedLength) {
        final char given = ' ';
        while (stringBuilder.length() < expectedLength) {
            stringBuilder.append(given);
        }
    }
}
