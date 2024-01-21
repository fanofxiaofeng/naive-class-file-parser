package com.test.present;

import com.test.cases.Case;
import com.test.cases.Case12;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class Case12Test extends CaseTestBase {

    @Test
    public void test() throws IOException {
        String[] results = getResults();

        Assert.assertEquals("   #3 = NameAndType        #5:#6          // \"<init>\":()V", results[3]);
        Assert.assertEquals("   #9 = NameAndType        #11:#12        // a:I", results[9]);
        Assert.assertEquals("  #15 = NameAndType        #17:#18        // out:Ljava/io/PrintStream;", results[15]);
        Assert.assertEquals("  #21 = NameAndType        #23:#24        // println:(I)V", results[21]);
    }

    @Override
    protected Class<? extends Case> forCase() {
        return Case12.class;
    }
}
