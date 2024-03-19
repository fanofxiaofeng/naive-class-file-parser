package com.test.instruction.standard;

import com.test.annotations.GeneratedBy;
import com.test.cases.method.instruction.Instruction;
import com.test.instruction.InstructionTestGenerator;
import com.test.method.MethodPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(InstructionTestGenerator.class)
public class ObjectInstructionsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Object"));
    }

    @Instruction(value = 0xb1, name = "return")
    @Test
    public void test_1() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.Object();",
                "    descriptor: ()V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=0, locals=1, args_size=1",
                "         0: return",
                "      LineNumberTable:",
                "        line 45: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       1     0  this   Ljava/lang/Object;"
        );
    }

    @Test
    public void test_2() {
        expectedConsecutiveLines = List.of(
                "  public final native java.lang.Class<?> getClass();",
                "    descriptor: ()Ljava/lang/Class;",
                "    flags: (0x0111) ACC_PUBLIC, ACC_FINAL, ACC_NATIVE",
                "    Signature: #91                          // ()Ljava/lang/Class<*>;"
        );
    }

    @Test
    public void test_3() {
        expectedConsecutiveLines = List.of(
                "  public native int hashCode();",
                "    descriptor: ()I",
                "    flags: (0x0101) ACC_PUBLIC, ACC_NATIVE"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0xa6, name = "if_acmpne")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xac, name = "ireturn")
    @Test
    public void test_4() {
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
                "        10: ireturn",
                "      LineNumberTable:",
                "        line 164: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      11     0  this   Ljava/lang/Object;",
                "            0      11     1   obj   Ljava/lang/Object;"
        );
    }

    @Test
    public void test_5() {
        expectedConsecutiveLines = List.of(
                "  protected native java.lang.Object clone() throws java.lang.CloneNotSupportedException;",
                "    descriptor: ()Ljava/lang/Object;",
                "    flags: (0x0104) ACC_PROTECTED, ACC_NATIVE",
                "    Exceptions:",
                "      throws java.lang.CloneNotSupportedException"
        );
    }

    @Instruction(value = 0x12, name = "ldc")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xbb, name = "new")
    @Test
    public void test_6() {
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
                "        35: areturn",
                "      LineNumberTable:",
                "        line 257: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      36     0  this   Ljava/lang/Object;"
        );
    }

    @Test
    public void test_7() {
        expectedConsecutiveLines = List.of(
                "  public final native void notify();",
                "    descriptor: ()V",
                "    flags: (0x0111) ACC_PUBLIC, ACC_FINAL, ACC_NATIVE"
        );
    }

    @Test
    public void test_8() {
        expectedConsecutiveLines = List.of(
                "  public final native void notifyAll();",
                "    descriptor: ()V",
                "    flags: (0x0111) ACC_PUBLIC, ACC_FINAL, ACC_NATIVE"
        );
    }

    @Instruction(value = 0x09, name = "lconst_0")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xb1, name = "return")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Test
    public void test_9() {
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
                "      LineNumberTable:",
                "        line 339: 0",
                "        line 340: 5",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0  this   Ljava/lang/Object;",
                "    Exceptions:",
                "      throws java.lang.InterruptedException"
        );
    }

    @Instruction(value = 0x19, name = "aload")
    @Instruction(value = 0x1f, name = "lload_1")
    @Instruction(value = 0x21, name = "lload_3")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x3a, name = "astore")
    @Instruction(value = 0x42, name = "lstore_3")
    @Instruction(value = 0x57, name = "pop")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xb1, name = "return")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xbf, name = "athrow")
    @Test
    public void test_10() {
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
                "      Exception table:",
                "         from    to  target type",
                "             4     9    16   Class java/lang/InterruptedException",
                "             4     9    40   any",
                "            16    42    40   any",
                "      LineNumberTable:",
                "        line 364: 0",
                "        line 366: 4",
                "        line 373: 9",
                "        line 374: 13",
                "        line 367: 16",
                "        line 368: 18",
                "        line 369: 23",
                "        line 370: 31",
                "        line 371: 37",
                "        line 373: 40",
                "        line 374: 46",
                "        line 375: 49",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "           23      17     6 thread   Ljava/lang/Thread;",
                "           18      22     5     e   Ljava/lang/InterruptedException;",
                "            0      50     0  this   Ljava/lang/Object;",
                "            0      50     1 timeoutMillis   J",
                "            4      46     3  comp   J",
                "    Exceptions:",
                "      throws java.lang.InterruptedException"
        );
    }

    @Test
    public void test_11() {
        expectedConsecutiveLines = List.of(
                "  private final native void wait0(long) throws java.lang.InterruptedException;",
                "    descriptor: (J)V",
                "    flags: (0x0112) ACC_PRIVATE, ACC_FINAL, ACC_NATIVE",
                "    Exceptions:",
                "      throws java.lang.InterruptedException"
        );
    }

    @Instruction(value = 0xffffffff, name = "ldc2_w")
    @Instruction(value = 0x09, name = "lconst_0")
    @Instruction(value = 0x0a, name = "lconst_1")
    @Instruction(value = 0x12, name = "ldc")
    @Instruction(value = 0x1d, name = "iload_3")
    @Instruction(value = 0x1f, name = "lload_1")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x40, name = "lstore_1")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0x61, name = "ladd")
    @Instruction(value = 0x94, name = "lcmp")
    @Instruction(value = 0x9b, name = "iflt")
    @Instruction(value = 0x9c, name = "ifge")
    @Instruction(value = 0x9e, name = "ifle")
    @Instruction(value = 0xa4, name = "if_icmple")
    @Instruction(value = 0xb1, name = "return")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbf, name = "athrow")
    @Test
    public void test_12() {
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
                "      LineNumberTable:",
                "        line 475: 0",
                "        line 476: 6",
                "        line 479: 16",
                "        line 480: 26",
                "        line 484: 36",
                "        line 485: 48",
                "        line 488: 52",
                "        line 489: 57",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      58     0  this   Ljava/lang/Object;",
                "            0      58     1 timeoutMillis   J",
                "            0      58     3 nanos   I",
                "    Exceptions:",
                "      throws java.lang.InterruptedException"
        );
    }

    @Instruction(value = 0xb1, name = "return")
    @Test
    public void test_13() {
        expectedConsecutiveLines = List.of(
                "  protected void finalize() throws java.lang.Throwable;",
                "    descriptor: ()V",
                "    flags: (0x0004) ACC_PROTECTED",
                "    Code:",
                "      stack=0, locals=1, args_size=1",
                "         0: return",
                "      LineNumberTable:",
                "        line 592: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       1     0  this   Ljava/lang/Object;",
                "    Exceptions:",
                "      throws java.lang.Throwable"
        );
    }
}
