package com.study.signature.builder;

import com.study.util.SignatureUtils;
import org.apache.commons.collections4.iterators.PeekingIterator;

import java.util.Iterator;
import java.util.List;

public interface Builder<T> {
    char LEFT_ANGLE_BRACKET = '<';
    char RIGHT_ANGLE_BRACKET = '>';

    char LEFT_PARENTHESIS = '(';

    char RIGHT_PARENTHESIS = ')';
    char COLON = ':';

    T build(PeekingIterator<Integer> peekingIterator);

    default void dropOneItem(Iterator<Integer> iterator) {
        iterator.next();
    }

    default void dropExpectedItem(Iterator<Integer> iterator, char expectedItem) {
        int realItem = iterator.next();
        if (realItem != expectedItem) {
            String message = String.format("'%s' was expected here, but we got '%s' instead",
                    expectedItem,
                    SignatureUtils.convertToString(List.of(realItem))
            );
            throw new IllegalArgumentException(message);
        }
    }
}
