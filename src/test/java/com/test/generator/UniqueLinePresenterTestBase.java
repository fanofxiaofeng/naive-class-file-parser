package com.test.generator;

import com.study.constants.PresentKind;
import com.test.present.PresenterTestBase;
import org.junit.After;
import org.junit.Assert;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public abstract class UniqueLinePresenterTestBase extends PresenterTestBase {

    protected List<String> realLines = new ArrayList<>();
    protected List<String> expectedLines;

    protected abstract Set<PresentKind> presentKinds();

    protected void buildRealLines(Class<?> clazz) throws IOException {
        String[] results = getResults(clazz, presentKinds());

        realLines = Arrays.stream(results).
                filter(this::shouldProcessThisItem).
                collect(Collectors.toList());
    }

    protected boolean shouldProcessThisItem(String line) {
        return true;
    }

    @After
    public void validate() {
        expectedLines.forEach(expectedLine -> {
            long count = realLines.stream().filter(line -> line.equals(expectedLine)).count();
            Assert.assertEquals(
                    String.format("There should be exactly one line that matches expectedLine: [%s]", expectedLine),
                    1L,
                    count
            );
            System.out.printf("Test passed for [%s] (line count: 1)%n", expectedLine);
        });
    }
}
