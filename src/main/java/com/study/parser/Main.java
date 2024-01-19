package com.study.parser;

import com.study.constants.PresentKind;
import com.study.present.MainPresenter;
import com.study.io.BasicInputStream;

import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.EnumSet;

public class Main {

    private int a = 42;

    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream(args[0]);
        PrintStream printStream = new PrintStream("scripts/result/output.txt");
//        PrintStream printStream = new PrintStream(new File("/Users/jinyang/Desktop/output.txt"));
        BasicInputStream basicInputStream = new BasicInputStream(inputStream);
        ParseResult parseResult = new BasicParser(basicInputStream).build();
        MainPresenter presenter = new MainPresenter(parseResult, printStream);
        presenter.present(EnumSet.allOf(PresentKind.class));
    }
}
