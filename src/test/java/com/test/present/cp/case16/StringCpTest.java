package com.test.present.cp.case16;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class StringCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.String"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "  #1412 = MethodType         #79          //  (Ljava/lang/Object;)Ljava/lang/Object;",
                "  #1416 = MethodType         #722         //  (Ljava/lang/String;)Ljava/lang/String;"
        );
    }
}
