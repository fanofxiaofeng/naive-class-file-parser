package com.study.signature;

import com.study.util.BaseTypeUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleSignatureBuilder implements SignatureBuilder {

    protected static final char OBJECT_START_SYMBOL = 'L';
    protected static final char OBJECT_END_SYMBOL = ';';

    protected static final char ARRAY_START_SYMBOL = '[';

    protected static final char LEFT = '<';

    protected static final char RIGHT = '>';

    protected static final char SUB_SYMBOL = '+';
    protected static final char SUPER_SYMBOL = '-';

    protected static final char GENERIC_START_SYMBOL = 'T';
    protected static final char GENERIC_END_SYMBOL = ';';

    protected static final char ARGUMENT_LIST_START_SYMBOL = '(';
    protected static final char ARGUMENT_LIST_END_SYMBOL = ')';

    public Signature build(Iterator<Integer> iterator) {
        if (!iterator.hasNext()) {
            throw new IllegalArgumentException();
        }
        int startCodePoint = iterator.next();

        if (BaseTypeUtils.isBaseType(startCodePoint)) {
            return new BaseType(startCodePoint);
        }

        if (startCodePoint == 'V') {
            return VoidSignature.getInstance();
        }

        switch (startCodePoint) {
            case RIGHT, ARGUMENT_LIST_END_SYMBOL -> {
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
            case ARGUMENT_LIST_START_SYMBOL -> {
                return buildMethodType(iterator);
            }
            default -> throw new IllegalArgumentException();
        }
    }

    private Signature buildMethodType(Iterator<Integer> iterator) {
        List<Signature> argumentSignatures = new ArrayList<>();

        while (true) {
            Signature signature = build(iterator);
            if (signature instanceof FakeType) {
                break;
            }
            argumentSignatures.add(signature);
        }

        Signature retSignature = build(iterator);

        return new MethodSignature(argumentSignatures, retSignature);
    }


    protected ReferenceType buildReferenceType(Iterator<Integer> iterator) {
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

    protected GenericType buildGenericType(Iterator<Integer> iterator) {
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

    @Override
    public Signature build(String raw) {
        CodePointsInfo codePointsInfo = new CodePointsInfo(raw);
        return build(codePointsInfo.iterator());
    }
}
