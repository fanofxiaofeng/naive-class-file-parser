package com.test.attribute.synthetic;

import com.study.constants.PresentKind;
import com.study.io.BasicInputStream;
import com.study.parser.MainParser;
import com.study.parser.ParseResult;
import com.study.parser.Parser;
import com.study.present.MainPresenter;
import com.study.util.PrintStreamWrapper;
import com.test.attribute.AttributePresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

public class SyntheticAttributePresenterTest extends AttributePresenterTestBase {

    @Before
    public void prepare() throws IOException {
        String dirName = "src/test/resources/com/generated/attribute/synthetic";

        InputStream inputStream = new FileInputStream(dirName + "/Generated.class");
        PrintStream printStream = new PrintStream(OUTPUT_FILE_NAME);
        PrintStreamWrapper printStreamWrapper = new PrintStreamWrapper(printStream);
        BasicInputStream basicInputStream = new BasicInputStream(inputStream);

        Parser<ParseResult> mainParser = new MainParser(basicInputStream);
        ParseResult parseResult = mainParser.parse();

        MainPresenter presenter = new MainPresenter(parseResult, printStreamWrapper, EnumSet.allOf(PresentKind.class));
        presenter.present();

        try (FileInputStream fileInputStream = new FileInputStream(OUTPUT_FILE_NAME)) {
            String[] results = new String(fileInputStream.readAllBytes()).split(System.lineSeparator());
            realLines = Arrays.stream(results).toList();
        }
    }

    @Test
    public void test() throws IOException {
        expectedLines = List.of("Synthetic: true");
    }
}
