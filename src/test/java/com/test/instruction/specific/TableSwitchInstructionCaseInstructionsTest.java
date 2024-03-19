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
public class TableSwitchInstructionCaseInstructionsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.method.instruction.TableSwitchInstructionCase"));
    }

    @Instruction(value = 0xaa, name = "tableswitch")
    @Test
    public void test_0xaa_case1() {
        expectedConsecutiveLines = List.of(
                "  public void test_0xaa_case1(int, int);",
                "    descriptor: (II)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=4, args_size=3",
                "         0: iload_1",
                "         1: iload_2",
                "         2: iadd",
                "         3: tableswitch   { // 1 to 39",
                "                       1: 172",
                "                       2: 172",
                "                       3: 172",
                "                       4: 172",
                "                       5: 172",
                "                       6: 172",
                "                       7: 172",
                "                       8: 172",
                "                       9: 172",
                "                      10: 172",
                "                      11: 176",
                "                      12: 176",
                "                      13: 176",
                "                      14: 176",
                "                      15: 176",
                "                      16: 176",
                "                      17: 176",
                "                      18: 176",
                "                      19: 176",
                "                      20: 176",
                "                      21: 180",
                "                      22: 180",
                "                      23: 180",
                "                      24: 180",
                "                      25: 180",
                "                      26: 180",
                "                      27: 180",
                "                      28: 180",
                "                      29: 180",
                "                      30: 176",
                "                      31: 180",
                "                      32: 180",
                "                      33: 180",
                "                      34: 180",
                "                      35: 180",
                "                      36: 180",
                "                      37: 180",
                "                      38: 180",
                "                      39: 180",
                "                 default: 184",
                "            }",
                "       172: iconst_1",
                "       173: goto          185",
                "       176: iconst_2",
                "       177: goto          185",
                "       180: iconst_3",
                "       181: goto          185",
                "       184: iconst_0",
                "       185: istore_3",
                "       186: return",
                "      LineNumberTable:",
                "        line 7: 0",
                "        line 8: 172",
                "        line 9: 176",
                "        line 10: 180",
                "        line 11: 184",
                "        line 13: 186",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0     187     0  this   Lcom/test/cases/method/instruction/TableSwitchInstructionCase;",
                "            0     187     1 number1   I",
                "            0     187     2 number2   I",
                "          186       1     3   ans   I"
        );
    }
}
