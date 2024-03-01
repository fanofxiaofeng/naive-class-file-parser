package com.test.presenter.cp.case3;

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
public class Case3CpTest extends ConstantPoolPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.Case3"));
    }

    @ExpectedConstantKind(ConstantKind.CONSTANT_Integer)
    @Test
    public void test() {
        expectedLines = List.of(
                "  #15 = Integer            2147483647",
                "  #19 = Integer            -2147483648"
        );
    }
}
