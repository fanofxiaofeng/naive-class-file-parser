package com.study.signature.builder;

import com.study.signature.*;
import com.study.type.descriptor.VoidDescriptor;
import com.study.util.SignatureUtils;
import org.apache.commons.collections4.iterators.PeekingIterator;

import java.util.ArrayList;
import java.util.List;

public class MethodSignatureBuilder implements Builder<MethodSignature> {
    @Override
    public MethodSignature build(PeekingIterator<Integer> peekingIterator) {
        List<TypeParameter> typeParameters = new TypeParametersBuilder().build(peekingIterator);

        List<JavaTypeSignature> javaTypeSignatureList = buildJavaTypeSignatureList(peekingIterator);
        Object result = buildResult(peekingIterator);
        List<ThrowsSignature<? extends ReferenceTypeSignature>> throwsSignatureList = buildThrowsSignatureList(peekingIterator);

        if (result instanceof JavaTypeSignature specifiedResult) {
            return new MethodSignature(typeParameters, javaTypeSignatureList, specifiedResult, throwsSignatureList);
        }

        if (result instanceof VoidDescriptor specifiedResult) {
            return new MethodSignature(typeParameters, javaTypeSignatureList, specifiedResult, throwsSignatureList);
        }

        String message = String.format("Class of result is unexpected: [%s]", result.getClass().getSimpleName());
        throw new IllegalArgumentException(message);
    }

    private List<ThrowsSignature<? extends ReferenceTypeSignature>> buildThrowsSignatureList(PeekingIterator<Integer> peekingIterator) {
        List<ThrowsSignature<? extends ReferenceTypeSignature>> throwsSignatureList = new ArrayList<>();
        while (peekingIterator.hasNext()) {
            dropExpectedItem(peekingIterator, '^');
            int codePoint = peekingIterator.peek();
            switch (codePoint) {
                case ((int) 'L') -> {
                    ClassTypeSignature classTypeSignature = new ClassTypeSignatureBuilder().build(peekingIterator);
                    throwsSignatureList.add(new ThrowsSignature.CaseOne(classTypeSignature));
                }
                case ((int) 'T') -> {
                    TypeVariableSignature typeVariableSignature = new TypeVariableSignatureBuilder().build(peekingIterator);
                    throwsSignatureList.add(new ThrowsSignature.CaseTwo(typeVariableSignature));
                }
                default -> {
                    String message =
                            String.format(
                                    "Unexpected item: %s",
                                    SignatureUtils.convertToString(List.of(codePoint))
                            );
                    throw new IllegalArgumentException(message);
                }
            }
        }

        return throwsSignatureList;
    }

    private List<JavaTypeSignature> buildJavaTypeSignatureList(PeekingIterator<Integer> peekingIterator) {
        dropExpectedItem(peekingIterator, LEFT_PARENTHESIS);

        JavaTypeSignatureBuilder builder = new JavaTypeSignatureBuilder();
        List<JavaTypeSignature> javaTypeSignatureList = new ArrayList<>();
        while (peekingIterator.peek() != RIGHT_PARENTHESIS) {
            JavaTypeSignature javaTypeSignature = builder.build(peekingIterator);
//            System.out.println(javaTypeSignatureList.size());
//            System.out.println("[" + javaTypeSignature.desc() + "]");
//            if (javaTypeSignatureList.size() > 30) {
//                throw new IllegalArgumentException("too long...");
//            }
            javaTypeSignatureList.add(javaTypeSignature);
        }
        dropExpectedItem(peekingIterator, RIGHT_PARENTHESIS);

        return javaTypeSignatureList;
    }

    private Object buildResult(PeekingIterator<Integer> peekingIterator) {
        if (peekingIterator.peek() == 'V') {
            dropExpectedItem(peekingIterator, 'V');
            return VoidDescriptor.getInstance();
        }

        return new JavaTypeSignatureBuilder().build(peekingIterator);
    }
}
