package com.test.present.cp.case18;

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
                "   #888 = InvokeDynamic      #0:#889      // #0:apply:(Ljava/lang/String;)Ljava/util/function/Function;",
                "   #901 = InvokeDynamic      #1:#902      // #1:apply:()Ljava/util/function/Function;",
                "   #904 = InvokeDynamic      #2:#905      // #2:apply:(I)Ljava/util/function/Function;",
                "   #937 = InvokeDynamic      #3:#905      // #3:apply:(I)Ljava/util/function/Function;"
        );
    }
}
