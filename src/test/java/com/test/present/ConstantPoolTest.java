package com.test.present;

import com.test.cases.Case3;
import com.test.cases.Case4;
import com.test.cases.Case5;
import com.test.cases.Case6;
import org.junit.Assert;
import org.junit.Test;

public class ConstantPoolTest extends PresenterTestBase {

    @Test
    public void case3() throws Exception {
        String[] results = getResults(Case3.class);

        Assert.assertEquals("  #15 = Integer            2147483647", results[15]);
        Assert.assertEquals("  #19 = Integer            -2147483648", results[19]);
    }

    @Test
    public void case4() throws Exception {
        String[] results = getResults(Case4.class);

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

    @Test
    public void case5() throws Exception {
        String[] results = getResults(Case5.class);

        Assert.assertEquals("   #7 = Long               42l", results[7]);
        Assert.assertEquals("  #17 = Long               9223372036854775807l", results[16]);
        Assert.assertEquals("  #22 = Long               -9223372036854775808l", results[20]);
    }

    @Test
    public void case6() throws Exception {
        String[] results = getResults(Case6.class);

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
}
