package com.study.util;

import java.util.List;
import java.util.stream.IntStream;

public class SignatureUtils {
    public static String convertToString(List<Integer> codePoints) {
        int size = codePoints.size();
        int[] data = new int[size];
        IntStream.range(0, size).forEach(index -> data[index] = codePoints.get(index));

        return new String(data, 0, data.length);
    }

}
