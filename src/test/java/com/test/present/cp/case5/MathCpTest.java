package com.test.present.cp.case5;

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
                "   #87 = Long               9218868437227405312l",
                "   #89 = Long               1074l",
                "   #91 = Long               -64l",
                "   #93 = Long               4503599627370495l",
                "   #95 = Long               4503599627370496l",
                "  #128 = Long               -9223372036854775808l",
                "  #130 = Long               -1l",
                "  #135 = Long               9223372036854775807l",
                "  #138 = Long               4294967295l",
                "  #322 = Long               1023l"
        );
    }
}
