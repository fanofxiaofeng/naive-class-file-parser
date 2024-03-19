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
public class LoadAndStoreInstructionsIntCaseInstructionsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.method.instruction.LoadAndStoreInstructionsIntCase"));
    }

    @Instruction(value = 0x02, name = "iconst_m1")
    @Instruction(value = 0x03, name = "iconst_0")
    @Instruction(value = 0x04, name = "iconst_1")
    @Instruction(value = 0x05, name = "iconst_2")
    @Instruction(value = 0x06, name = "iconst_3")
    @Instruction(value = 0x07, name = "iconst_4")
    @Instruction(value = 0x08, name = "iconst_5")
    @Test
    public void test_0x2_to_0x8() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x2_to_0x8();",
                "    descriptor: ()V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=2, args_size=1",
                "         0: iconst_m1",
                "         1: istore_1",
                "         2: iconst_0",
                "         3: istore_1",
                "         4: iconst_1",
                "         5: istore_1",
                "         6: iconst_2",
                "         7: istore_1",
                "         8: iconst_3",
                "         9: istore_1",
                "        10: iconst_4",
                "        11: istore_1",
                "        12: iconst_5",
                "        13: istore_1",
                "        14: return",
                "      LineNumberTable:",
                "        line 29: 0",
                "        line 30: 2",
                "        line 31: 4",
                "        line 32: 6",
                "        line 33: 8",
                "        line 34: 10",
                "        line 35: 12",
                "        line 36: 14",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      15     0  this   Lcom/test/cases/method/instruction/LoadAndStoreInstructionsIntCase;",
                "            2      13     1     b   I"
        );
    }

    @Instruction(value = 0x10, name = "bipush")
    @Test
    public void test_0x10() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x10();",
                "    descriptor: ()V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=2, args_size=1",
                "         0: bipush        6",
                "         2: istore_1",
                "         3: bipush        127",
                "         5: istore_1",
                "         6: bipush        -128",
                "         8: istore_1",
                "         9: bipush        42",
                "        11: istore_1",
                "        12: bipush        -2",
                "        14: istore_1",
                "        15: return",
                "      LineNumberTable:",
                "        line 40: 0",
                "        line 41: 3",
                "        line 42: 6",
                "        line 43: 9",
                "        line 44: 12",
                "        line 45: 15",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      16     0  this   Lcom/test/cases/method/instruction/LoadAndStoreInstructionsIntCase;",
                "            3      13     1     a   I"
        );
    }

    @Instruction(value = 0x11, name = "sipush")
    @Test
    public void test_0x11() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x11();",
                "    descriptor: ()V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=2, args_size=1",
                "         0: sipush        128",
                "         3: istore_1",
                "         4: sipush        32767",
                "         7: istore_1",
                "         8: sipush        -32768",
                "        11: istore_1",
                "        12: sipush        420",
                "        15: istore_1",
                "        16: sipush        -1008",
                "        19: istore_1",
                "        20: return",
                "      LineNumberTable:",
                "        line 49: 0",
                "        line 50: 4",
                "        line 51: 8",
                "        line 52: 12",
                "        line 53: 16",
                "        line 54: 20",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      21     0  this   Lcom/test/cases/method/instruction/LoadAndStoreInstructionsIntCase;",
                "            4      17     1     a   I"
        );
    }

    @Instruction(value = 0x12, name = "ldc")
    @Test
    public void test_0x12() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x12();",
                "    descriptor: ()V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=5, args_size=1",
                "         0: ldc           #11                 // int 123456",
                "         2: istore_1",
                "         3: ldc           #12                 // float 123456.7f",
                "         5: fstore_2",
                "         6: ldc           #13                 // String Hello world",
                "         8: astore_3",
                "         9: ldc           #15                 // class java/lang/Integer",
                "        11: astore        4",
                "        13: ldc           #17                 // class java/util/List",
                "        15: astore        4",
                "        17: return",
                "      LineNumberTable:",
                "        line 58: 0",
                "        line 59: 3",
                "        line 60: 6",
                "        line 61: 9",
                "        line 62: 13",
                "        line 63: 17",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      18     0  this   Lcom/test/cases/method/instruction/LoadAndStoreInstructionsIntCase;",
                "            3      15     1     a   I",
                "            6      12     2     b   F",
                "            9       9     3     c   Ljava/lang/String;",
                "           13       5     4     d   Ljava/lang/Class;",
                "      LocalVariableTypeTable:",
                "        Start  Length  Slot  Name   Signature",
                "           13       5     4     d   Ljava/lang/Class<*>;"
        );
    }

    @Instruction(value = 0x15, name = "iload")
    @Instruction(value = 0x1a, name = "iload_0")
    @Instruction(value = 0x1b, name = "iload_1")
    @Instruction(value = 0x1c, name = "iload_2")
    @Instruction(value = 0x1d, name = "iload_3")
    @Test
    public void test_0x15_and_0x1a_to_0x1d() {
        expectedConsecutiveLines = List.of(
                "  public static int test_0x15_and_0x1a_to_0x1d(int, int, int, int, int);",
                "    descriptor: (IIIII)I",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=2, locals=5, args_size=5",
                "         0: iload_0",
                "         1: iload_1",
                "         2: iadd",
                "         3: iload_2",
                "         4: iadd",
                "         5: iload_3",
                "         6: iadd",
                "         7: iload         4",
                "         9: iadd",
                "        10: ireturn",
                "      LineNumberTable:",
                "        line 71: 0",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      11     0    n1   I",
                "            0      11     1    n2   I",
                "            0      11     2    n3   I",
                "            0      11     3    n4   I",
                "            0      11     4    n5   I"
        );
    }

    @Instruction(value = 0x36, name = "istore")
    @Test
    public void test_0x36() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x36(int, int, int, int, int, int);",
                "    descriptor: (IIIIII)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=7, args_size=7",
                "         0: iconst_1",
                "         1: istore        6",
                "         3: return",
                "      LineNumberTable:",
                "        line 76: 0",
                "        line 77: 3",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0       4     0  this   Lcom/test/cases/method/instruction/LoadAndStoreInstructionsIntCase;",
                "            0       4     1     a   I",
                "            0       4     2     b   I",
                "            0       4     3     c   I",
                "            0       4     4     d   I",
                "            0       4     5     e   I",
                "            0       4     6     f   I"
        );
    }

    @Instruction(value = 0x3b, name = "istore_0")
    @Instruction(value = 0x3c, name = "istore_1")
    @Instruction(value = 0x3d, name = "istore_2")
    @Instruction(value = 0x3e, name = "istore_3")
    @Test
    public void test_0x3b_to_0x3e() {
        expectedConsecutiveLines = List.of(
                "  public static void test_0x3b_to_0x3e(int, int, int, int);",
                "    descriptor: (IIII)V",
                "    flags: (0x0009) ACC_PUBLIC, ACC_STATIC",
                "    Code:",
                "      stack=1, locals=5, args_size=4",
                "         0: iconst_1",
                "         1: istore        4",
                "         3: iload         4",
                "         5: istore_0",
                "         6: iload         4",
                "         8: istore_1",
                "         9: iload         4",
                "        11: istore_2",
                "        12: iload         4",
                "        14: istore_3",
                "        15: return",
                "      LineNumberTable:",
                "        line 84: 0",
                "        line 85: 3",
                "        line 86: 6",
                "        line 87: 9",
                "        line 88: 12",
                "        line 89: 15",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      16     0     a   I",
                "            0      16     1     b   I",
                "            0      16     2     c   I",
                "            0      16     3     d   I",
                "            3      13     4     n   I"
        );
    }
}
