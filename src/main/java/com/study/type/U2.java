package com.study.type;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

public final class U2 extends AbstractU implements Iterable<Integer> {

    public U2(int a, int b) {
        rangeCheck(a, b);
        fillDetail(a, b);
    }

    public U2(U1 a, U1 b) {
        fillDetail(a, b);
    }

    public int toSignedInt() {
        int raw = toInt();
        if (raw > Short.MAX_VALUE) {
            return raw - 0x10000;
        }
        return raw;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            final int end = U2.this.toInt();
            int current = -1;

            @Override
            public boolean hasNext() {
                return current + 1 < end;
            }

            @Override
            public Integer next() {
                return ++current;
            }
        };
    }

    public <U> List<U> mapToList(Supplier<? extends U> supplier) {
        List<U> result = new ArrayList<>(this.toInt());
        for (int i : this) {
            result.add(supplier.get());
        }
        return result;
    }
}

