package com.test.present.cp.case8;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class EnumCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Enum"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "   #70 = String             #71           // Name is null",
                "   #80 = String             #81           // No enum constant",
                "   #90 = String             #91           // .",
                "   #98 = String             #99           // can\\'t deserialize enum"
        );
    }
}
