package com.test.presenter.cp.case18;

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
public class EnumCpTest extends ConstantPoolPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Enum"));
    }

    @ExpectedConstantKind(ConstantKind.CONSTANT_InvokeDynamic)
    @Test
    public void test() {
        expectedLines = List.of(
                "   #48 = InvokeDynamic      #0:#49        // #0:apply:(Ljava/lang/Enum;)Ljava/util/function/Function;"
        );
    }
}
