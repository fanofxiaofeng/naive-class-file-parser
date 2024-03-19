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

    public record ExceptionTable(U2 startPc, U2 endPc, U2 handlerPc, U2 catchType) {
    }
}
