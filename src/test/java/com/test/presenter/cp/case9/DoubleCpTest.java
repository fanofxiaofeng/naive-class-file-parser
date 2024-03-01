package com.test.presenter.cp.case9;

import com.test.presenter.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class DoubleCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Double"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "  #118 = Fieldref           #1.#119       // java/lang/Double.value:D",
                "  #171 = Fieldref           #1.#172       // java/lang/Double.TYPE:Ljava/lang/Class;"
        );
    }
}
