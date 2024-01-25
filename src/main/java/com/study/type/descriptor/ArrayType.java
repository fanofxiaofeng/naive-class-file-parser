package com.study.type.descriptor;

public final class ArrayType implements FieldType {

    private final FieldType componentType;

    public ArrayType(FieldType componentType) {
        this.componentType = componentType;
    }

    @Override
    public String desc() {
        return componentType.desc() + "[]";
    }

    public String descForVarArgs() {
        return componentType.desc() + "...";
    }
}
