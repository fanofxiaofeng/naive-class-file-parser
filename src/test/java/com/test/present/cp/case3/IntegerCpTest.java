package com.test.present.cp.case3;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class IntegerCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Integer"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "  #122 = Integer            -2147483647",
                "  #127 = Integer            -2147483648",
                "  #264 = Integer            65536",
                "  #265 = Integer            1431655765",
                "  #266 = Integer            858993459",
                "  #267 = Integer            252645135",
                "  #274 = Integer            65280",
                "  #313 = Integer            2147483647",
                "  #317 = Integer            32",
                "  #319 = Integer            4",
                "  #374 = Integer            1"
        );
    }
}
