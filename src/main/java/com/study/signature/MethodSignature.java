package com.study.signature;

import com.study.type.descriptor.VoidDescriptor;

import java.util.List;
import java.util.StringJoiner;

public class MethodSignature implements Signature {

    private final List<TypeParameter> typeParameters;

    private final List<JavaTypeSignature> javaTypeSignatureList;

    private final Object result;

    private final List<ThrowsSignature<? extends ReferenceTypeSignature>> throwsSignatureList;

    public MethodSignature(
            List<TypeParameter> typeParameters,
            List<JavaTypeSignature> javaTypeSignatureList,
            JavaTypeSignature result,
            List<ThrowsSignature<? extends ReferenceTypeSignature>> throwsSignatureList

    ) {
        this.typeParameters = typeParameters;
        this.javaTypeSignatureList = javaTypeSignatureList;
        this.result = result;
        this.throwsSignatureList = throwsSignatureList;
    }

    public MethodSignature(List<TypeParameter> typeParameters,
                           List<JavaTypeSignature> javaTypeSignatureList,
                           VoidDescriptor result,
                           List<ThrowsSignature<? extends ReferenceTypeSignature>> throwsSignatureList
    ) {
        this.typeParameters = typeParameters;
        this.javaTypeSignatureList = javaTypeSignatureList;
        this.result = result;
        this.throwsSignatureList = throwsSignatureList;
    }

    public List<TypeParameter> getTypeParameters() {
        return typeParameters;
    }

    public String descTypeParameters() {
        if (typeParameters.isEmpty()) {
            return "";
        }
        StringJoiner joiner = new StringJoiner(", ");
        for (TypeParameter typeParameter : typeParameters) {
            joiner.add(typeParameter.desc());
        }
        return String.format("<%s>", joiner);
    }

    public List<JavaTypeSignature> getJavaTypeSignatureList() {
        return javaTypeSignatureList;
    }

    public Object getResult() {
        return result;
    }

    public String descResult() {
        if (result instanceof VoidDescriptor) {
            return VoidDescriptor.getInstance().desc();
        }

        if (result instanceof JavaTypeSignature specifiedResult) {
            return specifiedResult.desc();
        }

        String message = String.format("Unexpected class for result: [%s]", result.getClass().getSimpleName());
        throw new IllegalArgumentException(message);
    }

    public List<ThrowsSignature<? extends ReferenceTypeSignature>> getThrowsSignatureList() {
        return throwsSignatureList;
    }

    public String buildParameterDescriptorsForCornerCases(boolean varargs) {
        if (!varargs) {
            return buildParameterDescriptorsDesc();
        }

        int parameterCount = javaTypeSignatureList.size();
        List<JavaTypeSignature> parameterSignatureList = javaTypeSignatureList;
//                enumConstructor ?
//                        javaTypeSignatureList.subList(2, parameterCount) :
//                        javaTypeSignatureList;

        StringJoiner joiner = new StringJoiner(", ");
        if (varargs) {
            parameterSignatureList.subList(0, parameterCount - 1).forEach(e -> joiner.add(e.desc()));
//            String descForLastParameter = ((ArrayTypeSignature) parameterSignatureList.get(parameterCount - 1)).desc();
            String descForLastParameter = ((ArrayTypeSignature) parameterSignatureList.get(parameterCount - 1)).descForVarArgs();
            joiner.add(descForLastParameter);
        } else {
            parameterSignatureList.forEach(e -> joiner.add(e.desc()));
        }
        return String.format("(%s)", joiner);
    }

    private String buildParameterDescriptorsDesc() {
        StringJoiner joiner = new StringJoiner(", ");
        for (JavaTypeSignature javaTypeSignature : javaTypeSignatureList) {
            joiner.add(javaTypeSignature.desc());
        }
        return String.format("(%s)", joiner);
    }
}
