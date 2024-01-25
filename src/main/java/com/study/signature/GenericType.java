package com.study.signature;

import java.util.List;

public class GenericType implements Signature {

    private final List<Integer> codePoints;

    public GenericType(List<Integer> codePoints) {
        this.codePoints = codePoints;
    }

    // todo
    @Override
    public List<String> desc() {
        String desc = desc(codePoints);
        return List.of(desc);
    }
}
