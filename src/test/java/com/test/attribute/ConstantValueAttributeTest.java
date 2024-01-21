package com.test.attribute;

import com.test.cases.Case;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ConstantValueAttributeTest extends AttributeTestBase {

    @Test
    public void test() throws IOException {
        String[] results = getResults();

        List<String> matchedLines = Arrays.stream(results).filter(line -> line.contains("ConstantValue:")).toList();

        Assert.assertEquals("    ConstantValue: int 42", matchedLines.get(0));
        Assert.assertEquals("    ConstantValue: long 102420140124l", matchedLines.get(1));
        Assert.assertEquals("    ConstantValue: float 3.1415925f", matchedLines.get(2));
        Assert.assertEquals("    ConstantValue: double 1.2345678998765433E8d", matchedLines.get(3));
        Assert.assertEquals("    ConstantValue: String Hello world", matchedLines.get(4));
    }

    @Override
    protected Class<? extends Case> forCase() {
        return C.class;
    }
}
