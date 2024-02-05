package com.test.present.cp.case4;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class RandomCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.util.Random"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "  #104 = Float              5.9604645E-8f"
        );
    }
}
