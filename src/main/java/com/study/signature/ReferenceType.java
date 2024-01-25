package com.study.signature;

import java.util.List;
import java.util.StringJoiner;

public class ReferenceType implements Signature {

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
    public List<String> desc() {
        if (children.isEmpty()) {
            return List.of(desc(codePoints));
        }

        StringJoiner joiner = new StringJoiner(", ");
        children.forEach(e -> joiner.add(e.desc().get(0)));
        String childrenDesc = joiner.toString();

        String desc = String.format("%s<%s>", desc(codePoints), childrenDesc);
        return List.of(desc);
    }
}
