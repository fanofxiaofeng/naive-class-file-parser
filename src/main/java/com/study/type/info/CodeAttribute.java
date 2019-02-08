package com.study.type.info;

import com.study.io.CodeInputStream;
import com.study.io.U1InputStream;
import com.study.type.U1;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.constant.AbstractConstant;
import com.study.type.constant.ConstantClass;

import java.util.Arrays;

public class CodeAttribute extends AttributeInfo {
    private U2 maxStack;
    private U2 maxLocals;
    private U4 codeLength;
    private U1 code[];
    private U2 exceptionTableLength;
    private ExceptionTable[] exceptionTable;
    private U2 attributesCount;
    private AttributeInfo[] attributes;

    CodeAttribute(AttributeInfo that) {
        super(that);

        if (this.attributeLength.toInt() != infoStream.length()) {
            throw new AssertionError("this.attributeLength.toInt() != infoStream.length()");
        }

        this.maxStack = infoStream.readU2();
        this.maxLocals = infoStream.readU2();
        this.codeLength = infoStream.readU4();
//        System.out.println("maxStack: " + maxStack.toInt());
//        System.out.println("maxLocals: " + maxLocals.toInt());
//        System.out.println("codeLength: " + codeLength.toLong());

        this.code = infoStream.readU1Array(this.codeLength.toInt());

        this.exceptionTableLength = infoStream.readU2();
        int exceptionTableLength = this.exceptionTableLength.toInt();
        this.exceptionTable = new ExceptionTable[exceptionTableLength];
        for (int i = 0; i < exceptionTableLength; i++) {
            this.exceptionTable[i] = new ExceptionTable(infoStream);
        }

        this.attributesCount = infoStream.readU2();
        int attributesCount = this.attributesCount.toInt();
        this.attributes = new AttributeInfo[attributesCount];
        for (int i = 0; i < attributesCount; i++) {
//            this.attributes[i] = AttributeInfo.convert(new AttributeInfo(infoStream));
            this.attributes[i] = AttributeInfo.build(infoStream);
        }
    }

    @Override
    public String describe(int indent) {
        StringBuilder stringBuilder = withIndent(indent).append("Code:\n");

        stringBuilder.append(String.format("%sstack=%d, locals=%d, args_size=%d\n", indentedString(indent + 2), this.maxStack.toInt(), this.maxLocals.toInt(), -1));
        CodeInputStream codeInputStream = new CodeInputStream(this.code);
        stringBuilder.append(codeInputStream.process());

        if (exceptionTableLength.toInt() > 0) {
            stringBuilder.append("      Exception table:\n");
            stringBuilder.append("         from    to  target type\n");
            for (int i = 0; i < exceptionTableLength.toInt(); i++) {
                ExceptionTable exceptionTable = this.exceptionTable[i];
                AbstractConstant exceptionClass = constantPool[exceptionTable.catchType.toInt()];
                if (!ConstantClass.class.isInstance(exceptionClass)) {
                    throw new AssertionError("variable \"exceptionClass\" is not an instance of ConstantClass!");
                }
                stringBuilder.append(String.format("%14d%6d%6d   Class %s\n",
                        exceptionTable.startPc.toInt(),
                        exceptionTable.endPc.toInt(),
                        exceptionTable.handlerPc.toInt(),
                        constantPool[exceptionTable.catchType.toInt()].detail()
                ));
            }
        }
        if (attributesCount.toInt() > 0) {
            for (AttributeInfo attribute : attributes) {
                stringBuilder.append(attribute.describe(indent + 2));
            }
        }

        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "CodeAttribute{" +
                "attributeNameIndex=" + attributeNameIndex.toInt() +
                ", attributeLength=" + attributeLength.toInt() +
                ", maxStack=" + maxStack.toInt() +
                ", maxLocals=" + maxLocals.toInt() +
                ", codeLength=" + codeLength.toInt() +
                ", code=" + Arrays.toString(code) +
                ", exceptionTableLength=" + exceptionTableLength.toInt() +
                ", exceptionTable=" + Arrays.toString(exceptionTable) +
                ", attributesCount=" + attributesCount.toInt() +
                ", attributes=" + Arrays.toString(attributes) +
                '}';
    }

    public static class ExceptionTable {
        private U2 startPc;
        private U2 endPc;
        private U2 handlerPc;
        private U2 catchType;

        ExceptionTable(U1InputStream u1InputStream) {
            this.startPc = u1InputStream.readU2();
            this.endPc = u1InputStream.readU2();
            this.handlerPc = u1InputStream.readU2();
            this.catchType = u1InputStream.readU2();
        }
    }
}
