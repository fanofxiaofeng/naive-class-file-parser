package com.study.signature;

import java.util.List;
import java.util.StringJoiner;

public class SimpleClassTypeSignature {
    private final String identifier;
    private final List<TypeArgument> typeArguments;

    public SimpleClassTypeSignature(String identifier, List<TypeArgument> typeArguments) {
        this.identifier = identifier;
        this.typeArguments = typeArguments;
    }

    public String desc() {
        if (typeArguments.isEmpty()) {
            return identifier;
        }
        StringJoiner joiner = new StringJoiner(", ");
        typeArguments.forEach(typeArgument -> joiner.add(typeArgument.desc()));
        return String.format("%s<%s>", identifier, joiner);
    }
}
