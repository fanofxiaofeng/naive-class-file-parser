package com.test.present.cp.case6;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class DoubleCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Double"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "   #28 = Double             -1.0d",
                "   #44 = Double             2.2250738585072014E-308d",
                "  #111 = Double             1.7976931348623157E308d",
                "  #183 = Double             Infinityd",
                "  #186 = Double             -Infinityd",
                "  #189 = Double             NaNd",
                "  #194 = Double             4.9E-324d"
        );
    }
}
