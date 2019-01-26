package com.test.parser;

import com.study.parser.Main;
import org.junit.Test;

public class MainTest {

    @Test
    public void test() throws Exception {
        String[] args = new String[]{"target/classes/com/study/parser/Toy.class"};
        Main.main(args);
    }
}
