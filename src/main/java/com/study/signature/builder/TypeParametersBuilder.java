package com.study.signature.builder;

import com.study.signature.ReferenceTypeSignature;
import com.study.signature.TypeParameter;
import com.study.util.SignatureUtils;
import org.apache.commons.collections4.iterators.PeekingIterator;

import java.util.*;

/**
 * <pre>
 * TypeParameters:
 *   < TypeParameter {TypeParameter} >
 * TypeParameter:
 *   Identifier ClassBound {InterfaceBound}
 * ClassBound:
 *   : [ReferenceTypeSignature]
 * InterfaceBound:
 *   : ReferenceTypeSignature
 * </pre>
 * <p>
 * {@link TypeParameter}
 * {@link ReferenceTypeSignature}
 * <p>
 * Please refer to the following link for more details
 * <a href="https://docs.oracle.com/javase/specs/jvms/se21/html/jvms-4.html#jvms-4.7.9.1">4.7.9.1. Signatures</a>
 */
public class TypeParametersBuilder implements Builder<List<TypeParameter>> {

    @Override
    public List<TypeParameter> build(PeekingIterator<Integer> peekingIterator) {
        if (peekingIterator.peek() != LEFT_ANGLE_BRACKET) {
            return Collections.emptyList();
        }

        // drop the next item, i.e. '>'
        dropExpectedItem(peekingIterator, LEFT_ANGLE_BRACKET);

        List<TypeParameter> typeParameters = new ArrayList<>();
        Builder<TypeParameter> typeParameterBuilder = new TypeParameterBuilder();
        while (peekingIterator.peek() != RIGHT_ANGLE_BRACKET) {
            typeParameters.add(typeParameterBuilder.build(peekingIterator));
        }

        // drop the next item, i.e. '>'
        dropExpectedItem(peekingIterator, RIGHT_ANGLE_BRACKET);

        return typeParameters;
    }

    private static class TypeParameterBuilder implements Builder<TypeParameter> {

        @Override
        public TypeParameter build(PeekingIterator<Integer> peekingIterator) {
            String identifier = new IdentifierBuilder().build(peekingIterator);
            Optional<ReferenceTypeSignature> classBound = new ClassBoundBuilder().build(peekingIterator);
            List<ReferenceTypeSignature> interfaceBound = new InterfaceBoundBuilder().build(peekingIterator);

            return new TypeParameter(identifier, classBound, interfaceBound);
        }
    }

    private static class IdentifierBuilder implements Builder<String> {

        @Override
        public String build(PeekingIterator<Integer> peekingIterator) {
            List<Integer> identifierHolder = new ArrayList<>();

            while (peekingIterator.peek() != COLON) {
                identifierHolder.add(peekingIterator.next());
            }

            return SignatureUtils.convertToString(identifierHolder);
        }
    }

    private static class InterfaceBoundBuilder
            implements Builder<List<ReferenceTypeSignature>> {

        @Override
        public List<ReferenceTypeSignature> build(PeekingIterator<Integer> peekingIterator) {
            List<ReferenceTypeSignature> result = new ArrayList<>();

            Builder<ReferenceTypeSignature> builder = new ReferenceTypeSignatureBuilder();
            while (peekingIterator.peek() == COLON) {
                // drop one item, i.e. ':'
                dropExpectedItem(peekingIterator, COLON);
                result.add(builder.build(peekingIterator));
            }

            return result;
        }
    }

    private static class ClassBoundBuilder implements
            Builder<Optional<ReferenceTypeSignature>> {

        @Override
        public Optional<ReferenceTypeSignature> build(PeekingIterator<Integer> peekingIterator) {
            // drop one item, i.e. ':'
            dropExpectedItem(peekingIterator, COLON);

            if (peekingIterator.peek() == COLON) {
                return Optional.empty();
            }

            Builder<ReferenceTypeSignature> builder = new ReferenceTypeSignatureBuilder();
            return Optional.of(builder.build(peekingIterator));
        }
    }
}
