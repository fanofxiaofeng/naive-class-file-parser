package com.test.method.specific;

import com.test.method.MethodPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ReturnValueCaseMethodsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.method.ReturnValueCase"));
    }

    @Test
    public void test_for_method_1() {
        expectedConsecutiveLines = List.of(
                "  public com.test.cases.method.ReturnValueCase();",
                "    descriptor: ()V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: aload_0",
                "         1: invokespecial #1                  // Method java/lang/Object.\"<init>\":()V",
                "         4: return"
        );
    }
    @Test
    public void test_for_method_2() {
        expectedConsecutiveLines = List.of(
                "  abstract void f1();",
                "    descriptor: ()V",
                "    flags: (0x0400) ACC_ABSTRACT"
        );
    }
    @Test
    public void test_for_method_3() {
        expectedConsecutiveLines = List.of(
                "  abstract int f2();",
                "    descriptor: ()I",
                "    flags: (0x0400) ACC_ABSTRACT"
        );
    }
    @Test
    public void test_for_method_4() {
        expectedConsecutiveLines = List.of(
                "  abstract java.util.List<java.lang.Integer> f3();",
                "    descriptor: ()Ljava/util/List;",
                "    flags: (0x0400) ACC_ABSTRACT",
                "    Signature: #20                          // ()Ljava/util/List<Ljava/lang/Integer;>;"
        );
    }
    @Test
    public void test_for_method_5() {
        expectedConsecutiveLines = List.of(
                "  abstract java.util.Map<java.lang.String, java.lang.Long> f4();",
                "    descriptor: ()Ljava/util/Map;",
                "    flags: (0x0400) ACC_ABSTRACT",
                "    Signature: #23                          // ()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Long;>;"
        );
    }
    @Test
    public void test_for_method_6() {
        expectedConsecutiveLines = List.of(
                "  abstract java.util.Set<com.test.cases.method.ReturnValueCase$C<? super java.lang.String, ? extends java.lang.Integer, java.lang.Runnable, java.util.function.Function<java.lang.Long, java.lang.Enum<?>>>> f5();",
                "    descriptor: ()Ljava/util/Set;",
                "    flags: (0x0400) ACC_ABSTRACT",
                "    Signature: #26                          // ()Ljava/util/Set<Lcom/test/cases/method/ReturnValueCase$C<-Ljava/lang/String;+Ljava/lang/Integer;Ljava/lang/Runnable;Ljava/util/function/Function<Ljava/lang/Long;Ljava/lang/Enum<*>;>;>;>;"
        );
    }
    @Test
    public void test_for_method_7() {
        expectedConsecutiveLines = List.of(
                "  abstract <A_LONG_NAME extends java.lang.Object, B extends java.lang.Object> java.util.Map<A_LONG_NAME, B> f6();",
                "    descriptor: ()Ljava/util/Map;",
                "    flags: (0x0400) ACC_ABSTRACT",
                "    Signature: #28                          // <A_LONG_NAME:Ljava/lang/Object;B:Ljava/lang/Object;>()Ljava/util/Map<TA_LONG_NAME;TB;>;"
        );
    }
    @Test
    public void test_for_method_8() {
        expectedConsecutiveLines = List.of(
                "  abstract <X extends java.lang.String & java.lang.Runnable & java.util.function.Supplier<? extends java.lang.Number>> java.util.function.Function<java.util.function.Function<? super java.lang.Object, ? extends java.lang.String>, ? extends java.lang.Runnable> f7();",
                "    descriptor: ()Ljava/util/function/Function;",
                "    flags: (0x0400) ACC_ABSTRACT",
                "    Signature: #31                          // <X:Ljava/lang/String;:Ljava/lang/Runnable;:Ljava/util/function/Supplier<+Ljava/lang/Number;>;>()Ljava/util/function/Function<Ljava/util/function/Function<-Ljava/lang/Object;+Ljava/lang/String;>;+Ljava/lang/Runnable;>;"
        );
    }
    @Test
    public void test_for_method_9() {
        expectedConsecutiveLines = List.of(
                "  abstract <TC1 extends java.lang.Number & java.lang.Runnable & java.util.function.Supplier<java.lang.Long> & java.util.function.Consumer<java.lang.Integer> & java.util.Map<java.lang.Number, java.lang.Thread>, TC2 extends java.util.function.Consumer<java.lang.Integer>, TC3 extends java.lang.String, TC4 extends java.lang.Object> java.util.List<java.util.List<java.util.List<java.util.Set<java.util.List<com.test.cases.method.ReturnValueCase$C<TC1[][], java.util.List<TC2>, java.util.function.BiConsumer<TC3, java.lang.Void>, org.apache.commons.lang3.tuple.Pair<java.lang.Object, TC4>>>>>>[][][]>[][] f8();",
                "    descriptor: ()[[Ljava/util/List;",
                "    flags: (0x0400) ACC_ABSTRACT",
                "    Signature: #34                          // <TC1:Ljava/lang/Number;:Ljava/lang/Runnable;:Ljava/util/function/Supplier<Ljava/lang/Long;>;:Ljava/util/function/Consumer<Ljava/lang/Integer;>;:Ljava/util/Map<Ljava/lang/Number;Ljava/lang/Thread;>;TC2::Ljava/util/function/Consumer<Ljava/lang/Integer;>;TC3:Ljava/lang/String;TC4:Ljava/lang/Object;>()[[Ljava/util/List<[[[Ljava/util/List<Ljava/util/List<Ljava/util/Set<Ljava/util/List<Lcom/test/cases/method/ReturnValueCase$C<[[TTC1;Ljava/util/List<TTC2;>;Ljava/util/function/BiConsumer<TTC3;Ljava/lang/Void;>;Lorg/apache/commons/lang3/tuple/Pair<Ljava/lang/Object;TTC4;>;>;>;>;>;>;>;"
        );
    }
}
