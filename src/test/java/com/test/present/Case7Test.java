package com.test.present;

import com.test.cases.Case;
import com.test.cases.Case7;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class Case7Test extends CaseTestBase {

    @Test
    public void test() throws IOException {
        String[] results = getResults();

        Assert.assertEquals("   #2 = Class              #4             // java/lang/Object", results[2]);
        Assert.assertEquals("   #7 = Class              #8             // com/test/cases/Case7$1", results[7]);
        Assert.assertEquals("  #12 = Class              #13            // com/test/cases/Case", results[12]);
        Assert.assertEquals("  #26 = Class              #27            // com/test/cases/Case7$Case7_2", results[26]);
        Assert.assertEquals("  #28 = Class              #29            // com/test/cases/Case7$Case7_1", results[28]);
        Assert.assertEquals("  #30 = Class              #31            // com/test/cases/Case7$1Case7_3", results[30]);
    }

    @Override
    protected Class<? extends Case> forCase() {
        return Case7.class;
    }
}
