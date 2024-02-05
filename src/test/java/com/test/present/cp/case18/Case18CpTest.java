package com.test.present.cp.case18;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class Case18CpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.Case18"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "    #7 = InvokeDynamic      #0:#8         // #0:run:()Ljava/lang/Runnable;",
                "   #11 = InvokeDynamic      #1:#12        // #1:accept:()Ljava/util/function/Consumer;",
                "   #15 = InvokeDynamic      #2:#16        // #2:get:()Ljava/util/function/Supplier;",
                "   #19 = InvokeDynamic      #3:#20        // #3:apply:()Ljava/util/function/UnaryOperator;",
                "   #23 = InvokeDynamic      #4:#24        // #4:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"
        );
    }
}
