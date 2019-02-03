package com.study.parser;

import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

public class Toy implements Serializable {

    private Map<String, Integer> map;

    public static void main(String[] args) throws Exception, IOException, ArithmeticException {
        int start = 1;
        int end = 100;
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
