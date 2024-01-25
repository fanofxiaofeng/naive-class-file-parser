package com.study.signature;

import java.util.List;

public class VoidSignature implements Signature {


    private VoidSignature() {
    }

    private static final VoidSignature instance = new VoidSignature();

    public static VoidSignature getInstance() {
        return instance;
    }

    @Override
    public List<String> desc() {
        return List.of("V");
    }
}
