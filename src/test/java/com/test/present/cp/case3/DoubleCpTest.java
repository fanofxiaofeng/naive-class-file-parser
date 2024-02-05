package com.test.present.cp.case3;

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
                "  #198 = Integer            64",
                "  #200 = Integer            53",
                "  #202 = Integer            1023",
                "  #204 = Integer            -1022",
                "  #206 = Integer            8",
                "  #242 = Integer            1"
        );
    }
}
