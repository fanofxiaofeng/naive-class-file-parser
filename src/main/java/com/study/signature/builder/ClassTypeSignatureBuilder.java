package com.study.signature.builder;

import com.study.signature.ClassTypeSignature;
import com.study.signature.ReferenceTypeSignature;
import com.study.signature.SimpleClassTypeSignature;
import com.study.signature.TypeArgument;
import com.study.util.SignatureUtils;
import org.apache.commons.collections4.iterators.PeekingIterator;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassTypeSignatureBuilder implements Builder<ClassTypeSignature> {
    @Override
    public ClassTypeSignature build(PeekingIterator<Integer> peekingIterator) {
        // drop the initial 'L' character
        dropExpectedItem(peekingIterator, 'L');

        List<Integer> codePoints = new ArrayList<>();
        String packageSpecifier = "";
        SimpleClassTypeSignature simpleClassTypeSignature = null;
        List<SimpleClassTypeSignature> classTypeSignatureSuffixList = new ArrayList<>();
        while (true) {
            int codePoint = peekingIterator.peek();
            switch (codePoint) {
                case ';' -> {
                    dropExpectedItem(peekingIterator, ';');

                    if (simpleClassTypeSignature == null) {
                        Pair<String, String> temp = parsePair(codePoints);
                        packageSpecifier = temp.getKey();
                        String identifier = temp.getRight();
                        simpleClassTypeSignature = new SimpleClassTypeSignature(identifier, Collections.emptyList());
                    }
                    if (packageSpecifier.isEmpty()) {
                        return new ClassTypeSignature(simpleClassTypeSignature, classTypeSignatureSuffixList);
                    }
                    return new ClassTypeSignature(packageSpecifier, simpleClassTypeSignature, classTypeSignatureSuffixList);
                }
                case LEFT_ANGLE_BRACKET -> {
                    Pair<String, String> temp = parsePair(codePoints);
                    packageSpecifier = temp.getKey();
                    String identifier = temp.getRight();
                    List<TypeArgument> typeArguments = new TypeArgumentsBuilder().build(peekingIterator);
                    simpleClassTypeSignature = new SimpleClassTypeSignature(identifier, typeArguments);
                }
                case '.' -> {
                    dropExpectedItem(peekingIterator, '.');
                    SimpleClassTypeSignature classTypeSignatureSuffix = new SimpleClassTypeSignatureBuilder().build(peekingIterator);
                    classTypeSignatureSuffixList.add(classTypeSignatureSuffix);
                }
                default -> {
                    dropOneItem(peekingIterator);
                    String message =
                            String.format(
                                    "codePoint: [%s] was fetched",
                                    SignatureUtils.convertToString(List.of(codePoint))
                            );
                    System.out.println(message);
                    codePoints.add(codePoint);
                }
            }
        }
    }

    private Pair<String, String> parsePair(List<Integer> codePoints) {
        String raw = SignatureUtils.convertToString(codePoints);
        int lastIndexForSlash = raw.lastIndexOf('/');
        if (lastIndexForSlash >= 0) {
            return Pair.of(
                    // todo: needs test
                    raw.substring(0, lastIndexForSlash + 1),
                    raw.substring(lastIndexForSlash + 1)
            );
        }
        return Pair.of("", raw);
    }

    private static class SimpleClassTypeSignatureBuilder implements Builder<SimpleClassTypeSignature> {
        @Override
        public SimpleClassTypeSignature build(PeekingIterator<Integer> peekingIterator) {
            List<Integer> codePoints = new ArrayList<>();

            List<TypeArgument> typeArguments = Collections.emptyList();
            while (true) {
                int cp = peekingIterator.peek();
                switch (cp) {
                    case LEFT_ANGLE_BRACKET -> {
                        typeArguments = new TypeArgumentsBuilder().build(peekingIterator);
                        String identifier = SignatureUtils.convertToString(codePoints);
                        return new SimpleClassTypeSignature(identifier, typeArguments);
                    }
                    case ';' -> {
                        String identifier = SignatureUtils.convertToString(codePoints);
                        return new SimpleClassTypeSignature(identifier, typeArguments);
                    }
                    case '.' -> {
                        String identifier = SignatureUtils.convertToString(codePoints);
                        // typeArguments should just be empty now
                        return new SimpleClassTypeSignature(identifier, Collections.emptyList());
                    }
                    default -> codePoints.add(peekingIterator.next());
                }
            }
        }
    }

    private static class TypeArgumentsBuilder implements Builder<List<TypeArgument>> {

        @Override
        public List<TypeArgument> build(PeekingIterator<Integer> peekingIterator) {
            dropExpectedItem(peekingIterator, LEFT_ANGLE_BRACKET);

            List<TypeArgument> typeArguments = new ArrayList<>();
            int codePoint;
            while ((codePoint = peekingIterator.peek()) != RIGHT_ANGLE_BRACKET) {
                switch (codePoint) {
                    case '*' -> {
                        dropExpectedItem(peekingIterator, '*');
                        typeArguments.add(TypeArgument.CaseTwo.getInstance());
                    }
                    case '+', '-' -> {
                        dropExpectedItem(peekingIterator, (char) codePoint);
                        ReferenceTypeSignature referenceTypeSignature = new ReferenceTypeSignatureBuilder().build(peekingIterator);
                        TypeArgument.CaseOne.WildcardIndicator wildcardIndicator =
                                TypeArgument.CaseOne.WildcardIndicator.toWildcardIndicator(codePoint);
                        typeArguments.add(new TypeArgument.CaseOne(wildcardIndicator, referenceTypeSignature));
                    }
                    default -> {
                        ReferenceTypeSignature referenceTypeSignature = new ReferenceTypeSignatureBuilder().build(peekingIterator);
                        typeArguments.add(new TypeArgument.CaseOne(referenceTypeSignature));
                    }
                }
            }

            dropExpectedItem(peekingIterator, RIGHT_ANGLE_BRACKET);
            return typeArguments;
        }
    }
}
