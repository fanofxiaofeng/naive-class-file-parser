package com.test.present.cp.case7;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class Case7CpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.Case7"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "   #2 = Class              #4             // java/lang/Object",
                "   #7 = Class              #8             // com/test/cases/Case7$1",
                "  #10 = Class              #11            // com/test/cases/Case7",
                "  #12 = Class              #13            // com/test/cases/Case",
                "  #26 = Class              #27            // com/test/cases/Case7$Case7_2",
                "  #28 = Class              #29            // com/test/cases/Case7$Case7_1",
                "  #30 = Class              #31            // com/test/cases/Case7$1Case7_3"
        );
    }
}
