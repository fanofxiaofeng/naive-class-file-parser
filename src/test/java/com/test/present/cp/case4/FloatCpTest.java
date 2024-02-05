package com.test.present.cp.case4;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class FloatCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Float"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "   #17 = Float              1.1754944E-38f",
                "   #49 = Float              3.4028235E38f",
                "   #81 = Float              -1.0f",
                "   #82 = Float              5.9604645E-8f",
                "   #83 = Float              Infinityf",
                "   #98 = Float              65520.0f",
                "   #99 = Float              2.9802322E-8f",
                "  #156 = Float              -Infinityf",
                "  #158 = Float              NaNf",
                "  #162 = Float              1.4E-45f"
        );
    }
}
