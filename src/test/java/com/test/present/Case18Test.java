package com.test.present;

import com.test.cases.Case;
import com.test.cases.Case18;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class Case18Test extends CaseTestBase {

    @Test
    public void test() throws IOException {
        String[] results = getResults();

        Assert.assertEquals("    #7 = InvokeDynamic      #0:#8         // #0:run:()Ljava/lang/Runnable;", results[7]);
        Assert.assertEquals("   #11 = InvokeDynamic      #1:#12        // #1:accept:()Ljava/util/function/Consumer;", results[11]);
        Assert.assertEquals("   #15 = InvokeDynamic      #2:#16        // #2:get:()Ljava/util/function/Supplier;", results[15]);
        Assert.assertEquals("   #19 = InvokeDynamic      #3:#20        // #3:apply:()Ljava/util/function/UnaryOperator;", results[19]);
        Assert.assertEquals("   #23 = InvokeDynamic      #4:#24        // #4:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", results[23]);
    }

    @Override
    protected Class<? extends Case> forCase() {
        return Case18.class;
    }
}
