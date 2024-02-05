package com.test.present.cp.case8;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class Case8CpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.Case8"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "   #7 = String             #8             // Hello world",
                "  #15 = String             #16            // 😂",
                "  #20 = String             #21            // ?",
                "  #25 = String             #26            // ?",
                "  #30 = String             #31            // left",
                "  #35 = String             #36            //  middle",
                "  #40 = String             #41            //  right"
        );
    }
}
