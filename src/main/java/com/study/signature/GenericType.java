package com.study.signature;

import java.util.List;

public class GenericType extends AbstractSignature {

    private final List<Integer> codePoints;

    public GenericType(List<Integer> codePoints) {
        this.codePoints = codePoints;
    }

    // todo
    @Override
    public String desc() {
        return desc(codePoints);
    }
}
