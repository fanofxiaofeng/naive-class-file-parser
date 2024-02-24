package com.study.signature.builder;

import com.study.signature.ArrayTypeSignature;
import com.study.signature.ClassTypeSignature;
import com.study.signature.ReferenceTypeSignature;
import com.study.signature.TypeVariableSignature;
import com.study.util.SignatureUtils;
import org.apache.commons.collections4.iterators.PeekingIterator;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

/**
 * <pre>
 * ReferenceTypeSignature:
 *   ClassTypeSignature
 *   TypeVariableSignature
 *   ArrayTypeSignature
 * </pre>
 * <p>
 * {@link ReferenceTypeSignature}
 * {@link ClassTypeSignature}
 * {@link TypeVariableSignature}
 * {@link ArrayTypeSignature}
 * <p>
 * Please refer to the following link for more details
 * <a href="https://docs.oracle.com/javase/specs/jvms/se21/html/jvms-4.html#jvms-4.7.9.1">4.7.9.1. Signatures</a>
 */
public class ReferenceTypeSignatureBuilder implements Builder<ReferenceTypeSignature> {

    private static final Map<Integer, Supplier<? extends Builder<? extends ReferenceTypeSignature>>> supplierMap =
            Map.ofEntries(
                    Map.entry((int) 'L', (Supplier<ClassTypeSignatureBuilder>) ClassTypeSignatureBuilder::new),
                    Map.entry((int) 'T', (Supplier<TypeVariableSignatureBuilder>) TypeVariableSignatureBuilder::new),
                    Map.entry((int) '[', (Supplier<ArrayTypeSignatureBuilder>) ArrayTypeSignatureBuilder::new)
            );

    @Override
    public ReferenceTypeSignature build(PeekingIterator<Integer> peekingIterator) {
        int startCodePoint = peekingIterator.peek();
        if (supplierMap.containsKey(startCodePoint)) {
            return supplierMap.get(startCodePoint).get().build(peekingIterator);
        }

        String message = String.format(
                "Unsupported startCodePoint: [%s]",
                SignatureUtils.convertToString(List.of(startCodePoint))
        );
        throw new IllegalArgumentException(message);
    }
}
