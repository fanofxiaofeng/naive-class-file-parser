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
public class StringCpTest extends ConstantPoolPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.String"));
    }

    @ExpectedConstantKind(ConstantKind.CONSTANT_InvokeDynamic)
    @Test
    public void test() {
        expectedLines = List.of(
                "   #888 = InvokeDynamic      #0:#889      // #0:apply:(Ljava/lang/String;)Ljava/util/function/Function;",
                "   #901 = InvokeDynamic      #1:#902      // #1:apply:()Ljava/util/function/Function;",
                "   #904 = InvokeDynamic      #2:#905      // #2:apply:(I)Ljava/util/function/Function;",
                "   #937 = InvokeDynamic      #3:#905      // #3:apply:(I)Ljava/util/function/Function;"
        );
    }
}
