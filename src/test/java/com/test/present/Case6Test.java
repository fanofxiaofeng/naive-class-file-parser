package com.test.present;

import com.test.cases.Case;
import com.test.cases.Case6;
import org.junit.Assert;
import org.junit.Test;

public class Case6Test extends CaseTestBase {
    @Test
    public void test() throws Exception {
        String[] results = getResults();

        Assert.assertEquals("   #7 = Double             42.0d", results[7]);
        Assert.assertEquals("  #17 = Double             1.7976931348623157E308d", results[16]);
        Assert.assertEquals("  #22 = Double             4.9E-324d", results[20]);
        Assert.assertEquals("  #27 = Double             Infinityd", results[24]);
        Assert.assertEquals("  #32 = Double             -Infinityd", results[28]);
        Assert.assertEquals("  #37 = Double             NaNd", results[32]);
        Assert.assertEquals("  #44 = Double             3.141592653589793d", results[38]);
        Assert.assertEquals("  #49 = Double             2.718281828459045d", results[42]);
        Assert.assertEquals("  #54 = Double             1.23456789d", results[46]);
    }

    @Override
    protected Class<? extends Case> forCase() {
        return Case6.class;
    }
}
