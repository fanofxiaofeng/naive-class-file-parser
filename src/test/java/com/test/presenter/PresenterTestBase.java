package com.test.presenter;

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
import java.util.Set;

public abstract class PresenterTestBase {

    protected static final String OUTPUT_FILE_NAME = "scripts/result/output.txt";

    private static String buildFileName(Class<?> clazz) {
        return PathUtils.convert(clazz.getName());
    }

    protected static String[] getResults(Class<?> clazz, PresentKind presentKind) throws IOException {
        return getResults(clazz, EnumSet.of(presentKind));
    }

    protected static String[] getResults(Class<?> clazz, Set<PresentKind> presentKinds) throws IOException {
        String fileName = buildFileName(clazz);
        InputStream inputStream = PresenterTestBase.class.getClassLoader().getResourceAsStream(fileName);
        return getResults(inputStream, presentKinds);
    }

    protected static String[] getResults(InputStream inputStream, Set<PresentKind> presentKinds) throws IOException {
        PrintStream printStream = new PrintStream(OUTPUT_FILE_NAME);
        PrintStreamWrapper printStreamWrapper = new PrintStreamWrapper(printStream);
        BasicInputStream basicInputStream = new BasicInputStream(inputStream);

        Parser<ParseResult> mainParser = new MainParser(basicInputStream);
        ParseResult parseResult = mainParser.parse();

        MainPresenter presenter = new MainPresenter(parseResult, printStreamWrapper, presentKinds);
        presenter.present();

        try (FileInputStream fileInputStream = new FileInputStream(OUTPUT_FILE_NAME)) {
            return new String(fileInputStream.readAllBytes()).split(System.lineSeparator());
        }
    }
}
