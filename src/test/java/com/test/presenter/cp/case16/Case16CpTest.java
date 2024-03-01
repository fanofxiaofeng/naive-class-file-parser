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
public class Case16CpTest extends ConstantPoolPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.Case16"));
    }

    @ExpectedConstantKind(ConstantKind.CONSTANT_MethodType)
    @Test
    public void test() {
        expectedLines = List.of(
                "   #97 = MethodType         #98           //  (Ljava/lang/Object;Ljava/lang/Object;)V",
                "  #102 = MethodType         #91           //  (Ljava/lang/Integer;Ljava/lang/Integer;)V",
                "  #103 = MethodType         #104          //  (Ljava/lang/Object;)V",
                "  #108 = MethodType         #89           //  (Ljava/lang/String;)V",
                "  #109 = MethodType         #110          //  ()Ljava/lang/Object;",
                "  #114 = MethodType         #87           //  ()Ljava/lang/Float;",
                "  #115 = MethodType         #116          //  (Ljava/lang/Object;)Z",
                "  #120 = MethodType         #82           //  (Ljava/lang/String;)Z",
                "  #121 = MethodType         #122          //  (Ljava/lang/Object;)Ljava/lang/Object;",
                "  #126 = MethodType         #78           //  (Ljava/lang/Integer;)Ljava/lang/Integer;"
        );
    }
}
