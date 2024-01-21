package com.study.type;

import com.study.type.info.FieldInfo;

import java.util.Iterator;

public record Fields(U2 fieldsCount, FieldInfo[] items) implements Iterable<FieldInfo> {

    @Override
    public Iterator<FieldInfo> iterator() {
        return new Iterator<>() {

            int currentIndex = -1;

            @Override
            public boolean hasNext() {
                return currentIndex + 1 < items.length;
            }

            @Override
            public FieldInfo next() {
                int nextIndex = currentIndex + 1;
                currentIndex = nextIndex;
                return items[nextIndex];
            }
        };
    }
}
