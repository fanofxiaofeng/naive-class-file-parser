package com.study.type.info.attribute;

import com.study.type.U1;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.info.MethodInfo;

import java.util.List;

public class CodeAttribute extends AttributeInfo {
    private final U2 maxStack;
    private final U2 maxLocals;
    private final List<U1> code;
    private final List<ExceptionTable> exceptionTableList;
    private final List<AttributeInfo> attributes;

    private MethodInfo methodInfo;

    public CodeAttribute(U2 attributeNameIndex,
                         U4 attributeLength,
                         U2 maxStack,
                         U2 maxLocals,
                         List<U1> code,
                         List<ExceptionTable> exceptionTableList,
                         List<AttributeInfo> attributes
    ) {
        super(attributeNameIndex, attributeLength);
        this.maxStack = maxStack;
        this.maxLocals = maxLocals;
        this.code = code;
        this.exceptionTableList = exceptionTableList;
        this.attributes = attributes;
    }


    @Override
    public String describe(int indent) {
        StringBuilder stringBuilder = withIndent(indent).append("Code:\n");

        if (exceptionTableList.size() > 0) {
            stringBuilder.append("      Exception table:\n");
            stringBuilder.append("         from    to  target type\n");
            for (ExceptionTable exceptionTableEntry : exceptionTableList) {
                // 根据 https://docs.oracle.com/javase/specs/jvms/se7/html/jvms-4.html#jvms-4.7.3 中关于 catch_type 的描述
                // If the value of the catch_type item is nonzero,
                // it must be a valid index into the constant_pool table.
                // The constant_pool entry at that index must be a CONSTANT_Class_info structure (§4.4.1) representing a class of exceptions that this exception handler is designated to catch.
                // The exception handler will be called only if the thrown exception is an instance of the given class or one of its subclasses.
                // If the value of the catch_type item is zero,
                // this exception handler is called for all exceptions.
                // This is used to implement finally (§3.13).

                // 大致是说
                // 1. catch_type == 0 时, 表示任意类型的异常
                // 2. catch_type != 0 时, 需要对应常量池中的一个元素
                boolean isAny = exceptionTableEntry.catchType.toInt() == 0;

                /*
                CpInfo exceptionClass = constantPool.get(exceptionTableEntry.catchType.toInt());
                if (!isAny && !(exceptionClass instanceof ConstantClass)) {
//                    System.out.println(stringBuilder.toString());
//                    System.out.println("~~" + exceptionTable.catchType.toInt());
                    throw new AssertionError("variable \"exceptionClass\" is not an instance of ConstantClass!" + exceptionClass.getClass().toString());
                }
                String classInfo = isAny ? "any" : exceptionClass.detail();
                stringBuilder.append(String.format("%14d%6d%6d   Class %s\n",
                        exceptionTableEntry.startPc.toInt(),
                        exceptionTableEntry.endPc.toInt(),
                        exceptionTableEntry.handlerPc.toInt(),
                        classInfo
                ));
            }*/
            }
            /*
            if (attributes.size() > 0) {
                for (AttributeInfo attribute : attributes) {
                    stringBuilder.append(attribute.describe(indent + 2));
                }
            }
             */
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "CodeAttribute{" +
                "maxStack=" + maxStack +
                ", maxLocals=" + maxLocals +
                ", code=" + code +
                ", exceptionTableList=" + exceptionTableList +
                ", attributes=" + attributes +
                '}';
    }

    public U2 getMaxStack() {
        return maxStack;
    }

    public U2 getMaxLocals() {
        return maxLocals;
    }

    public List<U1> getCode() {
        return code;
    }

    public List<ExceptionTable> getExceptionTableList() {
        return exceptionTableList;
    }

    public List<AttributeInfo> getAttributes() {
        return attributes;
    }

    public void setMethodInfo(MethodInfo methodInfo) {
        this.methodInfo = methodInfo;
    }

    public MethodInfo getMethodInfo() {
        return methodInfo;
    }

    public static class ExceptionTable {
        private final U2 startPc;
        private final U2 endPc;
        private final U2 handlerPc;
        private final U2 catchType;

        public ExceptionTable(U2 startPc, U2 endPc, U2 handlerPc, U2 catchType) {
            this.startPc = startPc;
            this.endPc = endPc;
            this.handlerPc = handlerPc;
            this.catchType = catchType;
        }
    }
}
