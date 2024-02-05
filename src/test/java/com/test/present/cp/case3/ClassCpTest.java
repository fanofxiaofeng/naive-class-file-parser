package com.test.present.cp.case3;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ClassCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Class"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "  #1316 = Integer            8192",
                "  #1318 = Integer            16384",
                "  #1320 = Integer            4096",
                "  #1464 = Integer            1"
        );
    }
}
