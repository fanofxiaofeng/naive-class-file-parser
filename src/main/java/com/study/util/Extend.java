package com.study.util;

public class Extend {
    public static void extentTo(StringBuilder stringBuilder, int length) {
        while (stringBuilder.length() < length) {
            stringBuilder.append(' ');
        }
    }
}
