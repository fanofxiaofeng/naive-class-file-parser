package com.test.present;

import com.study.constants.PresentKind;
import com.study.io.BasicInputStream;
import com.study.parser.BasicParser;
import com.study.parser.ParseResult;
import com.study.present.MainPresenter;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.EnumSet;

public class PresenterTest {

    @Test
    public void onlyVersion() throws Exception {
        FileInputStream inputStream = new FileInputStream("target/classes/com/study/parser/BasicParser.class");
        PrintStream printStream = new PrintStream("scripts/result/output.txt");
        BasicInputStream basicInputStream = new BasicInputStream(inputStream);
        ParseResult parseResult = new BasicParser(basicInputStream).build();
        MainPresenter presenter = new MainPresenter(parseResult, printStream);
        presenter.present(EnumSet.of(PresentKind.VERSION));

        try (FileInputStream fileInputStream = new FileInputStream("scripts/result/output.txt")) {
            String[] results = new String(fileInputStream.readAllBytes()).split("\n");
            Assert.assertEquals("minor version: 0", results[0].trim());
            Assert.assertEquals("major version: 61", results[1].trim());
        }
    }

    @Test
    public void onlyAccessFlags() throws Exception {
        FileInputStream inputStream = new FileInputStream("target/test-classes/com/test/present/C1.class");
        PrintStream printStream = new PrintStream("scripts/result/output.txt");
        BasicInputStream basicInputStream = new BasicInputStream(inputStream);
        ParseResult parseResult = new BasicParser(basicInputStream).build();
        MainPresenter presenter = new MainPresenter(parseResult, printStream);
        presenter.present(EnumSet.of(PresentKind.ACCESS_FLAGS));

        try (FileInputStream fileInputStream = new FileInputStream("scripts/result/output.txt")) {
            String[] results = new String(fileInputStream.readAllBytes()).split("\n");
            Assert.assertEquals("flags: (0x2601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT, ACC_ANNOTATION", results[0].trim());
        }
    }

    @Test
    public void onlyThisClass() throws Exception {
        FileInputStream inputStream = new FileInputStream("target/test-classes/com/test/present/C1.class");
        PrintStream printStream = new PrintStream("scripts/result/output.txt");
        BasicInputStream basicInputStream = new BasicInputStream(inputStream);
        ParseResult parseResult = new BasicParser(basicInputStream).build();
        MainPresenter presenter = new MainPresenter(parseResult, printStream);
        presenter.present(EnumSet.of(PresentKind.THIS_CLASS));

        try (FileInputStream fileInputStream = new FileInputStream("scripts/result/output.txt")) {
            String[] results = new String(fileInputStream.readAllBytes()).split("\n");
            Assert.assertEquals("this_class: #1                          // com/test/present/C1", results[0].trim());
        }
    }

    @Test
    public void onlySuperClass() throws Exception {
        FileInputStream inputStream = new FileInputStream("target/test-classes/com/test/present/C1.class");
        PrintStream printStream = new PrintStream("scripts/result/output.txt");
        BasicInputStream basicInputStream = new BasicInputStream(inputStream);
        ParseResult parseResult = new BasicParser(basicInputStream).build();
        MainPresenter presenter = new MainPresenter(parseResult, printStream);
        presenter.present(EnumSet.of(PresentKind.SUPER_CLASS));

        try (FileInputStream fileInputStream = new FileInputStream("scripts/result/output.txt")) {
            String[] results = new String(fileInputStream.readAllBytes()).split("\n");
            Assert.assertEquals("super_class: #3                         // java/lang/Object", results[0].trim());
        }

    }
}
