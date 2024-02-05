package com.test.present.cp.case3;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class MathCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Math"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "   #76 = Integer            2139095040",
                "   #77 = Integer            8388607",
                "   #78 = Integer            8388608",
                "  #134 = Integer            2147483647",
                "  #137 = Integer            -2147483648"
        );
    }
}
