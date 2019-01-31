package com.study.type.info;

import com.study.io.CodeInputStream;
import com.study.io.U1InputStream;
import com.study.type.U1;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.constant.AbstractConstant;
import com.study.type.constant.ConstantClass;

import java.util.Arrays;

public class CodeAttribute {
    private U2 attributeNameIndex;
    private U4 attributeLength;
    private U2 maxStack;
    private U2 maxLocals;
    private U4 codeLength;
    private U1 code[];
    private U2 exceptionTableLength;
    private ExceptionTable[] exceptionTable;
    private U2 attributesCount;
    private AttributeInfo[] attributes;

    public CodeAttribute(U2 attributeNameIndex, U4 attributeLength, U1[] info) {
        this.attributeNameIndex = attributeNameIndex;
        this.attributeLength = attributeLength;
        if (this.attributeLength.toInt() != info.length) {
            throw new AssertionError("this.attributeLength.toInt() != info.length");
        }
        U1InputStream u1InputStream = new U1InputStream(info);

        this.maxStack = u1InputStream.readU2();
        this.maxLocals = u1InputStream.readU2();
        this.codeLength = u1InputStream.readU4();

        this.code = u1InputStream.readU1Array(this.codeLength.toInt());

        this.exceptionTableLength = u1InputStream.readU2();
        int exceptionTableLength = this.exceptionTableLength.toInt();
        this.exceptionTable = new ExceptionTable[exceptionTableLength];
        for (int i = 0; i < exceptionTableLength; i++) {
            this.exceptionTable[i] = new ExceptionTable(u1InputStream);
        }

        this.attributesCount = u1InputStream.readU2();
        int attributesCount = this.attributesCount.toInt();
        this.attributes = new AttributeInfo[attributesCount];
        for (int i = 0; i < attributesCount; i++) {
            this.attributes[i] = new AttributeInfo(u1InputStream);
        }
    }

    public String desc(AbstractConstant[] constantPool) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("    Code:\n");
        stringBuilder.append(String.format("      stack=%d, locals=%d, args_size=%d\n", this.maxStack.toInt(), this.maxLocals.toInt(), -1));
        CodeInputStream codeInputStream = new CodeInputStream(this.code, constantPool);
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
                        constantPool[exceptionTable.catchType.toInt()].detail(constantPool)
                ));
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

        public ExceptionTable(U1InputStream u1InputStream) {
            this.startPc = u1InputStream.readU2();
            this.endPc = u1InputStream.readU2();
            this.handlerPc = u1InputStream.readU2();
            this.catchType = u1InputStream.readU2();
        }
    }
}
