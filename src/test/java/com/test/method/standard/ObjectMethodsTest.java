package com.test.method.standard;

import com.test.method.MethodPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ObjectMethodsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Object"));
    }

    @Test
    public void test_for_method_1() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.Object();",
                "    descriptor: ()V",
                "    flags: (0x0001) ACC_PUBLIC"
        );
    }
    @Test
    public void test_for_method_2() {
        expectedConsecutiveLines = List.of(
                "  public final native java.lang.Class<?> getClass();",
                "    descriptor: ()Ljava/lang/Class;",
                "    flags: (0x0111) ACC_PUBLIC, ACC_FINAL, ACC_NATIVE",
                "    Signature: #91                          // ()Ljava/lang/Class<*>;"
        );
    }
    @Test
    public void test_for_method_3() {
        expectedConsecutiveLines = List.of(
                "  public native int hashCode();",
                "    descriptor: ()I",
                "    flags: (0x0101) ACC_PUBLIC, ACC_NATIVE"
        );
    }
    @Test
    public void test_for_method_4() {
        expectedConsecutiveLines = List.of(
                "  public boolean equals(java.lang.Object);",
                "    descriptor: (Ljava/lang/Object;)Z",
                "    flags: (0x0001) ACC_PUBLIC"
        );
    }
    @Test
    public void test_for_method_5() {
        expectedConsecutiveLines = List.of(
                "  protected native java.lang.Object clone() throws java.lang.CloneNotSupportedException;",
                "    descriptor: ()Ljava/lang/Object;",
                "    flags: (0x0104) ACC_PROTECTED, ACC_NATIVE",
                "    Exceptions:",
                "      throws java.lang.CloneNotSupportedException"
        );
    }
    @Test
    public void test_for_method_6() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.String toString();",
                "    descriptor: ()Ljava/lang/String;",
                "    flags: (0x0001) ACC_PUBLIC"
        );
    }
    @Test
    public void test_for_method_7() {
        expectedConsecutiveLines = List.of(
                "  public final native void notify();",
                "    descriptor: ()V",
                "    flags: (0x0111) ACC_PUBLIC, ACC_FINAL, ACC_NATIVE"
        );
    }
    @Test
    public void test_for_method_8() {
        expectedConsecutiveLines = List.of(
                "  public final native void notifyAll();",
                "    descriptor: ()V",
                "    flags: (0x0111) ACC_PUBLIC, ACC_FINAL, ACC_NATIVE"
        );
    }
    @Test
    public void test_for_method_9() {
        expectedConsecutiveLines = List.of(
                "  public final void wait() throws java.lang.InterruptedException;",
                "    descriptor: ()V",
                "    flags: (0x0011) ACC_PUBLIC, ACC_FINAL",
                "    Exceptions:",
                "      throws java.lang.InterruptedException"
        );
    }
    @Test
    public void test_for_method_10() {
        expectedConsecutiveLines = List.of(
                "  public final void wait(long) throws java.lang.InterruptedException;",
                "    descriptor: (J)V",
                "    flags: (0x0011) ACC_PUBLIC, ACC_FINAL",
                "    Exceptions:",
                "      throws java.lang.InterruptedException"
        );
    }
    @Test
    public void test_for_method_11() {
        expectedConsecutiveLines = List.of(
                "  private final native void wait0(long) throws java.lang.InterruptedException;",
                "    descriptor: (J)V",
                "    flags: (0x0112) ACC_PRIVATE, ACC_FINAL, ACC_NATIVE",
                "    Exceptions:",
                "      throws java.lang.InterruptedException"
        );
    }
    @Test
    public void test_for_method_12() {
        expectedConsecutiveLines = List.of(
                "  public final void wait(long, int) throws java.lang.InterruptedException;",
                "    descriptor: (JI)V",
                "    flags: (0x0011) ACC_PUBLIC, ACC_FINAL",
                "    Exceptions:",
                "      throws java.lang.InterruptedException"
        );
    }
    @Test
    public void test_for_method_13() {
        expectedConsecutiveLines = List.of(
                "  protected void finalize() throws java.lang.Throwable;",
                "    descriptor: ()V",
                "    flags: (0x0004) ACC_PROTECTED",
                "    Exceptions:",
                "      throws java.lang.Throwable"
        );
    }
}
