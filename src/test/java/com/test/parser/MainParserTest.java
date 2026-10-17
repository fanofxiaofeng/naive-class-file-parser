package com.test.parser;

import com.study.io.BasicInputStream;
import com.study.parser.MainParser;
import com.study.parser.ParseResult;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.PrintStream;

public class MainParserTest {
    @Test
    public void run() throws Exception {
        FileInputStream inputStream = new FileInputStream("target/classes/com/study/parser/MainParser.class");
        PrintStream printStream = new PrintStream("scripts/result/output.txt");
        BasicInputStream basicInputStream = new BasicInputStream(inputStream);
        ParseResult parseResult = new MainParser(basicInputStream).parse();
    }
}
