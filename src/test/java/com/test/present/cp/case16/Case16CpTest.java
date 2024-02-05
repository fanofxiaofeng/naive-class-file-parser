package com.test.present.cp.case16;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class Case16CpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.Case16"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "   #99 = MethodType         #100          //  (Ljava/lang/Object;Ljava/lang/Object;)V",
                "  #104 = MethodType         #93           //  (Ljava/lang/Integer;Ljava/lang/Integer;)V",
                "  #105 = MethodType         #106          //  (Ljava/lang/Object;)V",
                "  #110 = MethodType         #91           //  (Ljava/lang/String;)V",
                "  #111 = MethodType         #112          //  ()Ljava/lang/Object;",
                "  #116 = MethodType         #89           //  ()Ljava/lang/Float;",
                "  #117 = MethodType         #118          //  (Ljava/lang/Object;)Z",
                "  #122 = MethodType         #84           //  (Ljava/lang/String;)Z",
                "  #123 = MethodType         #124          //  (Ljava/lang/Object;)Ljava/lang/Object;",
                "  #128 = MethodType         #80           //  (Ljava/lang/Integer;)Ljava/lang/Integer;"
        );
    }
}
