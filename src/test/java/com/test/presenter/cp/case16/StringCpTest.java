package com.test.presenter.cp.case16;

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
public class StringCpTest extends ConstantPoolPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.String"));
    }

    @ExpectedConstantKind(ConstantKind.CONSTANT_MethodType)
    @Test
    public void test() {
        expectedLines = List.of(
                "  #1412 = MethodType         #79          //  (Ljava/lang/Object;)Ljava/lang/Object;",
                "  #1416 = MethodType         #722         //  (Ljava/lang/String;)Ljava/lang/String;"
        );
    }
}
