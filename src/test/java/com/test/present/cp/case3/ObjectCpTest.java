package com.test.present.cp.case3;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ObjectCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "   #76 = Integer            999999",
                "  #121 = Integer            1"
        );
    }
}
