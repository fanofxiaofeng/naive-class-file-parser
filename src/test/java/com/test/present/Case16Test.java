package com.test.present;

import com.test.cases.Case;
import com.test.cases.Case16;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;


public class Case16Test extends CaseTestBase {

    @Test
    public void test() throws IOException {
        String[] results = getResults();

        Assert.assertEquals("   #99 = MethodType         #100          //  (Ljava/lang/Object;Ljava/lang/Object;)V", results[99]);
        Assert.assertEquals("  #104 = MethodType         #93           //  (Ljava/lang/Integer;Ljava/lang/Integer;)V", results[104]);
        Assert.assertEquals("  #105 = MethodType         #106          //  (Ljava/lang/Object;)V", results[105]);
    }

    @Override
    protected Class<? extends Case> forCase() {
        return Case16.class;
    }
}
