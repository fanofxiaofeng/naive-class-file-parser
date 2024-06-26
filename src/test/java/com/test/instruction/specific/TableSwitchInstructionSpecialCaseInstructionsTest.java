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
public class TableSwitchInstructionSpecialCaseInstructionsTest extends MethodPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.cases.method.instruction.TableSwitchInstructionSpecialCase"));
    }

    @Instruction(value = 0xaa, name = "tableswitch")
    @Test
    public void test_0xaa() {
        expectedConsecutiveLines = List.of(
                "  public void test_0xaa(int);",
                "    descriptor: (I)V",
                "    flags: (0x0001) ACC_PUBLIC",
                "    Code:",
                "      stack=1, locals=3, args_size=2",
                "         0: iload_1",
                "         1: tableswitch   { // -10100 to -9992",
                "                  -10100: 452",
                "                  -10099: 501",
                "                  -10098: 452",
                "                  -10097: 501",
                "                  -10096: 452",
                "                  -10095: 501",
                "                  -10094: 452",
                "                  -10093: 501",
                "                  -10092: 452",
                "                  -10091: 501",
                "                  -10090: 456",
                "                  -10089: 501",
                "                  -10088: 456",
                "                  -10087: 501",
                "                  -10086: 456",
                "                  -10085: 501",
                "                  -10084: 456",
                "                  -10083: 501",
                "                  -10082: 456",
                "                  -10081: 501",
                "                  -10080: 460",
                "                  -10079: 501",
                "                  -10078: 460",
                "                  -10077: 501",
                "                  -10076: 460",
                "                  -10075: 501",
                "                  -10074: 460",
                "                  -10073: 501",
                "                  -10072: 460",
                "                  -10071: 501",
                "                  -10070: 464",
                "                  -10069: 501",
                "                  -10068: 464",
                "                  -10067: 501",
                "                  -10066: 464",
                "                  -10065: 501",
                "                  -10064: 464",
                "                  -10063: 501",
                "                  -10062: 464",
                "                  -10061: 501",
                "                  -10060: 468",
                "                  -10059: 501",
                "                  -10058: 468",
                "                  -10057: 501",
                "                  -10056: 468",
                "                  -10055: 501",
                "                  -10054: 468",
                "                  -10053: 501",
                "                  -10052: 468",
                "                  -10051: 501",
                "                  -10050: 472",
                "                  -10049: 501",
                "                  -10048: 472",
                "                  -10047: 501",
                "                  -10046: 472",
                "                  -10045: 501",
                "                  -10044: 472",
                "                  -10043: 501",
                "                  -10042: 472",
                "                  -10041: 501",
                "                  -10040: 476",
                "                  -10039: 501",
                "                  -10038: 476",
                "                  -10037: 501",
                "                  -10036: 476",
                "                  -10035: 501",
                "                  -10034: 476",
                "                  -10033: 501",
                "                  -10032: 476",
                "                  -10031: 501",
                "                  -10030: 481",
                "                  -10029: 501",
                "                  -10028: 481",
                "                  -10027: 501",
                "                  -10026: 481",
                "                  -10025: 501",
                "                  -10024: 481",
                "                  -10023: 501",
                "                  -10022: 481",
                "                  -10021: 501",
                "                  -10020: 486",
                "                  -10019: 501",
                "                  -10018: 486",
                "                  -10017: 501",
                "                  -10016: 486",
                "                  -10015: 501",
                "                  -10014: 486",
                "                  -10013: 501",
                "                  -10012: 486",
                "                  -10011: 501",
                "                  -10010: 491",
                "                  -10009: 501",
                "                  -10008: 491",
                "                  -10007: 501",
                "                  -10006: 491",
                "                  -10005: 501",
                "                  -10004: 491",
                "                  -10003: 501",
                "                  -10002: 491",
                "                  -10001: 501",
                "                  -10000: 496",
                "                   -9999: 501",
                "                   -9998: 496",
                "                   -9997: 501",
                "                   -9996: 496",
                "                   -9995: 501",
                "                   -9994: 496",
                "                   -9993: 501",
                "                   -9992: 496",
                "                 default: 501",
                "            }",
                "       452: iconst_0",
                "       453: goto          502",
                "       456: iconst_1",
                "       457: goto          502",
                "       460: iconst_2",
                "       461: goto          502",
                "       464: iconst_3",
                "       465: goto          502",
                "       468: iconst_4",
                "       469: goto          502",
                "       472: iconst_5",
                "       473: goto          502",
                "       476: bipush        6",
                "       478: goto          502",
                "       481: bipush        7",
                "       483: goto          502",
                "       486: bipush        8",
                "       488: goto          502",
                "       491: bipush        9",
                "       493: goto          502",
                "       496: bipush        10",
                "       498: goto          502",
                "       501: iconst_m1",
                "       502: istore_2",
                "       503: return",
                "      LineNumberTable:",
                "        line 10: 0",
                "        line 11: 452",
                "        line 12: 456",
                "        line 13: 460",
                "        line 14: 464",
                "        line 15: 468",
                "        line 16: 472",
                "        line 17: 476",
                "        line 18: 481",
                "        line 19: 486",
                "        line 20: 491",
                "        line 21: 496",
                "        line 22: 501",
                "        line 24: 503",
                "      LocalVariableTable:",
                "        Start  Length  Slot  Name   Signature",
                "            0     504     0  this   Lcom/test/cases/method/instruction/TableSwitchInstructionSpecialCase;",
                "            0     504     1 number   I",
                "          503       1     2 answer   I",
                "      StackMapTable: number_of_entries = 13",
                "        frame_type = 251 /* same_frame_extended */",
                "          offset_delta = 452",
                "        frame_type = 3 /* same */",
                "        frame_type = 3 /* same */",
                "        frame_type = 3 /* same */",
                "        frame_type = 3 /* same */",
                "        frame_type = 3 /* same */",
                "        frame_type = 3 /* same */",
                "        frame_type = 4 /* same */",
                "        frame_type = 4 /* same */",
                "        frame_type = 4 /* same */",
                "        frame_type = 4 /* same */",
                "        frame_type = 4 /* same */",
                "        frame_type = 64 /* same_locals_1_stack_item */",
                "          stack = [ int ]"
        );
    }
}
