package com.test.present;

import com.study.constants.PresentKind;
import com.study.io.BasicInputStream;
import com.study.parser.MainParser;
import com.study.parser.ParseResult;
import com.study.parser.Parser;
import com.study.present.MainPresenter;
import com.study.util.PathUtils;
import com.study.util.PrintStreamWrapper;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.EnumSet;

public abstract class PresenterTestBase {

    private static final String OUTPUT_FILE_NAME = "scripts/result/output.txt";

    private String buildFileName(Class clazz) {
        String canonicalName = clazz.getCanonicalName();
        System.out.println(clazz.getSimpleName());
        System.out.println(canonicalName);
        return PathUtils.convert(canonicalName);
    }

    protected String[] getResults(Class clazz, PresentKind presentKind) throws IOException {
        String fileName = buildFileName(clazz);
        InputStream inputStream = PresenterTestBase.class.getClassLoader().getResourceAsStream(fileName);
        PrintStream printStream = new PrintStream(OUTPUT_FILE_NAME);
        PrintStreamWrapper printStreamWrapper = new PrintStreamWrapper(printStream);
        BasicInputStream basicInputStream = new BasicInputStream(inputStream);

        Parser<ParseResult> mainParser = new MainParser(basicInputStream);
        ParseResult parseResult = mainParser.parse();

        MainPresenter presenter = new MainPresenter(parseResult, printStreamWrapper);
        presenter.present(EnumSet.of(presentKind));

        try (FileInputStream fileInputStream = new FileInputStream(OUTPUT_FILE_NAME)) {
            return new String(fileInputStream.readAllBytes()).split("\n");
        }
    }
}
