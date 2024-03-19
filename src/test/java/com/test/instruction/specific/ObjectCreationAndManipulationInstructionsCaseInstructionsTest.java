package com.test.instruction.specific;

import com.test.annotations.GeneratedBy;
import com.test.cases.method.instruction.Instruction;
import com.test.instruction.InstructionTestGenerator;
import com.test.method.MethodPresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(InstructionTestGenerator.class)
public class ObjectCreationAndManipulationInstructionsCaseInstructionsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.method.instruction.ObjectCreationAndManipulationInstructionsCase"));
    }

    @Instruction(value = 0xbb, name = "new")
    @Test
    public void test_0xbb() {
        expectedConsecutiveLines = List.of(
                "  public void test_0xbb();",
                "    descriptor: ()V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=1, args_size=1",
                "         0: new           #2                  // class java/lang/Object",
                "         3: dup",
                "         4: invokespecial #1                  // Method java/lang/Object.\"<init>\":()V",
                "         7: pop",
                "         8: return",
                "      LineNumberTable:",
                "        line 9: 0",
                "        line 10: 8",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       9     0  this   Lcom/test/cases/method/instruction/ObjectCreationAndManipulationInstructionsCase;"
        );
    }

    @Instruction(value = 0xbc, name = "newarray")
    @Test
    public void test_0xbc() {
        expectedConsecutiveLines = List.of(
                "  public void test_0xbc();",
                "    descriptor: ()V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=2, args_size=1",
                "         0: iconst_5",
                "         1: newarray       boolean",
                "         3: astore_1",
                "         4: bipush        10",
                "         6: newarray       char",
                "         8: astore_1",
                "         9: bipush        42",
                "        11: newarray       float",
                "        13: astore_1",
                "        14: bipush        10",
                "        16: newarray       double",
                "        18: astore_1",
                "        19: iconst_5",
                "        20: newarray       byte",
                "        22: astore_1",
                "        23: iconst_0",
                "        24: newarray       short",
                "        26: astore_1",
                "        27: bipush        100",
                "        29: newarray       int",
                "        31: astore_1",
                "        32: bipush        50",
                "        34: newarray       long",
                "        36: astore_1",
                "        37: return",
                "      LineNumberTable:",
                "        line 14: 0",
                "        line 15: 4",
                "        line 16: 9",
                "        line 17: 14",
                "        line 18: 19",
                "        line 19: 23",
                "        line 20: 27",
                "        line 21: 32",
                "        line 22: 37",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      38     0  this   Lcom/test/cases/method/instruction/ObjectCreationAndManipulationInstructionsCase;",
                "            4      34     1   ans   Ljava/lang/Object;"
        );
    }

    @Instruction(value = 0xbd, name = "anewarray")
    @Test
    public void test_0xbd() {
        expectedConsecutiveLines = List.of(
                "  public void test_0xbd(int[]);",
                "    descriptor: ([I)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=4, locals=3, args_size=2",
                "         0: bipush        10",
                "         2: anewarray     #7                  // class java/lang/String",
                "         5: astore_2",
                "         6: bipush        42",
                "         8: anewarray     #9                  // class java/lang/Runtime",
                "        11: astore_2",
                "        12: iconst_1",
                "        13: anewarray     #11                 // class \"[I\"",
                "        16: dup",
                "        17: iconst_0",
                "        18: aload_1",
                "        19: aastore",
                "        20: astore_2",
                "        21: return",
                "      LineNumberTable:",
                "        line 26: 0",
                "        line 27: 6",
                "        line 28: 12",
                "        line 29: 21",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      22     0  this   Lcom/test/cases/method/instruction/ObjectCreationAndManipulationInstructionsCase;",
                "            0      22     1     a   [I",
                "            6      16     2   ans   Ljava/lang/Object;"
        );
    }

    @Instruction(value = 0xc5, name = "multianewarray")
    @Test
    public void test_0xc5() {
        expectedConsecutiveLines = List.of(
                "  public void test_0xc5();",
                "    descriptor: ()V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=21, locals=2, args_size=1",
                "         0: bipush        10",
                "         2: bipush        9",
                "         4: bipush        8",
                "         6: multianewarray #13,  3            // class \"[[[Ljava/lang/String;\"",
                "        10: astore_1",
                "        11: iconst_1",
                "        12: iconst_1",
                "        13: iconst_2",
                "        14: iconst_3",
                "        15: iconst_1",
                "        16: iconst_1",
                "        17: iconst_1",
                "        18: iconst_1",
                "        19: iconst_1",
                "        20: iconst_1",
                "        21: iconst_1",
                "        22: iconst_1",
                "        23: iconst_1",
                "        24: iconst_2",
                "        25: iconst_1",
                "        26: iconst_1",
                "        27: iconst_1",
                "        28: iconst_1",
                "        29: iconst_1",
                "        30: iconst_1",
                "        31: iconst_1",
                "        32: multianewarray #15,  21           // class \"[[[[[[[[[[[[[[[[[[[[[Ljava/lang/Runtime;\"",
                "        36: astore_1",
                "        37: bipush        10",
                "        39: bipush        42",
                "        41: multianewarray #17,  2            // class \"[[[I\"",
                "        45: astore_1",
                "        46: return",
                "      LineNumberTable:",
                "        line 33: 0",
                "        line 34: 11",
                "        line 35: 37",
                "        line 36: 46",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      47     0  this   Lcom/test/cases/method/instruction/ObjectCreationAndManipulationInstructionsCase;",
                "           11      36     1   ans   Ljava/lang/Object;"
        );
    }

    @Instruction(value = 0xb2, name = "getstatic")
    @Instruction(value = 0xb3, name = "putstatic")
    @Instruction(value = 0xb4, name = "getfield")
    @Instruction(value = 0xb5, name = "putfield")
    @Test
    public void test_0xb2_to_0xb5() {
        expectedConsecutiveLines = List.of(
                "  public void test_0xb2_to_0xb5();",
                "    descriptor: ()V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=3, args_size=1",
                "         0: getstatic     #19                 // Field f1:I",
                "         3: istore_1",
                "         4: ldc           #27                 // int 2147483647",
                "         6: istore_1",
                "         7: bipush        42",
                "         9: putstatic     #19                 // Field f1:I",
                "        12: bipush        23",
                "        14: putstatic     #28                 // Field com/test/cases/method/instruction/ObjectCreationAndManipulationInstructionsCase$C.f1:I",
                "        17: aload_0",
                "        18: getfield      #31                 // Field f2:I",
                "        21: istore_2",
                "        22: new           #29                 // class com/test/cases/method/instruction/ObjectCreationAndManipulationInstructionsCase$C",
                "        25: dup",
                "        26: invokespecial #34                 // Method com/test/cases/method/instruction/ObjectCreationAndManipulationInstructionsCase$C.\"<init>\":()V",
                "        29: getfield      #35                 // Field com/test/cases/method/instruction/ObjectCreationAndManipulationInstructionsCase$C.f2:I",
                "        32: istore_2",
                "        33: aload_0",
                "        34: bipush        42",
                "        36: putfield      #31                 // Field f2:I",
                "        39: new           #29                 // class com/test/cases/method/instruction/ObjectCreationAndManipulationInstructionsCase$C",
                "        42: dup",
                "        43: invokespecial #34                 // Method com/test/cases/method/instruction/ObjectCreationAndManipulationInstructionsCase$C.\"<init>\":()V",
                "        46: iload_2",
                "        47: putfield      #35                 // Field com/test/cases/method/instruction/ObjectCreationAndManipulationInstructionsCase$C.f2:I",
                "        50: return",
                "      LineNumberTable:",
                "        line 43: 0",
                "        line 44: 4",
                "        line 45: 7",
                "        line 46: 12",
                "        line 47: 17",
                "        line 48: 22",
                "        line 49: 33",
                "        line 50: 39",
                "        line 51: 50",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      51     0  this   Lcom/test/cases/method/instruction/ObjectCreationAndManipulationInstructionsCase;",
                "            4      47     1     a   I",
                "           22      29     2     b   I"
        );
    }

    @Instruction(value = 0x2e, name = "iaload")
    @Test
    public void test_0x2e() {
        expectedConsecutiveLines = List.of(
                "  public int test_0x2e(int[]);",
                "    descriptor: ([I)I",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_1",
                "         1: bipush        42",
                "         3: iaload",
                "         4: ireturn",
                "      LineNumberTable:",
                "        line 56: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       5     0  this   Lcom/test/cases/method/instruction/ObjectCreationAndManipulationInstructionsCase;",
                "            0       5     1 array   [I"
        );
    }

    @Instruction(value = 0x2f, name = "laload")
    @Test
    public void test_0x2f() {
        expectedConsecutiveLines = List.of(
                "  public long test_0x2f(long[]);",
                "    descriptor: ([J)J",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_1",
                "         1: bipush        42",
                "         3: laload",
                "         4: lreturn",
                "      LineNumberTable:",
                "        line 62: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       5     0  this   Lcom/test/cases/method/instruction/ObjectCreationAndManipulationInstructionsCase;",
                "            0       5     1 array   [J"
        );
    }

    @Instruction(value = 0x30, name = "faload")
    @Test
    public void test_0x30() {
        expectedConsecutiveLines = List.of(
                "  public float test_0x30(float[]);",
                "    descriptor: ([F)F",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_1",
                "         1: bipush        42",
                "         3: faload",
                "         4: freturn",
                "      LineNumberTable:",
                "        line 68: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       5     0  this   Lcom/test/cases/method/instruction/ObjectCreationAndManipulationInstructionsCase;",
                "            0       5     1 array   [F"
        );
    }

    @Instruction(value = 0x31, name = "daload")
    @Test
    public void test_0x31() {
        expectedConsecutiveLines = List.of(
                "  public double test_0x31(double[]);",
                "    descriptor: ([D)D",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_1",
                "         1: bipush        42",
                "         3: daload",
                "         4: dreturn",
                "      LineNumberTable:",
                "        line 74: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       5     0  this   Lcom/test/cases/method/instruction/ObjectCreationAndManipulationInstructionsCase;",
                "            0       5     1 array   [D"
        );
    }

    @Instruction(value = 0x32, name = "aaload")
    @Test
    public void test_0x32() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x32(int[][][], java.util.function.Function<java.lang.String, java.lang.Integer>[], java.lang.Deprecated[]);",
                "    descriptor: ([[[I[Ljava/util/function/Function;[Ljava/lang/Deprecated;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=5, args_size=4",
                "         0: aload_1",
                "         1: bipush        42",
                "         3: aaload",
                "         4: astore        4",
                "         6: aload_2",
                "         7: bipush        42",
                "         9: aaload",
                "        10: astore        4",
                "        12: aload_3",
                "        13: bipush        42",
                "        15: aaload",
                "        16: astore        4",
                "        18: return",
                "      LineNumberTable:",
                "        line 80: 0",
                "        line 81: 6",
                "        line 82: 12",
                "        line 83: 18",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      19     0  this   Lcom/test/cases/method/instruction/ObjectCreationAndManipulationInstructionsCase;",
                "            0      19     1 array   [[[I",
                "            0      19     2 functions   [Ljava/util/function/Function;",
                "            0      19     3 annotations   [Ljava/lang/Deprecated;",
                "            6      13     4     o   Ljava/lang/Object;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      19     2 functions   [Ljava/util/function/Function<Ljava/lang/String;Ljava/lang/Integer;>;",
                "    Signature: #132                         // ([[[I[Ljava/util/function/Function<Ljava/lang/String;Ljava/lang/Integer;>;[Ljava/lang/Deprecated;)V"
        );
    }

    @Instruction(value = 0x33, name = "baload")
    @Test
    public void test_0x33() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x33(byte[], boolean[]);",
                "    descriptor: ([B[Z)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=5, args_size=3",
                "         0: aload_1",
                "         1: bipush        42",
                "         3: baload",
                "         4: istore_3",
                "         5: aload_2",
                "         6: bipush        42",
                "         8: baload",
                "         9: istore        4",
                "        11: return",
                "      LineNumberTable:",
                "        line 88: 0",
                "        line 89: 5",
                "        line 90: 11",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      12     0  this   Lcom/test/cases/method/instruction/ObjectCreationAndManipulationInstructionsCase;",
                "            0      12     1 bytes   [B",
                "            0      12     2 booleans   [Z",
                "            5       7     3    b1   B",
                "           11       1     4    b2   Z"
        );
    }

    @Instruction(value = 0x34, name = "caload")
    @Test
    public void test_0x34() {
        expectedConsecutiveLines = List.of(
                "  public char test_0x34(char[]);",
                "    descriptor: ([C)C",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_1",
                "         1: bipush        42",
                "         3: caload",
                "         4: ireturn",
                "      LineNumberTable:",
                "        line 95: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       5     0  this   Lcom/test/cases/method/instruction/ObjectCreationAndManipulationInstructionsCase;",
                "            0       5     1 array   [C"
        );
    }

    @Instruction(value = 0x35, name = "saload")
    @Test
    public void test_0x35() {
        expectedConsecutiveLines = List.of(
                "  public short test_0x35(short[]);",
                "    descriptor: ([S)S",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=2, args_size=2",
                "         0: aload_1",
                "         1: bipush        42",
                "         3: saload",
                "         4: ireturn",
                "      LineNumberTable:",
                "        line 101: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       5     0  this   Lcom/test/cases/method/instruction/ObjectCreationAndManipulationInstructionsCase;",
                "            0       5     1 array   [S"
        );
    }

    @Instruction(value = 0x4f, name = "iastore")
    @Test
    public void test_0x4f() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x4f(int[]);",
                "    descriptor: ([I)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=2, args_size=2",
                "         0: aload_1",
                "         1: iconst_0",
                "         2: bipush        42",
                "         4: iastore",
                "         5: return",
                "      LineNumberTable:",
                "        line 107: 0",
                "        line 108: 5",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0  this   Lcom/test/cases/method/instruction/ObjectCreationAndManipulationInstructionsCase;",
                "            0       6     1 array   [I"
        );
    }

    @Instruction(value = 0x50, name = "lastore")
    @Test
    public void test_0x50() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x50(long[]);",
                "    descriptor: ([J)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=4, locals=2, args_size=2",
                "         0: aload_1",
                "         1: iconst_0",
                "         2: ldc2_w        #36                 // long 42l",
                "         5: lastore",
                "         6: return",
                "      LineNumberTable:",
                "        line 113: 0",
                "        line 114: 6",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       7     0  this   Lcom/test/cases/method/instruction/ObjectCreationAndManipulationInstructionsCase;",
                "            0       7     1 array   [J"
        );
    }

    @Instruction(value = 0x51, name = "fastore")
    @Test
    public void test_0x51() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x51(float[]);",
                "    descriptor: ([F)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=2, args_size=2",
                "         0: aload_1",
                "         1: iconst_0",
                "         2: ldc           #38                 // float 42.0f",
                "         4: fastore",
                "         5: return",
                "      LineNumberTable:",
                "        line 119: 0",
                "        line 120: 5",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0  this   Lcom/test/cases/method/instruction/ObjectCreationAndManipulationInstructionsCase;",
                "            0       6     1 array   [F"
        );
    }

    @Instruction(value = 0x52, name = "dastore")
    @Test
    public void test_0x52() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x52(double[]);",
                "    descriptor: ([D)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=4, locals=2, args_size=2",
                "         0: aload_1",
                "         1: iconst_0",
                "         2: ldc2_w        #39                 // double 42.0d",
                "         5: dastore",
                "         6: return",
                "      LineNumberTable:",
                "        line 125: 0",
                "        line 126: 6",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       7     0  this   Lcom/test/cases/method/instruction/ObjectCreationAndManipulationInstructionsCase;",
                "            0       7     1 array   [D"
        );
    }

    @Instruction(value = 0x53, name = "aastore")
    @Test
    public void test_0x53() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x53(int[][][], java.util.function.Function<java.lang.String, java.lang.Integer>[], java.lang.Deprecated[]);",
                "    descriptor: ([[[I[Ljava/util/function/Function;[Ljava/lang/Deprecated;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=4, args_size=4",
                "         0: aload_1",
                "         1: iconst_0",
                "         2: aconst_null",
                "         3: aastore",
                "         4: aload_2",
                "         5: bipush        42",
                "         7: aconst_null",
                "         8: aastore",
                "         9: aload_3",
                "        10: bipush        42",
                "        12: aconst_null",
                "        13: aastore",
                "        14: return",
                "      LineNumberTable:",
                "        line 131: 0",
                "        line 132: 4",
                "        line 133: 9",
                "        line 134: 14",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      15     0  this   Lcom/test/cases/method/instruction/ObjectCreationAndManipulationInstructionsCase;",
                "            0      15     1 array   [[[I",
                "            0      15     2 functions   [Ljava/util/function/Function;",
                "            0      15     3 annotations   [Ljava/lang/Deprecated;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      15     2 functions   [Ljava/util/function/Function<Ljava/lang/String;Ljava/lang/Integer;>;",
                "    Signature: #132                         // ([[[I[Ljava/util/function/Function<Ljava/lang/String;Ljava/lang/Integer;>;[Ljava/lang/Deprecated;)V"
        );
    }

    @Instruction(value = 0x54, name = "bastore")
    @Test
    public void test_0x54() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x54(byte[], boolean[]);",
                "    descriptor: ([B[Z)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=3, args_size=3",
                "         0: aload_1",
                "         1: bipush        42",
                "         3: iconst_0",
                "         4: bastore",
                "         5: aload_2",
                "         6: iconst_3",
                "         7: iconst_0",
                "         8: bastore",
                "         9: aload_2",
                "        10: bipush        42",
                "        12: iconst_1",
                "        13: bastore",
                "        14: return",
                "      LineNumberTable:",
                "        line 139: 0",
                "        line 140: 5",
                "        line 141: 9",
                "        line 142: 14",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      15     0  this   Lcom/test/cases/method/instruction/ObjectCreationAndManipulationInstructionsCase;",
                "            0      15     1 bytes   [B",
                "            0      15     2 booleans   [Z"
        );
    }

    @Instruction(value = 0x55, name = "castore")
    @Test
    public void test_0x55() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x55(char[]);",
                "    descriptor: ([C)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=2, args_size=2",
                "         0: aload_1",
                "         1: bipush        42",
                "         3: bipush        97",
                "         5: castore",
                "         6: return",
                "      LineNumberTable:",
                "        line 147: 0",
                "        line 148: 6",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       7     0  this   Lcom/test/cases/method/instruction/ObjectCreationAndManipulationInstructionsCase;",
                "            0       7     1 array   [C"
        );
    }

    @Instruction(value = 0x56, name = "sastore")
    @Test
    public void test_0x56() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x56(short[]);",
                "    descriptor: ([S)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=3, locals=2, args_size=2",
                "         0: aload_1",
                "         1: iconst_4",
                "         2: bipush        42",
                "         4: sastore",
                "         5: return",
                "      LineNumberTable:",
                "        line 153: 0",
                "        line 154: 5",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       6     0  this   Lcom/test/cases/method/instruction/ObjectCreationAndManipulationInstructionsCase;",
                "            0       6     1 array   [S"
        );
    }

    @Instruction(value = 0xbe, name = "arraylength")
    @Test
    public void test_0xbe() {
        expectedConsecutiveLines = List.of(
                "  public int test_0xbe(double[]);",
                "    descriptor: ([D)I",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=2, args_size=2",
                "         0: aload_1",
                "         1: arraylength",
                "         2: ireturn",
                "      LineNumberTable:",
                "        line 159: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       3     0  this   Lcom/test/cases/method/instruction/ObjectCreationAndManipulationInstructionsCase;",
                "            0       3     1 numbers   [D"
        );
    }

    @Instruction(value = 0xc0, name = "checkcast")
    @Test
    public void test_0xc0() {
        expectedConsecutiveLines = List.of(
                "  public void test_0xc0(java.lang.Object);",
                "    descriptor: (Ljava/lang/Object;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=3, args_size=2",
                "         0: aload_1",
                "         1: checkcast     #7                  // class java/lang/String",
                "         4: astore_2",
                "         5: aload_1",
                "         6: checkcast     #41                 // class java/lang/Runnable",
                "         9: astore_2",
                "        10: aload_1",
                "        11: checkcast     #43                 // class \"[[I\"",
                "        14: astore_2",
                "        15: return",
                "      LineNumberTable:",
                "        line 166: 0",
                "        line 167: 5",
                "        line 168: 10",
                "        line 169: 15",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      16     0  this   Lcom/test/cases/method/instruction/ObjectCreationAndManipulationInstructionsCase;",
                "            0      16     1     o   Ljava/lang/Object;",
                "            5      11     2   ans   Ljava/lang/Object;"
        );
    }

    @Instruction(value = 0xc1, name = "instanceof")
    @Test
    public void test_0xc1() {
        expectedConsecutiveLines = List.of(
                "  public void test_0xc1(java.lang.Object);",
                "    descriptor: (Ljava/lang/Object;)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=3, args_size=2",
                "         0: aload_1",
                "         1: instanceof    #7                  // class java/lang/String",
                "         4: istore_2",
                "         5: aload_1",
                "         6: instanceof    #41                 // class java/lang/Runnable",
                "         9: istore_2",
                "        10: aload_1",
                "        11: instanceof    #43                 // class \"[[I\"",
                "        14: istore_2",
                "        15: return",
                "      LineNumberTable:",
                "        line 173: 0",
                "        line 174: 5",
                "        line 175: 10",
                "        line 176: 15",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      16     0  this   Lcom/test/cases/method/instruction/ObjectCreationAndManipulationInstructionsCase;",
                "            0      16     1     o   Ljava/lang/Object;",
                "            5      11     2   ans   Z"
        );
    }
}
