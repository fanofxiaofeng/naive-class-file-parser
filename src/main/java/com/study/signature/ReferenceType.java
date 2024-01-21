package com.study.signature;

import java.util.List;
import java.util.StringJoiner;

public class ReferenceType extends AbstractSignature {

    private final List<Integer> codePoints;

    private final List<Signature> children;

    public ReferenceType(List<Integer> codePoints) {
        this(codePoints, List.of());
    }

    public ReferenceType(List<Integer> codePoints, List<Signature> children) {
        this.codePoints = codePoints;
        this.children = children;
    }

    @Override
    public String desc() {
        if (children.isEmpty()) {
            return desc(codePoints);
        }

        StringJoiner joiner = new StringJoiner(", ");
        children.forEach(e -> joiner.add(e.desc()));
        String childrenDesc = joiner.toString();

        return String.format("%s<%s>", desc(codePoints), childrenDesc);
    }
}
