package com.test.presenter.cp.case7;

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
public class Case7CpTest extends ConstantPoolPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.Case7"));
    }

    @ExpectedConstantKind(ConstantKind.CONSTANT_Class)
    @Test
    public void test() {
        expectedLines = List.of(
                "   #2 = Class              #4             // java/lang/Object",
                "   #7 = Class              #8             // com/test/cases/Case7$1",
                "  #10 = Class              #11            // com/test/cases/Case7",
                "  #25 = Class              #26            // com/test/cases/Case7$Case7_2",
                "  #27 = Class              #28            // com/test/cases/Case7$Case7_1",
                "  #29 = Class              #30            // com/test/cases/Case7$1Case7_3"
        );
    }
}
