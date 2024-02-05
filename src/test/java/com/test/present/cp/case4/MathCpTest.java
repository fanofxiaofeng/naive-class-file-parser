package com.test.present.cp.case4;

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
                "  #295 = Float              1.4E-45f",
                "  #326 = Float              -1.4E-45f",
                "  #329 = Float              Infinityf",
                "  #332 = Float              -Infinityf",
                "  #351 = Float              -0.0f"
        );
    }
}
