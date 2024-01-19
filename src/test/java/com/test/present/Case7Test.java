package com.test.present;

import com.test.cases.Case7;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class Case7Test extends PresenterTestBase {

    @Test
    public void test() throws IOException {
        String[] results = getResults(Case7.class);

        Assert.assertEquals("   #2 = Class              #4             // java/lang/Object", results[2]);
        Assert.assertEquals("   #7 = Class              #8             // com/test/cases/Case7$1", results[7]);
        Assert.assertEquals("  #10 = Class              #11            // com/test/cases/Case7", results[10]);
        Assert.assertEquals("  #24 = Class              #25            // com/test/cases/Case7$Case7_2", results[24]);
        Assert.assertEquals("  #26 = Class              #27            // com/test/cases/Case7$Case7_1", results[26]);
        Assert.assertEquals("  #28 = Class              #29            // com/test/cases/Case7$1Case7_3", results[28]);
    }
}
