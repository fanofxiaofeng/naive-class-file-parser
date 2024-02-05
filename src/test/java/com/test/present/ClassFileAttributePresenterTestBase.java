package com.test.present;

import com.study.constants.PresentKind;
import com.test.generator.ConsecutiveLinesPresenterTestBase;

import java.io.IOException;
import java.util.Arrays;

public class ClassFileAttributePresenterTestBase extends ConsecutiveLinesPresenterTestBase {

    protected static void buildRealLines(Class<?> clazz) throws IOException {
        String[] results = getResults(clazz, PresentKind.ATTRIBUTES);
        realLines = Arrays.stream(results).toList();
    }
}
