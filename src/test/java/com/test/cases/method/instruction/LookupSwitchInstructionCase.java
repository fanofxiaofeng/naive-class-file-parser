package com.test.cases.method.instruction;

public class LookupSwitchInstructionCase implements InstructionAnalyzer {
    @Instruction(value = 0xab, name = "lookupswitch")
    public void test_0xab_case1(int number1, int number2) {
        int ans = switch (number1 + number2) {
            case 1, 3, 5 -> 1;
            case 11, 13, 15 -> 2;
            case 21, 23, 25, 31, 33, 35 -> 3;
            case 107 -> 4;
            default -> 0;
        };
    }
}
