package com.study.type;

import java.util.Iterator;
import java.util.List;

public record ItemsContainer<T>(List<T> items) implements Iterable<T> {

    @Override
    public Iterator<T> iterator() {
        return items.iterator();
    }

    public int getCount() {
        return items.size();
    }
}
