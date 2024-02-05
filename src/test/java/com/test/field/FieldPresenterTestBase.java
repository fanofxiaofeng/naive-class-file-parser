package com.test.field;

import com.study.constants.PresentKind;
import com.test.generator.ConsecutiveLinesPresenterTestBase;

import java.io.IOException;
import java.util.Arrays;

public class FieldPresenterTestBase extends ConsecutiveLinesPresenterTestBase {

    protected static void buildRealLines(Class<?> clazz) throws IOException {
        String[] results = getResults(clazz, PresentKind.FIELDS);
        realLines = Arrays.stream(results).toList();
    }
}
