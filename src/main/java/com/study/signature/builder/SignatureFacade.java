package com.study.signature.builder;

import com.study.signature.ClassSignature;
import com.study.signature.CodePointsInfo;
import com.study.signature.MethodSignature;
import com.study.signature.ReferenceTypeSignature;
import org.apache.commons.collections4.iterators.PeekingIterator;

public class SignatureFacade {

    private PeekingIterator<Integer> convertToPeekingIterator(String raw) {
        CodePointsInfo codePointsInfo = new CodePointsInfo(raw);
        return new PeekingIterator<>(codePointsInfo.iterator());
    }

    public ClassSignature buildClassSignature(String raw) {
        PeekingIterator<Integer> peekingIterator = convertToPeekingIterator(raw);
        Builder<ClassSignature> builder = new ClassSignatureBuilder();
        return builder.build(peekingIterator);
    }

    public ReferenceTypeSignature buildFieldSignature(String raw) {
        PeekingIterator<Integer> peekingIterator = convertToPeekingIterator(raw);
        Builder<ReferenceTypeSignature> builder = new FieldSignatureBuilder();
        return builder.build(peekingIterator);
    }

    public MethodSignature buildMethodSignature(String raw) {
        System.out.println("raw is: " + raw);
        if (raw.equals("(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class<*>;")) {
            int a = 42;
        }
        PeekingIterator<Integer> peekingIterator = convertToPeekingIterator(raw);
        Builder<MethodSignature> builder = new MethodSignatureBuilder();
        return builder.build(peekingIterator);
    }
}
