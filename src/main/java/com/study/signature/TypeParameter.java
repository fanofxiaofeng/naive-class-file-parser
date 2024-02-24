package com.study.signature;

import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;

public record TypeParameter(String identifier,
                            Optional<ReferenceTypeSignature> classBound,
                            List<ReferenceTypeSignature> interfaceBound) {
    // Identifier ClassBound {InterfaceBound}

    public String desc() {
        StringJoiner joiner = new StringJoiner(" & ");

        classBound.ifPresent(referenceTypeSignature -> joiner.add(referenceTypeSignature.desc()));

        if (!interfaceBound.isEmpty()) {
            interfaceBound.stream().map(JavaTypeSignature::desc).forEach(joiner::add);
        }

        if (joiner.length() > 0) {
            return String.format("%s extends %s", identifier, joiner);
        }

        return identifier;
    }

}
