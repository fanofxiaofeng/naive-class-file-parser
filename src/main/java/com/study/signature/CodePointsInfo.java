package com.study.signature;

import java.util.Iterator;

public class CodePointsInfo implements Iterable<Integer> {

    private final int[] codePoints;

    public CodePointsInfo(String raw) {
        this.codePoints = raw.codePoints().toArray();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {

            int next = -1;

            @Override
            public boolean hasNext() {
                return next + 1 < codePoints.length;
            }

            @Override
            public Integer next() {
                int codePoint = codePoints[next + 1];
                next++;
//                System.out.printf("You fetched [%s]\n", (char) codePoint);
                return codePoint;
            }
        };
    }
}
