package com.test.present.cp.case5;

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
                "   #51 = Long               5l",
                "   #53 = Long               10l",
                "  #129 = Long               -2147483648l",
                "  #131 = Long               100l",
                "  #140 = Long               -10l",
                "  #162 = Long               -9223372036854775807l",
                "  #168 = Long               -9223372036854775808l",
                "  #230 = Long               -128l",
                "  #232 = Long               127l",
                "  #306 = Long               -1l",
                "  #314 = Long               6148914691236517205l",
                "  #316 = Long               3689348814741910323l",
                "  #318 = Long               1085102592571150095l",
                "  #327 = Long               71777214294589695l",
                "  #329 = Long               4294901760l",
                "  #372 = Long               9223372036854775807l",
                "  #382 = Long               4290774380558885855l"
        );
    }
}
