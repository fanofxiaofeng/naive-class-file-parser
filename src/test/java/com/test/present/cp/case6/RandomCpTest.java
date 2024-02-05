package com.test.present.cp.case6;

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
                "  #107 = Double             1.1102230246251565E-16d",
                "  #113 = Double             2.0d",
                "  #119 = Double             -2.0d"
        );
    }
}
