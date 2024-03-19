package com.test.method.standard;

import com.test.annotations.GeneratedBy;
import com.test.method.MethodPresenterTestBase;
import com.test.method.MethodTestGenerator;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(MethodTestGenerator.class)
public class EnumMethodsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Enum"));
    }

    @Test
    public void test_for_method_1() {
        expectedConsecutiveLines = List.of(
                "  public final java.lang.String name();",
                "    descriptor: ()Ljava/lang/String;",
                "    flags: (0x0011) ACC_PUBLIC, ACC_FINAL"
        );
    }

    @Test
    public void test_for_method_2() {
        expectedConsecutiveLines = List.of(
                "  public final int ordinal();",
                "    descriptor: ()I",
                "    flags: (0x0011) ACC_PUBLIC, ACC_FINAL"
        );
    }

    @Test
    public void test_for_method_3() {
        expectedConsecutiveLines = List.of(
                "  protected java.lang.Enum(java.lang.String, int);",
                "    descriptor: (Ljava/lang/String;I)V",
                "    flags: (0x0004) ACC_PROTECTED"
        );
    }

    @Test
    public void test_for_method_4() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.String toString();",
                "    descriptor: ()Ljava/lang/String;",
                "    flags: (0x0001) ACC_PUBLIC"
        );
    }

    @Test
    public void test_for_method_5() {
        expectedConsecutiveLines = List.of(
                "  public final boolean equals(java.lang.Object);",
                "    descriptor: (Ljava/lang/Object;)Z",
                "    flags: (0x0011) ACC_PUBLIC, ACC_FINAL"
        );
    }

    @Test
    public void test_for_method_6() {
        expectedConsecutiveLines = List.of(
                "  public final int hashCode();",
                "    descriptor: ()I",
                "    flags: (0x0011) ACC_PUBLIC, ACC_FINAL"
        );
    }

    @Test
    public void test_for_method_7() {
        expectedConsecutiveLines = List.of(
                "  protected final java.lang.Object clone() throws java.lang.CloneNotSupportedException;",
                "    descriptor: ()Ljava/lang/Object;",
                "    flags: (0x0014) ACC_PROTECTED, ACC_FINAL",
                "    Exceptions:",
                "      throws java.lang.CloneNotSupportedException"
        );
    }

    @Test
    public void test_for_method_8() {
        expectedConsecutiveLines = List.of(
                "  public final int compareTo(E);",
                "    descriptor: (Ljava/lang/Enum;)I",
                "    flags: (0x0011) ACC_PUBLIC, ACC_FINAL",
                "    Signature: #143                         // (TE;)I"
        );
    }

    @Test
    public void test_for_method_9() {
        expectedConsecutiveLines = List.of(
                "  public final java.lang.Class<E> getDeclaringClass();",
                "    descriptor: ()Ljava/lang/Class;",
                "    flags: (0x0011) ACC_PUBLIC, ACC_FINAL",
                "    Signature: #148                         // ()Ljava/lang/Class<TE;>;"
        );
    }

    @Test
    public void test_for_method_10() {
        expectedConsecutiveLines = List.of(
                "  public final java.util.Optional<java.lang.Enum$EnumDesc<E>> describeConstable();",
                "    descriptor: ()Ljava/util/Optional;",
                "    flags: (0x0011) ACC_PUBLIC, ACC_FINAL",
                "    Signature: #149                         // ()Ljava/util/Optional<Ljava/lang/Enum$EnumDesc<TE;>;>;"
        );
    }

    @Test
    public void test_for_method_11() {
        expectedConsecutiveLines = List.of(
                "  public static <T extends java.lang.Enum<T>> T valueOf(java.lang.Class<T>, java.lang.String);",
                "    descriptor: (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Signature: #156                         // <T:Ljava/lang/Enum<TT;>;>(Ljava/lang/Class<TT;>;Ljava/lang/String;)TT;"
        );
    }

    @Test
    public void test_for_method_12() {
        expectedConsecutiveLines = List.of(
                "  protected final void finalize();",
                "    descriptor: ()V",
                "    flags: (0x0014) ACC_PROTECTED, ACC_FINAL"
        );
    }

    @Test
    public void test_for_method_13() {
        expectedConsecutiveLines = List.of(
                "  private void readObject(java.io.ObjectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException;",
                "    descriptor: (Ljava/io/ObjectInputStream;)V",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Exceptions:",
                "      throws java.io.IOException, java.lang.ClassNotFoundException"
        );
    }

    @Test
    public void test_for_method_14() {
        expectedConsecutiveLines = List.of(
                "  private void readObjectNoData() throws java.io.ObjectStreamException;",
                "    descriptor: ()V",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Exceptions:",
                "      throws java.io.ObjectStreamException"
        );
    }

    @Test
    public void test_for_method_15() {
        expectedConsecutiveLines = List.of(
                "  public int compareTo(java.lang.Object);",
                "    descriptor: (Ljava/lang/Object;)I",
                "    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC"
        );
    }

    @Test
    public void test_for_method_16() {
        expectedConsecutiveLines = List.of(
                "  private java.lang.Enum$EnumDesc lambda$describeConstable$0(java.lang.constant.ClassDesc);",
                "    descriptor: (Ljava/lang/constant/ClassDesc;)Ljava/lang/Enum$EnumDesc;",
                "    flags: (0x1002) ACC_PRIVATE, ACC_SYNTHETIC"
        );
    }
}
