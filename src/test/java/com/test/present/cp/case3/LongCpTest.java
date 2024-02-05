package com.test.present.cp.case3;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class LongCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Long"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "  #378 = Integer            64",
                "  #380 = Integer            8",
                "  #449 = Integer            1"
        );
    }
}
