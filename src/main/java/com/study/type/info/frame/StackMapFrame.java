package com.study.type.info.frame;

public abstract class StackMapFrame {
    public abstract String desc();

    public boolean hasDetail() {
        return false;
    }

    public String[] detail() {
        return new String[0];
    }
}
