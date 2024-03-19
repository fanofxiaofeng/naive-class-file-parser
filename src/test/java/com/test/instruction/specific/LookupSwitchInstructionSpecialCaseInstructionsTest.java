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
public class LookupSwitchInstructionSpecialCaseInstructionsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.method.instruction.LookupSwitchInstructionSpecialCase"));
    }

    @Instruction(value = 0xab, name = "lookupswitch")
    @Test
    public void test_0xab() {
        expectedConsecutiveLines = List.of(
                "  public void test_0xab(int);",
                "    descriptor: (I)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=3, args_size=2",
                "         0: iload_1",
                "         1: lookupswitch  { // 56",
                "             -2147483648: 460",
                "                  -10100: 465",
                "                  -10098: 465",
                "                  -10096: 465",
                "                  -10094: 465",
                "                  -10092: 465",
                "                  -10090: 469",
                "                  -10088: 469",
                "                  -10086: 469",
                "                  -10084: 469",
                "                  -10082: 469",
                "                  -10080: 473",
                "                  -10078: 473",
                "                  -10076: 473",
                "                  -10074: 473",
                "                  -10072: 473",
                "                  -10070: 477",
                "                  -10068: 477",
                "                  -10066: 477",
                "                  -10064: 477",
                "                  -10062: 477",
                "                  -10060: 481",
                "                  -10058: 481",
                "                  -10056: 481",
                "                  -10054: 481",
                "                  -10052: 481",
                "                  -10050: 485",
                "                  -10048: 485",
                "                  -10046: 485",
                "                  -10044: 485",
                "                  -10042: 485",
                "                  -10040: 489",
                "                  -10038: 489",
                "                  -10036: 489",
                "                  -10034: 489",
                "                  -10032: 489",
                "                  -10030: 494",
                "                  -10028: 494",
                "                  -10026: 494",
                "                  -10024: 494",
                "                  -10022: 494",
                "                  -10020: 499",
                "                  -10018: 499",
                "                  -10016: 499",
                "                  -10014: 499",
                "                  -10012: 499",
                "                  -10010: 504",
                "                  -10008: 504",
                "                  -10006: 504",
                "                  -10004: 504",
                "                  -10002: 504",
                "                  -10000: 509",
                "                   -9998: 509",
                "                   -9996: 509",
                "                   -9994: 509",
                "                   -9992: 509",
                "                 default: 514",
                "            }",
                "       460: bipush        42",
                "       462: goto          515",
                "       465: iconst_0",
                "       466: goto          515",
                "       469: iconst_1",
                "       470: goto          515",
                "       473: iconst_2",
                "       474: goto          515",
                "       477: iconst_3",
                "       478: goto          515",
                "       481: iconst_4",
                "       482: goto          515",
                "       485: iconst_5",
                "       486: goto          515",
                "       489: bipush        6",
                "       491: goto          515",
                "       494: bipush        7",
                "       496: goto          515",
                "       499: bipush        8",
                "       501: goto          515",
                "       504: bipush        9",
                "       506: goto          515",
                "       509: bipush        10",
                "       511: goto          515",
                "       514: iconst_m1",
                "       515: istore_2",
                "       516: return",
                "      LineNumberTable:",
                "        line 10: 0",
                "        line 11: 460",
                "        line 12: 465",
                "        line 13: 469",
                "        line 14: 473",
                "        line 15: 477",
                "        line 16: 481",
                "        line 17: 485",
                "        line 18: 489",
                "        line 19: 494",
                "        line 20: 499",
                "        line 21: 504",
                "        line 22: 509",
                "        line 23: 514",
                "        line 25: 516",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0     517     0  this   Lcom/test/cases/method/instruction/LookupSwitchInstructionSpecialCase;",
                "            0     517     1 number   I",
                "          516       1     2 answer   I"
        );
    }
}