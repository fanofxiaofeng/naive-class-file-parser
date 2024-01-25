package com.study.type;

import java.util.Iterator;

public class U2 extends AbstractU implements Iterable<Integer> {

    public U2(int a, int b) {
        fillDetail(a, b);
    }

    public U2(U1 a, U1 b) {
        fillDetail(a, b);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            int end = U2.this.toInt();
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
}

