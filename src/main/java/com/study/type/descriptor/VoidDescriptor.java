package com.study.type.descriptor;

public final class VoidDescriptor {

    private VoidDescriptor() {
    }

    private static final VoidDescriptor instance = new VoidDescriptor();

    public static VoidDescriptor getInstance() {
        return instance;
    }

    public String desc() {
//        return "V";
        return "void";
    }
}
