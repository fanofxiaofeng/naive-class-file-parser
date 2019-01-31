package com.study.parser;

import com.study.type.info.CodeAttribute;

import java.io.IOException;

public class Toy {

    public static void main(String[] args) throws Exception, IOException {
        try {
            int a = 12;
        } catch (RuntimeException | AssertionError e) {
            e.printStackTrace();
        }
    }

//    private int f(int[] a, List<Map<Long, List<Set<String>>>> b, Object c) {
//        return -1;
//    }
//
//    protected double g() {
//        return 0;
//    }
//
//    public Object h() {
//        return null;
//    }
}
