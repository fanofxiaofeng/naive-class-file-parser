package com.test.presenter.cp.case4;

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
public class Case4CpTest extends ConstantPoolPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.Case4"));
    }

    @ExpectedConstantKind(ConstantKind.CONSTANT_Float)
    @Test
    public void test() {
        expectedLines = List.of(
                "   #7 = Float              42.0f",
                "  #16 = Float              3.4028235E38f",
                "  #20 = Float              1.4E-45f",
                "  #24 = Float              -Infinityf",
                "  #28 = Float              Infinityf",
                "  #32 = Float              NaNf",
                "  #36 = Float              1.234567f",
                "  #42 = Float              3.1415927f",
                "  #46 = Float              2.7182817f"
        );
    }
}
