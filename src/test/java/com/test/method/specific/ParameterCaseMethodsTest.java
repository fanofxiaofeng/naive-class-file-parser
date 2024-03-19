package com.test.method.specific;

import com.test.annotations.GeneratedBy;
import com.test.method.MethodPresenterTestBase;
import com.test.method.MethodTestGenerator;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(MethodTestGenerator.class)
public class ParameterCaseMethodsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.method.ParameterCase"));
    }

    @Test
    public void test_for_method_1() {
        expectedConsecutiveLines = List.of(
                "  public com.test.cases.method.ParameterCase();",
                "    descriptor: ()V",
                "    flags: (0x0001) ACC_PUBLIC"
        );
    }

    @Test
    public void test_for_method_2() {
        expectedConsecutiveLines = List.of(
                "  abstract void f1(int, int, int, int...);",
                "    descriptor: (III[I)V",
                "    flags: (0x0480) ACC_VARARGS, ACC_ABSTRACT"
        );
    }

    @Test
    public void test_for_method_3() {
        expectedConsecutiveLines = List.of(
                "  abstract int f2(java.util.List<int[][][]>[][], java.util.Optional<java.util.Set<long[][]>>...);",
                "    descriptor: ([[Ljava/util/List;[Ljava/util/Optional;)I",
                "    flags: (0x0480) ACC_VARARGS, ACC_ABSTRACT",
                "    Signature: #24                          // ([[Ljava/util/List<[[[I>;[Ljava/util/Optional<Ljava/util/Set<[[J>;>;)I"
        );
    }

    @Test
    public void test_for_method_4() {
        expectedConsecutiveLines = List.of(
                "  abstract void f3(java.util.List<java.lang.Integer>, java.util.List<java.lang.Integer>[], java.util.List<java.lang.Integer>[][]...);",
                "    descriptor: (Ljava/util/List;[Ljava/util/List;[[[Ljava/util/List;)V",
                "    flags: (0x0480) ACC_VARARGS, ACC_ABSTRACT",
                "    Signature: #27                          // (Ljava/util/List<Ljava/lang/Integer;>;[Ljava/util/List<Ljava/lang/Integer;>;[[[Ljava/util/List<Ljava/lang/Integer;>;)V"
        );
    }

    @Test
    public void test_for_method_5() {
        expectedConsecutiveLines = List.of(
                "  abstract void f4(java.util.Map<java.lang.String, java.lang.Long>, java.util.Map<java.lang.String, java.lang.Long>[], java.util.Map<java.lang.String, java.lang.Long>[][]...);",
                "    descriptor: (Ljava/util/Map;[Ljava/util/Map;[[[Ljava/util/Map;)V",
                "    flags: (0x0480) ACC_VARARGS, ACC_ABSTRACT",
                "    Signature: #30                          // (Ljava/util/Map<Ljava/lang/String;Ljava/lang/Long;>;[Ljava/util/Map<Ljava/lang/String;Ljava/lang/Long;>;[[[Ljava/util/Map<Ljava/lang/String;Ljava/lang/Long;>;)V"
        );
    }

    @Test
    public void test_for_method_6() {
        expectedConsecutiveLines = List.of(
                "  abstract void f5(java.util.Set<com.test.cases.method.ReturnValueCase$C<? super java.lang.String, ? extends java.lang.Integer, java.lang.Runnable, java.util.function.Function<java.lang.Long, java.lang.Enum<?>>>>, java.util.Set<com.test.cases.method.ReturnValueCase$C<? super java.lang.String, ? extends java.lang.Integer, java.lang.Runnable, java.util.function.Function<java.lang.Long, java.lang.Enum<?>>>>[][]...);",
                "    descriptor: (Ljava/util/Set;[[[Ljava/util/Set;)V",
                "    flags: (0x0480) ACC_VARARGS, ACC_ABSTRACT",
                "    Signature: #33                          // (Ljava/util/Set<Lcom/test/cases/method/ReturnValueCase$C<-Ljava/lang/String;+Ljava/lang/Integer;Ljava/lang/Runnable;Ljava/util/function/Function<Ljava/lang/Long;Ljava/lang/Enum<*>;>;>;>;[[[Ljava/util/Set<Lcom/test/cases/method/ReturnValueCase$C<-Ljava/lang/String;+Ljava/lang/Integer;Ljava/lang/Runnable;Ljava/util/function/Function<Ljava/lang/Long;Ljava/lang/Enum<*>;>;>;>;)V"
        );
    }

    @Test
    public void test_for_method_7() {
        expectedConsecutiveLines = List.of(
                "  abstract <A_LONG_NAME extends java.lang.Object, B extends java.lang.Object> void f6(java.util.Map<A_LONG_NAME, B>, java.util.Map<A_LONG_NAME, B>[][]...);",
                "    descriptor: (Ljava/util/Map;[[[Ljava/util/Map;)V",
                "    flags: (0x0480) ACC_VARARGS, ACC_ABSTRACT",
                "    Signature: #36                          // <A_LONG_NAME:Ljava/lang/Object;B:Ljava/lang/Object;>(Ljava/util/Map<TA_LONG_NAME;TB;>;[[[Ljava/util/Map<TA_LONG_NAME;TB;>;)V"
        );
    }

    @Test
    public void test_for_method_8() {
        expectedConsecutiveLines = List.of(
                "  abstract <X extends java.lang.String & java.lang.Runnable & java.util.function.Supplier<? extends java.lang.Number>> java.util.function.Function<java.util.function.Function<? super java.lang.Object, ? extends java.lang.String>, ? extends java.lang.Runnable> f7(java.util.Set<java.util.List<X>[][]>[]...);",
                "    descriptor: ([[Ljava/util/Set;)Ljava/util/function/Function;",
                "    flags: (0x0480) ACC_VARARGS, ACC_ABSTRACT",
                "    Signature: #39                          // <X:Ljava/lang/String;:Ljava/lang/Runnable;:Ljava/util/function/Supplier<+Ljava/lang/Number;>;>([[Ljava/util/Set<[[Ljava/util/List<TX;>;>;)Ljava/util/function/Function<Ljava/util/function/Function<-Ljava/lang/Object;+Ljava/lang/String;>;+Ljava/lang/Runnable;>;"
        );
    }

    @Test
    public void test_for_method_9() {
        expectedConsecutiveLines = List.of(
                "  abstract <TC1 extends java.lang.Number & java.lang.Runnable & java.util.function.Supplier<java.lang.Long> & java.util.function.Consumer<java.lang.Integer> & java.util.Map<java.lang.Number, java.lang.Thread>, TC2 extends java.util.function.Consumer<java.lang.Integer>, TC3 extends java.lang.String, TC4 extends java.lang.Object> void f8(java.util.List<java.util.List<java.util.List<java.util.Set<java.util.List<com.test.cases.method.ReturnValueCase$C<TC1[][], java.util.List<TC2>, java.util.function.BiConsumer<TC3, java.lang.Void>, org.apache.commons.lang3.tuple.Pair<java.lang.Object, TC4>>>>>>[][][]>[][]);",
                "    descriptor: ([[Ljava/util/List;)V",
                "    flags: (0x0400) ACC_ABSTRACT",
                "    Signature: #42                          // <TC1:Ljava/lang/Number;:Ljava/lang/Runnable;:Ljava/util/function/Supplier<Ljava/lang/Long;>;:Ljava/util/function/Consumer<Ljava/lang/Integer;>;:Ljava/util/Map<Ljava/lang/Number;Ljava/lang/Thread;>;TC2::Ljava/util/function/Consumer<Ljava/lang/Integer;>;TC3:Ljava/lang/String;TC4:Ljava/lang/Object;>([[Ljava/util/List<[[[Ljava/util/List<Ljava/util/List<Ljava/util/Set<Ljava/util/List<Lcom/test/cases/method/ReturnValueCase$C<[[TTC1;Ljava/util/List<TTC2;>;Ljava/util/function/BiConsumer<TTC3;Ljava/lang/Void;>;Lorg/apache/commons/lang3/tuple/Pair<Ljava/lang/Object;TTC4;>;>;>;>;>;>;>;)V"
        );
    }
}
