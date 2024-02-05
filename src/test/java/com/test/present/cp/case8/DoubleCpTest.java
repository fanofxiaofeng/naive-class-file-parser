package com.test.present.cp.case8;

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
                "   #30 = String             #31           // -",
                "   #36 = String             #37           // 0x",
                "   #42 = String             #43           // 0.0p0",
                "   #56 = String             #57           // 0.",
                "   #58 = String             #59           // 1.",
                "   #72 = String             #73           // 0000000000000",
                "   #78 = String             #79           // 0",
                "   #80 = String             #81           // 0{1,12}$",
                "   #82 = String             #83           //",
                "  #163 = String             #164          // double"
        );
    }
}
