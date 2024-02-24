package com.study.present;

import com.study.constants.ClassAccessFlags;
import com.study.constants.MethodAccessFlags;
import com.study.parser.ParseResult;
import com.study.signature.MethodSignature;
import com.study.signature.ReferenceTypeSignature;
import com.study.signature.ThrowsSignature;
import com.study.signature.builder.SignatureFacade;
import com.study.type.ConstantPool;
import com.study.type.descriptor.MethodDescriptor;
import com.study.type.descriptor.MethodDescriptorBuilder;
import com.study.type.info.MethodInfo;
import com.study.type.info.attribute.ExceptionsAttribute;
import com.study.type.info.attribute.SignatureAttribute;
import com.study.util.ClassNameUtils;
import com.study.util.PrintStreamWrapper;

import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;

public class MethodHeaderLinePresenter extends AbstractPresenter {

    private final MethodInfo methodInfo;

    private static final int INDENT_LEVEL = 1;

    public MethodHeaderLinePresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, MethodInfo methodInfo) {
        super(result, printStreamWrapper);
        this.methodInfo = methodInfo;
    }

    @Override
    public void doPresent() {
        String headerLine = buildHeaderLine();
        printStreamWrapper.printlnWithIndentLevel(headerLine, INDENT_LEVEL);
    }

    public String buildHeaderLine() {
        ConstantPool constantPool = result.getConstantPool();

        MethodDescriptorBuilder methodDescriptorBuilder = new MethodDescriptorBuilder();
        MethodDescriptor methodDescriptor = methodDescriptorBuilder.build(constantPool, methodInfo.getDescriptorIndex());

        Optional<MethodSignature> methodSignature = buildMethodSignature();
        String humanReadableFlagsDesc = methodInfo.buildHumanReadableFlagsDesc();
        String returnTypeDesc =
                methodSignature.isPresent() ?
                        buildReturnTypeDesc(methodSignature.get(), constantPool) :
                        buildReturnTypeDesc(methodDescriptor, constantPool);
        String functionName = buildName(constantPool);
        String parametersDesc =
                methodSignature.isPresent() ?
                        buildParametersDesc(methodSignature.get(), constantPool) :
                        buildParametersDesc(methodDescriptor, constantPool);
        String exceptionsDesc =
                methodSignature.isPresent() ?
                        buildExceptionsDesc(methodSignature.get()) :
                        buildExceptionsDesc();

        String typeParametersDesc =
                methodSignature.isPresent() ?
                        methodSignature.get().descTypeParameters() :
                        "";
        return buildHeaderLine(humanReadableFlagsDesc, typeParametersDesc, returnTypeDesc, functionName + parametersDesc, exceptionsDesc);
    }

    private Optional<MethodSignature> buildMethodSignature() {
        Optional<SignatureAttribute> signatureAttribute = methodInfo.findSignatureAttribute();

        if (signatureAttribute.isEmpty()) {
            return Optional.empty();
        }

        ConstantPool constantPool = result.getConstantPool();
        MethodSignature methodSignature =
                new SignatureFacade().buildMethodSignature(signatureAttribute.get().detail(constantPool));
        return Optional.of(methodSignature);
    }

    private String buildExceptionsDesc(MethodSignature methodSignature) {
        List<ThrowsSignature<? extends ReferenceTypeSignature>> throwsSignatureList = methodSignature.getThrowsSignatureList();
        if (throwsSignatureList.isEmpty()) {
            return buildExceptionsDesc();
        }

        StringJoiner joiner = new StringJoiner(", ");
        for (ThrowsSignature<? extends ReferenceTypeSignature> throwsSignature : throwsSignatureList) {
            // todo: is the logic ok?
            joiner.add(throwsSignature.desc().replace('.', '/'));
        }
        return String.format("throws %s", joiner);
    }

    private String buildExceptionsDesc() {
        List<ExceptionsAttribute> exceptionsAttribute = methodInfo.findAttribute(ExceptionsAttribute.class);
        if (exceptionsAttribute.isEmpty()) {
            return "";
        }

        return exceptionsAttribute.get(0).buildDesc(result.getConstantPool());
    }


    private String buildParametersDesc(MethodDescriptor methodDescriptor, ConstantPool constantPool) {
        if (methodInfo.isClassInit(constantPool)) {
            return "{}";
        }

        boolean varargs = methodInfo.getAccessFlags().isOn(MethodAccessFlags.ACC_VARARGS.getFlag());
        boolean enumConstructor = result.getAccessFlags().isOn(ClassAccessFlags.ACC_ENUM.getFlag()) && methodInfo.isConstructor(constantPool);
        return methodDescriptor.buildParameterDescriptorsForCornerCases(varargs, enumConstructor);
    }

    private String buildParametersDesc(MethodSignature methodSignature, ConstantPool constantPool) {
        if (methodInfo.isClassInit(constantPool)) {
            return "{}";
        }

        boolean varargs = methodInfo.getAccessFlags().isOn(MethodAccessFlags.ACC_VARARGS.getFlag());
        boolean enumConstructor = result.getAccessFlags().isOn(ClassAccessFlags.ACC_ENUM.getFlag()) && methodInfo.isConstructor(constantPool);
        return methodSignature.buildParameterDescriptorsForCornerCases(varargs, enumConstructor);
    }

    private String buildName(ConstantPool constantPool) {
        if (methodInfo.isClassInit(constantPool)) {
            return "";
        }

        if (methodInfo.isConstructor(constantPool)) {
            String raw = constantPool.detail(result.getThisClass());
            return ClassNameUtils.slashToDot(raw);
        }

        return constantPool.desc(methodInfo.getNameIndex());
    }

    private String buildReturnTypeDesc(MethodDescriptor methodDescriptor, ConstantPool constantPool) {
        if (methodInfo.isClassInit(constantPool) || methodInfo.isConstructor(constantPool)) {
            return "";
        }
        return methodDescriptor.buildReturnDescriptorDesc();
    }

    private String buildReturnTypeDesc(MethodSignature methodSignature, ConstantPool constantPool) {
        if (methodInfo.isClassInit(constantPool) || methodInfo.isConstructor(constantPool)) {
            return "";
        }
        return methodSignature.descResult();
    }
}
