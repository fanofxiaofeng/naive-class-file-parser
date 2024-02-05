package com.test.present.cp.case11;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class Case11CpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.Case11"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "   #7 = InterfaceMethodref #8.#9          // java/lang/Runnable.run:()V"
        );
    }
}
