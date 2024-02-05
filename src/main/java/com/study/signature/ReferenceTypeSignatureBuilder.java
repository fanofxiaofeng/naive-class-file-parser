package com.study.signature;

import com.study.util.BaseTypeUtils;
import org.apache.commons.collections4.iterators.PeekingIterator;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ReferenceTypeSignatureBuilder implements SignatureBuilder<ReferenceTypeSignature> {

    @Override
    public ReferenceTypeSignature build(String raw) {
        CodePointsInfo codePointsInfo = new CodePointsInfo(raw);
        return buildReferenceTypeSignature(new PeekingIterator<>(codePointsInfo.iterator()));
    }

    private ReferenceTypeSignature buildReferenceTypeSignature(PeekingIterator<Integer> iterator) {
        int startCodePoint = iterator.peek();
        switch (startCodePoint) {
            case 'L' -> {
                // ClassTypeSignature case
                // We need to drop the initial 'L' character
                return buildClassTypeSignature(iterator, true);
            }
            case 'T' -> {
                // TypeVariableSignature case
                // We need to drop the initial T character
                return buildTypeVariableSignature(iterator, true);
            }
            case '[' -> {
                // ArrayTypeSignature case
                // We need to drop the initial [ character
                return buildArrayTypeSignature(iterator, true);
            }
            default -> {
                String message = String.format("Unsupported startCodePoint: " + convertToString(List.of(startCodePoint)));
                throw new IllegalArgumentException(message);
            }
        }
    }

    private ClassTypeSignature buildClassTypeSignature(PeekingIterator<Integer> iterator, boolean shouldDropOneItem) {
        if (shouldDropOneItem) {
            // drop the initial 'L' character
            iterator.next();
        }

        List<Integer> codePoints = new ArrayList<>();
        String packageSpecifier = "";
        SimpleClassTypeSignature simpleClassTypeSignature = null;
        List<SimpleClassTypeSignature> classTypeSignatureSuffixList = new ArrayList<>();
        while (true) {
            int codePoint = iterator.next();
            switch (codePoint) {
                case ';' -> {
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
                case '<' -> {
                    Pair<String, String> temp = parsePair(codePoints);
                    packageSpecifier = temp.getKey();
                    String identifier = temp.getRight();
                    List<TypeArgument> typeArguments = buildTypeArguments(iterator);
                    simpleClassTypeSignature = new SimpleClassTypeSignature(identifier, typeArguments);
                }
                case '>' -> {
                    // just do nothing
                }
                case '.' -> {
                    SimpleClassTypeSignature classTypeSignatureSuffix = buildSimpleClassTypeSignature(iterator);
                    classTypeSignatureSuffixList.add(classTypeSignatureSuffix);
                }
                default -> {
                    String message = String.format("codePoint: [%s] was fetched", convertToString(List.of(codePoint)));
                    System.out.println(message);
                    codePoints.add(codePoint);
                }
            }
        }
    }

    private SimpleClassTypeSignature buildSimpleClassTypeSignature(PeekingIterator<Integer> iterator) {
        List<Integer> codePoints = new ArrayList<>();

        List<TypeArgument> typeArguments = Collections.emptyList();
        while (true) {
            int cp = iterator.peek();
            switch (cp) {
                case '<' -> {
                    iterator.next();
                    typeArguments = buildTypeArguments(iterator);
                }
                case '>' -> {
                    iterator.next();
                    String identifier = convertToString(codePoints);
                    return new SimpleClassTypeSignature(identifier, typeArguments);
                }
                case ';' -> {
                    String identifier = convertToString(codePoints);
                    return new SimpleClassTypeSignature(identifier, typeArguments);
                }
                case '.' -> {
                    String identifier = convertToString(codePoints);
                    // typeArguments should just be empty now
                    return new SimpleClassTypeSignature(identifier, Collections.emptyList());
                }
                default -> codePoints.add(iterator.next());
            }
        }
    }

    private List<TypeArgument> buildTypeArguments(PeekingIterator<Integer> iterator) {
        List<TypeArgument> typeArguments = new ArrayList<>();
        int codePoint;
        while ((codePoint = iterator.peek()) != '>') {
            switch (codePoint) {
                case '*' -> {
                    iterator.next();
                    typeArguments.add(TypeArgument.CaseTwo.getInstance());
                }
                case '+', '-' -> {
                    iterator.next();
                    ReferenceTypeSignature referenceTypeSignature = buildReferenceTypeSignature(iterator);
                    TypeArgument.CaseOne.WildcardIndicator wildcardIndicator =
                            TypeArgument.CaseOne.WildcardIndicator.toWildcardIndicator(codePoint);
                    typeArguments.add(new TypeArgument.CaseOne(wildcardIndicator, referenceTypeSignature));
                }
                default -> {
                    ReferenceTypeSignature referenceTypeSignature = buildReferenceTypeSignature(iterator);
                    typeArguments.add(new TypeArgument.CaseOne(referenceTypeSignature));
                }
            }
        }
        return typeArguments;
    }


    private Pair<String, String> parsePair(List<Integer> codePoints) {
        String raw = convertToString(codePoints);
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


    private TypeVariableSignature buildTypeVariableSignature(PeekingIterator<Integer> iterator, boolean shouldDropOneItem) {
        if (shouldDropOneItem) {
            // drop the initial 'T' character
            iterator.next();
        }

        int codePoint;
        List<Integer> codePoints = new ArrayList<>();
        while ((codePoint = iterator.next()) != ';') {
            codePoints.add(codePoint);
        }

        return new TypeVariableSignature(convertToString(codePoints));
    }

    private String convertToString(List<Integer> codePoints) {
        int size = codePoints.size();
        int[] data = new int[size];
        IntStream.range(0, size).forEach(index -> data[index] = codePoints.get(index));

        return new String(data, 0, data.length);
    }

    private ArrayTypeSignature buildArrayTypeSignature(PeekingIterator<Integer> iterator, boolean shouldDropOneItem) {
        if (shouldDropOneItem) {
            // drop the initial '[' character
            iterator.next();
        }

        JavaTypeSignature component = buildJavaTypeSignature(iterator);
        return new ArrayTypeSignature(component);
    }

    private JavaTypeSignature buildJavaTypeSignature(PeekingIterator<Integer> iterator) {
        int startCodePoint = iterator.peek();

        if (BaseTypeUtils.isBaseType(startCodePoint)) {
            return new BaseType(startCodePoint);
        }

        return buildReferenceTypeSignature(iterator);
    }
}
