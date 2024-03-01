package com.test.presenter.cp.case9;

import com.study.constants.ConstantKind;
import com.test.annotations.ExpectedConstantKind;
import com.test.annotations.GeneratedBy;
import com.test.presenter.cp.ConstantPoolPresenterTestBase;
import com.test.presenter.cp.ConstantPoolTestGenerator;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(ConstantPoolTestGenerator.class)
public class Case9CpTest extends ConstantPoolPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.Case9"));
    }

    @ExpectedConstantKind(ConstantKind.CONSTANT_Fieldref)
    @Test
    public void test() {
        expectedLines = List.of(
                "   #7 = Fieldref           #8.#9          // com/test/cases/Case9.n2:I",
                "  #13 = Fieldref           #8.#14         // com/test/cases/Case9.n1:I"
        );
    }
}
