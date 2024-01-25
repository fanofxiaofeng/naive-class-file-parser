package com.study.util;

public class ClassNameUtils {
    public static String dashToDot(String rawName) {
        return rawName.replace('/', '.');
    }
}
