package com.test.generator;

import com.test.presenter.PresenterTestBase;
import org.junit.After;
import org.junit.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class UniqueLinePresenterTestBase extends PresenterTestBase {

    protected static Map<String, Integer> realLineMap = new HashMap<>();
    protected List<String> expectedLines;

    @After
    public void validate() {
        expectedLines.forEach(expectedLine -> {
            int count = realLineMap.get(expectedLine);
            Assert.assertEquals(
                    String.format("There should be exactly one line that matches expectedLine: [%s]", expectedLine),
                    1,
                    count
            );
            System.out.printf("Test passed for [%s] (line count: 1)%n", expectedLine);
        });
    }
}
