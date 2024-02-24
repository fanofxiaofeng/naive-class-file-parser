package com.test.method.specific;

import com.test.method.MethodPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ThrowsCaseMethodsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.method.ThrowsCase"));
    }

    @Test
    public void test_for_method_1() {
        expectedConsecutiveLines = List.of(
                "  public com.test.cases.method.ThrowsCase();",
                "    descriptor: ()V",
                "    flags: (0x0001) ACC_PUBLIC"
        );
    }
    @Test
    public void test_for_method_2() {
        expectedConsecutiveLines = List.of(
                "  abstract void f1() throws java.lang.RuntimeException, java.lang.NullPointerException, java.lang.Throwable, java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.AssertionError;",
                "    descriptor: ()V",
                "    flags: (0x0400) ACC_ABSTRACT",
                "    Exceptions:",
                "      throws java.lang.RuntimeException, java.lang.NullPointerException, java.lang.Throwable, java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.AssertionError"
        );
    }
    @Test
    public void test_for_method_3() {
        expectedConsecutiveLines = List.of(
                "  abstract void f2(java.util.List<? extends java.lang.Integer>) throws java.lang.Throwable, java.lang.IllegalStateException;",
                "    descriptor: (Ljava/util/List;)V",
                "    flags: (0x0400) ACC_ABSTRACT",
                "    Exceptions:",
                "      throws java.lang.Throwable, java.lang.IllegalStateException",
                "    Signature: #31                          // (Ljava/util/List<+Ljava/lang/Integer;>;)V"
        );
    }
    @Test
    public void test_for_method_4() {
        expectedConsecutiveLines = List.of(
                "  abstract <T extends java.lang.Exception, T2 extends java.lang.Throwable & java.lang.Runnable> void f3(java.util.List<java.lang.Integer>) throws com/test/cases/method/ThrowsCase$C1$C2$C3, T, T2, java/lang/NullPointerException, java/lang/Throwable, java/lang/AssertionError;",
                "    descriptor: (Ljava/util/List;)V",
                "    flags: (0x0400) ACC_ABSTRACT",
                "    Exceptions:",
                "      throws com.test.cases.method.ThrowsCase$C1$C2$C3, java.lang.Exception, java.lang.Throwable, java.lang.NullPointerException, java.lang.Throwable, java.lang.AssertionError",
                "    Signature: #37                          // <T:Ljava/lang/Exception;T2:Ljava/lang/Throwable;:Ljava/lang/Runnable;>(Ljava/util/List<Ljava/lang/Integer;>;)V^Lcom/test/cases/method/ThrowsCase$C1$C2$C3;^TT;^TT2;^Ljava/lang/NullPointerException;^Ljava/lang/Throwable;^Ljava/lang/AssertionError;"
        );
    }
}
