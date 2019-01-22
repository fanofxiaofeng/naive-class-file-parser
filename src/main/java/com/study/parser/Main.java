package com.study.parser;

import com.study.io.BasicInputStream;

import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) throws Exception {
//        System.out.println(Arrays.tolString(args));
        FileInputStream inputStream = new FileInputStream(args[0]);
        BasicInputStream basicInputStream = new BasicInputStream(inputStream);
        new BasicParser(basicInputStream).build().show();
    }
}
