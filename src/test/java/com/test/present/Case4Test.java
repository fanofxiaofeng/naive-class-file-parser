package com.test.present;

import com.test.cases.Case;
import com.test.cases.Case4;
import org.junit.Assert;
import org.junit.Test;

public class Case4Test extends CaseTestBase {
    @Test
    public void test() throws Exception {
        String[] results = getResults();

        Assert.assertEquals("   #7 = Float              42.0f", results[7]);
        Assert.assertEquals("  #16 = Float              3.4028235E38f", results[16]);
        Assert.assertEquals("  #20 = Float              1.4E-45f", results[20]);
        Assert.assertEquals("  #24 = Float              -Infinityf", results[24]);
        Assert.assertEquals("  #28 = Float              Infinityf", results[28]);
        Assert.assertEquals("  #32 = Float              NaNf", results[32]);
        Assert.assertEquals("  #36 = Float              1.234567f", results[36]);
        Assert.assertEquals("  #42 = Float              3.1415927f", results[42]);
        Assert.assertEquals("  #46 = Float              2.7182817f", results[46]);
    }

    @Override
    protected Class<? extends Case> forCase() {
        return Case4.class;
    }
}
