package com.test.presenter.cp.case8;

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
public class Case8CpTest extends ConstantPoolPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.Case8"));
    }

    @ExpectedConstantKind(ConstantKind.CONSTANT_String)
    @Test
    public void test() {
        expectedLines = List.of(
                "   #7 = String             #8             // Hello world",
                "  #15 = String             #16            // 😂",
                "  #20 = String             #21            // ?",
                "  #25 = String             #26            // ?",
                "  #30 = String             #31            // left",
                "  #35 = String             #36            //  middle",
                "  #40 = String             #41            //  right"
        );
    }
}
