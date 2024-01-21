package com.test.present;

import com.test.cases.Case;
import com.test.cases.Case15;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class Case15Test extends CaseTestBase {

    @Test
    public void test() throws IOException {
        String[] results = getResults();

        Assert.assertEquals("  #26 = MethodHandle       6:#27          // REF_invokeStatic com/test/cases/Case15.lambda$f$0:()V", results[26]);
        Assert.assertEquals("  #29 = MethodHandle       6:#30          // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", results[29]);
    }

    @Override
    protected Class<? extends Case> forCase() {
        return Case15.class;
    }
}
