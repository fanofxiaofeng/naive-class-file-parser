package com.study.constants;

public interface FlagHolder {

    int getFlag();

    default String getSimpleName() {
        return toString().replace("ACC_", "").toLowerCase();
    }
}
