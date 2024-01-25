package com.study.signature;

import java.util.ArrayList;
import java.util.List;

public record MethodSignature(List<Signature> argumentSignatureList, Signature retSignature) implements Signature {

    @Override
    public List<String> desc() {
        List<String> result = new ArrayList<>();

        result.add(retSignature.desc().get(0));
        argumentSignatureList.forEach(e -> result.add(e.desc().get(0)));

        return result;
    }
}
