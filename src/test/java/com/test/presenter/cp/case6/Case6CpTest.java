package com.test.presenter.cp.case6;

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
public class Case6CpTest extends ConstantPoolPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.Case6"));
    }

    @ExpectedConstantKind(ConstantKind.CONSTANT_Double)
    @Test
    public void test() {
        expectedLines = List.of(
                "   #7 = Double             42.0d",
                "  #17 = Double             1.7976931348623157E308d",
                "  #22 = Double             4.9E-324d",
                "  #27 = Double             Infinityd",
                "  #32 = Double             -Infinityd",
                "  #37 = Double             NaNd",
                "  #44 = Double             3.141592653589793d",
                "  #49 = Double             2.718281828459045d",
                "  #54 = Double             1.23456789d"
        );
    }
}
