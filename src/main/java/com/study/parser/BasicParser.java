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
    private U2 interfacesCount;
    private U2[] interfaces;
    private U2 fieldsCount;
    private FieldInfo[] fields;
    private U2 methodsCount;
    private MethodInfo[] methods;
    private U2 attributesCount;
    private AttributeInfo[] attributes;
    private PrintStream printStream = System.out;

    public BasicParser(BasicInputStream basicInputStream, PrintStream printStream) {
        this.basicInputStream = basicInputStream;
        this.printStream = printStream;
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
            int type = basicInputStream.readU1().toInt();
            AbstractConstant constant = build(type);
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

    private BasicParser fillInterfacesCount() {
        this.interfacesCount = basicInputStream.readU2();
        return this;
    }

    private BasicParser fillInterfaces() {
        int size = interfacesCount.toInt();
        this.interfaces = new U2[size];
        for (int i = 0; i < size; i++) {
            this.interfaces[i] = basicInputStream.readU2();
        }
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

    private AbstractConstant build(int type) {
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
            case 8:
                return new ConstantString(basicInputStream.readU2());
            case 9:
                return new ConstantFieldref(basicInputStream.readU2(), basicInputStream.readU2());
            case 10:
                return new ConstantMethodref(basicInputStream.readU2(), basicInputStream.readU2());
            case 12:
                return new ConstantNameAndType(basicInputStream.readU2(), basicInputStream.readU2());
            default:
                throw new RuntimeException("Not supported yet!");
        }
    }

    private BasicParser makeSure() {
        assert basicInputStream.justFinished();
        return this;
    }

    public void show() {
        printStream.println("Magic: " + magic.toString());

        showMinorVersion();
        showMajorVersion();
        showAccessFlags();
        showThisClass();
        showSuperClass();
        showCount();

        showConstantPool();
        printStream.println("access flags: " + accessFlags.toString());
        printStream.println("this class: " + thisClass.toString());
        printStream.println("super class: " + superClass.toString());
        showFields();
    }

    private void showMinorVersion() {
        printStream.println(String.format("  minor version: %s", minorVersion.toInt()));
    }

    private void showMajorVersion() {
        printStream.println(String.format("  major version: %s", majorVersion.toInt()));
    }

    private void showAccessFlags() {
        // todo 输出内容不够
        printStream.println(String.format("  flags: (0x%04x) ...", accessFlags.toInt()));
    }

    private void showThisClass() {
        StringBuilder stringBuilder = new StringBuilder(String.format("  this_class: #%d", thisClass.toInt()));
        extendTo(stringBuilder, 42, ' ');
        stringBuilder.append("// ");
        stringBuilder.append(constantPool[thisClass.toInt()].detail(constantPool));
        printStream.println(stringBuilder.toString());
    }

    private void showSuperClass() {
        StringBuilder stringBuilder = new StringBuilder(String.format("  super_class: #%d", superClass.toInt()));
        extendTo(stringBuilder, 42, ' ');
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
        for (int i = 1; i < count; i++) {
            String s = String.format("%5s", "#" + i);
            StringBuilder stringBuilder = new StringBuilder(String.format("%s = %s", s, this.constantPool[i].desc()));
            String detail = constantPool[i].detail(constantPool);
            if (hasDetail(constantPool[i])) {
                extendTo(stringBuilder, 42, ' ');
                stringBuilder.append("//");
                if (detail.length() > 0) {
                    stringBuilder.append(' ');
                    stringBuilder.append(constantPool[i].detail(constantPool));
                }
            }
            printStream.println(stringBuilder.toString());
        }
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
        int count = this.fieldsCount.toInt();
        for (int i = 0; i < count; i++) {
            printStream.println(fields[i].desc(constantPool));
        }
    }

    private void extendTo(StringBuilder stringBuilder, int expectedLength, char given) {
        while (stringBuilder.length() < expectedLength) {
            stringBuilder.append(given);
        }
    }
}
