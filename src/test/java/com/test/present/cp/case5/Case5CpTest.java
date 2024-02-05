package com.test.present.cp.case5;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class Case5CpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.Case5"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "   #7 = Long               42l",
                "  #17 = Long               9223372036854775807l",
                "  #22 = Long               -9223372036854775808l"
        );
    }
}
