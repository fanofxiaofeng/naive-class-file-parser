package com.study.signature.builder;

import com.study.signature.ClassSignature;
import com.study.signature.ClassTypeSignature;
import com.study.signature.TypeParameter;
import org.apache.commons.collections4.iterators.PeekingIterator;

import java.util.ArrayList;
import java.util.List;

public class ClassSignatureBuilder implements Builder<ClassSignature> {

    @Override
    public ClassSignature build(PeekingIterator<Integer> peekingIterator) {
        List<TypeParameter> typeParameters = new TypeParametersBuilder().build(peekingIterator);

        ClassTypeSignature superclassSignature = new ClassTypeSignatureBuilder().build(peekingIterator);

        List<ClassTypeSignature> superinterfaceSignature = new ArrayList<>();
        while (peekingIterator.hasNext()) {
            ClassTypeSignature item = new ClassTypeSignatureBuilder().build(peekingIterator);
            superinterfaceSignature.add(item);
        }

        return new ClassSignature(typeParameters, superclassSignature, superinterfaceSignature);
    }
}
