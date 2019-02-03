package com.test.parser;

import com.study.io.BasicInputStream;
import com.study.parser.BasicParser;
import com.study.parser.ParseResult;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintStream;

public class BasicParserTest {
    @Test
    public void run() throws Exception {
        FileInputStream inputStream = new FileInputStream("target/classes/com/study/parser/BasicParser.class");
        PrintStream printStream = new PrintStream(new File("/Users/jinyang/Desktop/output.txt"));
        BasicInputStream basicInputStream = new BasicInputStream(inputStream);
        ParseResult parseResult = new BasicParser(basicInputStream).build();
    }

    @Test
    public void runWithConsole() throws Exception {
        FileInputStream inputStream = new FileInputStream("target/classes/com/study/parser/Toy.class");
        BasicInputStream basicInputStream = new BasicInputStream(inputStream);
        ParseResult parseResult = new BasicParser(basicInputStream).build();
        parseResult.show(System.out);
    }
}
