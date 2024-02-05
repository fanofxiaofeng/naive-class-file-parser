package com.test.present.cp.case9;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class Case9CpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.Case9"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "   #7 = Fieldref           #8.#9          // com/test/cases/Case9.n2:I",
                "  #13 = Fieldref           #8.#14         // com/test/cases/Case9.n1:I"
        );
    }
}
