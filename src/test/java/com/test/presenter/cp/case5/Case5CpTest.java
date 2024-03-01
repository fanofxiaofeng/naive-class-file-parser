package com.test.presenter.cp.case5;

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
public class Case5CpTest extends ConstantPoolPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.Case5"));
    }

    @ExpectedConstantKind(ConstantKind.CONSTANT_Long)
    @Test
    public void test() {
        expectedLines = List.of(
                "   #7 = Long               42l",
                "  #17 = Long               9223372036854775807l",
                "  #22 = Long               -9223372036854775808l"
        );
    }
}
