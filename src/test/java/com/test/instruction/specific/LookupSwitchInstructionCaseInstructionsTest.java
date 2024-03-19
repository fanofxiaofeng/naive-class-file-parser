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
public class LookupSwitchInstructionCaseInstructionsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.method.instruction.LookupSwitchInstructionCase"));
    }

    @Instruction(value = 0xab, name = "lookupswitch")
    @Test
    public void test_0xab_case1() {
        expectedConsecutiveLines = List.of(
                "  public void test_0xab_case1(int, int);",
                "    descriptor: (II)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=2, locals=4, args_size=3",
                "         0: iload_1",
                "         1: iload_2",
                "         2: iadd",
                "         3: lookupswitch  { // 13",
                "                       1: 116",
                "                       3: 116",
                "                       5: 116",
                "                      11: 120",
                "                      13: 120",
                "                      15: 120",
                "                      21: 124",
                "                      23: 124",
                "                      25: 124",
                "                      31: 124",
                "                      33: 124",
                "                      35: 124",
                "                     107: 128",
                "                 default: 132",
                "            }",
                "       116: iconst_1",
                "       117: goto          133",
                "       120: iconst_2",
                "       121: goto          133",
                "       124: iconst_3",
                "       125: goto          133",
                "       128: iconst_4",
                "       129: goto          133",
                "       132: iconst_0",
                "       133: istore_3",
                "       134: return",
                "      LineNumberTable:",
                "        line 6: 0",
                "        line 7: 116",
                "        line 8: 120",
                "        line 9: 124",
                "        line 10: 128",
                "        line 11: 132",
                "        line 13: 134",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0     135     0  this   Lcom/test/cases/method/instruction/LookupSwitchInstructionCase;",
                "            0     135     1 number1   I",
                "            0     135     2 number2   I",
                "          134       1     3   ans   I"
        );
    }
}
