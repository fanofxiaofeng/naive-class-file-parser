package com.study.type.descriptor;

import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.constant.leaf.ConstantUtf8;
import com.study.util.BaseTypeUtils;
import org.apache.commons.collections4.iterators.PeekingIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

public abstract class AbstractDescriptorBuilder<T> implements DescriptorBuilder<T> {

    protected FieldType buildFieldType(Iterator<Integer> iterator) {
        int codePoint = iterator.next();

        if (BaseTypeUtils.isBaseType(codePoint)) {
            return new BaseType(codePoint);
        }

        switch (codePoint) {
            case '[' -> {
                FieldType fieldType = buildFieldType(iterator);
                return new ArrayType(fieldType);
            }
            case 'L' -> {
                List<Integer> elements = new ArrayList<>();
                while (true) {
                    int next = iterator.next();
                    if (next == ';') {
                        break;
                    }
                    elements.add(next);
                }
                return new ObjectType(elements);
            }
            default -> {
                String message = String.format("%s is unexpected here!", (char) codePoint);
                throw new IllegalArgumentException(message);
            }
        }
    }

    protected PeekingIterator<Integer> buildPeekingIterator(ConstantPool constantPool, U2 descriptorIndex) {
        ConstantUtf8 descriptor = constantPool.get(descriptorIndex, ConstantUtf8.class);
        // todo: check whether it is OK for codepoints outside of BMP
        IntStream intStream = new String(descriptor.getContent()).codePoints();
        return new PeekingIterator<>(intStream.iterator());
    }
}
