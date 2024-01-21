package com.test.present;

import com.test.cases.Case;
import com.test.cases.Case9;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class Case9Test extends CaseTestBase {

    @Test
    public void test() throws IOException {
        String[] results = getResults();

        Assert.assertEquals("   #7 = Fieldref           #8.#9          // com/test/cases/Case9.n2:I", results[7]);
        Assert.assertEquals("  #13 = Fieldref           #8.#14         // com/test/cases/Case9.n1:I", results[13]);
    }

    @Override
    protected Class<? extends Case> forCase() {
        return Case9.class;
    }
}
