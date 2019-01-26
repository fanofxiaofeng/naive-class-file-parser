package com.study.parser;

import com.study.io.BasicInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream(args[0]);
        PrintStream printStream = new PrintStream(new File("/Users/jinyang/Desktop/output.txt"));
        BasicInputStream basicInputStream = new BasicInputStream(inputStream);
        new BasicParser(basicInputStream, printStream).build().show();
    }
}
