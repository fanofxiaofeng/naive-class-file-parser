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
public class TypeConversionInstructionsCaseInstructionsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.method.instruction.TypeConversionInstructionsCase"));
    }

    @Instruction(value = 0x85, name = "i2l")
    @Instruction(value = 0x86, name = "i2f")
    @Instruction(value = 0x87, name = "i2d")
    @Test
    public void test_0x85_to_0x87() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x85_to_0x87(int);",
                "    descriptor: (I)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=7, args_size=2",
                "         0: iload_1",
                "         1: i2l",
                "         2: lstore_2",
                "         3: iload_1",
                "         4: i2f",
                "         5: fstore        4",
                "         7: iload_1",
                "         8: i2d",
                "         9: dstore        5",
                "        11: return",
                "      LineNumberTable:",
                "        line 12: 0",
                "        line 13: 3",
                "        line 14: 7",
                "        line 15: 11",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      12     0  this   Lcom/test/cases/method/instruction/TypeConversionInstructionsCase;",
                "            0      12     1     n   I",
                "            3       9     2  ans1   J",
                "            7       5     4  ans2   F",
                "           11       1     5  ans3   D"
        );
    }

    @Instruction(value = 0x88, name = "l2i")
    @Instruction(value = 0x89, name = "l2f")
    @Instruction(value = 0x8a, name = "l2d")
    @Test
    public void test_0x88_to_0x8a() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x88_to_0x8a(long);",
                "    descriptor: (J)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=7, args_size=2",
                "         0: lload_1",
                "         1: l2i",
                "         2: istore_3",
                "         3: lload_1",
                "         4: l2f",
                "         5: fstore        4",
                "         7: lload_1",
                "         8: l2d",
                "         9: dstore        5",
                "        11: return",
                "      LineNumberTable:",
                "        line 21: 0",
                "        line 22: 3",
                "        line 23: 7",
                "        line 24: 11",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      12     0  this   Lcom/test/cases/method/instruction/TypeConversionInstructionsCase;",
                "            0      12     1     n   J",
                "            3       9     3  ans1   I",
                "            7       5     4  ans2   F",
                "           11       1     5  ans3   D"
        );
    }

    @Instruction(value = 0x8b, name = "f2i")
    @Instruction(value = 0x8c, name = "f2l")
    @Instruction(value = 0x8d, name = "f2d")
    @Test
    public void test_0x8b_to_0x8d() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x8b_to_0x8d(float);",
                "    descriptor: (F)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=7, args_size=2",
                "         0: fload_1",
                "         1: f2i",
                "         2: istore_2",
                "         3: fload_1",
                "         4: f2l",
                "         5: lstore_3",
                "         6: fload_1",
                "         7: f2d",
                "         8: dstore        5",
                "        10: return",
                "      LineNumberTable:",
                "        line 30: 0",
                "        line 31: 3",
                "        line 32: 6",
                "        line 33: 10",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      11     0  this   Lcom/test/cases/method/instruction/TypeConversionInstructionsCase;",
                "            0      11     1     n   F",
                "            3       8     2  ans1   I",
                "            6       5     3  ans2   J",
                "           10       1     5  ans3   D"
        );
    }

    @Instruction(value = 0x8e, name = "d2i")
    @Instruction(value = 0x8f, name = "d2l")
    @Instruction(value = 0x90, name = "d2f")
    @Test
    public void test_0x83_to_0x90() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x83_to_0x90(double);",
                "    descriptor: (D)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=7, args_size=2",
                "         0: dload_1",
                "         1: d2i",
                "         2: istore_3",
                "         3: dload_1",
                "         4: d2l",
                "         5: lstore        4",
                "         7: dload_1",
                "         8: d2f",
                "         9: fstore        6",
                "        11: return",
                "      LineNumberTable:",
                "        line 39: 0",
                "        line 40: 3",
                "        line 41: 7",
                "        line 42: 11",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      12     0  this   Lcom/test/cases/method/instruction/TypeConversionInstructionsCase;",
                "            0      12     1     n   D",
                "            3       9     3  ans1   I",
                "            7       5     4  ans2   J",
                "           11       1     6  ans3   F"
        );
    }

    @Instruction(value = 0x91, name = "i2b")
    @Instruction(value = 0x92, name = "i2c")
    @Instruction(value = 0x93, name = "i2s")
    @Test
    public void test_0x91_to_0x93() {
        expectedConsecutiveLines = List.of(
                "  public void test_0x91_to_0x93(int);",
                "    descriptor: (I)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=5, args_size=2",
                "         0: iload_1",
                "         1: i2b",
                "         2: istore_2",
                "         3: iload_1",
                "         4: i2c",
                "         5: istore_3",
                "         6: iload_1",
                "         7: i2s",
                "         8: istore        4",
                "        10: return",
                "      LineNumberTable:",
                "        line 48: 0",
                "        line 49: 3",
                "        line 50: 6",
                "        line 51: 10",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0      11     0  this   Lcom/test/cases/method/instruction/TypeConversionInstructionsCase;",
                "            0      11     1     n   I",
                "            3       8     2  ans1   I",
                "            6       5     3  ans2   C",
                "           10       1     4  ans3   S"
        );
    }
}
