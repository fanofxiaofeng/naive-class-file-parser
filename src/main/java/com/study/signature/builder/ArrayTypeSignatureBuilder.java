package com.study.signature.builder;

import com.study.signature.ArrayTypeSignature;
import com.study.signature.JavaTypeSignature;
import org.apache.commons.collections4.iterators.PeekingIterator;

/**
 * <pre>
 * ArrayTypeSignature:
 *   [ JavaTypeSignature
 * </pre>
 * <p>
 * {@link ArrayTypeSignature}
 * {@link JavaTypeSignature}
 * <p>
 * Please refer to the following link for more details
 * <a href="https://docs.oracle.com/javase/specs/jvms/se21/html/jvms-4.html#jvms-4.7.9.1">4.7.9.1. Signatures</a>
 */
public class ArrayTypeSignatureBuilder implements Builder<ArrayTypeSignature> {
    @Override
    public ArrayTypeSignature build(PeekingIterator<Integer> peekingIterator) {
        dropExpectedItem(peekingIterator, '[');

        JavaTypeSignature component = new JavaTypeSignatureBuilder().build(peekingIterator);
        return new ArrayTypeSignature(component);
    }
}
