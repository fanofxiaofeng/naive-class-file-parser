package com.test.generator;

import com.study.constants.PresentKind;
import com.test.present.PresenterTestBase;
import org.junit.After;
import org.junit.Assert;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public abstract class ConsecutiveLinesPresenterTestBase extends PresenterTestBase {

    protected static List<String> realLines;
    protected List<String> expectedConsecutiveLines;

    protected void buildRealLines(Class<?> clazz, Set<PresentKind> kinds) throws IOException {
        String[] results = getResults(clazz, kinds);
        realLines = Arrays.stream(results).toList();
    }

    @After
    public void validate() {
        String headerLine = expectedConsecutiveLines.get(0);
        long count = realLines.stream().filter(line -> line.equals(headerLine)).count();
        Assert.assertEquals(String.format("There should be exactly one line that matches headerLine: [%s]", headerLine)
                , 1L, count);
        IntStream.range(0, realLines.size()).forEach(index -> {
            String realLine = realLines.get(index);
            if (!realLine.equals(headerLine)) {
                return;
            }
            for (int i = 1; i < expectedConsecutiveLines.size(); i++) {
                Assert.assertEquals("i is: " + i, expectedConsecutiveLines.get(i), realLines.get(index + i));
            }
        });
        System.out.printf("Test passed for [%s] (line count: %s)%n", headerLine, expectedConsecutiveLines.size());
    }
}
