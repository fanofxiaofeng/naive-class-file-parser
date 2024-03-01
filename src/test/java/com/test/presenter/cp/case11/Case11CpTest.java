package com.test.presenter.cp.case11;

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
public class Case11CpTest extends ConstantPoolPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.Case11"));
    }

    @ExpectedConstantKind(ConstantKind.CONSTANT_InterfaceMethodref)
    @Test
    public void test() {
        expectedLines = List.of(
                "   #7 = InterfaceMethodref #8.#9          // java/lang/Runnable.run:()V"
        );
    }
}
