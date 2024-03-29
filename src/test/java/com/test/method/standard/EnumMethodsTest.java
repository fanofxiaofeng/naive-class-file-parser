package com.test.method.standard;

import com.test.method.MethodPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

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
                "    flags: (0x0011) ACC_PUBLIC, ACC_FINAL",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #1                  // Field name:Ljava/lang/String;",
                "         4: areturn"
        );
    }
    @Test
    public void test_for_method_2() {
        expectedConsecutiveLines = List.of(
                "  public final int ordinal();",
                "    descriptor: ()I",
                "    flags: (0x0011) ACC_PUBLIC, ACC_FINAL",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #7                  // Field ordinal:I",
                "         4: ireturn"
        );
    }
    @Test
    public void test_for_method_3() {
        expectedConsecutiveLines = List.of(
                "  protected java.lang.Enum(java.lang.String, int);",
                "    descriptor: (Ljava/lang/String;I)V",
                "    flags: (0x0004) ACC_PROTECTED",
                "    Code:",
                "      stack=2, locals=3, args_size=3",
                "         0: aload_0",
                "         1: invokespecial #11                 // Method java/lang/Object.\"<init>\":()V",
                "         4: aload_0",
                "         5: aload_1",
                "         6: putfield      #1                  // Field name:Ljava/lang/String;",
                "         9: aload_0",
                "        10: iload_2",
                "        11: putfield      #7                  // Field ordinal:I",
                "        14: return"
        );
    }
    @Test
    public void test_for_method_4() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.String toString();",
                "    descriptor: ()Ljava/lang/String;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #1                  // Field name:Ljava/lang/String;",
                "         4: areturn"
        );
    }
    @Test
    public void test_for_method_5() {
        expectedConsecutiveLines = List.of(
                "  public final boolean equals(java.lang.Object);",
                "    descriptor: (Ljava/lang/Object;)Z",
                "    flags: (0x0011) ACC_PUBLIC, ACC_FINAL",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_0",
                "         1: aload_1",
                "         2: if_acmpne     9",
                "         5: iconst_1",
                "         6: goto          10",
                "         9: iconst_0",
                "        10: ireturn"
        );
    }
    @Test
    public void test_for_method_6() {
        expectedConsecutiveLines = List.of(
                "  public final int hashCode();",
                "    descriptor: ()I",
                "    flags: (0x0011) ACC_PUBLIC, ACC_FINAL",
                "    Code:",
                "      stack=3, locals=2, args_size=1",
                "         0: aload_0",
                "         1: getfield      #17                 // Field hash:I",
                "         4: istore_1",
                "         5: iload_1",
                "         6: ifne          19",
                "         9: aload_0",
                "        10: aload_0",
                "        11: invokestatic  #20                 // Method java/lang/System.identityHashCode:(Ljava/lang/Object;)I",
                "        14: dup_x1",
                "        15: putfield      #17                 // Field hash:I",
                "        18: istore_1",
                "        19: iload_1",
                "        20: ireturn"
        );
    }
    @Test
    public void test_for_method_7() {
        expectedConsecutiveLines = List.of(
                "  protected final java.lang.Object clone() throws java.lang.CloneNotSupportedException;",
                "    descriptor: ()Ljava/lang/Object;",
                "    flags: (0x0014) ACC_PROTECTED, ACC_FINAL",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: new           #26                 // class java/lang/CloneNotSupportedException",
                "         3: dup",
                "         4: invokespecial #28                 // Method java/lang/CloneNotSupportedException.\"<init>\":()V",
                "         7: athrow",
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
                "    Code:",
                "      stack=2, locals=4, args_size=2",
                "         0: aload_1",
                "         1: astore_2",
                "         2: aload_0",
                "         3: astore_3",
                "         4: aload_3",
                "         5: invokevirtual #29                 // Method java/lang/Object.getClass:()Ljava/lang/Class;",
                "         8: aload_2",
                "         9: invokevirtual #29                 // Method java/lang/Object.getClass:()Ljava/lang/Class;",
                "        12: if_acmpeq     34",
                "        15: aload_3",
                "        16: invokevirtual #33                 // Method getDeclaringClass:()Ljava/lang/Class;",
                "        19: aload_2",
                "        20: invokevirtual #33                 // Method getDeclaringClass:()Ljava/lang/Class;",
                "        23: if_acmpeq     34",
                "        26: new           #36                 // class java/lang/ClassCastException",
                "        29: dup",
                "        30: invokespecial #38                 // Method java/lang/ClassCastException.\"<init>\":()V",
                "        33: athrow",
                "        34: aload_3",
                "        35: getfield      #7                  // Field ordinal:I",
                "        38: aload_2",
                "        39: getfield      #7                  // Field ordinal:I",
                "        42: isub",
                "        43: ireturn",
                "    Signature: #143                         // (TE;)I"
        );
    }
    @Test
    public void test_for_method_9() {
        expectedConsecutiveLines = List.of(
                "  public final java.lang.Class<E> getDeclaringClass();",
                "    descriptor: ()Ljava/lang/Class;",
                "    flags: (0x0011) ACC_PUBLIC, ACC_FINAL",
                "    Code:",
                "      stack=2, locals=3, args_size=1",
                "         0: aload_0",
                "         1: invokevirtual #29                 // Method java/lang/Object.getClass:()Ljava/lang/Class;",
                "         4: astore_1",
                "         5: aload_1",
                "         6: invokevirtual #39                 // Method java/lang/Class.getSuperclass:()Ljava/lang/Class;",
                "         9: astore_2",
                "        10: aload_2",
                "        11: ldc           #2                  // class java/lang/Enum",
                "        13: if_acmpne     20",
                "        16: aload_1",
                "        17: goto          21",
                "        20: aload_2",
                "        21: areturn",
                "    Signature: #148                         // ()Ljava/lang/Class<TE;>;"
        );
    }
    @Test
    public void test_for_method_10() {
        expectedConsecutiveLines = List.of(
                "  public final java.util.Optional<java.lang.Enum$EnumDesc<E>> describeConstable();",
                "    descriptor: ()Ljava/util/Optional;",
                "    flags: (0x0011) ACC_PUBLIC, ACC_FINAL",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: invokevirtual #33                 // Method getDeclaringClass:()Ljava/lang/Class;",
                "         4: invokevirtual #44                 // Method java/lang/Class.describeConstable:()Ljava/util/Optional;",
                "         7: aload_0",
                "         8: invokedynamic #48,  0             // InvokeDynamic #0:apply:(Ljava/lang/Enum;)Ljava/util/function/Function;",
                "        13: invokevirtual #52                 // Method java/util/Optional.map:(Ljava/util/function/Function;)Ljava/util/Optional;",
                "        16: areturn",
                "    Signature: #149                         // ()Ljava/util/Optional<Ljava/lang/Enum$EnumDesc<TE;>;>;"
        );
    }
    @Test
    public void test_for_method_11() {
        expectedConsecutiveLines = List.of(
                "  public static <T extends java.lang.Enum<T>> T valueOf(java.lang.Class<T>, java.lang.String);",
                "    descriptor: (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=3, args_size=2",
                "         0: aload_0",
                "         1: invokevirtual #58                 // Method java/lang/Class.enumConstantDirectory:()Ljava/util/Map;",
                "         4: aload_1",
                "         5: invokeinterface #62,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;",
                "        10: checkcast     #2                  // class java/lang/Enum",
                "        13: astore_2",
                "        14: aload_2",
                "        15: ifnull        20",
                "        18: aload_2",
                "        19: areturn",
                "        20: aload_1",
                "        21: ifnonnull     34",
                "        24: new           #68                 // class java/lang/NullPointerException",
                "        27: dup",
                "        28: ldc           #70                 // String Name is null",
                "        30: invokespecial #72                 // Method java/lang/NullPointerException.\"<init>\":(Ljava/lang/String;)V",
                "        33: athrow",
                "        34: new           #75                 // class java/lang/IllegalArgumentException",
                "        37: dup",
                "        38: new           #77                 // class java/lang/StringBuilder",
                "        41: dup",
                "        42: invokespecial #79                 // Method java/lang/StringBuilder.\"<init>\":()V",
                "        45: ldc           #80                 // String No enum constant",
                "        47: invokevirtual #82                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "        50: aload_0",
                "        51: invokevirtual #86                 // Method java/lang/Class.getCanonicalName:()Ljava/lang/String;",
                "        54: invokevirtual #82                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "        57: ldc           #90                 // String .",
                "        59: invokevirtual #82                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "        62: aload_1",
                "        63: invokevirtual #82                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "        66: invokevirtual #92                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;",
                "        69: invokespecial #95                 // Method java/lang/IllegalArgumentException.\"<init>\":(Ljava/lang/String;)V",
                "        72: athrow",
                "    Signature: #156                         // <T:Ljava/lang/Enum<TT;>;>(Ljava/lang/Class<TT;>;Ljava/lang/String;)TT;"
        );
    }
    @Test
    public void test_for_method_12() {
        expectedConsecutiveLines = List.of(
                "  protected final void finalize();",
                "    descriptor: ()V",
                "    flags: (0x0014) ACC_PROTECTED, ACC_FINAL",
                "    Code:",
                "      stack=0, locals=1, args_size=1",
                "         0: return"
        );
    }
    @Test
    public void test_for_method_13() {
        expectedConsecutiveLines = List.of(
                "  private void readObject(java.io.ObjectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException;",
                "    descriptor: (Ljava/io/ObjectInputStream;)V",
                "    flags: (0x0002) ACC_PRIVATE",
                "    Code:",
                "      stack=3, locals=2, args_size=2",
                "         0: new           #96                 // class java/io/InvalidObjectException",
                "         3: dup",
                "         4: ldc           #98                 // String can\\'t deserialize enum",
                "         6: invokespecial #100                // Method java/io/InvalidObjectException.\"<init>\":(Ljava/lang/String;)V",
                "         9: athrow",
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
                "    Code:",
                "      stack=3, locals=1, args_size=1",
                "         0: new           #96                 // class java/io/InvalidObjectException",
                "         3: dup",
                "         4: ldc           #98                 // String can\\'t deserialize enum",
                "         6: invokespecial #100                // Method java/io/InvalidObjectException.\"<init>\":(Ljava/lang/String;)V",
                "         9: athrow",
                "    Exceptions:",
                "      throws java.io.ObjectStreamException"
        );
    }
    @Test
    public void test_for_method_15() {
        expectedConsecutiveLines = List.of(
                "  public int compareTo(java.lang.Object);",
                "    descriptor: (Ljava/lang/Object;)I",
                "    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_0",
                "         1: aload_1",
                "         2: checkcast     #2                  // class java/lang/Enum",
                "         5: invokevirtual #101                // Method compareTo:(Ljava/lang/Enum;)I",
                "         8: ireturn"
        );
    }
    @Test
    public void test_for_method_16() {
        expectedConsecutiveLines = List.of(
                "  private java.lang.Enum$EnumDesc lambda$describeConstable$0(java.lang.constant.ClassDesc);",
                "    descriptor: (Ljava/lang/constant/ClassDesc;)Ljava/lang/Enum$EnumDesc;",
                "    flags: (0x1002) ACC_PRIVATE, ACC_SYNTHETIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_1",
                "         1: aload_0",
                "         2: getfield      #1                  // Field name:Ljava/lang/String;",
                "         5: invokestatic  #105                // Method java/lang/Enum$EnumDesc.of:(Ljava/lang/constant/ClassDesc;Ljava/lang/String;)Ljava/lang/Enum$EnumDesc;",
                "         8: areturn"
        );
    }
}
