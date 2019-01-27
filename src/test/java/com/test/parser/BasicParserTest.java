package com.test.parser;

import com.study.io.BasicInputStream;
import com.study.parser.BasicParser;
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
        new BasicParser(basicInputStream, printStream).build().show();
    }

    @Test
    public void runWithConsole() throws Exception {
        FileInputStream inputStream = new FileInputStream("target/classes/com/study/parser/BasicParser.class");
        BasicInputStream basicInputStream = new BasicInputStream(inputStream);
        new BasicParser(basicInputStream).build().show();
    }
}
