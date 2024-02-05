package com.test.present.cp.case16;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class EnumCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Enum"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "  #185 = MethodType         #67           //  (Ljava/lang/Object;)Ljava/lang/Object;",
                "  #189 = MethodType         #177          //  (Ljava/lang/constant/ClassDesc;)Ljava/lang/Enum$EnumDesc;"
        );
    }
}