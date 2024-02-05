package com.test.present.cp.case3;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class Case3CpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.Case3"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "  #15 = Integer            2147483647",
                "  #19 = Integer            -2147483648"
        );
    }
}
