package com.study.signature.builder;

import com.study.signature.BaseType;
import com.study.signature.JavaTypeSignature;
import com.study.signature.ReferenceTypeSignature;
import com.study.util.BaseTypeUtils;
import org.apache.commons.collections4.iterators.PeekingIterator;

/**
 * <pre>
 * JavaTypeSignature:
 *   ReferenceTypeSignature
 *   BaseType
 * </pre>
 * <p>
 * {@link JavaTypeSignature}
 * {@link ReferenceTypeSignature}
 * {@link BaseType}
 * <p>
 * Please refer to the following link for more details
 * <a href="https://docs.oracle.com/javase/specs/jvms/se21/html/jvms-4.html#jvms-4.7.9.1">4.7.9.1. Signatures</a>
 */
public class JavaTypeSignatureBuilder implements Builder<JavaTypeSignature> {

    @Override
    public JavaTypeSignature build(PeekingIterator<Integer> peekingIterator) {
        int startCodePoint = peekingIterator.peek();

        if (BaseTypeUtils.isBaseType(startCodePoint)) {
            dropOneItem(peekingIterator);
            return new BaseType(startCodePoint);
        }

        return new ReferenceTypeSignatureBuilder().build(peekingIterator);
    }
}
