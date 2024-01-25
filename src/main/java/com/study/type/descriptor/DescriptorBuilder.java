package com.study.type.descriptor;

import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.constant.leaf.ConstantUtf8;
import org.apache.commons.collections4.iterators.PeekingIterator;

import java.util.stream.IntStream;

public interface DescriptorBuilder<T> {
    T build(ConstantPool constantPool, U2 descriptorIndex);

}
