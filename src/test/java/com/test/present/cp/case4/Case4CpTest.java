package com.test.present.cp.case4;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class Case4CpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.Case4"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "   #7 = Float              42.0f",
                "  #16 = Float              3.4028235E38f",
                "  #20 = Float              1.4E-45f",
                "  #24 = Float              -Infinityf",
                "  #28 = Float              Infinityf",
                "  #32 = Float              NaNf",
                "  #36 = Float              1.234567f",
                "  #42 = Float              3.1415927f",
                "  #46 = Float              2.7182817f"
        );
    }
}
