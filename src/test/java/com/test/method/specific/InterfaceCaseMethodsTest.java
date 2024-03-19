package com.test.method.specific;

import com.test.annotations.GeneratedBy;
import com.test.method.MethodPresenterTestBase;
import com.test.method.MethodTestGenerator;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(MethodTestGenerator.class)
public class InterfaceCaseMethodsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.method.InterfaceCase"));
    }

    @Test
    public void test_for_method_1() {
        expectedConsecutiveLines = List.of(
                "  public default void f1();",
                "    descriptor: ()V",
                "    flags: (0x0001) ACC_PUBLIC"
        );
    }

    @Test
    public void test_for_method_2() {
        expectedConsecutiveLines = List.of(
                "  public static void f2();",
                "    descriptor: ()V",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC"
        );
    }
}
