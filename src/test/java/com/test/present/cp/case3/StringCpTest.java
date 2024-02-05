package com.test.present.cp.case3;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class StringCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.String"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "   #132 = Integer            65533",
                "   #378 = Integer            -123008",
                "   #379 = Integer            3678080",
                "   #761 = Integer            55296",
                "   #762 = Integer            57343",
                "   #900 = Integer            -2147483648",
                "   #938 = Integer            2147483647",
                "  #1119 = Integer            0",
                "  #1121 = Integer            1"
        );
    }
}
