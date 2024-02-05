package com.test.present.cp.case7;

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
                "    #1 = Class              #2            // java/lang/StringBuilder",
                "    #8 = Class              #10           // java/lang/Object",
                "   #14 = Class              #16           // java/lang/Class",
                "   #30 = Class              #32           // java/lang/Integer",
                "   #43 = Class              #45           // jdk/internal/misc/Blocker",
                "   #54 = Class              #55           // java/lang/InterruptedException",
                "   #57 = Class              #59           // java/lang/Thread",
                "   #69 = Class              #70           // java/lang/IllegalArgumentException",
                "   #79 = Class              #80           // java/lang/Long",
                "   #99 = Class              #100          // java/lang/CloneNotSupportedException",
                "  #110 = Class              #111          // java/lang/Throwable"
        );
    }
}
