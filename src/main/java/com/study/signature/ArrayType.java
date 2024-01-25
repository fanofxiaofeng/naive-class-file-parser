package com.study.signature;

import java.util.List;

public class ArrayType implements Signature {
    private final Signature signature;

    public ArrayType(Signature signature) {
        this.signature = signature;
    }

    @Override
    public List<String> desc() {
        String desc = signature.desc() + "[]";
        return List.of(desc);
    }
}
