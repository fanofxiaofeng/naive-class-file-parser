package com.test.present.cp.case3;

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
                "  #371 = Integer            48",
                "  #373 = Integer            0"
        );
    }
}
