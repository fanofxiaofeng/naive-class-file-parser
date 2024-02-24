package com.study.signature.builder;

import com.study.signature.TypeVariableSignature;
import com.study.util.SignatureUtils;
import org.apache.commons.collections4.iterators.PeekingIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * TypeVariableSignature:
 *   T Identifier ;
 * </pre>
 * <p>
 * {@link TypeVariableSignature}
 * <p>
 * Please refer to the following link for more details
 * <a href="https://docs.oracle.com/javase/specs/jvms/se21/html/jvms-4.html#jvms-4.7.9.1">4.7.9.1. Signatures</a>
 */
public class TypeVariableSignatureBuilder implements Builder<TypeVariableSignature> {

    @Override
    public TypeVariableSignature build(PeekingIterator<Integer> peekingIterator) {
        dropExpectedItem(peekingIterator, 'T');

        int codePoint;
        List<Integer> codePoints = new ArrayList<>();
        while ((codePoint = peekingIterator.next()) != ';') {
            codePoints.add(codePoint);
        }

        String identifier = SignatureUtils.convertToString(codePoints);
        return new TypeVariableSignature(identifier);
    }
}
