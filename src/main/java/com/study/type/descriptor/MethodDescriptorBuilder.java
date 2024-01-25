package com.study.type.descriptor;

import java.util.ArrayList;
import java.util.List;

import com.study.type.ConstantPool;
import com.study.type.U2;
import org.apache.commons.collections4.iterators.PeekingIterator;

public class MethodDescriptorBuilder extends AbstractDescriptorBuilder<MethodDescriptor> {
    @Override
    public MethodDescriptor build(ConstantPool constantPool, U2 descriptorIndex) {
        PeekingIterator<Integer> peekingIterator = buildPeekingIterator(constantPool, descriptorIndex);
        return build(peekingIterator);
    }

    private MethodDescriptor build(PeekingIterator<Integer> peekingIterator) {
        int codePoint = peekingIterator.next();
        if (codePoint != '(') {
            String message = "The initial codePoint should be '('!";
            throw new IllegalArgumentException(message);
        }

        List<FieldType> parameterDescriptors = new ArrayList<>();
        while (true) {
            int nextCodePoint = peekingIterator.peek();
            if (nextCodePoint == ')') {
                // just waste this codePoint
                peekingIterator.next();
                break;
            }
            parameterDescriptors.add(buildFieldType(peekingIterator));
        }

        int nextCodePoint = peekingIterator.peek();
        if (nextCodePoint == 'V') {
            return new MethodDescriptor(parameterDescriptors, VoidDescriptor.getInstance());
        }

        FieldType returnDescriptor = buildFieldType(peekingIterator);
        return new MethodDescriptor(parameterDescriptors, returnDescriptor);
    }
}
