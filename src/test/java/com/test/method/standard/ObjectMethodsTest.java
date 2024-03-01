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
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=0, locals=1, args_size=1",
                "         0: return"
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
                "    flags: (0x0001) ACC_PUBLIC",
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
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: new           #1                  // class java/lang/StringBuilder",
                "         3: dup",
                "         4: invokespecial #3                  // Method java/lang/StringBuilder.\"<init>\":()V",
                "         7: aload_0",
                "         8: invokevirtual #7                  // Method getClass:()Ljava/lang/Class;",
                "        11: invokevirtual #13                 // Method java/lang/Class.getName:()Ljava/lang/String;",
                "        14: invokevirtual #19                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "        17: ldc           #23                 // String @",
                "        19: invokevirtual #19                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "        22: aload_0",
                "        23: invokevirtual #25                 // Method hashCode:()I",
                "        26: invokestatic  #29                 // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;",
                "        29: invokevirtual #19                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "        32: invokevirtual #35                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;",
                "        35: areturn"
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
                "    Code:",
                "      stack=3, locals=1, args_size=1",
                "         0: aload_0",
                "         1: lconst_0",
                "         2: invokevirtual #38                 // Method wait:(J)V",
                "         5: return",
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
                "    Code:",
                "      stack=3, locals=8, args_size=2",
                "         0: invokestatic  #42                 // Method jdk/internal/misc/Blocker.begin:()J",
                "         3: lstore_3",
                "         4: aload_0",
                "         5: lload_1",
                "         6: invokevirtual #48                 // Method wait0:(J)V",
                "         9: lload_3",
                "        10: invokestatic  #51                 // Method jdk/internal/misc/Blocker.end:(J)V",
                "        13: goto          49",
                "        16: astore        5",
                "        18: invokestatic  #56                 // Method java/lang/Thread.currentThread:()Ljava/lang/Thread;",
                "        21: astore        6",
                "        23: aload         6",
                "        25: invokevirtual #62                 // Method java/lang/Thread.isVirtual:()Z",
                "        28: ifeq          37",
                "        31: aload         6",
                "        33: invokevirtual #66                 // Method java/lang/Thread.getAndClearInterrupt:()Z",
                "        36: pop",
                "        37: aload         5",
                "        39: athrow",
                "        40: astore        7",
                "        42: lload_3",
                "        43: invokestatic  #51                 // Method jdk/internal/misc/Blocker.end:(J)V",
                "        46: aload         7",
                "        48: athrow",
                "        49: return",
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
                "    Code:",
                "      stack=4, locals=4, args_size=3",
                "         0: lload_1",
                "         1: lconst_0",
                "         2: lcmp",
                "         3: ifge          16",
                "         6: new           #69                 // class java/lang/IllegalArgumentException",
                "         9: dup",
                "        10: ldc           #71                 // String timeoutMillis value is negative",
                "        12: invokespecial #73                 // Method java/lang/IllegalArgumentException.\"<init>\":(Ljava/lang/String;)V",
                "        15: athrow",
                "        16: iload_3",
                "        17: iflt          26",
                "        20: iload_3",
                "        21: ldc           #76                 // int 999999",
                "        23: if_icmple     36",
                "        26: new           #69                 // class java/lang/IllegalArgumentException",
                "        29: dup",
                "        30: ldc           #77                 // String nanosecond timeout value out of range",
                "        32: invokespecial #73                 // Method java/lang/IllegalArgumentException.\"<init>\":(Ljava/lang/String;)V",
                "        35: athrow",
                "        36: iload_3",
                "        37: ifle          52",
                "        40: lload_1",
                "        41: ldc2_w        #81                 // long 9223372036854775807l",
                "        44: lcmp",
                "        45: ifge          52",
                "        48: lload_1",
                "        49: lconst_1",
                "        50: ladd",
                "        51: lstore_1",
                "        52: aload_0",
                "        53: lload_1",
                "        54: invokevirtual #38                 // Method wait:(J)V",
                "        57: return",
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
                "    Code:",
                "      stack=0, locals=1, args_size=1",
                "         0: return",
                "    Exceptions:",
                "      throws java.lang.Throwable"
        );
    }
}
