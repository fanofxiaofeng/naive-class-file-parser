package com.test.method.specific;

import com.test.method.MethodPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class C33MethodsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.present.C33"));
    }

    @Test
    public void test_for_method_1() {
        expectedConsecutiveLines = List.of(
                "  abstract java.util.List<java.lang.String> f0();",
                "    descriptor: ()Ljava/util/List;",
                "    flags: (0x0400) ACC_ABSTRACT",
                "    Signature: #12                          // ()Ljava/util/List<Ljava/lang/String;>;"
        );
    }
    @Test
    public void test_for_method_2() {
        expectedConsecutiveLines = List.of(
                "  private synchronized void f1(java.util.List<java.lang.Integer>, java.util.List<java.lang.Long>...);",
                "    descriptor: (Ljava/util/List;[Ljava/util/List;)V",
                "    flags: (0x00a2) ACC_PRIVATE, ACC_SYNCHRONIZED, ACC_VARARGS",
                "    Signature: #27                          // (Ljava/util/List<Ljava/lang/Integer;>;[Ljava/util/List<Ljava/lang/Long;>;)V"
        );
    }
    @Test
    public void test_for_method_3() {
        expectedConsecutiveLines = List.of(
                "  abstract long f2(long, long, long, long...) throws com.test.present.C33$MyException, java.lang.IndexOutOfBoundsException, java.lang.NullPointerException, java.lang.ClassNotFoundException;",
                "    descriptor: (JJJ[J)J",
                "    flags: (0x0480) ACC_VARARGS, ACC_ABSTRACT",
                "    Exceptions:",
                "      throws com.test.present.C33$MyException, java.lang.IndexOutOfBoundsException, java.lang.NullPointerException, java.lang.ClassNotFoundException"
        );
    }
    @Test
    public void test_for_method_4() {
        expectedConsecutiveLines = List.of(
                "  abstract float f3(float...);",
                "    descriptor: ([F)F",
                "    flags: (0x0480) ACC_VARARGS, ACC_ABSTRACT"
        );
    }
    @Test
    public void test_for_method_5() {
        expectedConsecutiveLines = List.of(
                "  abstract double f4(double);",
                "    descriptor: (D)D",
                "    flags: (0x0400) ACC_ABSTRACT"
        );
    }
    @Test
    public void test_for_method_6() {
        expectedConsecutiveLines = List.of(
                "  abstract java.lang.String f5(java.lang.String, int[]...);",
                "    descriptor: (Ljava/lang/String;[[I)Ljava/lang/String;",
                "    flags: (0x0480) ACC_VARARGS, ACC_ABSTRACT"
        );
    }
    @Test
    public void test_for_method_7() {
        expectedConsecutiveLines = List.of(
                "  abstract java.util.Map f6(int, java.util.Map[]...);",
                "    descriptor: (I[[Ljava/util/Map;)Ljava/util/Map;",
                "    flags: (0x0480) ACC_VARARGS, ACC_ABSTRACT"
        );
    }
    @Test
    public void test_for_method_8() {
        expectedConsecutiveLines = List.of(
                "  abstract java.util.List f7(java.util.List[], java.util.List...);",
                "    descriptor: ([Ljava/util/List;[Ljava/util/List;)Ljava/util/List;",
                "    flags: (0x0480) ACC_VARARGS, ACC_ABSTRACT"
        );
    }
    @Test
    public void test_for_method_9() {
        expectedConsecutiveLines = List.of(
                "  abstract com.test.present.C33$Level2 f8(com.test.present.C33$Level2[], com.test.present.C33$Level2...);",
                "    descriptor: ([Lcom/test/present/C33$Level2;[Lcom/test/present/C33$Level2;)Lcom/test/present/C33$Level2;",
                "    flags: (0x0480) ACC_VARARGS, ACC_ABSTRACT"
        );
    }
    @Test
    public void test_for_method_10() {
        expectedConsecutiveLines = List.of(
                "  abstract com.test.present.C33$Level2$Level3 f9(com.test.present.C33$Level2$Level3...);",
                "    descriptor: ([Lcom/test/present/C33$Level2$Level3;)Lcom/test/present/C33$Level2$Level3;",
                "    flags: (0x0480) ACC_VARARGS, ACC_ABSTRACT"
        );
    }
    @Test
    public void test_for_method_11() {
        expectedConsecutiveLines = List.of(
                "  abstract com.test.present.C33$SC f10(com.test.present.C33$SC, com.test.present.C33$SC, com.test.present.C33$SC, com.test.present.C33$SC[], com.test.present.C33$SC...);",
                "    descriptor: (Lcom/test/present/C33$SC;Lcom/test/present/C33$SC;Lcom/test/present/C33$SC;[Lcom/test/present/C33$SC;[Lcom/test/present/C33$SC;)Lcom/test/present/C33$SC;",
                "    flags: (0x0480) ACC_VARARGS, ACC_ABSTRACT"
        );
    }
    @Test
    public void test_for_method_12() {
        expectedConsecutiveLines = List.of(
                "  abstract int[][][][][][][] f11(int[][][][][][][]...);",
                "    descriptor: ([[[[[[[[I)[[[[[[[I",
                "    flags: (0x0480) ACC_VARARGS, ACC_ABSTRACT"
        );
    }
    @Test
    public void test_for_method_13() {
        expectedConsecutiveLines = List.of(
                "  abstract com.test.present.C33$Level2$Level3[][][][][][][][][][][] f12(com.test.present.C33$Level2$Level3[][][][][][][][][][][]...);",
                "    descriptor: ([[[[[[[[[[[[Lcom/test/present/C33$Level2$Level3;)[[[[[[[[[[[Lcom/test/present/C33$Level2$Level3;",
                "    flags: (0x0480) ACC_VARARGS, ACC_ABSTRACT"
        );
    }
    @Test
    public void test_for_method_14() {
        expectedConsecutiveLines = List.of(
                "  static java.util.List[][][][][][] f13(java.util.List[][][][][][], int[][][][][][][], boolean[][][][][][][], java.lang.Boolean[][][][][][][], java.lang.Integer[][][][][], java.util.function.Function[][][][], java.util.function.BiConsumer[][][], java.lang.Object...);",
                "    descriptor: ([[[[[[Ljava/util/List;[[[[[[[I[[[[[[[Z[[[[[[[Ljava/lang/Boolean;[[[[[Ljava/lang/Integer;[[[[Ljava/util/function/Function;[[[Ljava/util/function/BiConsumer;[Ljava/lang/Object;)[[[[[[Ljava/util/List;",
                "    flags: (0x0088) ACC_STATIC, ACC_VARARGS"
        );
    }
    @Test
    public void test_for_method_15() {
        expectedConsecutiveLines = List.of(
                "  private com.test.present.C33(java.lang.String[]...);",
                "    descriptor: ([[Ljava/lang/String;)V",
                "    flags: (0x0082) ACC_PRIVATE, ACC_VARARGS"
        );
    }
    @Test
    public void test_for_method_16() {
        expectedConsecutiveLines = List.of(
                "  public com.test.present.C33(java.lang.String...);",
                "    descriptor: ([Ljava/lang/String;)V",
                "    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS"
        );
    }
    @Test
    public void test_for_method_17() {
        expectedConsecutiveLines = List.of(
                "  protected com.test.present.C33(java.lang.String);",
                "    descriptor: (Ljava/lang/String;)V",
                "    flags: (0x0004) ACC_PROTECTED"
        );
    }
    @Test
    public void test_for_method_18() {
        expectedConsecutiveLines = List.of(
                "  com.test.present.C33(java.lang.String, int[]...);",
                "    descriptor: (Ljava/lang/String;[[I)V",
                "    flags: (0x0080) ACC_VARARGS"
        );
    }
}
