package com.test.present;

import com.test.cases.Case;
import com.test.cases.Case3;
import org.junit.Assert;
import org.junit.Test;

public class Case3Test extends CaseTestBase {
    @Test
    public void test() throws Exception {
        String[] results = getResults();

        Assert.assertEquals("  #15 = Integer            2147483647", results[15]);
        Assert.assertEquals("  #19 = Integer            -2147483648", results[19]);
    }

    @Override
    protected Class<? extends Case> forCase() {
        return Case3.class;
    }
}
