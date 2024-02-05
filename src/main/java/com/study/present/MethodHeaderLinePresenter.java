package com.study.present;

import com.study.constants.ClassAccessFlags;
import com.study.constants.MethodAccessFlags;
import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.descriptor.MethodDescriptor;
import com.study.type.descriptor.MethodDescriptorBuilder;
import com.study.type.info.MethodInfo;
import com.study.util.ClassNameUtils;
import com.study.util.PrintStreamWrapper;

public class MethodHeaderLinePresenter extends AbstractPresenter {

    private final MethodInfo methodInfo;

    public MethodHeaderLinePresenter(
            ParseResult result,
            PrintStreamWrapper printStreamWrapper,
            MethodInfo methodInfo
    ) {
        super(result, printStreamWrapper);
        this.methodInfo = methodInfo;
    }

    @Override
    public void doPresent() {
        String headerLine = buildHeaderLine();
        printStreamWrapper.printlnWithIndentLevel(headerLine, 1);
    }

    public String buildHeaderLine() {
        ConstantPool constantPool = result.getConstantPool();

        MethodDescriptorBuilder methodDescriptorBuilder = new MethodDescriptorBuilder();
        MethodDescriptor methodDescriptor = methodDescriptorBuilder.build(constantPool, methodInfo.getDescriptorIndex());

        String humanReadableFlagsDesc = methodInfo.buildHumanReadableFlagsDesc();
        String returnTypeDesc = buildReturnTypeDesc(methodDescriptor, constantPool);
        String functionName = buildName(constantPool);
        String parametersDesc = buildParametersDesc(methodDescriptor, constantPool);

        return buildHeaderLine(
                humanReadableFlagsDesc,
                returnTypeDesc,
                functionName + parametersDesc
        );
    }


    private String buildParametersDesc(MethodDescriptor methodDescriptor, ConstantPool constantPool) {
        if (methodInfo.isClassInit(constantPool)) {
            return "{}";
        }

        boolean varargs = methodInfo.getAccessFlags().isOn(MethodAccessFlags.ACC_VARARGS.getFlag());
        boolean enumConstructor =
                result.getAccessFlags().isOn(ClassAccessFlags.ACC_ENUM.getFlag()) &&
                        methodInfo.isConstructor(constantPool);
        return methodDescriptor.buildParameterDescriptorsForCornerCases(varargs, enumConstructor);
    }

    private String buildName(ConstantPool constantPool) {
        if (methodInfo.isClassInit(constantPool)) {
            return "";
        }

        if (methodInfo.isConstructor(constantPool)) {
            String raw = constantPool.detail(result.getThisClass());
            return ClassNameUtils.dashToDot(raw);
        }

        return constantPool.desc(methodInfo.getNameIndex());
    }

    private String buildReturnTypeDesc(MethodDescriptor methodDescriptor, ConstantPool constantPool) {
        if (methodInfo.isClassInit(constantPool) || methodInfo.isConstructor(constantPool)) {
            return "";
        }
        return methodDescriptor.buildReturnDescriptorDesc();
    }
}
