package com.study.type.descriptor;

import java.util.List;

public final class ObjectType implements FieldType {

    private final String className;

    public ObjectType(List<Integer> elements) {
        int[] codePoints = new int[elements.size()];
        int index = 0;
        for (int e : elements) {
            codePoints[index] = e;
            index++;
        }
        this.className = new String(codePoints, 0, codePoints.length);
    }

    public ObjectType(String className) {
        this.className = className;
    }

    @Override
    public String desc() {
        // todo: check whether inner class is OK, too
        return className.replaceAll("/", ".");
    }
}
