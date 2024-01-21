package com.test.present;

import com.test.cases.Case;
import com.test.cases.Case5;
import org.junit.Assert;
import org.junit.Test;

public class Case5Test extends CaseTestBase {
    @Test
    public void test() throws Exception {
        String[] results = getResults();

        Assert.assertEquals("   #7 = Long               42l", results[7]);
        Assert.assertEquals("  #17 = Long               9223372036854775807l", results[16]);
        Assert.assertEquals("  #22 = Long               -9223372036854775808l", results[20]);
    }

    @Override
    protected Class<? extends Case> forCase() {
        return Case5.class;
    }
}
