package com.study.signature;

import java.util.List;

public interface Signature {

//    List<String> desc();

    default int[] to(List<Integer> codePoints) {
        int[] ans = new int[codePoints.size()];
        int index = 0;
        for (int codePoint : codePoints) {
            ans[index] = (codePoint == '/' ? '.' : codePoint);
            index++;
        }
        return ans;
    }

    default String desc(List<Integer> codePoints) {
        int[] holder = to(codePoints);
        return new String(holder, 0, holder.length);
    }

}
