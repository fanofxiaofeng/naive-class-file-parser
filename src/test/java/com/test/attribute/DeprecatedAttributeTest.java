package com.test.attribute;

import com.test.attribute.cases.DeprecatedCase;
import com.test.cases.Case;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;


public class DeprecatedAttributeTest extends AttributeTestBase {

    // todo: only field annotation was tested for now...
    @Test
    public void test() throws IOException {
        String[] results = getResults();
        List<String> matchedLines = Arrays.stream(results).filter(line -> line.contains("Deprecated:")).toList();

        Assert.assertEquals("    Deprecated: true", matchedLines.get(0));
    }

    @Override
    protected Class<? extends Case> forCase() {
        return DeprecatedCase.class;
    }
}
