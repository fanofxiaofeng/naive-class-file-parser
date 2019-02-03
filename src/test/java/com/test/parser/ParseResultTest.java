package com.test.parser;

import com.study.io.BasicInputStream;
import com.study.parser.BasicParser;
import com.study.parser.ParseResult;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.PrintStream;

public class ParseResultTest {
    @Test
    public void show() throws Exception {
        FileInputStream inputStream = new FileInputStream("target/classes/com/study/parser/Toy.class");
        BasicInputStream basicInputStream = new BasicInputStream(inputStream);
        ParseResult parseResult = new BasicParser(basicInputStream).build();
        parseResult.show(System.out);
    }

    @Test
    public void showWithFile() throws Exception {
        FileInputStream inputStream = new FileInputStream("target/classes/com/study/parser/ParseResult.class");
        BasicInputStream basicInputStream = new BasicInputStream(inputStream);
        ParseResult parseResult = new BasicParser(basicInputStream).build();
        PrintStream printStream = new PrintStream("scripts/result/output.txt");
//        PrintStream printStream = new PrintStream(new File("/Users/jinyang/Desktop/study/naive-class-file-parser/scripts/result/output.txt"));
        parseResult.show(printStream);
    }

}
