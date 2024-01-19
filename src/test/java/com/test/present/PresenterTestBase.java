package com.test.present;

import com.study.constants.PresentKind;
import com.study.io.BasicInputStream;
import com.study.parser.BasicParser;
import com.study.parser.ParseResult;
import com.study.present.MainPresenter;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.EnumSet;

public abstract class PresenterTestBase {

    private static final String OUTPUT_FILE_NAME = "scripts/result/output.txt";

    protected String[] getResults(Class clazz) throws IOException {
        String canonicalName = clazz.getCanonicalName();
        String fileName = String.format("target/test-classes/%s.class", canonicalName.replaceAll("\\.", "/"));
        FileInputStream inputStream = new FileInputStream(fileName);
        PrintStream printStream = new PrintStream(OUTPUT_FILE_NAME);
        BasicInputStream basicInputStream = new BasicInputStream(inputStream);
        ParseResult parseResult = new BasicParser(basicInputStream).build();
        MainPresenter presenter = new MainPresenter(parseResult, printStream);
        presenter.present(EnumSet.of(PresentKind.CONSTANT_POOL));

        try (FileInputStream fileInputStream = new FileInputStream(OUTPUT_FILE_NAME)) {
            return new String(fileInputStream.readAllBytes()).split("\n");
        }
    }
}
