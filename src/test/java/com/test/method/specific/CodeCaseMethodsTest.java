package com.test.method.specific;

import com.test.annotations.GeneratedBy;
import com.test.method.MethodPresenterTestBase;
import com.test.method.MethodTestGenerator;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(MethodTestGenerator.class)
public class CodeCaseMethodsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.method.CodeCase"));
    }

    @Test
    public void test_for_method_1() {
        expectedConsecutiveLines = List.of(
                "  public com.test.cases.method.CodeCase();",
                "    descriptor: ()V",
                "    flags: (0x0001) ACC_PUBLIC"
        );
    }

    @Test
    public void test_for_method_2() {
        expectedConsecutiveLines = List.of(
                "  public <T extends java.lang.Object> void f1(T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T);",
                "    descriptor: (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Signature: #152                         // <T:Ljava/lang/Object;>(TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;TT;)V"
        );
    }

    @Test
    public void test_for_method_3() {
        expectedConsecutiveLines = List.of(
                "  public void f2();",
                "    descriptor: ()V",
                "    flags: (0x0001) ACC_PUBLIC"
        );
    }

    @Test
    public void test_for_method_4() {
        expectedConsecutiveLines = List.of(
                "  public void f3();",
                "    descriptor: ()V",
                "    flags: (0x0001) ACC_PUBLIC"
        );
    }

    @Test
    public void test_for_method_5() {
        expectedConsecutiveLines = List.of(
                "  public static void f4();",
                "    descriptor: ()V",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC"
        );
    }

    @Test
    public void test_for_method_6() {
        expectedConsecutiveLines = List.of(
                "  public void f5(long, long, long);",
                "    descriptor: (JJJ)V",
                "    flags: (0x0001) ACC_PUBLIC"
        );
    }

    @Test
    public void test_for_method_7() {
        expectedConsecutiveLines = List.of(
                "  public static void main(java.lang.String[]);",
                "    descriptor: ([Ljava/lang/String;)V",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC"
        );
    }
}
