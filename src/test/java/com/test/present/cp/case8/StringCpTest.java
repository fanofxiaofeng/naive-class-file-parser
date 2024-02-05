package com.test.present.cp.case8;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class StringCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.String"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "     #7 = String             #8           //",
                "   #445 = String             #446         // malformed input off :",
                "   #454 = String             #455         // , length :",
                "   #465 = String             #466         // , length : 1",
                "   #745 = String             #746         // Required length exceeds implementation limit",
                "   #756 = String             #757         // .$|()[{^?*+\\\\",
                "   #808 = String             #809         // Requested string length exceeds VM limit",
                "   #882 = String             #883         //",
                "   #907 = String             #908         // \\n",
                "   #952 = String             #953         // Invalid escape sequence: \\\\%c \\\\\\\\u%04X",
                "  #1000 = String             #1001        // null",
                "  #1006 = String             #1007        // true",
                "  #1008 = String             #1009        // false",
                "  #1034 = String             #1035        // count is negative:",
                "  #1069 = String             #1070        // Not a valid Unicode code point: 0x%X"
        );
    }
}
