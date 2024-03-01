package com.test.attribute;

import com.study.constants.PresentKind;
import com.test.presenter.PresenterTestBase;
import org.junit.After;
import org.junit.Assert;

import java.io.IOException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class AttributePresenterTestBase extends PresenterTestBase {
    protected List<String> realLines;
    protected List<String> expectedLines;

    protected void buildRealLines(Class<?> clazz) throws IOException {
        String[] results = getResults(clazz, PresentKind.FIELDS);
        realLines = Arrays.stream(results).toList();
    }

    protected void buildRealLines(Class<?> clazz, Set<PresentKind> kinds) throws IOException {
        String[] results = getResults(clazz, kinds);
        realLines = Arrays.stream(results).toList();
    }

    @After
    public void validate() {
        Map<String, Long> expectedCountMap = expectedLines.
                stream().
                collect(Collectors.groupingBy(Function.identity(), Collectors.summingLong(line -> 1L)));
        expectedCountMap.forEach((line, expectedCount) -> {
            long realCount = realLines.stream().filter(e -> e.equals(line)).count();
            String message = String.format("expected line content: [%s] not found!", line);
            Assert.assertEquals(message, expectedCount.longValue(), realCount);
        });
        System.out.println("Test passed...");
    }
}
