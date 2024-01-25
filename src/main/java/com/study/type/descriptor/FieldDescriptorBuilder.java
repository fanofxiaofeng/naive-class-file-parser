package com.study.type.descriptor;

import com.study.type.ConstantPool;
import com.study.type.U2;
import org.apache.commons.collections4.iterators.PeekingIterator;

public class FieldDescriptorBuilder extends AbstractDescriptorBuilder<FieldDescriptor> {
    public FieldDescriptor build(ConstantPool constantPool, U2 descriptorIndex) {
        PeekingIterator<Integer> peekingIterator = buildPeekingIterator(constantPool, descriptorIndex);
        FieldType fieldType = buildFieldType(peekingIterator);
        return new FieldDescriptor(fieldType);
    }
}
