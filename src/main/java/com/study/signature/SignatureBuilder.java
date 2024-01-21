package com.study.signature;

import com.study.util.BaseTypeUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SignatureBuilder {

    private static final char OBJECT_START_SYMBOL = 'L';
    private static final char OBJECT_END_SYMBOL = ';';

    private static final char ARRAY_START_SYMBOL = '[';

    private static final char LEFT = '<';

    private static final char RIGHT = '>';

    private static final char SUB_SYMBOL = '+';
    private static final char SUPER_SYMBOL = '-';

    private static final char GENERIC_START_SYMBOL = 'T';
    private static final char GENERIC_END_SYMBOL = ';';

    public Signature build(String raw) {
        CodePointsInfo codePointsInfo = new CodePointsInfo(raw);
        return build(codePointsInfo.iterator());
    }

    private Signature build(Iterator<Integer> iterator) {
        if (!iterator.hasNext()) {
            throw new IllegalArgumentException();
        }
        int startCodePoint = iterator.next();

        if (BaseTypeUtils.isBaseType(startCodePoint)) {
            return new BaseType(startCodePoint);
        }

        switch (startCodePoint) {
            case RIGHT -> {
                return new FakeType();
            }
            case ARRAY_START_SYMBOL -> { // [
                Signature inner = build(iterator);
                return new ArrayType(inner);
            }
            case SUB_SYMBOL -> { // +
                Signature follower = build(iterator);
                return new SubType(follower);
            }
            case SUPER_SYMBOL -> { // -
                Signature follower = build(iterator);
                return new SuperType(follower);
            }
            case OBJECT_START_SYMBOL -> { // L
                return buildReferenceType(iterator);
            }
            case GENERIC_START_SYMBOL -> { // T
                return buildGenericType(iterator);
            }
            default -> throw new IllegalArgumentException();
        }
    }

    private ReferenceType buildReferenceType(Iterator<Integer> iterator) {
        List<Integer> holder = new ArrayList<>();
        List<Signature> children = new ArrayList<>();
        while (true) {
            if (!iterator.hasNext()) {
                throw new IllegalArgumentException();
            }

            int nextCodePoint = iterator.next();

            switch (nextCodePoint) {
                case OBJECT_END_SYMBOL -> {
                    return new ReferenceType(holder, children);
                }
                case LEFT -> {
                    while (true) {
                        Signature child = build(iterator);
                        if ((child instanceof FakeType)) {
                            break;
                        }
                        children.add(child);
                    }
                }
                case RIGHT -> throw new IllegalArgumentException();
                default -> holder.add(nextCodePoint);
            }
        }
    }

    private GenericType buildGenericType(Iterator<Integer> iterator) {
        List<Integer> holder = new ArrayList<>();

        while (true) {
            if (!iterator.hasNext()) {
                throw new IllegalArgumentException();
            }

            int nextCodePoint = iterator.next();
            if (nextCodePoint == GENERIC_END_SYMBOL) {
                return new GenericType(holder);
            }
            holder.add(nextCodePoint);
        }
    }
}
