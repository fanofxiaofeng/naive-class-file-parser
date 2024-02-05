package com.test.present.cp.case6;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class MathCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Math"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "   #30 = Double             0.017453292519943295d",
                "   #32 = Double             57.29577951308232d",
                "  #238 = Double             NaNd",
                "  #284 = Double             4.9E-324d",
                "  #324 = Double             -4.9E-324d",
                "  #327 = Double             Infinityd",
                "  #330 = Double             -Infinityd",
                "  #352 = Double             -0.0d",
                "  #356 = Double             2.718281828459045d",
                "  #359 = Double             3.141592653589793d",
                "  #362 = Double             6.283185307179586d"
        );
    }
}
