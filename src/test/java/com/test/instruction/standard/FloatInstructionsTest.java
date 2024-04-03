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
public class FloatInstructionsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Float"));
    }

    @Instruction(value = 0x22, name = "fload_0")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_1() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.String toString(float);",
                "    descriptor: (F)Ljava/lang/String;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: fload_0",
                "         1: invokestatic  #5                  // Method jdk/internal/math/FloatToDecimal.toString:(F)Ljava/lang/String;",
                "         4: areturn",
                "      LineNumberTable:",
                "        line 306: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       5     0     f   F"
        );
    }

    @Instruction(value = 0x0b, name = "fconst_0")
    @Instruction(value = 0x11, name = "sipush")
    @Instruction(value = 0x12, name = "ldc")
    @Instruction(value = 0x22, name = "fload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x4c, name = "astore_1")
    @Instruction(value = 0x8d, name = "f2d")
    @Instruction(value = 0x95, name = "fcmpl")
    @Instruction(value = 0x96, name = "fcmpg")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0x9c, name = "ifge")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_2() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.String toHexString(float);",
                "    descriptor: (F)Ljava/lang/String;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=3, locals=2, args_size=1",
                "         0: fload_0",
                "         1: invokestatic  #11                 // Method java/lang/Math.abs:(F)F",
                "         4: ldc           #17                 // float 1.1754944E-38f",
                "         6: fcmpg",
                "         7: ifge          37",
                "        10: fload_0",
                "        11: fconst_0",
                "        12: fcmpl",
                "        13: ifeq          37",
                "        16: fload_0",
                "        17: f2d",
                "        18: sipush        -896",
                "        21: invokestatic  #20                 // Method java/lang/Math.scalb:(DI)D",
                "        24: invokestatic  #24                 // Method java/lang/Double.toHexString:(D)Ljava/lang/String;",
                "        27: astore_1",
                "        28: aload_1",
                "        29: ldc           #28                 // String p-1022$",
                "        31: ldc           #30                 // String p-126",
                "        33: invokevirtual #32                 // Method java/lang/String.replaceFirst:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;",
                "        36: areturn",
                "        37: fload_0",
                "        38: f2d",
                "        39: invokestatic  #24                 // Method java/lang/Double.toHexString:(D)Ljava/lang/String;",
                "        42: areturn",
                "      LineNumberTable:",
                "        line 388: 0",
                "        line 393: 16",
                "        line 397: 28",
                "        line 400: 37",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "           28       9     1     s   Ljava/lang/String;",
                "            0      43     0     f   F",
                "      StackMapTable: number_of_entries = 1",
                "        frame_type = 37 /* same */"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xbb, name = "new")
    @Test
    public void test_3() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.Float valueOf(java.lang.String) throws java.lang.NumberFormatException;",
                "    descriptor: (Ljava/lang/String;)Ljava/lang/Float;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=3, locals=1, args_size=1",
                "         0: new           #1                  // class java/lang/Float",
                "         3: dup",
                "         4: aload_0",
                "         5: invokestatic  #38                 // Method parseFloat:(Ljava/lang/String;)F",
                "         8: invokespecial #42                 // Method \"<init>\":(F)V",
                "        11: areturn",
                "      LineNumberTable:",
                "        line 520: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      12     0     s   Ljava/lang/String;",
                "    Exceptions:",
                "      throws java.lang.NumberFormatException"
        );
    }

    @Instruction(value = 0x22, name = "fload_0")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xbb, name = "new")
    @Test
    public void test_4() {
        expectedConsecutiveLines = List.of(
                "  public static java.lang.Float valueOf(float);",
                "    descriptor: (F)Ljava/lang/Float;",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=3, locals=1, args_size=1",
                "         0: new           #1                  // class java/lang/Float",
                "         3: dup",
                "         4: fload_0",
                "         5: invokespecial #42                 // Method \"<init>\":(F)V",
                "         8: areturn",
                "      LineNumberTable:",
                "        line 538: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       9     0     f   F"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xae, name = "freturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_5() {
        expectedConsecutiveLines = List.of(
                "  public static float parseFloat(java.lang.String) throws java.lang.NumberFormatException;",
                "    descriptor: (Ljava/lang/String;)F",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: aload_0",
                "         1: invokestatic  #46                 // Method jdk/internal/math/FloatingDecimal.parseFloat:(Ljava/lang/String;)F",
                "         4: freturn",
                "      LineNumberTable:",
                "        line 556: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       5     0     s   Ljava/lang/String;",
                "    Exceptions:",
                "      throws java.lang.NumberFormatException"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x22, name = "fload_0")
    @Instruction(value = 0x95, name = "fcmpl")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xac, name = "ireturn")
    @Test
    public void test_6() {
        expectedConsecutiveLines = List.of(
                "  public static boolean isNaN(float);",
                "    descriptor: (F)Z",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: fload_0",
                "         1: fload_0",
                "         2: fcmpl",
                "         3: ifeq          10",
                "         6: iconst_1",
                "         7: goto          11",
                "        10: iconst_0",
                "        11: ireturn",
                "      LineNumberTable:",
                "        line 572: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      12     0     v   F",
                "      StackMapTable: number_of_entries = 2",
                "        frame_type = 10 /* same */",
                "        frame_type = 64 /* same_locals_1_stack_item */",
                "          stack = [ int ]"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x12, name = "ldc")
    @Instruction(value = 0x22, name = "fload_0")
    @Instruction(value = 0x95, name = "fcmpl")
    @Instruction(value = 0x9e, name = "ifle")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_7() {
        expectedConsecutiveLines = List.of(
                "  public static boolean isInfinite(float);",
                "    descriptor: (F)Z",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: fload_0",
                "         1: invokestatic  #11                 // Method java/lang/Math.abs:(F)F",
                "         4: ldc           #49                 // float 3.4028235E38f",
                "         6: fcmpl",
                "         7: ifle          14",
                "        10: iconst_1",
                "        11: goto          15",
                "        14: iconst_0",
                "        15: ireturn",
                "      LineNumberTable:",
                "        line 589: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      16     0     v   F",
                "      StackMapTable: number_of_entries = 2",
                "        frame_type = 14 /* same */",
                "        frame_type = 64 /* same_locals_1_stack_item */",
                "          stack = [ int ]"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x12, name = "ldc")
    @Instruction(value = 0x22, name = "fload_0")
    @Instruction(value = 0x96, name = "fcmpg")
    @Instruction(value = 0x9d, name = "ifgt")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_8() {
        expectedConsecutiveLines = List.of(
                "  public static boolean isFinite(float);",
                "    descriptor: (F)Z",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: fload_0",
                "         1: invokestatic  #11                 // Method java/lang/Math.abs:(F)F",
                "         4: ldc           #49                 // float 3.4028235E38f",
                "         6: fcmpg",
                "         7: ifgt          14",
                "        10: iconst_1",
                "        11: goto          15",
                "        14: iconst_0",
                "        15: ireturn",
                "      LineNumberTable:",
                "        line 609: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      16     0     f   F",
                "      StackMapTable: number_of_entries = 2",
                "        frame_type = 14 /* same */",
                "        frame_type = 64 /* same_locals_1_stack_item */",
                "          stack = [ int ]"
        );
    }

    @Instruction(value = 0x23, name = "fload_1")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xb1, name = "return")
    @Instruction(value = 0xb5, name = "putfield")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Test
    public void test_9() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.Float(float);",
                "    descriptor: (F)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_0",
                "         1: invokespecial #50                 // Method java/lang/Number.\"<init>\":()V",
                "         4: aload_0",
                "         5: fload_1",
                "         6: putfield      #55                 // Field value:F",
                "         9: return",
                "      LineNumberTable:",
                "        line 631: 0",
                "        line 632: 4",
                "        line 633: 9",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      10     0  this   Ljava/lang/Float;",
                "            0      10     1 value   F"
        );
    }

    @Instruction(value = 0x27, name = "dload_1")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x90, name = "d2f")
    @Instruction(value = 0xb1, name = "return")
    @Instruction(value = 0xb5, name = "putfield")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Test
    public void test_10() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.Float(double);",
                "    descriptor: (D)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=3, args_size=2",
                "         0: aload_0",
                "         1: invokespecial #50                 // Method java/lang/Number.\"<init>\":()V",
                "         4: aload_0",
                "         5: dload_1",
                "         6: d2f",
                "         7: putfield      #55                 // Field value:F",
                "        10: return",
                "      LineNumberTable:",
                "        line 647: 0",
                "        line 648: 4",
                "        line 649: 10",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      11     0  this   Ljava/lang/Float;",
                "            0      11     1 value   D"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0xb1, name = "return")
    @Instruction(value = 0xb5, name = "putfield")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_11() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.Float(java.lang.String) throws java.lang.NumberFormatException;",
                "    descriptor: (Ljava/lang/String;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_0",
                "         1: invokespecial #50                 // Method java/lang/Number.\"<init>\":()V",
                "         4: aload_0",
                "         5: aload_1",
                "         6: invokestatic  #38                 // Method parseFloat:(Ljava/lang/String;)F",
                "         9: putfield      #55                 // Field value:F",
                "        12: return",
                "      LineNumberTable:",
                "        line 668: 0",
                "        line 669: 4",
                "        line 670: 12",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      13     0  this   Ljava/lang/Float;",
                "            0      13     1     s   Ljava/lang/String;",
                "    Exceptions:",
                "      throws java.lang.NumberFormatException"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_12() {
        expectedConsecutiveLines = List.of(
                "  public boolean isNaN();",
                "    descriptor: ()Z",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #55                 // Field value:F",
                "         4: invokestatic  #59                 // Method isNaN:(F)Z",
                "         7: ireturn",
                "      LineNumberTable:",
                "        line 680: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       8     0  this   Ljava/lang/Float;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_13() {
        expectedConsecutiveLines = List.of(
                "  public boolean isInfinite();",
                "    descriptor: ()Z",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #55                 // Field value:F",
                "         4: invokestatic  #63                 // Method isInfinite:(F)Z",
                "         7: ireturn",
                "      LineNumberTable:",
                "        line 692: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       8     0  this   Ljava/lang/Float;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_14() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.String toString();",
                "    descriptor: ()Ljava/lang/String;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #55                 // Field value:F",
                "         4: invokestatic  #66                 // Method toString:(F)Ljava/lang/String;",
                "         7: areturn",
                "      LineNumberTable:",
                "        line 705: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       8     0  this   Ljava/lang/Float;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x8b, name = "f2i")
    @Instruction(value = 0x91, name = "i2b")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Test
    public void test_15() {
        expectedConsecutiveLines = List.of(
                "  public byte byteValue();",
                "    descriptor: ()B",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #55                 // Field value:F",
                "         4: f2i",
                "         5: i2b",
                "         6: ireturn",
                "      LineNumberTable:",
                "        line 717: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       7     0  this   Ljava/lang/Float;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x8b, name = "f2i")
    @Instruction(value = 0x93, name = "i2s")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Test
    public void test_16() {
        expectedConsecutiveLines = List.of(
                "  public short shortValue();",
                "    descriptor: ()S",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #55                 // Field value:F",
                "         4: f2i",
                "         5: i2s",
                "         6: ireturn",
                "      LineNumberTable:",
                "        line 730: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       7     0  this   Ljava/lang/Float;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x8b, name = "f2i")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Test
    public void test_17() {
        expectedConsecutiveLines = List.of(
                "  public int intValue();",
                "    descriptor: ()I",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #55                 // Field value:F",
                "         4: f2i",
                "         5: ireturn",
                "      LineNumberTable:",
                "        line 742: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0  this   Ljava/lang/Float;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x8c, name = "f2l")
    @Instruction(value = 0xad, name = "lreturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Test
    public void test_18() {
        expectedConsecutiveLines = List.of(
                "  public long longValue();",
                "    descriptor: ()J",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #55                 // Field value:F",
                "         4: f2l",
                "         5: lreturn",
                "      LineNumberTable:",
                "        line 754: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0  this   Ljava/lang/Float;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xae, name = "freturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Test
    public void test_19() {
        expectedConsecutiveLines = List.of(
                "  public float floatValue();",
                "    descriptor: ()F",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #55                 // Field value:F",
                "         4: freturn",
                "      LineNumberTable:",
                "        line 764: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       5     0  this   Ljava/lang/Float;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x8d, name = "f2d")
    @Instruction(value = 0xaf, name = "dreturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Test
    public void test_20() {
        expectedConsecutiveLines = List.of(
                "  public double doubleValue();",
                "    descriptor: ()D",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #55                 // Field value:F",
                "         4: f2d",
                "         5: dreturn",
                "      LineNumberTable:",
                "        line 780: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0  this   Ljava/lang/Float;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_21() {
        expectedConsecutiveLines = List.of(
                "  public int hashCode();",
                "    descriptor: ()I",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: aload_0",
                "         1: getfield      #55                 // Field value:F",
                "         4: invokestatic  #67                 // Method hashCode:(F)I",
                "         7: ireturn",
                "      LineNumberTable:",
                "        line 794: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       8     0  this   Ljava/lang/Float;"
        );
    }

    @Instruction(value = 0x22, name = "fload_0")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_22() {
        expectedConsecutiveLines = List.of(
                "  public static int hashCode(float);",
                "    descriptor: (F)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: fload_0",
                "         1: invokestatic  #71                 // Method floatToIntBits:(F)I",
                "         4: ireturn",
                "      LineNumberTable:",
                "        line 806: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       5     0 value   F"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0xa0, name = "if_icmpne")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xc0, name = "checkcast")
    @Instruction(value = 0xc1, name = "instanceof")
    @Test
    public void test_23() {
        expectedConsecutiveLines = List.of(
                "  public boolean equals(java.lang.Object);",
                "    descriptor: (Ljava/lang/Object;)Z",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_1",
                "         1: instanceof    #1                  // class java/lang/Float",
                "         4: ifeq          31",
                "         7: aload_1",
                "         8: checkcast     #1                  // class java/lang/Float",
                "        11: getfield      #55                 // Field value:F",
                "        14: invokestatic  #71                 // Method floatToIntBits:(F)I",
                "        17: aload_0",
                "        18: getfield      #55                 // Field value:F",
                "        21: invokestatic  #71                 // Method floatToIntBits:(F)I",
                "        24: if_icmpne     31",
                "        27: iconst_1",
                "        28: goto          32",
                "        31: iconst_0",
                "        32: ireturn",
                "      LineNumberTable:",
                "        line 837: 0",
                "        line 838: 14",
                "        line 837: 32",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      33     0  this   Ljava/lang/Float;",
                "            0      33     1   obj   Ljava/lang/Object;",
                "      StackMapTable: number_of_entries = 2",
                "        frame_type = 31 /* same */",
                "        frame_type = 64 /* same_locals_1_stack_item */",
                "          stack = [ int ]"
        );
    }

    @Instruction(value = 0x12, name = "ldc")
    @Instruction(value = 0x22, name = "fload_0")
    @Instruction(value = 0x9a, name = "ifne")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_24() {
        expectedConsecutiveLines = List.of(
                "  public static int floatToIntBits(float);",
                "    descriptor: (F)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: fload_0",
                "         1: invokestatic  #59                 // Method isNaN:(F)Z",
                "         4: ifne          12",
                "         7: fload_0",
                "         8: invokestatic  #74                 // Method floatToRawIntBits:(F)I",
                "        11: ireturn",
                "        12: ldc           #77                 // int 2143289344",
                "        14: ireturn",
                "      LineNumberTable:",
                "        line 874: 0",
                "        line 875: 7",
                "        line 877: 12",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      15     0 value   F",
                "      StackMapTable: number_of_entries = 1",
                "        frame_type = 12 /* same */"
        );
    }

    @Test
    public void test_25() {
        expectedConsecutiveLines = List.of(
                "  public static native int floatToRawIntBits(float);",
                "    descriptor: (F)I",
                "    flags: (0x0109) ACC_PUBLIC, ACC_STATIC, ACC_NATIVE"
        );
    }

    @Test
    public void test_26() {
        expectedConsecutiveLines = List.of(
                "  public static native float intBitsToFloat(int);",
                "    descriptor: (I)F",
                "    flags: (0x0109) ACC_PUBLIC, ACC_STATIC, ACC_NATIVE"
        );
    }

    @Instruction(value = 0x0c, name = "fconst_1")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x11, name = "sipush")
    @Instruction(value = 0x12, name = "ldc")
    @Instruction(value = 0x15, name = "iload")
    @Instruction(value = 0x17, name = "fload")
    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0x1c, name = "iload_2")
    @Instruction(value = 0x1d, name = "iload_3")
    @Instruction(value = 0x36, name = "istore")
    @Instruction(value = 0x38, name = "fstore")
    @Instruction(value = 0x3c, name = "istore_1")
    @Instruction(value = 0x3d, name = "istore_2")
    @Instruction(value = 0x3e, name = "istore_3")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0x60, name = "iadd")
    @Instruction(value = 0x64, name = "isub")
    @Instruction(value = 0x6a, name = "fmul")
    @Instruction(value = 0x78, name = "ishl")
    @Instruction(value = 0x7a, name = "ishr")
    @Instruction(value = 0x7e, name = "iand")
    @Instruction(value = 0x80, name = "ior")
    @Instruction(value = 0x86, name = "i2f")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0x9a, name = "ifne")
    @Instruction(value = 0xa0, name = "if_icmpne")
    @Instruction(value = 0xa1, name = "if_icmplt")
    @Instruction(value = 0xa2, name = "if_icmpge")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xae, name = "freturn")
    @Instruction(value = 0xb2, name = "getstatic")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbf, name = "athrow")
    @Test
    public void test_27() {
        expectedConsecutiveLines = List.of(
                "  public static float float16ToFloat(short);",
                "    descriptor: (S)F",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=3, locals=9, args_size=1",
                "         0: iload_0",
                "         1: istore_1",
                "         2: ldc           #78                 // int 32768",
                "         4: iload_1",
                "         5: iand",
                "         6: istore_2",
                "         7: sipush        31744",
                "        10: iload_1",
                "        11: iand",
                "        12: istore_3",
                "        13: sipush        1023",
                "        16: iload_1",
                "        17: iand",
                "        18: istore        4",
                "        20: bipush        13",
                "        22: istore        5",
                "        24: iload_2",
                "        25: ifeq          33",
                "        28: ldc           #81                 // float -1.0f",
                "        30: goto          34",
                "        33: fconst_1",
                "        34: fstore        6",
                "        36: iload_3",
                "        37: bipush        10",
                "        39: ishr",
                "        40: bipush        15",
                "        42: isub",
                "        43: istore        7",
                "        45: iload         7",
                "        47: bipush        -15",
                "        49: if_icmpne     62",
                "        52: fload         6",
                "        54: ldc           #82                 // float 5.9604645E-8f",
                "        56: iload         4",
                "        58: i2f",
                "        59: fmul",
                "        60: fmul",
                "        61: freturn",
                "        62: iload         7",
                "        64: bipush        16",
                "        66: if_icmpne     99",
                "        69: iload         4",
                "        71: ifne          82",
                "        74: fload         6",
                "        76: ldc           #83                 // float Infinityf",
                "        78: fmul",
                "        79: goto          98",
                "        82: iload_2",
                "        83: bipush        16",
                "        85: ishl",
                "        86: ldc           #84                 // int 2139095040",
                "        88: ior",
                "        89: iload         4",
                "        91: bipush        13",
                "        93: ishl",
                "        94: ior",
                "        95: invokestatic  #85                 // Method intBitsToFloat:(I)F",
                "        98: freturn",
                "        99: getstatic     #89                 // Field $assertionsDisabled:Z",
                "       102: ifne          127",
                "       105: bipush        -15",
                "       107: iload         7",
                "       109: if_icmpge     119",
                "       112: iload         7",
                "       114: bipush        16",
                "       116: if_icmplt     127",
                "       119: new           #93                 // class java/lang/AssertionError",
                "       122: dup",
                "       123: invokespecial #95                 // Method java/lang/AssertionError.\"<init>\":()V",
                "       126: athrow",
                "       127: iload         7",
                "       129: bipush        127",
                "       131: iadd",
                "       132: bipush        23",
                "       134: ishl",
                "       135: istore        8",
                "       137: iload_2",
                "       138: bipush        16",
                "       140: ishl",
                "       141: iload         8",
                "       143: ior",
                "       144: iload         4",
                "       146: bipush        13",
                "       148: ishl",
                "       149: ior",
                "       150: invokestatic  #85                 // Method intBitsToFloat:(I)F",
                "       153: freturn",
                "      LineNumberTable:",
                "        line 1022: 0",
                "        line 1023: 2",
                "        line 1024: 7",
                "        line 1025: 13",
                "        line 1029: 20",
                "        line 1031: 24",
                "        line 1037: 36",
                "        line 1038: 45",
                "        line 1042: 52",
                "        line 1043: 62",
                "        line 1044: 69",
                "        line 1045: 74",
                "        line 1046: 82",
                "        line 1044: 98",
                "        line 1052: 99",
                "        line 1054: 127",
                "        line 1058: 137",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0     154     0 floatBinary16   S",
                "            2     152     1 bin16arg   I",
                "            7     147     2 bin16SignBit   I",
                "           13     141     3 bin16ExpBits   I",
                "           20     134     4 bin16SignifBits   I",
                "           24     130     5 SIGNIF_SHIFT   I",
                "           36     118     6  sign   F",
                "           45     109     7 bin16Exp   I",
                "          137      17     8 floatExpBits   I",
                "      StackMapTable: number_of_entries = 8",
                "        frame_type = 255 /* full_frame */",
                "          offset_delta = 33",
                "          locals = [ int, int, int, int, int, int ]",
                "          stack = []",
                "        frame_type = 64 /* same_locals_1_stack_item */",
                "          stack = [ float ]",
                "        frame_type = 253 /* append */",
                "          offset_delta = 27",
                "          locals = [ float, int ]",
                "        frame_type = 19 /* same */",
                "        frame_type = 79 /* same_locals_1_stack_item */",
                "          stack = [ float ]",
                "        frame_type = 0 /* same */",
                "        frame_type = 19 /* same */",
                "        frame_type = 7 /* same */"
        );
    }

    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x07, name = "iconst_4")
    @Instruction(value = 0x10, name = "bipush")
    @Instruction(value = 0x11, name = "sipush")
    @Instruction(value = 0x12, name = "ldc")
    @Instruction(value = 0x15, name = "iload")
    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0x1c, name = "iload_2")
    @Instruction(value = 0x22, name = "fload_0")
    @Instruction(value = 0x25, name = "fload_3")
    @Instruction(value = 0x36, name = "istore")
    @Instruction(value = 0x3c, name = "istore_1")
    @Instruction(value = 0x3d, name = "istore_2")
    @Instruction(value = 0x46, name = "fstore_3")
    @Instruction(value = 0x59, name = "dup")
    @Instruction(value = 0x60, name = "iadd")
    @Instruction(value = 0x64, name = "isub")
    @Instruction(value = 0x78, name = "ishl")
    @Instruction(value = 0x7a, name = "ishr")
    @Instruction(value = 0x7e, name = "iand")
    @Instruction(value = 0x80, name = "ior")
    @Instruction(value = 0x93, name = "i2s")
    @Instruction(value = 0x95, name = "fcmpl")
    @Instruction(value = 0x96, name = "fcmpg")
    @Instruction(value = 0x99, name = "ifeq")
    @Instruction(value = 0x9a, name = "ifne")
    @Instruction(value = 0x9b, name = "iflt")
    @Instruction(value = 0x9d, name = "ifgt")
    @Instruction(value = 0xa2, name = "if_icmpge")
    @Instruction(value = 0xa3, name = "if_icmpgt")
    @Instruction(value = 0xa4, name = "if_icmple")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb2, name = "getstatic")
    @Instruction(value = 0xb7, name = "invokespecial")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Instruction(value = 0xbb, name = "new")
    @Instruction(value = 0xbf, name = "athrow")
    @Test
    public void test_28() {
        expectedConsecutiveLines = List.of(
                "  public static short floatToFloat16(float);",
                "    descriptor: (F)S",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=4, locals=12, args_size=1",
                "         0: fload_0",
                "         1: invokestatic  #74                 // Method floatToRawIntBits:(F)I",
                "         4: istore_1",
                "         5: iload_1",
                "         6: ldc           #96                 // int -2147483648",
                "         8: iand",
                "         9: bipush        16",
                "        11: ishr",
                "        12: i2s",
                "        13: istore_2",
                "        14: fload_0",
                "        15: invokestatic  #59                 // Method isNaN:(F)Z",
                "        18: ifeq          49",
                "        21: iload_2",
                "        22: sipush        31744",
                "        25: ior",
                "        26: iload_1",
                "        27: ldc           #97                 // int 8380416",
                "        29: iand",
                "        30: bipush        13",
                "        32: ishr",
                "        33: ior",
                "        34: iload_1",
                "        35: sipush        8176",
                "        38: iand",
                "        39: iconst_4",
                "        40: ishr",
                "        41: ior",
                "        42: iload_1",
                "        43: bipush        15",
                "        45: iand",
                "        46: ior",
                "        47: i2s",
                "        48: ireturn",
                "        49: fload_0",
                "        50: invokestatic  #11                 // Method java/lang/Math.abs:(F)F",
                "        53: fstore_3",
                "        54: fload_3",
                "        55: ldc           #98                 // float 65520.0f",
                "        57: fcmpl",
                "        58: iflt          68",
                "        61: iload_2",
                "        62: sipush        31744",
                "        65: ior",
                "        66: i2s",
                "        67: ireturn",
                "        68: fload_3",
                "        69: ldc           #99                 // float 2.9802322E-8f",
                "        71: fcmpg",
                "        72: ifgt          77",
                "        75: iload_2",
                "        76: ireturn",
                "        77: fload_0",
                "        78: invokestatic  #100                // Method java/lang/Math.getExponent:(F)I",
                "        81: istore        4",
                "        83: getstatic     #89                 // Field $assertionsDisabled:Z",
                "        86: ifne          111",
                "        89: bipush        -25",
                "        91: iload         4",
                "        93: if_icmpgt     103",
                "        96: iload         4",
                "        98: bipush        15",
                "       100: if_icmple     111",
                "       103: new           #93                 // class java/lang/AssertionError",
                "       106: dup",
                "       107: invokespecial #95                 // Method java/lang/AssertionError.\"<init>\":()V",
                "       110: athrow",
                "       111: iconst_0",
                "       112: istore        5",
                "       114: iconst_0",
                "       115: istore        6",
                "       117: iload         4",
                "       119: bipush        -14",
                "       121: if_icmpge     139",
                "       124: bipush        -14",
                "       126: iload         4",
                "       128: isub",
                "       129: istore        5",
                "       131: bipush        -15",
                "       133: istore        4",
                "       135: ldc           #103                // int 8388608",
                "       137: istore        6",
                "       139: iload_1",
                "       140: ldc           #104                // int 8388607",
                "       142: iand",
                "       143: iload         6",
                "       145: ior",
                "       146: istore        7",
                "       148: iload         7",
                "       150: bipush        13",
                "       152: iload         5",
                "       154: iadd",
                "       155: ishr",
                "       156: i2s",
                "       157: istore        8",
                "       159: iload         7",
                "       161: iconst_1",
                "       162: bipush        13",
                "       164: iload         5",
                "       166: iadd",
                "       167: ishl",
                "       168: iand",
                "       169: istore        9",
                "       171: iload         7",
                "       173: iconst_1",
                "       174: bipush        12",
                "       176: iload         5",
                "       178: iadd",
                "       179: ishl",
                "       180: iand",
                "       181: istore        10",
                "       183: iload         7",
                "       185: iconst_1",
                "       186: bipush        12",
                "       188: iload         5",
                "       190: iadd",
                "       191: ishl",
                "       192: iconst_1",
                "       193: isub",
                "       194: iand",
                "       195: istore        11",
                "       197: iload         10",
                "       199: ifeq          217",
                "       202: iload         9",
                "       204: iload         11",
                "       206: ior",
                "       207: ifeq          217",
                "       210: iload         8",
                "       212: iconst_1",
                "       213: iadd",
                "       214: i2s",
                "       215: istore        8",
                "       217: getstatic     #89                 // Field $assertionsDisabled:Z",
                "       220: ifne          239",
                "       223: ldc           #105                // int 63488",
                "       225: iload         8",
                "       227: iand",
                "       228: ifeq          239",
                "       231: new           #93                 // class java/lang/AssertionError",
                "       234: dup",
                "       235: invokespecial #95                 // Method java/lang/AssertionError.\"<init>\":()V",
                "       238: athrow",
                "       239: iload_2",
                "       240: iload         4",
                "       242: bipush        15",
                "       244: iadd",
                "       245: bipush        10",
                "       247: ishl",
                "       248: iload         8",
                "       250: iadd",
                "       251: ior",
                "       252: i2s",
                "       253: ireturn",
                "      LineNumberTable:",
                "        line 1093: 0",
                "        line 1094: 5",
                "        line 1096: 14",
                "        line 1098: 21",
                "        line 1108: 49",
                "        line 1111: 54",
                "        line 1112: 61",
                "        line 1117: 68",
                "        line 1118: 75",
                "        line 1123: 77",
                "        line 1124: 83",
                "        line 1131: 111",
                "        line 1132: 114",
                "        line 1133: 117",
                "        line 1134: 124",
                "        line 1135: 131",
                "        line 1136: 135",
                "        line 1138: 139",
                "        line 1141: 148",
                "        line 1156: 159",
                "        line 1157: 171",
                "        line 1158: 183",
                "        line 1160: 197",
                "        line 1161: 210",
                "        line 1167: 217",
                "        line 1169: 239",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0     254     0     f   F",
                "            5     249     1 doppel   I",
                "           14     240     2 sign_bit   S",
                "           54     200     3 abs_f   F",
                "           83     171     4   exp   I",
                "          114     140     5 expdelta   I",
                "          117     137     6   msb   I",
                "          148     106     7 f_signif_bits   I",
                "          159      95     8 signif_bits   S",
                "          171      83     9   lsb   I",
                "          183      71    10 round   I",
                "          197      57    11 sticky   I",
                "      StackMapTable: number_of_entries = 8",
                "        frame_type = 253 /* append */",
                "          offset_delta = 49",
                "          locals = [ int, int ]",
                "        frame_type = 252 /* append */",
                "          offset_delta = 18",
                "          locals = [ float ]",
                "        frame_type = 8 /* same */",
                "        frame_type = 252 /* append */",
                "          offset_delta = 25",
                "          locals = [ int ]",
                "        frame_type = 7 /* same */",
                "        frame_type = 253 /* append */",
                "          offset_delta = 27",
                "          locals = [ int, int ]",
                "        frame_type = 255 /* full_frame */",
                "          offset_delta = 77",
                "          locals = [ float, int, int, float, int, int, int, int, int, int, int, int ]",
                "          stack = []",
                "        frame_type = 21 /* same */"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_29() {
        expectedConsecutiveLines = List.of(
                "  public int compareTo(java.lang.Float);",
                "    descriptor: (Ljava/lang/Float;)I",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_0",
                "         1: getfield      #55                 // Field value:F",
                "         4: aload_1",
                "         5: getfield      #55                 // Field value:F",
                "         8: invokestatic  #106                // Method compare:(FF)I",
                "        11: ireturn",
                "      LineNumberTable:",
                "        line 1213: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      12     0  this   Ljava/lang/Float;",
                "            0      12     1 anotherFloat   Ljava/lang/Float;"
        );
    }

    @Instruction(value = 0x02, name = "iconst_m1")
    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x1c, name = "iload_2")
    @Instruction(value = 0x1d, name = "iload_3")
    @Instruction(value = 0x22, name = "fload_0")
    @Instruction(value = 0x23, name = "fload_1")
    @Instruction(value = 0x3d, name = "istore_2")
    @Instruction(value = 0x3e, name = "istore_3")
    @Instruction(value = 0x95, name = "fcmpl")
    @Instruction(value = 0x96, name = "fcmpg")
    @Instruction(value = 0x9c, name = "ifge")
    @Instruction(value = 0x9e, name = "ifle")
    @Instruction(value = 0xa0, name = "if_icmpne")
    @Instruction(value = 0xa2, name = "if_icmpge")
    @Instruction(value = 0xa7, name = "goto")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_30() {
        expectedConsecutiveLines = List.of(
                "  public static int compare(float, float);",
                "    descriptor: (FF)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=4, args_size=2",
                "         0: fload_0",
                "         1: fload_1",
                "         2: fcmpg",
                "         3: ifge          8",
                "         6: iconst_m1",
                "         7: ireturn",
                "         8: fload_0",
                "         9: fload_1",
                "        10: fcmpl",
                "        11: ifle          16",
                "        14: iconst_1",
                "        15: ireturn",
                "        16: fload_0",
                "        17: invokestatic  #71                 // Method floatToIntBits:(F)I",
                "        20: istore_2",
                "        21: fload_1",
                "        22: invokestatic  #71                 // Method floatToIntBits:(F)I",
                "        25: istore_3",
                "        26: iload_2",
                "        27: iload_3",
                "        28: if_icmpne     35",
                "        31: iconst_0",
                "        32: goto          45",
                "        35: iload_2",
                "        36: iload_3",
                "        37: if_icmpge     44",
                "        40: iconst_m1",
                "        41: goto          45",
                "        44: iconst_1",
                "        45: ireturn",
                "      LineNumberTable:",
                "        line 1235: 0",
                "        line 1236: 6",
                "        line 1237: 8",
                "        line 1238: 14",
                "        line 1241: 16",
                "        line 1242: 21",
                "        line 1244: 26",
                "        line 1245: 35",
                "        line 1246: 44",
                "        line 1244: 45",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      46     0    f1   F",
                "            0      46     1    f2   F",
                "           21      25     2 thisBits   I",
                "           26      20     3 anotherBits   I",
                "      StackMapTable: number_of_entries = 5",
                "        frame_type = 8 /* same */",
                "        frame_type = 7 /* same */",
                "        frame_type = 253 /* append */",
                "          offset_delta = 18",
                "          locals = [ int, int ]",
                "        frame_type = 8 /* same */",
                "        frame_type = 64 /* same_locals_1_stack_item */",
                "          stack = [ int ]"
        );
    }

    @Instruction(value = 0x22, name = "fload_0")
    @Instruction(value = 0x23, name = "fload_1")
    @Instruction(value = 0x62, name = "fadd")
    @Instruction(value = 0xae, name = "freturn")
    @Test
    public void test_31() {
        expectedConsecutiveLines = List.of(
                "  public static float sum(float, float);",
                "    descriptor: (FF)F",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: fload_0",
                "         1: fload_1",
                "         2: fadd",
                "         3: freturn",
                "      LineNumberTable:",
                "        line 1263: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       4     0     a   F",
                "            0       4     1     b   F"
        );
    }

    @Instruction(value = 0x22, name = "fload_0")
    @Instruction(value = 0x23, name = "fload_1")
    @Instruction(value = 0xae, name = "freturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_32() {
        expectedConsecutiveLines = List.of(
                "  public static float max(float, float);",
                "    descriptor: (FF)F",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: fload_0",
                "         1: fload_1",
                "         2: invokestatic  #110                // Method java/lang/Math.max:(FF)F",
                "         5: freturn",
                "      LineNumberTable:",
                "        line 1281: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0     a   F",
                "            0       6     1     b   F"
        );
    }

    @Instruction(value = 0x22, name = "fload_0")
    @Instruction(value = 0x23, name = "fload_1")
    @Instruction(value = 0xae, name = "freturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_33() {
        expectedConsecutiveLines = List.of(
                "  public static float min(float, float);",
                "    descriptor: (FF)F",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: fload_0",
                "         1: fload_1",
                "         2: invokestatic  #114                // Method java/lang/Math.min:(FF)F",
                "         5: freturn",
                "      LineNumberTable:",
                "        line 1299: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0     a   F",
                "            0       6     1     b   F"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb8, name = "invokestatic")
    @Test
    public void test_34() {
        expectedConsecutiveLines = List.of(
                "  public java.util.Optional<java.lang.Float> describeConstable();",
                "    descriptor: ()Ljava/util/Optional;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=1, args_size=1",
                "         0: aload_0",
                "         1: invokestatic  #117                // Method java/util/Optional.of:(Ljava/lang/Object;)Ljava/util/Optional;",
                "         4: areturn",
                "      LineNumberTable:",
                "        line 1311: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       5     0  this   Ljava/lang/Float;",
                "    Signature: #260                         // ()Ljava/util/Optional<Ljava/lang/Float;>;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0xb0, name = "areturn")
    @Test
    public void test_35() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.Float resolveConstantDesc(java.lang.invoke.MethodHandles$Lookup);",
                "    descriptor: (Ljava/lang/invoke/MethodHandles$Lookup;)Ljava/lang/Float;",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=2, args_size=2",
                "         0: aload_0",
                "         1: areturn",
                "      LineNumberTable:",
                "        line 1324: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       2     0  this   Ljava/lang/Float;",
                "            0       2     1 lookup   Ljava/lang/invoke/MethodHandles$Lookup;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0xac, name = "ireturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Instruction(value = 0xc0, name = "checkcast")
    @Test
    public void test_36() {
        expectedConsecutiveLines = List.of(
                "  public int compareTo(java.lang.Object);",
                "    descriptor: (Ljava/lang/Object;)I",
                "    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_0",
                "         1: aload_1",
                "         2: checkcast     #1                  // class java/lang/Float",
                "         5: invokevirtual #123                // Method compareTo:(Ljava/lang/Float;)I",
                "         8: ireturn",
                "      LineNumberTable:",
                "        line 72: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       9     0  this   Ljava/lang/Float;"
        );
    }

    @Instruction(value = 0x2a, name = "aload_0")
    @Instruction(value = 0x2b, name = "aload_1")
    @Instruction(value = 0xb0, name = "areturn")
    @Instruction(value = 0xb6, name = "invokevirtual")
    @Test
    public void test_37() {
        expectedConsecutiveLines = List.of(
                "  public java.lang.Object resolveConstantDesc(java.lang.invoke.MethodHandles$Lookup) throws java.lang.ReflectiveOperationException;",
                "    descriptor: (Ljava/lang/invoke/MethodHandles$Lookup;)Ljava/lang/Object;",
                "    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_0",
                "         1: aload_1",
                "         2: invokevirtual #127                // Method resolveConstantDesc:(Ljava/lang/invoke/MethodHandles$Lookup;)Ljava/lang/Float;",
                "         5: areturn",
                "      LineNumberTable:",
                "        line 72: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0  this   Ljava/lang/Float;",
                "    Exceptions:",
                "      throws java.lang.ReflectiveOperationException"
        );
    }
}
