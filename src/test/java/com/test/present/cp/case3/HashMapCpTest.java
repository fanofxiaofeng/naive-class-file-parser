package com.test.present.cp.case3;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class HashMapCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.util.HashMap"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "   #42 = Integer            1073741824",
                "  #209 = Integer            2147483647",
                "  #402 = Integer            16",
                "  #406 = Integer            8",
                "  #408 = Integer            6",
                "  #410 = Integer            64"
        );
    }
}
