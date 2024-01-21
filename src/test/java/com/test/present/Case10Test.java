package com.test.present;

import com.test.cases.Case;
import com.test.cases.Case10;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class Case10Test extends CaseTestBase {
    @Test
    public void test() throws IOException {
        String[] results = getResults();

        Assert.assertEquals("   #1 = Methodref          #2.#3          // java/lang/Object.\"<init>\":()V", results[1]);
        Assert.assertEquals("   #7 = Methodref          #8.#9          // com/test/cases/Case10.add:(II)V", results[7]);
    }

    @Override
    protected Class<? extends Case> forCase() {
        return Case10.class;
    }
}
