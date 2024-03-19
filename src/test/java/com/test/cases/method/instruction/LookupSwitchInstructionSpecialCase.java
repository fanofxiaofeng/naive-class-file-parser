package com.test.cases.method.instruction;

import com.test.annotations.GeneratedBy;
import com.test.generator.instruction.TableSwitchGenerator;

@GeneratedBy(TableSwitchGenerator.class)
public class LookupSwitchInstructionSpecialCase implements InstructionAnalyzer {
    @Instruction(value = 0xab, name = "lookupswitch")
    public void test_0xab(int number) {
        int answer = switch (number) {
            case -2147483648 -> 42;
            case -10100, -10098, -10096, -10094, -10092 -> 0;
            case -10090, -10088, -10086, -10084, -10082 -> 1;
            case -10080, -10078, -10076, -10074, -10072 -> 2;
            case -10070, -10068, -10066, -10064, -10062 -> 3;
            case -10060, -10058, -10056, -10054, -10052 -> 4;
            case -10050, -10048, -10046, -10044, -10042 -> 5;
            case -10040, -10038, -10036, -10034, -10032 -> 6;
            case -10030, -10028, -10026, -10024, -10022 -> 7;
            case -10020, -10018, -10016, -10014, -10012 -> 8;
            case -10010, -10008, -10006, -10004, -10002 -> 9;
            case -10000, -9998, -9996, -9994, -9992 -> 10;
            default -> -1;
        };
    }
}
